package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.*;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.assertTrue;

public class QingCloudMonitorAPITest {

	private static final String ZONE = QingCloudZone.PEK2;
	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("/opt/.qingcloud/credential.txt")));
		accessKey = properties.getProperty("AccessKeyID");
		secretKey = properties.getProperty("SecretKey");
		qingCloudWSClient = new QingCloudWSClient(accessKey, secretKey);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testGetMonitor(){
		com.fit2cloud.qingcloud.wsclient.ui.model.GetMonitorRequest request = new com.fit2cloud.qingcloud.wsclient.ui.model.GetMonitorRequest();
		//request.setResource("vxnet-3ay9sob");
		request.setResource("i-b5olg6mg");
		List<String> meters = new ArrayList<String>();
		meters.add("cpu");
		meters.add("memory");
*//*		meters.add("disk-os");
		meters.add("disk-vol-0rzimnwa");
		meters.add("disk-iops-os");
		meters.add("disk-us-os");
		meters.add("if-52:54:cc:ca:b9:15");
		meters.add("if-pps-52:54:cc:ca:b9:15");*//*

		//meters.add("52:54:CC:CA:B9:15");
		request.setMeters(meters);
		request.setStep("15m");
		// 1、取得本地时间：
		Calendar calendar = Calendar.getInstance();
		// 2、取得时间偏移量：
		int zoneOffset = calendar.get(java.util.Calendar.ZONE_OFFSET);
		// 3、取得夏令时差：
		int dstOffset = calendar.get(java.util.Calendar.DST_OFFSET);
		// 4、从本地时间里扣除这些差量，即可以取得UTC时间：
		calendar.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
		Date now = calendar.getTime();
		calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - 15);
		Date before = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		request.setStart_time(format.format(before));
		request.setEnd_time(format.format(now));
		request.setZone("pek3a");
		try {
			GetMonitorResponse getMonitorResponse = qingCloudWSClient.getMonitor(request);
			System.out.println(getMonitorResponse);
		} catch (QingCloudClientException e) {
			e.printStackTrace();
		} catch (QingCloudServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();

	}

	@Test
	public void testDisk(){
		DescribeVolumesRequest request = new DescribeVolumesRequest();
		List<String> volumes = new ArrayList<String>();
		volumes.add("vol-0rzimnwa");
		request.setVolumes(volumes);
		request.setZone(QingCloudZone.GD1);
		try {
			DescribeVolumesResponse describeVolumesResponse = qingCloudWSClient.describeVolumes(request);
			QingCloudVolume qingCloudVolume = describeVolumesResponse.getVolume_set().get(0);
			QingCloudInstance qingCloudInstance = qingCloudVolume.getInstance();
			String instance = qingCloudInstance.getInstance_id();
			com.fit2cloud.qingcloud.wsclient.ui.model.GetMonitorRequest getMonitorRequest = new com.fit2cloud.qingcloud.wsclient.ui.model.GetMonitorRequest();
			getMonitorRequest.setResource(instance);
			List<String> meters = new ArrayList<String>();
			meters.add("disk-"+"vol-0rzimnwa");
			meters.add("disk-iops-"+"vol-0rzimnwa");
			getMonitorRequest.setMeters(meters);
			getMonitorRequest.setStep("15m");
			// 1、取得本地时间：
			Calendar calendar = Calendar.getInstance();
			// 2、取得时间偏移量：
			int zoneOffset = calendar.get(java.util.Calendar.ZONE_OFFSET);
			// 3、取得夏令时差：
			int dstOffset = calendar.get(java.util.Calendar.DST_OFFSET);
			// 4、从本地时间里扣除这些差量，即可以取得UTC时间：
			calendar.add(java.util.Calendar.MILLISECOND, -(zoneOffset + dstOffset));
			Date now = calendar.getTime();
			calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - 15);
			Date before = calendar.getTime();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			getMonitorRequest.setStart_time(format.format(before));
			getMonitorRequest.setEnd_time(format.format(now));
			getMonitorRequest.setZone(QingCloudZone.GD1);
			GetMonitorResponse getMonitorResponse = qingCloudWSClient.getMonitor(getMonitorRequest);
			System.out.println(getMonitorResponse);
		} catch (QingCloudClientException e) {
			e.printStackTrace();
		} catch (QingCloudServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testGjson(){
		String jsonStr = "{\"action\":\"GetMonitorResponse\",\"resource_id\":\"i-gdw5nqea\",\"ret_code\":0,\"meter_set\":[{\"data\":[[1511505900,5]],\"meter_id\":\"cpu\"},{\"data\":[[1511505900,64]],\"meter_id\":\"memory\"}]}";
		JsonObject jsonObject = new JsonParser().parse(jsonStr).getAsJsonObject();
		String action = jsonObject.get("action").getAsString();
		JsonArray jsonArray = jsonObject.getAsJsonArray("meter_set");

		for(JsonElement element : jsonArray){
			JsonObject jsonObj1  = element.getAsJsonObject();
			String meter = jsonObj1.get("meter_id").getAsString();
			JsonArray jsonArr = jsonObj1.getAsJsonArray("data");
			System.out.println(jsonArr.get(0).getAsJsonArray().get(1).getAsBigDecimal().divide(new BigDecimal(10)));
		}
		System.out.println(jsonArray);
	}*/


}
