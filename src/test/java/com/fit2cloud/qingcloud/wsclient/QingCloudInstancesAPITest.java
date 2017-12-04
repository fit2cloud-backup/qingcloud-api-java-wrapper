package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.*;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudInstancesAPITest {
	
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

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//@Test
	public void testDescribeInstances() throws Exception {
		DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest();
		
//		String image_id = QingCloudImageId.CENTOS64_X86a;
//		String instance_type = QingCloudPEK2InstanceType.C1M1;
//		String instance_id = "";
//		List<String> instance_ids = new ArrayList<String>();
//		instance_ids.add(instance_id);
//		Integer limit = 10;
//		Integer offset = 0;
//		String search_word = "";
		String status = QingCloudInstanceStatus.RUNNING;
//		
//		describeInstancesRequest.setImage_id(image_id);
//		describeInstancesRequest.setInstance_type(instance_type);
//		describeInstancesRequest.setInstances(instance_ids);
//		describeInstancesRequest.setLimit(limit);
//		describeInstancesRequest.setOffset(offset);
//		describeInstancesRequest.setSearch_word(search_word);
		//describeInstancesRequest.setStatus(status);
		describeInstancesRequest.setVerbose(1);
		
		describeInstancesRequest.setZone(QingCloudZone.PEK2);

		DescribeInstancesResponse describeInstancesResponse = qingCloudWSClient.describeInstances(describeInstancesRequest);
		assertTrue(describeInstancesResponse!=null);
		assertTrue(describeInstancesResponse.getRet_code()==0);
		List<QingCloudInstance> instances = describeInstancesResponse.getInstance_set();
		for(QingCloudInstance instance : instances){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String jsonInstance = gson.toJson(instance);
			System.out.println(jsonInstance);
		}
		System.out.println("QingCloudWSClientTest");
	}

	//@Test
	public void testRunInstancesWithInstanceClass() throws Exception {
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
		runInstancesRequest.setImage_id(QingCloudImageId.CENTOS64_X86a);
		runInstancesRequest.setInstance_type(QingCloudPEK2InstanceType.C1M1);
		runInstancesRequest.setInstance_class(QingCloudInstanceClass.PERFORMANCE_SUPER);
		runInstancesRequest.setCount(1);
		runInstancesRequest.setInstance_name("test@"+System.currentTimeMillis());
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-0");
		//vxnets.add("vxnet-1");
		runInstancesRequest.setVxnets(vxnets);
		//runInstancesRequest.setSecurity_group(security_group);
		runInstancesRequest.setLogin_mode("passwd");
		runInstancesRequest.setLogin_passwd("Ff8802616");
		runInstancesRequest.setZone(QingCloudZone.PEK2);

		String jsonRequest = runInstancesRequest.toJson();
		System.out.println(jsonRequest);

		Gson gson = new GsonBuilder().create();
		RunInstancesRequest request = gson.fromJson(jsonRequest, RunInstancesRequest.class);
		System.out.println(request.toJson());
		RunInstancesResponse runInstancesResponse = qingCloudWSClient.runInstances(runInstancesRequest);
		assertTrue(runInstancesResponse!=null);
		assertTrue(runInstancesResponse.getRet_code() == 0);
		System.out.println("QingCloudWSClientTest");
	}

	@Test
	public void testRunInstancesWithCustomOSSize() throws Exception {
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
		runInstancesRequest.setImage_id("centos68x64a");
		runInstancesRequest.setInstance_type(QingCloudPEK2InstanceType.C1M1);
		runInstancesRequest.setInstance_class(QingCloudInstanceClass.PERFORMANCE);
		runInstancesRequest.setCount(1);
		runInstancesRequest.setInstance_name("test@"+System.currentTimeMillis());
		runInstancesRequest.setHypervisor("kvm");
		runInstancesRequest.setOs_disk_size(40);
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-0");
		//vxnets.add("vxnet-1");
		runInstancesRequest.setVxnets(vxnets);
		//runInstancesRequest.setSecurity_group(security_group);
		runInstancesRequest.setLogin_mode("passwd");
		runInstancesRequest.setLogin_passwd("Ff8802616");
		runInstancesRequest.setZone(QingCloudZone.PEK2);

		String jsonRequest = runInstancesRequest.toJson();
		System.out.println(jsonRequest);

		Gson gson = new GsonBuilder().create();
		RunInstancesRequest request = gson.fromJson(jsonRequest, RunInstancesRequest.class);
		System.out.println(request.toJson());
		RunInstancesResponse runInstancesResponse = qingCloudWSClient.runInstances(runInstancesRequest);
		assertTrue(runInstancesResponse!=null);
		assertTrue(runInstancesResponse.getRet_code() == 0);
		System.out.println("QingCloudWSClientTest");
	}

	//@Test
	public void testRunInstances() throws Exception {
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
		runInstancesRequest.setImage_id(QingCloudImageId.CENTOS64_X86a);
		runInstancesRequest.setInstance_type(QingCloudPEK2InstanceType.C1M1);
		runInstancesRequest.setCount(1);
		runInstancesRequest.setInstance_name("test@"+System.currentTimeMillis());
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-0");
		//vxnets.add("vxnet-1");
		runInstancesRequest.setVxnets(vxnets);
		//runInstancesRequest.setSecurity_group(security_group);
		runInstancesRequest.setLogin_mode("passwd");
		runInstancesRequest.setLogin_passwd("Ff8802616");
		runInstancesRequest.setZone(QingCloudZone.PEK2);
		
		String jsonRequest = runInstancesRequest.toJson();
		System.out.println(jsonRequest);
		
		Gson gson = new GsonBuilder().create();
		RunInstancesRequest request = gson.fromJson(jsonRequest, RunInstancesRequest.class);
		System.out.println(request.toJson());
		RunInstancesResponse runInstancesResponse = qingCloudWSClient.runInstances(runInstancesRequest);
		assertTrue(runInstancesResponse!=null);
		assertTrue(runInstancesResponse.getRet_code() == 0);
		System.out.println("QingCloudWSClientTest");
	}
	
	//@Test
	public void testTerminateInstances() throws Exception {
		TerminateInstancesRequest terminateInstancesRequest = new TerminateInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-7dzmvwdg");
		terminateInstancesRequest.setInstances(instances);
		terminateInstancesRequest.setZone(QingCloudZone.PEK2);
		
		TerminateInstancesResponse terminateInstancesResponse = qingCloudWSClient.terminateInstances(terminateInstancesRequest);
		assertTrue(terminateInstancesResponse!=null);
		System.out.println("terminateInstancesResponse.getRet_code()="+terminateInstancesResponse.getRet_code());
		if(terminateInstancesResponse.getRet_code()!=0){
			String message = terminateInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(terminateInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testStopInstances() throws Exception {
		StopInstancesRequest stopInstancesRequest = new StopInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-lkg2ivas");
		stopInstancesRequest.setInstances(instances);
		stopInstancesRequest.setZone(QingCloudZone.PEK2);
		
		StopInstancesResponse stopInstancesResponse = qingCloudWSClient.stopInstances(stopInstancesRequest);
		assertTrue(stopInstancesResponse!=null);
		System.out.println("stopInstancesResponse.getRet_code()="+stopInstancesResponse.getRet_code());
		if(stopInstancesResponse.getRet_code()!=0){
			String message = stopInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(stopInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testStartInstances() throws Exception {
		StartInstancesRequest startInstancesRequest = new StartInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-lkg2ivas");
		startInstancesRequest.setInstances(instances);
		startInstancesRequest.setZone(QingCloudZone.PEK2);
		
		StartInstancesResponse startInstancesResponse = qingCloudWSClient.startInstances(startInstancesRequest);
		assertTrue(startInstancesResponse!=null);
		System.out.println("startInstancesResponse.getRet_code()="+startInstancesResponse.getRet_code());
		if(startInstancesResponse.getRet_code()!=0){
			String message = startInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(startInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testRestartInstances() throws Exception {
		RestartInstancesRequest restartInstancesRequest = new RestartInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-lkg2ivas");
		restartInstancesRequest.setInstances(instances);
		restartInstancesRequest.setZone(QingCloudZone.PEK2);
		
		RestartInstancesResponse restartInstancesResponse = qingCloudWSClient.restartInstances(restartInstancesRequest);
		assertTrue(restartInstancesResponse!=null);
		System.out.println("restartInstancesResponse.getRet_code()="+restartInstancesResponse.getRet_code());
		if(restartInstancesResponse.getRet_code()!=0){
			String message = restartInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(restartInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testResetInstances() throws Exception {
		ResetInstancesRequest resetInstancesRequest = new ResetInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-lkg2ivas");
		resetInstancesRequest.setInstances(instances);
		resetInstancesRequest.setLogin_mode(QingCloudLoginMode.PASSWORD);
		String login_passwd = "Ff8802616";
		resetInstancesRequest.setLogin_passwd(login_passwd);
		//String login_keypair = "kp-isdfslw";
		//resetInstancesRequest.setLogin_keypair(login_keypair);
		//Integer need_newsid = 0;
		//resetInstancesRequest.setNeed_newsid(need_newsid);
		resetInstancesRequest.setZone(QingCloudZone.PEK2);
		
		ResetInstancesResponse resetInstancesResponse = qingCloudWSClient.resetInstances(resetInstancesRequest);
		assertTrue(resetInstancesResponse!=null);
		System.out.println("resetInstancesResponse.getRet_code()="+resetInstancesResponse.getRet_code());
		if(resetInstancesResponse.getRet_code()!=0){
			String message = resetInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(resetInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testResizeInstances() throws Exception {
		ResizeInstancesRequest resizeInstancesRequest = new ResizeInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add("i-lkg2ivas");
		resizeInstancesRequest.setInstances(instances);
		resizeInstancesRequest.setInstance_type(QingCloudPEK2InstanceType.C1M2);
		//resizeInstancesRequest.setCpu(1);
		//resizeInstancesRequest.setMemory(QingCloudMemory.M2048);
		resizeInstancesRequest.setZone(QingCloudZone.PEK2);
		
		ResizeInstancesResponse resizeInstancesResponse = qingCloudWSClient.resizeInstances(resizeInstancesRequest);
		assertTrue(resizeInstancesResponse!=null);
		System.out.println("resizeInstancesResponse.getRet_code()="+resizeInstancesResponse.getRet_code());
		if(resizeInstancesResponse.getRet_code()!=0){
			String message = resizeInstancesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(resizeInstancesResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testModifyInstanceAttributesRequest() throws Exception {
		ModifyInstanceAttributesRequest modifyInstanceAttributesRequest = new ModifyInstanceAttributesRequest();
		
		String instance_id = "i-lkg2ivas";
		String instance_name = "testForModifyInstanceAttributes";
		String description = "use for testing ModifyInstanceAttributes";
		modifyInstanceAttributesRequest.setInstance(instance_id);
		modifyInstanceAttributesRequest.setInstance_name(instance_name);
		modifyInstanceAttributesRequest.setDescription(description);
		modifyInstanceAttributesRequest.setZone(QingCloudZone.PEK2);
		
		ModifyInstanceAttributesResponse modifyInstanceAttributesResponse = qingCloudWSClient.modifyInstanceAttributes(modifyInstanceAttributesRequest);
		assertTrue(modifyInstanceAttributesResponse!=null);
		System.out.println("modifyInstanceAttributesResponse.getRet_code()="+modifyInstanceAttributesResponse.getRet_code());
		if(modifyInstanceAttributesResponse.getRet_code()!=0){
			String message = modifyInstanceAttributesResponse.getMessage();
			System.out.println("message="+message);
		}
		assertTrue(modifyInstanceAttributesResponse.getRet_code() != 0);
	}
	

	
//awk '{print "import com.qingcloud.wsclient.ui.model." $1 "Request;\nimport com.qingcloud.wsclient.ui.model." $1 "Response;"}' 1.txt
	
	
	
}
