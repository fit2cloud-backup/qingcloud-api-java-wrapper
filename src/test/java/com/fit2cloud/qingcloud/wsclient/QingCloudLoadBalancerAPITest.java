package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudBalanceMode;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancer;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerBackendBase;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerBackendDetail;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerListenerDetail;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerType;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingcloudLoadBalancerListenerBase;
import com.google.gson.Gson;

public class QingCloudLoadBalancerAPITest {

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
	public void testDescribeLoadBalancers() throws Exception {
		DescribeLoadBalancersRequest request = new DescribeLoadBalancersRequest();
		request.setZone(ZONE);
		List<String> loadbalancers = new ArrayList<String>();
		loadbalancers.add("lb-zjsmyurl");
		request.setLoadbalancers(loadbalancers);
		DescribeLoadBalancersResponse response = qingCloudWSClient.describeLoadBalancers(request);
		assertTrue(response!=null);
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudLoadBalancer> lbs = response.getLoadbalancer_set();
		for(QingCloudLoadBalancer lb : lbs) {
			System.out.println("lb :: "+new Gson().toJson(lb));
		}
	}
	
	//@Test
	public void testCreateLoadBalancer() throws Exception {
		CreateLoadBalancerRequest request = new CreateLoadBalancerRequest();
		request.setZone(ZONE);
		List<String> eips = new ArrayList<String>();
		eips.add("eip-tkkkg9e0");
		request.setLoadbalancer_name("Created by FIT2CLOUD API");
		request.setLoadbalancer_type(QingCloudLoadBalancerType.MAX_CONNECTION_5000);
		request.setEips(eips);
		CreateLoadBalancerResponse response = qingCloudWSClient.createLoadBalancer(request);
		assertTrue(response!=null);
		System.out.println("CreateLoadBalancerResponse.getRet_code()=" + response.getRet_code());
		
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		System.out.println("loadbalancer id :: "+response.getLoadbalancer_id());
	}
	
