package com.fit2cloud.qingcloud.wsclient.tools;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ClassesGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		//1. Get API names
		InputStream in = ClassesGenerator.class.getResourceAsStream("/com/fit2cloud/qingcloud/wsclient/tools/apinames.txt");
		String strApiNames = IOUtils.toString(in);
		//System.out.println(strApiNames);
		String[] arrayApiNames = strApiNames.split("\n");
		if(arrayApiNames!=null && arrayApiNames.length>0){
			for(String apiName : arrayApiNames){
				if(!apiName.equals("")){
				    //System.out.println(apiName);
				}
			}
		}
		//2. Generate IQingCloudWSClient interfaces strings
		if(arrayApiNames!=null && arrayApiNames.length>0){
			for(String apiName : arrayApiNames){
				if(!apiName.equals("")){
				    //System.out.println(String.format("import com.qingcloud.wsclient.ui.model.%sRequest;", apiName));
				    //System.out.println(String.format("import com.qingcloud.wsclient.ui.model.%sResponse;", apiName));
				}
			}
		}
		
		if(arrayApiNames!=null && arrayApiNames.length>0){
			StringBuilder sb = new StringBuilder();
			for(String apiName : arrayApiNames){
				if(!apiName.equals("")){
					String apiNameFirstCharLower = getFirstCharLowerCaseString(apiName);
					String apiNameUpper = apiName.toUpperCase();
					sb.append(String.format("public %sResponse %s(", apiName, apiNameFirstCharLower)).append("\n");
					sb.append(String.format("%sRequest %sRequest) ", apiName, apiNameFirstCharLower)).append("\n");
					sb.append("throws QingCloudClientException, QingCloudServiceException;").append("\n");
				}
			}
			//System.out.println(sb.toString());
		}
		
		//3. Generate QingCloudWSClient impls strings
		/**
		 * public ModifyKeyPairAttributesResponse modifyKeyPairAttributes(
			ModifyKeyPairAttributesRequest modifyKeyPairAttributesRequest) 
			throws QingCloudClientException, QingCloudServiceException{
		
				ModifyKeyPairAttributesResponse modifyKeyPairAttributesResponse = null;
				String httpMethod = "GET";
				String action = QingCloudAction.MODIFY_KEYPAIR_ATTRIBUTES;
		
				try {
					String jsonResponse = this.sendRequest(httpMethod, action,
							modifyKeyPairAttributesRequest);
					modifyKeyPairAttributesResponse = ModifyKeyPairAttributesResponse
								.fromJson(jsonResponse);
				} catch (QingCloudClientException e) {
					throw e;
				} catch (QingCloudServiceException e) {
					throw e;
				}
				return modifyKeyPairAttributesResponse;
			}
		 */
		if(arrayApiNames!=null && arrayApiNames.length>0){
			StringBuilder sb = new StringBuilder();
			for(String apiName : arrayApiNames){
				if(!apiName.equals("")){
					String apiNameFirstCharLower = getFirstCharLowerCaseString(apiName);
					String apiNameUpper = apiName.toUpperCase();
					
					sb.append(String.format("public %sResponse %s(", apiName, apiNameFirstCharLower)).append("\n");
					sb.append(String.format("%sRequest %sRequest) ", apiName, apiNameFirstCharLower)).append("\n");
					sb.append("throws QingCloudClientException, QingCloudServiceException{").append("\n");
					sb.append(String.format("%sResponse %sResponse = null;", apiName, apiNameFirstCharLower)).append("\n");
					sb.append("String httpMethod = \"GET\";").append("\n");
					sb.append(String.format("String action = QingCloudAction.%s;", apiNameUpper)).append("\n");
					sb.append("\n");
					
					sb.append("try {").append("\n");
					sb.append("String jsonResponse = this.sendRequest(httpMethod, action,").append("\n");
					sb.append(String.format("%sRequest);", apiNameFirstCharLower)).append("\n");
					sb.append(String.format("%sResponse = %sResponse", apiNameFirstCharLower, apiName)).append("\n");
					sb.append(".fromJson(jsonResponse);").append("\n");
					sb.append("} catch (QingCloudClientException e) {").append("\n");
					sb.append("throw e;").append("\n");
					sb.append("} catch (QingCloudServiceException e) {").append("\n");
					sb.append("throw e;").append("\n");
					sb.append("}").append("\n");
					sb.append(String.format("return %sResponse;", apiNameFirstCharLower)).append("\n");
					sb.append("}").append("\n");
					sb.append("\n\n");
					
				}
			}
			System.out.println(sb.toString());
		}
		
		URL fileURL = ClassesGenerator.class.getResource("/com/fit2cloud/qingcloud/wsclient/tools/apinames.txt");
		String strFilePath = fileURL.getFile();
		String strToolsDirPath = new File(strFilePath).getParent();
		
		System.out.println(fileURL.getFile());
		System.out.println(strToolsDirPath);
		
		//4. Generate UI models
		String uiModelsOutputPath = strToolsDirPath + "generated";
		String requestTemplateFilePath = strToolsDirPath + "RequestTemplate.txt";
        String strRequestTemplate = FileUtils.readFileToString(new File(requestTemplateFilePath));
        for(String apiName : arrayApiNames){
			if(!apiName.equals("")){
				
				
				String className = String.format("%sRequest", apiName);
			    String strTargetRequest = strRequestTemplate.replaceAll("RequestTemplate", className);
			    //System.out.println(strTargetRequest);
			    String strTargetRequestClassFilePath = String.format("%s/%s.java", uiModelsOutputPath, className);
			    //FileUtils.writeStringToFile(new File(strTargetRequestClassFilePath), strTargetRequest);
			}
        }
        
        String responseTemplateFilePath = strToolsDirPath + "ResponseTemplate.txt";
        String strResponseTemplate = FileUtils.readFileToString(new File(responseTemplateFilePath));
        for(String apiName : arrayApiNames){
			if(!apiName.equals("")){
				String apiNameFirstCharLower = getFirstCharLowerCaseString(apiName);
				
				String className = String.format("%sResponse", apiName);
				String responseInstanceName = String.format("%sResponse", apiNameFirstCharLower);
				
			    String strTargetResponse = strResponseTemplate.replaceAll("TemplateResponse", className);
			    strTargetResponse = strTargetResponse.replaceAll("templateResponse", responseInstanceName);
			    ///System.out.println(strTargetResponse);
			    String strTargetResponseClassFilePath = String.format("%s/%s.java", uiModelsOutputPath, className);
			    //FileUtils.writeStringToFile(new File(strTargetResponseClassFilePath), strTargetResponse);
			}
        }
        
	}
	
	public static String getFirstCharLowerCaseString(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(i==0){
				sb.append(Character.toLowerCase(c));
			}else{
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
