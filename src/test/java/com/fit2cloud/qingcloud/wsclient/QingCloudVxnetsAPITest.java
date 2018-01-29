package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.fit2cloud.qingcloud.wsclient.domain.model.*;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QingCloudVxnetsAPITest {

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

	//@Test
	public void testDescribeVxnets() throws Exception {
		DescribeVxnetsRequest request = new DescribeVxnetsRequest();
		request.setZone(ZONE);
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-abusv1l");
		request.setVxnets(vxnets);
		DescribeVxnetsResponse response = qingCloudWSClient.describeVxnets(request);
		assertTrue(response!=null);
		System.out.println("DescribeVxnetsResponse.getRet_code()=" + response.getRet_code()+", getTotal_count() = "+response.getTotal_count());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudVxnetDetail> nets = response.getVxnet_set();
		for(QingCloudVxnetDetail net : nets) {
			System.out.println("vxnet :: "+net);
		}
	}
	
	//@Test
	public void testCreateVxnets() throws Exception {
		CreateVxnetsRequest request = new CreateVxnetsRequest();
		request.setZone(ZONE);
		request.setCount(1);
		request.setVxnet_name("vxnet_name");
		request.setVxnet_type(1);
		CreateVxnetsResponse response = qingCloudWSClient.createVxnets(request);
		assertTrue(response!=null);
		System.out.println("CreateVxnetsResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<String> nets = response.getVxnets();
		for(String net : nets) {
			System.out.println("vxnet id:: "+net);
		}
	}
	
	//@Test
	public void testDeleteVxnets() throws Exception {
		DeleteVxnetsRequest request = new DeleteVxnetsRequest();
		request.setZone(ZONE);
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-yo5uh3y");
		request.setVxnets(vxnets);
		DeleteVxnetsResponse response = qingCloudWSClient.deleteVxnets(request);
		assertTrue(response!=null);
		System.out.println("DeleteVxnetsResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<String> nets = response.getVxnets();
		for(String net : nets) {
			System.out.println("vxnet id:: "+net);
		}
	}
	
	//@Test
	public void testJoinVxnet() throws Exception {
		JoinVxnetRequest request = new JoinVxnetRequest();
		request.setZone(ZONE);
		request.setVxnet("vxnet-abusv1l");
		List<String> instances = new ArrayList<String>();
		instances.add("i-7bhl5ezi");
		request.setInstances(instances);
		JoinVxnetResponse response = qingCloudWSClient.joinVxnet(request);
		assertTrue(response!=null);
		System.out.println("JoinVxnetResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testLeaveVxnet() throws Exception {
		LeaveVxnetRequest request = new LeaveVxnetRequest();
		request.setZone(ZONE);
		request.setVxnet("vxnet-abusv1l");
		List<String> instances = new ArrayList<String>();
		instances.add("i-7bhl5ezi");
		request.setInstances(instances);
		LeaveVxnetResponse response = qingCloudWSClient.leaveVxnet(request);
		assertTrue(response!=null);
		System.out.println("LeaveVxnetResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testModifyVxnetAttributes() throws Exception {
		ModifyVxnetAttributesRequest request = new ModifyVxnetAttributesRequest();
		request.setZone(ZONE);
		request.setVxnet("vxnet-abusv1l");
		request.setVxnet_name("vxnet_name2");
		request.setDescription("description");
		ModifyVxnetAttributesResponse response = qingCloudWSClient.modifyVxnetAttributes(request);
		assertTrue(response!=null);
		System.out.println("DeleteVxnetsResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}

	//@Test
	public void testDescribeVxnetInstances() throws Exception {
		DescribeVxnetInstancesRequest request = new DescribeVxnetInstancesRequest();
		request.setZone(ZONE);
		request.setVxnet("vxnet-abusv1l");
		DescribeVxnetInstancesResponse response = qingCloudWSClient.describeVxnetInstances(request);
		assertTrue(response!=null);
		System.out.println("DeleteVxnetsResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudVxnetInstance> instances = response.getInstance_set();
		for(QingCloudVxnetInstance instance : instances) {
			System.out.println("instance :: "+instance);
		}
	}

	@Test
	public void testDescribeReplPolicys() throws IOException, QingCloudClientException, QingCloudServiceException {
		DescribeReplPolicysRequest request = new DescribeReplPolicysRequest();
		request.setVerbose(0);
		request.setLimit(20);
		request.setOffset(0);
		request.setZone("qg2");
		DescribeReplPolicysResponse jsonResponse = qingCloudWSClient.describeReplPolicys(request);
		System.out.println(jsonResponse);
	}

}
