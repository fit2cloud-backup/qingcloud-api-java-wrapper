package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterStatics;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterVxnet;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVxnet;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVxnetDetail;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVxnetInstance;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingcloudRouter;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVxnetsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVxnetsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVxnetsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVxnetsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterVxnetsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterVxnetsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVxnetInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVxnetInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVxnetsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVxnetsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinRouterRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinRouterResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinVxnetRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinVxnetResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveRouterRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveRouterResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveVxnetRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveVxnetResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterStaticAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterStaticAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyVxnetAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyVxnetAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOffRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOffRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOnRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOnRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.UpdateRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.UpdateRoutersResponse;

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
}
