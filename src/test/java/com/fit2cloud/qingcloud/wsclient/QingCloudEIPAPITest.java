package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fit2cloud.qingcloud.wsclient.IQingCloudWSClient;
import com.fit2cloud.qingcloud.wsclient.QingCloudWSClient;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudEIP;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudEIPBillingMode;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.AllocateEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AllocateEipsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.AssociateEipRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AssociateEipResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ChangeEipsBandwidthRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ChangeEipsBandwidthResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeEipsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DissociateEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DissociateEipsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyEipAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyEipAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ReleaseEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ReleaseEipsResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 
 * @author jason
 *
 */
public class QingCloudEIPAPITest {

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
    
	
	//@Test
	public void testDescribeEips() throws Exception {
		DescribeEipsRequest describeEipsRequest = new DescribeEipsRequest();
		
		//describeEipsRequest.setEips(eips);
		//describeEipsRequest.setInstance_id(instance_id);
		//describeEipsRequest.setLimit(limit);
		//describeEipsRequest.setOffset(offset);
		//describeEipsRequest.setSearch_word(search_word);
		//describeEipsRequest.setStatus(status);

		describeEipsRequest.setZone(QingCloudZone.PEK2);
		
		DescribeEipsResponse describeEipsResponse = qingCloudWSClient.describeEips(describeEipsRequest);
		assertTrue(describeEipsResponse!=null);
		
		List<QingCloudEIP> eips = describeEipsResponse.getEip_set();
		
		for(QingCloudEIP eip : eips){
			GsonBuilder gb = new GsonBuilder().setPrettyPrinting();
			Gson gson = gb.create();
			String strJson = gson.toJson(eip);
			System.out.println(strJson);
		}
	}
	
//	@Test
	public void testAllocateEipsRequest() throws Exception {
		AllocateEipsRequest allocateEipsRequest = new AllocateEipsRequest();
		
		Integer bandwidth = 1;
        int count = 1;
        String eip_name = "eip-wordpress-dev-pek2";
        Integer need_icp = 0;
        
		allocateEipsRequest.setBandwidth(bandwidth);
		allocateEipsRequest.setCount(count);
		allocateEipsRequest.setEip_name(eip_name);
		allocateEipsRequest.setNeed_icp(need_icp);
		allocateEipsRequest.setBilling_mode(QingCloudEIPBillingMode.TRAFFIC);
		allocateEipsRequest.setZone(QingCloudZone.GD1);
		
		AllocateEipsResponse allocateEipsResponse = qingCloudWSClient.allocateEips(allocateEipsRequest);
		assertTrue(allocateEipsResponse!=null);
		System.out.println("allocateEipsResponse.getRet_code()="+allocateEipsResponse.getRet_code());

		if(allocateEipsResponse.getRet_code()!=0){
			String message = allocateEipsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(allocateEipsResponse.getRet_code() == 0);
		
	}
	
	//@Test
	public void testReleaseEips() throws Exception {
		ReleaseEipsRequest releaseEipsRequest = new ReleaseEipsRequest();

		List<String> eips = new ArrayList<String>();
		eips.add("eip-jdsof9c9");
		releaseEipsRequest.setEips(eips);
		releaseEipsRequest.setZone(QingCloudZone.PEK2);
		
		ReleaseEipsResponse releaseEipsResponse = qingCloudWSClient.releaseEips(releaseEipsRequest);
		assertTrue(releaseEipsResponse!=null);
		assertTrue(releaseEipsResponse.getRet_code() == 0);
		
		System.out.println("releaseEipsResponse.getRet_code()="+releaseEipsResponse.getRet_code());

		if(releaseEipsResponse.getRet_code()!=0){
			String message = releaseEipsResponse.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testAssociateEip() throws Exception {
		AssociateEipRequest associateEipRequest = new AssociateEipRequest();
		
		String eip = "eip-1w9i2qhn";
		String instance = "i-hox2ld1l";
		associateEipRequest.setEip(eip);
		associateEipRequest.setInstance(instance);
		associateEipRequest.setZone(QingCloudZone.PEK2);
		
		AssociateEipResponse associateEipResponse = qingCloudWSClient.associateEip(associateEipRequest);
		assertTrue(associateEipResponse!=null);
		System.out.println("associateEipResponse.getRet_code()="+associateEipResponse.getRet_code());

		if(associateEipResponse.getRet_code()!=0){
			String message = associateEipResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(associateEipResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testDissociateEips() throws Exception {
		DissociateEipsRequest dissociateEipsRequest = new DissociateEipsRequest();
		
		List<String> eips = new ArrayList<String>();
		eips.add("eip-1w9i2qhn");
		dissociateEipsRequest.setEips(eips);
		dissociateEipsRequest.setZone(QingCloudZone.PEK2);
		
		DissociateEipsResponse dissociateEipsResponse = qingCloudWSClient.dissociateEips(dissociateEipsRequest);
		assertTrue(dissociateEipsResponse!=null);
		System.out.println("dissociateEipsResponse.getRet_code()="+dissociateEipsResponse.getRet_code());

		if(dissociateEipsResponse.getRet_code()!=0){
			String message = dissociateEipsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(dissociateEipsResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testChangeEipsBandwidth() throws Exception {
		ChangeEipsBandwidthRequest changeEipsBandwidthRequest = new ChangeEipsBandwidthRequest();
		
		List<String> eips = new ArrayList<String>();
		eips.add("eip-1w9i2qhn");
		Integer bandwidth = 1;
		changeEipsBandwidthRequest.setEips(eips);
		changeEipsBandwidthRequest.setBandwidth(bandwidth);
		changeEipsBandwidthRequest.setZone(QingCloudZone.PEK2);
		
		ChangeEipsBandwidthResponse changeEipsBandwidthResponse = qingCloudWSClient.changeEipsBandwidth(changeEipsBandwidthRequest);
		assertTrue(changeEipsBandwidthResponse!=null);
		System.out.println("changeEipsBandwidthResponse.getRet_code()="+changeEipsBandwidthResponse.getRet_code());

		if(changeEipsBandwidthResponse.getRet_code()!=0){
			String message = changeEipsBandwidthResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(changeEipsBandwidthResponse.getRet_code() == 0);
	
	}

	//@Test
	public void testModifyEipAttributes() throws Exception {
		ModifyEipAttributesRequest modifyEipAttributesRequest = new ModifyEipAttributesRequest();
		
		String eip = "eip-1w9i2qhn";
		String eip_name = "eip-web1-webVMGroup-wordpress-dev1-pek2";
		String description = "eip of web VM#1 of webVMGroup in wordpress-dev1 cluster @ pek2 zone.";
		
		modifyEipAttributesRequest.setEip(eip);
		modifyEipAttributesRequest.setEip_name(eip_name);
		modifyEipAttributesRequest.setDescription(description);
		modifyEipAttributesRequest.setZone(QingCloudZone.PEK2);
		
		ModifyEipAttributesResponse modifyEipAttributesResponse = qingCloudWSClient.modifyEipAttributes(modifyEipAttributesRequest);
		assertTrue(modifyEipAttributesResponse!=null);
		System.out.println("modifyEipAttributesResponse.getRet_code()="+modifyEipAttributesResponse.getRet_code());

		if(modifyEipAttributesResponse.getRet_code()!=0){
			String message = modifyEipAttributesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(modifyEipAttributesResponse.getRet_code() == 0);
	}

}
