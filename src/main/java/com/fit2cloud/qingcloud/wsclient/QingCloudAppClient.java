package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAction;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAppPayload;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.Request;
import com.fit2cloud.qingcloud.wsclient.ui.model.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.SimpleTimeZone;

/**
 * Created by zhangbohan on 15/8/19.
 */
public class QingCloudAppClient implements IQingCloudAppClient {

    private static final String API_VERSION = "1";
    private static final String ENDPOINT = "https://api.qingcloud.com/app/";
    private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String ENCODING = "UTF-8";
    private static final boolean DEBUG = false;


    private String appId;
    private String secretAppKey;
    private String accessToken;

    public QingCloudAppClient(String appId, String secretAppKey){
        this.appId = appId;
        this.secretAppKey = secretAppKey;
        this.accessToken = null;
    }

    public QingCloudAppClient(String appId, String secretAppKey,String accessToken) {
        this.appId = appId;
        this.secretAppKey = secretAppKey;
        this.accessToken = accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public DescribeUsersResponse describeUsers(DescribeUsersRequest describeUsersRequest) throws QingCloudClientException, QingCloudServiceException, IOException {
        DescribeUsersResponse describeUsersResponse = null;
        String httpMethod = "GET";
        String action = QingCloudAction.DESCRIBE_USERS;


        try {
            String jsonResponse = this.sendRequest(httpMethod, action, describeUsersRequest);
            describeUsersResponse = DescribeUsersResponse.fromJson(jsonResponse);
        } catch (QingCloudClientException e) {
            throw e;
        } catch (QingCloudServiceException e) {
            throw e;
        }
        return describeUsersResponse;
    }

    private String sendRequest(String httpMethod, String action, Request request)
            throws QingCloudClientException, QingCloudServiceException, IOException {
        Map<String, String> parameters = request.toMap();
        addCommonParams(httpMethod, action, parameters);

        // debug to print all parameters of final request
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(DEBUG) System.out.println(String.format("%s=%s", key, value));
        }

        InputStream content = null;
        HttpURLConnection connection = null;
        try {
            String query = paramsToQueryString(parameters);
            URL url = new URL(ENDPOINT + "?" + query);

            if(DEBUG) System.out.println("url=" + url);

            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            int code = connection.getResponseCode();

            if(DEBUG) System.out.println("code=" + code);

            if (code >= 400) {
                content = connection.getErrorStream();
                String message = readContent(content);

                QingCloudServiceException exception = new QingCloudServiceException(
                        message);
                exception.setServiceName(action);
                exception.setStatusCode(code);
                throw exception;
            } else {
                content = connection.getInputStream();
                String message = readContent(content);
                if(DEBUG) System.out.println("message=" + message);

                //check retcode
                Response response = Response.fromJson(message);
                int retCode = response.getRet_code();
                if(retCode!=0){
                    String errorMessage = response.getMessage();
                    if(retCode >= 5000){
                        QingCloudServiceException exception = new QingCloudServiceException(
                                errorMessage);
                        exception.setServiceName(action);
                        exception.setStatusCode(code);
                        exception.setErrorCode(retCode);
                        exception.setErrorMessage(errorMessage);
                        throw exception;
                    }else{
                        QingCloudClientException exception = new QingCloudClientException(
                                errorMessage);
                        exception.setServiceName(action);
                        exception.setErrorCode(retCode);
                        exception.setErrorMessage(errorMessage);
                        throw exception;
                    }
                }
                return message;
            }
        } catch (IOException e) {
            throw e;
        } finally {
            safeClose(content);
            connection.disconnect();
        }
    }

    private void addCommonParams(String httpMethod, String action,
                                 Map<String, String> parameters) {
        parameters.put("action", action);
        parameters.put("version", API_VERSION);
        if(accessToken!=null){
            parameters.put("access_token", accessToken);
        }
        parameters.put("app_id", appId);
        parameters.put("time_stamp", formatIso8601Date(new Date()));
        parameters.put("signature_method", "HmacSHA256");
        parameters.put("signature_version", "1");
        parameters.put("signature", computeSignature(httpMethod, parameters));

    }

