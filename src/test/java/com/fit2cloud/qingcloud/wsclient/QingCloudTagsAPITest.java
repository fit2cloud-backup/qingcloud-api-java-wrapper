package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudResourceTagPair;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudTag;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudTagsAPITest {

	private static final String ZONE = "pek3b";
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

	@Test
	public void testDescribeTags() throws Exception {
		DescribeTagsRequest request = new DescribeTagsRequest();
		request.setZone("sh1a");
		request.setSearch_word("tag");

//		DescribeZonesRequest describeZonesRequest = new DescribeZonesRequest();
//		DescribeZonesResponse describeZonesResponse = qingCloudWSClient.describeZones(describeZonesRequest);
		DescribeTagsResponse response = qingCloudWSClient.describeTags(request);
		assertTrue(response!=null);
		System.out.println("DescribeTagsResponse.getRet_code()=" + response.getRet_code()+", getTotal_count() = "+response.getTotal_count());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudTag> tag_set = response.getTag_set();
		for(QingCloudTag tag : tag_set) {
			System.out.println("tag :: "+tag);
		}
	}
	
	@Test
	public void testCreateTag() throws Exception {
		CreateTagRequest request = new CreateTagRequest();
		request.setZone(ZONE);
		request.setTag_name("test_tag");
		CreateTagResponse response = qingCloudWSClient.createTag(request);
		assertTrue(response!=null);
		System.out.println("CreateTagResponse.getRet_code()=" + response.getRet_code());

		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}

		String tag_id = response.getTag_id();
		System.out.println("tag_id : "+tag_id);

	}

	@Test
	public void testAttachTags() throws Exception {
		AttachTagsRequest attachTagsRequest = new AttachTagsRequest();
		attachTagsRequest.setZone(ZONE);
		List<QingCloudResourceTagPair> resource_tag_pairs = new ArrayList();
		QingCloudResourceTagPair qingCloudResourceTagPair = new QingCloudResourceTagPair();
		qingCloudResourceTagPair.setResource_id("i-nomhaj2v");//资源ID
		qingCloudResourceTagPair.setResource_type("instance");//主机
		qingCloudResourceTagPair.setTag_id("tag-iif9m1zr");//标签ID
		resource_tag_pairs.add(qingCloudResourceTagPair);
		attachTagsRequest.setResource_tag_pairs(resource_tag_pairs);

		AttachTagsResponse attachTagsResponse = qingCloudWSClient.attachTags(attachTagsRequest);
		assertTrue(attachTagsResponse!=null);
		System.out.println("attachTagsResponse.getRet_code()=" + attachTagsResponse.getRet_code());

		if(attachTagsResponse.getRet_code()!=0){
			String message = attachTagsResponse.getMessage();
			System.out.println("message="+message);
		}
	}
}