	//@Test
	public void testModifyLoadBalancerAttributes() throws Exception {
		ModifyLoadBalancerAttributesRequest request = new ModifyLoadBalancerAttributesRequest();
		request.setDescription("test description");
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		request.setLoadbalancer_name("change loadbalancer name");
		ModifyLoadBalancerAttributesResponse response = qingCloudWSClient.modifyLoadBalancerAttributes(request);
		assertTrue(response!=null);
		System.out.println("ModifyLoadBalancerAttributesResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	
	//@Test
	public void testStopLoadBalancers() throws Exception {
		StopLoadBalancersRequest request = new StopLoadBalancersRequest();
		request.setZone(ZONE);
		List<String> loadbalancers = new ArrayList<String>();
		loadbalancers.add("lb-zjsmyurl");
		request.setLoadbalancers(loadbalancers);
		StopLoadBalancersResponse response = qingCloudWSClient.stopLoadBalancers(request);
		assertTrue(response!=null);
		System.out.println("StopLoadBalancersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testStartLoadBalancers() throws Exception {
		StartLoadBalancersRequest request = new StartLoadBalancersRequest();
		request.setZone(ZONE);
		List<String> loadbalancers = new ArrayList<String>();
		loadbalancers.add("lb-zjsmyurl");
		request.setLoadbalancers(loadbalancers);
		StartLoadBalancersResponse response = qingCloudWSClient.startLoadBalancers(request);
		assertTrue(response!=null);
		System.out.println("StartLoadBalancersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	
	//@Test
	public void testUpdateLoadBalancers() throws Exception {
		UpdateLoadBalancersRequest request = new UpdateLoadBalancersRequest();
		request.setZone(ZONE);
		List<String> loadbalancers = new ArrayList<String>();
		loadbalancers.add("lb-zjsmyurl");
		request.setLoadbalancers(loadbalancers);
		UpdateLoadBalancersResponse response = qingCloudWSClient.updateLoadBalancers(request);
		assertTrue(response!=null);
		System.out.println("UpdateLoadBalancersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testDissociateEipsFromLoadBalancer() throws Exception {
		DissociateEipsFromLoadBalancerRequest request = new DissociateEipsFromLoadBalancerRequest();
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		List<String> eips = new ArrayList<String>();
		eips.add("eip-tkkkg9e0");
		request.setEips(eips);
		DissociateEipsFromLoadBalancerResponse response = qingCloudWSClient.dissociateEipsFromLoadBalancer(request);
		assertTrue(response!=null);
		System.out.println("DissociateEipsFromLoadBalancerResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testAssociateEipsToLoadBalancer() throws Exception {
		AssociateEipsToLoadBalancerRequest request = new AssociateEipsToLoadBalancerRequest();
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		List<String> eips = new ArrayList<String>();
		eips.add("eip-tkkkg9e0");
		request.setEips(eips);
		AssociateEipsToLoadBalancerResponse response = qingCloudWSClient.associateEipsToLoadBalancer(request);
		assertTrue(response!=null);
		System.out.println("AssociateEipsToLoadBalancerResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testAddLoadBalancerListeners() throws Exception {
		AddLoadBalancerListenersRequest request = new AddLoadBalancerListenersRequest();
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		List<QingcloudLoadBalancerListenerBase> listeners = new ArrayList<QingcloudLoadBalancerListenerBase>();
		QingcloudLoadBalancerListenerBase listener = new QingcloudLoadBalancerListenerBase();
		listener.setListener_port(8081);
		listener.setListener_protocol("tcp");
		listener.setBackend_protocol("tcp");
		listener.setLoadbalancer_listener_name("test loadbalancer listener3");
		listener.setBalance_mode(QingCloudBalanceMode.ROUND_ROBIN);
		listener.setSession_sticky("insert|3600");
		listener.setHealthy_check_method("http|/index.html");
		listener.setHealthy_check_option("20|30|3|4");
		listeners.add(listener);
		request.setListeners(listeners);
		
		AddLoadBalancerListenersResponse response = qingCloudWSClient.addLoadBalancerListeners(request);
		assertTrue(response!=null);
		System.out.println("AddLoadBalancerListenersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<String> listenerIds = response.getLoadbalancer_listeners();
		for(String id : listenerIds) {
			System.out.println("listener id :: "+id);
		}
	}
	
	//@Test
	public void testDescribeLoadBalancerListeners() throws Exception {
		DescribeLoadBalancerListenersRequest request = new DescribeLoadBalancerListenersRequest();
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		request.setVerbose(1);
		List<String> loadbalancer_listeners = new ArrayList<String>();
		loadbalancer_listeners.add("lbl-saho67cf");
		request.setLoadbalancer_listeners(loadbalancer_listeners);
		DescribeLoadBalancerListenersResponse response = qingCloudWSClient.describeLoadBalancerListeners(request);
		assertTrue(response!=null);
		System.out.println("DescribeLoadBalancerListenersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudLoadBalancerListenerDetail> lbListeners = response.getLoadbalancer_listener_set();
		for(QingCloudLoadBalancerListenerDetail lbl : lbListeners) {
			System.out.println("loadbalancer listener :: "+new Gson().toJson(lbl));
		}
	}
	
	//@Test
	public void testModifyLoadBalancerListenerAttributes() throws Exception {
		ModifyLoadBalancerListenerAttributesRequest request = new ModifyLoadBalancerListenerAttributesRequest();
		request.setZone(ZONE);
		request.setLoadbalancer_listener("lbl-saho67cf");
		request.setBalance_mode(QingCloudBalanceMode.LEAST_CONN);
		request.setLoadbalancer_listener_name("new loadbalancer_listener_name");
		request.setSession_sticky("insert|3000");
		request.setHealthy_check_method("http|/index.html");
		request.setHealthy_check_option("10|20|2|5");
		ModifyLoadBalancerListenerAttributesResponse response = qingCloudWSClient.modifyLoadBalancerListenerAttributes(request);
		assertTrue(response!=null);
		System.out.println("ModifyLoadBalancerListenerAttributesResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testAddLoadBalancerBackends() throws Exception {
		AddLoadBalancerBackendsRequest request = new AddLoadBalancerBackendsRequest();
		request.setZone(ZONE);
		request.setLoadbalancer_listener("lbl-saho67cf");
		List<QingCloudLoadBalancerBackendBase> backends = new ArrayList<QingCloudLoadBalancerBackendBase>();
		QingCloudLoadBalancerBackendBase backend = new QingCloudLoadBalancerBackendBase();
		backend.setLoadbalancer_backend_name("new loadbalancer_backend_name");
		backend.setPort(123);
		backend.setWeight(11);
		backend.setResource_id("i-inxxvkln");
		backends.add(backend);
		request.setBackends(backends);
		
		AddLoadBalancerBackendsResponse response = qingCloudWSClient.addLoadBalancerBackends(request);
		assertTrue(response!=null);
		System.out.println("AddLoadBalancerBackendsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		List<String> bks = response.getLoadbalancer_backends();
		for(String bk : bks) {
			System.out.println("backend id :: "+bk);
		}
	}
	
	//@Test
	public void testDescribeLoadBalancerBackends() throws Exception {
		DescribeLoadBalancerBackendsRequest request = new DescribeLoadBalancerBackendsRequest();
		request.setZone(ZONE);
		request.setLoadbalancer("lb-zjsmyurl");
		request.setVerbose(1);
		DescribeLoadBalancerBackendsResponse response = qingCloudWSClient.describeLoadBalancerBackends(request);
		assertTrue(response!=null);
		System.out.println("DescribeLoadBalancerBackendsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudLoadBalancerBackendDetail> bks = response.getLoadbalancer_backend_set();
		for(QingCloudLoadBalancerBackendDetail bk : bks) {
			System.out.println("loadbalancer backend :: "+new Gson().toJson(bk));
		}
	}
	
	//@Test
	public void testModifyLoadBalancerBackendAttributes() throws Exception {
		ModifyLoadBalancerBackendAttributesRequest request = new ModifyLoadBalancerBackendAttributesRequest();
		request.setZone(ZONE);
		request.setLoadbalancer_backend("lbb-gg1s5gy9");
		request.setPort(22);
		request.setWeight(33);
		ModifyLoadBalancerBackendAttributesResponse response = qingCloudWSClient.modifyLoadBalancerBackendAttributes(request);
		assertTrue(response!=null);
		System.out.println("ModifyLoadBalancerBackendAttributesResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testDeleteLoadBalancerBackends() throws Exception {
		DeleteLoadBalancerBackendsRequest request = new DeleteLoadBalancerBackendsRequest();
		request.setZone(ZONE);
		List<String> loadbalancer_backends = new ArrayList<String>();
		loadbalancer_backends.add("lbb-gg1s5gy9");
		request.setLoadbalancer_backends(loadbalancer_backends);
		DeleteLoadBalancerBackendsResponse response = qingCloudWSClient.deleteLoadBalancerBackends(request);
		assertTrue(response!=null);
		System.out.println("DeleteLoadBalancerBackendsResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testDeleteLoadBalancerListeners() throws Exception {
		DeleteLoadBalancerListenersRequest request = new DeleteLoadBalancerListenersRequest();
		request.setZone(ZONE);
		List<String> loadbalancer_listeners = new ArrayList<String>();
		loadbalancer_listeners.add("lbl-saho67cf");
		request.setLoadbalancer_listeners(loadbalancer_listeners);
		DeleteLoadBalancerListenersResponse response = qingCloudWSClient.deleteLoadBalancerListeners(request);
		assertTrue(response!=null);
		System.out.println("DeleteLoadBalancerListenersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}
	
	//@Test
	public void testDeleteLoadBalancers() throws Exception {
		DeleteLoadBalancersRequest request = new DeleteLoadBalancersRequest();
		request.setZone(ZONE);
		List<String> loadbalancers = new ArrayList<String>();
		loadbalancers.add("lb-zjsmyurl");
		request.setLoadbalancers(loadbalancers);
		DeleteLoadBalancersResponse response = qingCloudWSClient.deleteLoadBalancers(request);
		assertTrue(response!=null);
		System.out.println("DeleteLoadBalancersResponse.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}

	@Test
	public void testDescribeServerCertificates() throws Exception {
		DescribeServerCertificatesRequest request = new DescribeServerCertificatesRequest();
		request.setZone("sh1a");
		DescribeServerCertificatesResponse response = qingCloudWSClient.describeServerCertificates(request);
		assertTrue(response!=null);
		System.out.println("DescribeServerCertificates.getRet_code()=" + response.getRet_code());
		if(response.getRet_code() != 0) {
			String message = response.getMessage();
			System.out.println("message="+message);
		}
	}


}