    private String computeSignature(String httpMethod,
                                    Map<String, String> parameters) {
        String[] sortedKeys = parameters.keySet().toArray(new String[] {});
        Arrays.sort(sortedKeys);
        final String SEPARATOR = "&";

        StringBuilder sbStringToSign = new StringBuilder();
        sbStringToSign.append(String.format("%s\n/app/\n", httpMethod));

        String signature = "";
        try {
            int count = 0;

            for (String key : sortedKeys) {
                if (count != 0) {
                    sbStringToSign.append(SEPARATOR);
                }
                sbStringToSign.append(percentEncode(key)).append("=")
                        .append(percentEncode(parameters.get(key)));
                count++;
            }

            String strToSign = sbStringToSign.toString();
            signature = calculateSignature(secretAppKey, strToSign);
        } catch (UnsupportedEncodingException e) {
        } catch (Exception e) {
        }
        return signature;
    }
    private String formatIso8601Date(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(ISO8601_DATE_FORMAT);
        df.setTimeZone(new SimpleTimeZone(8 * 60 * 60 * 1000, "GMT"));
        return df.format(date);
    }

    private String calculateSignature(String key, String stringToSign) {
        final String ALGORITHM = "HmacSHA256";
        byte[] signData = null;
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
            signData = mac.doFinal(stringToSign.getBytes(ENCODING));
        } catch (InvalidKeyException e) {
        } catch (NoSuchAlgorithmException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (IllegalStateException e) {
        }
        return new String(Base64.encodeBase64(signData));
    }

    private String percentEncode(String value)
            throws UnsupportedEncodingException {
        return value != null ? URLEncoder.encode(value, ENCODING)
                .replace("+", "%20").replace("*", "%2A").replace("%7E", "~")
                : null;
    }

    private String paramsToQueryString(Map<String, String> params)
            throws UnsupportedEncodingException {
        if (params == null || params.size() == 0) {
            return null;
        }
        String[] sortedKeys = params.keySet().toArray(new String[] {});
        Arrays.sort(sortedKeys);

        StringBuilder paramString = new StringBuilder();
        boolean first = true;
        for (String key : sortedKeys) {
            Object val = params.get(key);
            if (!first) {
                paramString.append("&");
            }
            if (val instanceof String) {
                paramString.append(URLEncoder.encode(key, ENCODING));
                if (val != null) {
                    String strValue = (String) val;
                    paramString.append("=").append(
                            URLEncoder.encode(strValue, ENCODING));
                }
            }
            first = false;
        }
        return paramString.toString();
    }

    private String readContent(InputStream content) throws IOException {
        if (content == null)
            return "";

        Reader reader = null;
        Writer writer = new StringWriter();
        String result;

        char[] buffer = new char[1024];
        try {
            reader = new BufferedReader(
                    new InputStreamReader(content, ENCODING));
            int n;
            while ((n = reader.read(buffer)) > 0) {
                writer.write(buffer, 0, n);
            }
            result = writer.toString();
        } finally {
            content.close();
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
        return result;
    }

    private void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    public QingCloudAppPayload extractPayload(String payload,String signature){
        String expectedSignature = calculateSignature(secretAppKey,payload);
        expectedSignature = expectedSignature.replace("+","-");
        expectedSignature = expectedSignature.replace("/","_");
        while (expectedSignature.endsWith("=")){
            expectedSignature = expectedSignature.substring(0,expectedSignature.length()-1);
        }

        QingCloudAppPayload qap = null;
        if(signature.equals(expectedSignature)){
            String decodePayload = decodeQingcloud(payload);
            Gson gson =new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm'Z'").create();
            qap = gson.fromJson(decodePayload, QingCloudAppPayload.class);
        }

        return qap;
    }

    public String decodeQingcloud(String data){
        int len = 4 - data.length()%4==0?4:data.length()%4;
        data = data.replace("-","+");
        data = data.replace("_","/");
        for(int i=0;i<len;i++){
            data += "=";
        }
        String decodeSignature = null;
        try {
            decodeSignature = new String(org.apache.commons.codec.binary.Base64.decodeBase64(data), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return decodeSignature;
    }

    public String encodeQingcloud(String data){
        data = data.replace("+","-");
        data = data.replace("/","_");
        while (data.endsWith("=")){
            data = data.substring(0,data.length()-1);
        }
        String encodeData = null;
        try {
            encodeData = new String(Base64.encodeBase64(encodeData.getBytes("UTF-8")), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeData;
    }
}
