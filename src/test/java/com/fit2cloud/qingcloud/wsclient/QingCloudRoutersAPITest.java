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
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingcloudRouter;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterStaticsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterStaticsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterVxnetsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRouterVxnetsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinRouterRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.JoinRouterResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveRouterRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.LeaveRouterResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterStaticAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyRouterStaticAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOffRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOffRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOnRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.PowerOnRoutersResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.UpdateRoutersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.UpdateRoutersResponse;

public class QingCloudRoutersAPITest {

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
	public void testDescribeRouters() throws Exception {
		DescribeRoutersRequest describeRoutersRequest = new DescribeRoutersRequest();
		describeRoutersRequest.setZone(ZONE);
		List<String> status = new ArrayList<String>();
		status.add("active");
		describeRoutersRequest.setStatus(status);
		DescribeRoutersResponse response = qingCloudWSClient.describeRouters(describeRoutersRequest);
		assertTrue(response!=null);
		System.out.println("DescribeRoutersResponse.getRet_code()=" + response.getRet_code()+", getTotal_count() = "+response.getTotal_count());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingcloudRouter> routers = response.getRouter_set();
		for(QingcloudRouter router : routers) {
			System.out.println("router :: "+router);
		}
	}
	
	//@Test
	public void testCreateRouters() throws Exception {
		CreateRoutersRequest request = new CreateRoutersRequest();
		request.setZone(ZONE);
		request.setCount(1);
		request.setRouter_type(0);
		CreateRoutersResponse response = qingCloudWSClient.createRouters(request);
		assertTrue(response!=null);
		System.out.println("CreateRoutersResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<String> routers = response.getRouters();
		for(String router : routers) {
			System.out.println("router :: "+router);
		}
	}
	
	//@Test
	public void testDeleteRouters() throws Exception {
		DeleteRoutersRequest request = new DeleteRoutersRequest();
		List<String> routers = new ArrayList<String>();
		routers.add("rtr-htadqnch");
		request.setRouters(routers);
		request.setZone(ZONE);
		DeleteRoutersResponse response = qingCloudWSClient.deleteRouters(request);
		assertTrue(response!=null);
		System.out.println("DeleteRoutersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testUpdateRouters() throws Exception {
		UpdateRoutersRequest request = new UpdateRoutersRequest();
		request.setZone(ZONE);
		List<String> routers = new ArrayList<String>();
		routers.add("rtr-9sdesb3g");
		request.setRouters(routers);
		UpdateRoutersResponse response = qingCloudWSClient.updateRouters(request);
		assertTrue(response!=null);
		System.out.println("UpdateRoutersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testPowerOffRouters() throws Exception {
		PowerOffRoutersRequest request = new PowerOffRoutersRequest();
		request.setZone(ZONE);
		List<String> routers = new ArrayList<String>();
		routers.add("rtr-9sdesb3g");
		request.setRouters(routers);
		PowerOffRoutersResponse response = qingCloudWSClient.powerOffRouters(request);
		assertTrue(response!=null);
		System.out.println("PowerOffRoutersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testPowerOnRouters() throws Exception {
		PowerOnRoutersRequest request = new PowerOnRoutersRequest();
		request.setZone(ZONE);
		List<String> routers = new ArrayList<String>();
		routers.add("rtr-9sdesb3g");
		request.setRouters(routers);
		PowerOnRoutersResponse response = qingCloudWSClient.powerOnRouters(request);
		assertTrue(response!=null);
		System.out.println("PowerOnRoutersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testJoinRouter() throws Exception {
		JoinRouterRequest request = new JoinRouterRequest();
		request.setVxnet("vxnet-abusv1l");
		request.setRouter("rtr-9sdesb3g");
		request.setZone(ZONE);
		request.setIp_network("192.168.1.0/24");
		JoinRouterResponse response = qingCloudWSClient.joinRouter(request);
		assertTrue(response!=null);
		System.out.println("JoinRouterResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testLeaveRouter() throws Exception {
		LeaveRouterRequest request = new LeaveRouterRequest();
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-abusv1l");
		request.setVxnets(vxnets);
		request.setRouter("rtr-9sdesb3g");
		request.setZone(ZONE);
		LeaveRouterResponse response = qingCloudWSClient.leaveRouter(request);
		assertTrue(response!=null);
		System.out.println("LeaveRouterResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}

	//@Test
	public void testModifyRouterAttributes() throws Exception{
		ModifyRouterAttributesRequest request = new ModifyRouterAttributesRequest();
		request.setZone(ZONE);
		request.setRouter("rtr-9sdesb3g");
		request.setRouter_name("router_name");
//		request.setEip("eip");
//		request.setSecurity_group("security_group");
		ModifyRouterAttributesResponse response = qingCloudWSClient.modifyRouterAttributes(request);
		assertTrue(response!=null);
		System.out.println("ModifyRouterAttributesResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	@Test
	public void testDescribeRouterStatics() throws Exception{
		DescribeRouterStaticsRequest request = new DescribeRouterStaticsRequest();
		request.setZone("pek3d");
		request.setRouter("rtr-enzf2v6v");
		DescribeRouterStaticsResponse response = qingCloudWSClient.describeRouterStatics(request);
		assertTrue(response!=null);
		System.out.println("DescribeRouterStaticsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		List<QingCloudRouterStatics> routerStaticSet = response.getRouter_static_set();
		for(QingCloudRouterStatics rs : routerStaticSet) {
			System.out.println("router statics >> "+rs);
		}
	}
	
	//@Test
	public void testAddRouterStatics() throws Exception{
		AddRouterStaticsRequest request = new AddRouterStaticsRequest();
		request.setZone(ZONE);
		request.setRouter("rtr-9sdesb3g");
		List<QingCloudRouterStatics> statics = new ArrayList<QingCloudRouterStatics>();
		QingCloudRouterStatics s = new QingCloudRouterStatics();
		s.setStatic_type(1);
		s.setRouter_id("rtr-9sdesb3g");
		//s.setVal1(80);
		s.setVal2("192.168.1.3");
		//s.setVal3(8080);
		s.setVal4("tcp");
		statics.add(s);
		request.setStatics(statics);
		AddRouterStaticsResponse response = qingCloudWSClient.addRouterStatics(request);
		assertTrue(response!=null);
		System.out.println("DescribeRouterStaticsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		List<String> routerStaticSet = response.getRouter_statics();
		for(String rs : routerStaticSet) {
			System.out.println("router statics id >> "+rs);
		}
	}
	
	//@Test
	public void testDeleteRouterStatics() throws Exception{
		DeleteRouterStaticsRequest request = new DeleteRouterStaticsRequest();
		request.setZone(ZONE);
		List<String> router_statics = new ArrayList<String>();
		router_statics.add("rtrs-xyhkeqkx");
		request.setRouter_statics(router_statics);
		DeleteRouterStaticsResponse response = qingCloudWSClient.deleteRouterStatics(request);
		assertTrue(response!=null);
		System.out.println("DeleteRouterStaticsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		List<String> routerStaticSet = response.getRouter_statics();
		for(String rs : routerStaticSet) {
			System.out.println("router statics id >> "+rs);
		}
	}
	
	//@Test
	public void testDescribeRouterVxnets() throws Exception{
		DescribeRouterVxnetsRequest request = new DescribeRouterVxnetsRequest();
		request.setZone(ZONE);
		request.setRouter("rtr-9sdesb3g");
		DescribeRouterVxnetsResponse response = qingCloudWSClient.describeRouterVxnets(request);
		assertTrue(response!=null);
		System.out.println("DescribeRouterVxnetsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		List<QingCloudRouterVxnet> routerVxnetSet = response.getRouter_vxnet_set();
		for(QingCloudRouterVxnet rv : routerVxnetSet) {
			System.out.println("router vxnet >> "+rv);
		}
	}
	
	//@Test
	public void testModifyRouterStaticAttributes() throws Exception{
		ModifyRouterStaticAttributesRequest request = new ModifyRouterStaticAttributesRequest();
		request.setZone(ZONE);
		request.setRouter_static("rtrs-sja56nbn");
		request.setVal1("4321");
		request.setVal2("192.168.1.3");
		request.setVal3("6543");
		request.setVal4("tcp");
		
		ModifyRouterStaticAttributesResponse response = qingCloudWSClient.modifyRouterStaticAttributes(request);
		assertTrue(response!=null);
		System.out.println("ModifyRouterStaticAttributesResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		String routerStaticId = response.getRouter_static_id();
		System.out.println("router statics id >> "+routerStaticId);
	}
}
