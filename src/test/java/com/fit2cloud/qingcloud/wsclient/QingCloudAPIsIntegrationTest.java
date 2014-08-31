package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fit2cloud.qingcloud.wsclient.IQingCloudWSClient;
import com.fit2cloud.qingcloud.wsclient.QingCloudWSClient;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudImageId;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudInstance;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudInstanceStatus;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoginMode;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudMemory;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudPEK2InstanceType;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSecurityGroupRule;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudUserDataType;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolume;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolumeStatus;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolumeType;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddSecurityGroupRulesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddSecurityGroupRulesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.AllocateEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AllocateEipsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ApplySecurityGroupRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ApplySecurityGroupResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.AssociateEipRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AssociateEipResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateKeyPairRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateKeyPairResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateSecurityGroupRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateSecurityGroupResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteKeyPairsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupRulesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupRulesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DettachKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DettachKeyPairsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ReleaseEipsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ReleaseEipsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.RestartInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.RestartInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.RunInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.RunInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopInstancesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.TerminateInstancesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.TerminateInstancesResponse;

public class QingCloudAPIsIntegrationTest {

	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
	private static String KEYPAIR_NAME = "test-env-1";
	private static String SECURITY_GROUP_NAME = "test-wordpress-web-sg";
	private static String VOLUME_NAME = "test-volume-1";
	
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
    
	public CreateKeyPairRequest getCreateKeyPairRequest(){
        CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
		
		String keypair_name = KEYPAIR_NAME;
		String mode = "system";
		String encrypt_method = "ssh-rsa";
		
		createKeyPairRequest.setKeypair_name(keypair_name);
		createKeyPairRequest.setMode(mode);
		createKeyPairRequest.setEncrypt_method(encrypt_method);
		createKeyPairRequest.setZone(QingCloudZone.PEK2);
		return createKeyPairRequest;
	}
	
	public CreateSecurityGroupRequest getCreateSecurityGroupRequest(){
		CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
		
		String security_group_name = SECURITY_GROUP_NAME;
		
		createSecurityGroupRequest.setSecurity_group_name(security_group_name);
		createSecurityGroupRequest.setZone(QingCloudZone.PEK2);
		return createSecurityGroupRequest;
	}
	
	public static List<QingCloudSecurityGroupRule> getSecurityGroupRules(){
		List<QingCloudSecurityGroupRule> rules = new ArrayList<QingCloudSecurityGroupRule>();
		QingCloudSecurityGroupRule qingCloudSecurityGroupRule = new QingCloudSecurityGroupRule();
		
		String action = "accept";
		Integer priority = 1;
		String protocol = "tcp";
		String security_group_rule_name = "ssh";
		Integer direction = 0;
		String val1 = "22";
		String val2 = "22";
		String val3 = "";
		
		qingCloudSecurityGroupRule.setAction(action);
		qingCloudSecurityGroupRule.setPriority(priority);
		qingCloudSecurityGroupRule.setProtocol(protocol);
		qingCloudSecurityGroupRule.setSecurity_group_rule_name(security_group_rule_name);
		qingCloudSecurityGroupRule.setDirection(direction);
		qingCloudSecurityGroupRule.setVal1(val1);
		qingCloudSecurityGroupRule.setVal2(val2);
		qingCloudSecurityGroupRule.setVal3(val3);
		
		rules.add(qingCloudSecurityGroupRule);
		
		qingCloudSecurityGroupRule = new QingCloudSecurityGroupRule();
		action = "accept";
		priority = 1;
		protocol = "tcp";
		security_group_rule_name = "http";
		direction = 0;
		val1 = "80";
		val2 = "80";
		val3 = "";
		
		qingCloudSecurityGroupRule.setAction(action);
		qingCloudSecurityGroupRule.setPriority(priority);
		qingCloudSecurityGroupRule.setProtocol(protocol);
		qingCloudSecurityGroupRule.setSecurity_group_rule_name(security_group_rule_name);
		qingCloudSecurityGroupRule.setDirection(direction);
		qingCloudSecurityGroupRule.setVal1(val1);
		qingCloudSecurityGroupRule.setVal2(val2);
		qingCloudSecurityGroupRule.setVal3(val3);
		
		rules.add(qingCloudSecurityGroupRule);
		
		return rules;
	}
	
	public static AddSecurityGroupRulesRequest getAddSecurityGroupRulesRequest(String security_group_id, 
			List<QingCloudSecurityGroupRule> rules){
		AddSecurityGroupRulesRequest addSecurityGroupRulesRequest = new AddSecurityGroupRulesRequest();
		
		addSecurityGroupRulesRequest.setSecurity_group(security_group_id);
		addSecurityGroupRulesRequest.setRules(rules);
		addSecurityGroupRulesRequest.setZone(QingCloudZone.PEK2);
		return addSecurityGroupRulesRequest;
	}
	
	public static AllocateEipsRequest getAllocateEipsRequest(){
		AllocateEipsRequest allocateEipsRequest = new AllocateEipsRequest();
				
		Integer bandwidth = 1;
        int count = 1;
        String eip_name = "eip-wordpress-dev-pek2";
        Integer need_icp = 0;
        
		allocateEipsRequest.setBandwidth(bandwidth);
		allocateEipsRequest.setCount(count);
		allocateEipsRequest.setEip_name(eip_name);
		allocateEipsRequest.setNeed_icp(need_icp);
		allocateEipsRequest.setZone(QingCloudZone.PEK2);
		
		return allocateEipsRequest;
	}
	
	public static RunInstancesRequest getRunInstancesRequest(String keypair_id, String security_group_id){
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();
				
		runInstancesRequest.setImage_id(QingCloudImageId.CENTOS64_X86a);
		runInstancesRequest.setInstance_type(QingCloudPEK2InstanceType.C1M1);
		runInstancesRequest.setCount(1);
		runInstancesRequest.setInstance_name("Pek2->wordpress-dev->WebVMGroup->1");
		List<String> vxnets = new ArrayList<String>();
		vxnets.add("vxnet-0");
		//vxnets.add("vxnet-1");
		runInstancesRequest.setVxnets(vxnets);
		runInstancesRequest.setSecurity_group(security_group_id);
		runInstancesRequest.setLogin_mode(QingCloudLoginMode.KEYPAIR);
		//runInstancesRequest.setLogin_passwd("Ff8802616");
		runInstancesRequest.setLogin_keypair(keypair_id);
		String userdata_path = "/etc/userdata";
		String userdata_type = QingCloudUserDataType.PLAIN;
		byte[] binaryData = "a=1\nb=2\nc=3\n".getBytes();
		String userdata_value = new String(Base64.encodeBase64(binaryData));
		
		runInstancesRequest.setNeed_userdata(1);
		runInstancesRequest.setUserdata_path(userdata_path);
		runInstancesRequest.setUserdata_type(userdata_type);
		runInstancesRequest.setUserdata_value(userdata_value);
		
		runInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return runInstancesRequest;
	}
	
	public static AssociateEipRequest getAssociateEipRequest(String eip_id, 
			String instance_id){
		AssociateEipRequest associateEipRequest = new AssociateEipRequest();

		associateEipRequest.setEip(eip_id);
		associateEipRequest.setInstance(instance_id);
		associateEipRequest.setZone(QingCloudZone.PEK2);
		
		return associateEipRequest;
	}
	
	public static DescribeInstancesRequest getDescribeInstancesRequest(String instance_id){
		DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		describeInstancesRequest.setInstances(instances);
		describeInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return describeInstancesRequest;
	}
	
	public static ApplySecurityGroupRequest getApplySecurityGroupRequest(String instance_id, String security_group_id){
		ApplySecurityGroupRequest applySecurityGroupRequest = new ApplySecurityGroupRequest();
		
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		applySecurityGroupRequest.setInstances(instances);
		applySecurityGroupRequest.setSecurity_group(security_group_id);
		applySecurityGroupRequest.setZone(QingCloudZone.PEK2);
		
		return applySecurityGroupRequest;
	}
	
	public static TerminateInstancesRequest getTerminateInstancesRequest(String instance_id){
		TerminateInstancesRequest terminateInstancesRequest = new TerminateInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		terminateInstancesRequest.setInstances(instances);
		terminateInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return terminateInstancesRequest;
	}
	
	public static StopInstancesRequest getStopInstancesRequest(String instance_id){
		StopInstancesRequest stopInstancesRequest = new StopInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		stopInstancesRequest.setInstances(instances);
		stopInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return stopInstancesRequest;
	}
	
	public static StartInstancesRequest getStartInstancesRequest(String instance_id){
		StartInstancesRequest startInstancesRequest = new StartInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		startInstancesRequest.setInstances(instances);
		startInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return startInstancesRequest;
	}
	
	public static DettachKeyPairsRequest getDettachKeyPairsRequest(String keypair_id, String instance_id){
        DettachKeyPairsRequest dettachKeyPairsRequest = new DettachKeyPairsRequest();
		
		List<String> keypairs = new ArrayList<String>();
		keypairs.add(keypair_id);
	
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		
		dettachKeyPairsRequest.setKeypairs(keypairs);
		dettachKeyPairsRequest.setInstances(instances);
		dettachKeyPairsRequest.setZone(QingCloudZone.PEK2);
		
		return dettachKeyPairsRequest;
	}
	
	public static RestartInstancesRequest getRestartInstancesRequest(String instance_id){
		RestartInstancesRequest restartInstancesRequest = new RestartInstancesRequest();
		List<String> instances = new ArrayList<String>();
		instances.add(instance_id);
		restartInstancesRequest.setInstances(instances);
		restartInstancesRequest.setZone(QingCloudZone.PEK2);
		
		return restartInstancesRequest;
	}
	
	public static DeleteKeyPairsRequest getDeleteKeyPairsRequest(String keypair_id){
		DeleteKeyPairsRequest deleteKeyPairsRequest = new DeleteKeyPairsRequest();
		List<String> keypairs = new ArrayList<String>();
		keypairs.add(keypair_id);
		deleteKeyPairsRequest.setKeypairs(keypairs);
		deleteKeyPairsRequest.setZone(QingCloudZone.PEK2);
		return deleteKeyPairsRequest;
	}
	
	public static CreateVolumesRequest getCreateVolumesRequest(){
        CreateVolumesRequest createVolumesRequest = new CreateVolumesRequest();
		
		int count = 1;
		int size = 10;
		String volume_name = VOLUME_NAME;
		Integer volume_type = QingCloudVolumeType.PERFORMANCE;
		createVolumesRequest.setCount(count);
		createVolumesRequest.setSize(size);
		createVolumesRequest.setVolume_name(volume_name);
		createVolumesRequest.setVolume_type(volume_type);
		createVolumesRequest.setZone(QingCloudZone.PEK2);
		return createVolumesRequest;
	}
	
	public static AttachVolumesRequest getAttachVolumesRequest(List<String> volumes, String instance_id){
		AttachVolumesRequest attachVolumesRequest = new AttachVolumesRequest();
		
		attachVolumesRequest.setInstance(instance_id);
		attachVolumesRequest.setVolumes(volumes);
		attachVolumesRequest.setZone(QingCloudZone.PEK2);
		return attachVolumesRequest;
	}
	
	public static DescribeVolumesRequest getDescribeVolumesRequest(String volume_id){
		DescribeVolumesRequest describeVolumesRequest = new DescribeVolumesRequest();
		if(volume_id!=null){
			List<String> volumes = new ArrayList<String>();
			volumes.add(volume_id);
			
			describeVolumesRequest.setVolumes(volumes);
		}
		
		describeVolumesRequest.setZone(QingCloudZone.PEK2);
		
		return describeVolumesRequest;
	}
	
	private String createKeyPair(){
		System.out.println("---------------------------------------");
		System.out.println("Go to create KeyPair... ...");
		System.out.println("---------------------------------------");
		CreateKeyPairResponse createKeyPairResponse;
		String keypair_id=null;
		try {
			CreateKeyPairRequest createKeyPairRequest = this.getCreateKeyPairRequest();
			createKeyPairResponse = qingCloudWSClient.createKeyPair(createKeyPairRequest);
			keypair_id = createKeyPairResponse.getKeypair_id();
			String private_key = createKeyPairResponse.getPrivate_key();
			String strPrivateKeyPath = "/tmp/key-"+System.currentTimeMillis()+".pem";
			FileUtils.writeStringToFile(new File(strPrivateKeyPath), private_key);
			System.out.println(String.format("    KeyPair %s created!", keypair_id));
		} catch (QingCloudClientException e) {
			e.printStackTrace();
		} catch (QingCloudServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(keypair_id!=null){
			System.out.println("    Create KeyPair Successfully!");
		}else{
			System.out.println("    Failed to create KeyPair!");
		}
		return keypair_id;
	}
	
	private String createSecurityGroup(){
		System.out.println("---------------------------------------");
		System.out.println("Go to create Security Group... ...");
		System.out.println("---------------------------------------");
		String security_group_id=null;
		try {
			CreateSecurityGroupRequest createSecurityGroupRequest = this.getCreateSecurityGroupRequest();
			CreateSecurityGroupResponse createSecurityGroupResponse;
			try {
				createSecurityGroupResponse = qingCloudWSClient.createSecurityGroup(createSecurityGroupRequest);
				security_group_id = createSecurityGroupResponse.getSecurity_group_id();
				System.out.println(String.format("    SecurityGroup %s created!", security_group_id));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		}
		if(security_group_id!=null){
			System.out.println("    Create Security Group Successfully!");
		}else{
			System.out.println("    Failed to create Security Group!");
		}
		return security_group_id;
	}
	
	private void applyRulesToSecurityGroup(String security_group_id){
		System.out.println("----------------------------------------------------------------");
		System.out.println("Go to add rules to Security Group to open 22 and 80... ...");
		System.out.println("----------------------------------------------------------------");
		List<String> addedSecurityGroupRules = new ArrayList<String>();
		try {
			List<QingCloudSecurityGroupRule> rules = getSecurityGroupRules();
			AddSecurityGroupRulesRequest addSecurityGroupRulesRequest = getAddSecurityGroupRulesRequest(security_group_id, rules);
			AddSecurityGroupRulesResponse addSecurityGroupRulesResponse = qingCloudWSClient.addSecurityGroupRules(addSecurityGroupRulesRequest);
			addedSecurityGroupRules = addSecurityGroupRulesResponse.getSecurity_group_rules();
			if(addedSecurityGroupRules!=null && addedSecurityGroupRules.size()>0){
				for(String rule : addedSecurityGroupRules){
					System.out.println(String.format("    SecurityGroupRule %s added to SecurityGroup %s!", rule, security_group_id));
				}
			}
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(addedSecurityGroupRules!=null && addedSecurityGroupRules.size()>0){
			System.out.println("    Add Security Rules opening 22,80 public Successfully!");
		}else{
			System.out.println("    Failed to add Security Rules opening 22,80 public!");
		}
	}
	
	private String createEIP(){
		System.out.println("---------------------------------------");
		System.out.println("Go to create EIP ... ...");
		System.out.println("---------------------------------------");
		String eip_id=null;
		try {
			AllocateEipsRequest allocateEipsRequest = getAllocateEipsRequest();
			AllocateEipsResponse allocateEipsResponse = qingCloudWSClient.allocateEips(allocateEipsRequest);
			List<String> eips = allocateEipsResponse.getEips();
			if(eips!=null && eips.size()>0){
				eip_id = eips.get(0);
				System.out.println(String.format("    EIP %s created!", eip_id));
			}
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(eip_id!=null){
			System.out.println("    Create EIP Successfully!");
		}else{
			System.out.println("    Fail to create EIP!");
		}
		return eip_id;
	}
	
	public String createInstance(String keypair_id, String security_group_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to create VM instance ... ...");
		System.out.println("---------------------------------------");
		String instance_id=null;
		try {
			RunInstancesRequest runInstancesRequest = getRunInstancesRequest(keypair_id, security_group_id);
			RunInstancesResponse runInstancesResponse = qingCloudWSClient.runInstances(runInstancesRequest);
			List<String> instances = runInstancesResponse.getInstances();
			if(instances!=null && instances.size()>0){
				instance_id = instances.get(0);
			}
			System.out.println(String.format("    VM %s created!", instance_id));
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(instance_id!=null){
		    System.out.println("    Create VM Instance Successfully!");
		}else{
			System.out.println("    Fail to create VM Instance!");
		}
		return instance_id;
	}
	
	public void attachEIPToInstance(String eip_id, String instance_id){
		System.out.println("---------------------------------------");
        System.out.println("Go to attach EIP to VM instance ... ...");
        System.out.println("---------------------------------------");
		
		AssociateEipResponse associateEipResponse = null;
		try {
			AssociateEipRequest associateEipRequest = getAssociateEipRequest(eip_id, instance_id);
			associateEipResponse = qingCloudWSClient.associateEip(associateEipRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(associateEipResponse.getRet_code()==0){
			System.out.println("    Attach EIP to VM Instance Successfully!");
		}else{
			System.out.println("    Fail to attach EIP to VM Instance!");
		}
	}
	
	public void applySecurityGroupToInstance(String security_group_id, String instance_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to apply Security Group to VM instance ... ...");
		System.out.println("---------------------------------------");
		ApplySecurityGroupResponse applySecurityGroupResponse = null;
		try {
			ApplySecurityGroupRequest applySecurityGroupRequest = getApplySecurityGroupRequest(instance_id, security_group_id);
			applySecurityGroupResponse = qingCloudWSClient.applySecurityGroup(applySecurityGroupRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(applySecurityGroupResponse.getRet_code()==0){
			System.out.println("    Apply Security Group to VM request is sent successfully!");
		}else{
			System.out.println("    Apply Security Group to VM request is sent failed!");
		}
	}
	
	public void stopInstance(String instance_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to stop VM instance ... ...");
		System.out.println("---------------------------------------");
		StopInstancesResponse stopInstancesResponse = null;
		try {
			StopInstancesRequest stopInstancesRequest = getStopInstancesRequest(instance_id);
			stopInstancesResponse = qingCloudWSClient.stopInstances(stopInstancesRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(stopInstancesResponse!=null && stopInstancesResponse.getRet_code()==0){
			System.out.println("    Stop VM instance request is sent successfully!");
		}else{
			System.out.println("    Stop VM instance request is sent failed!");
		}
	}
	
	public void startInstance(String instance_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to start VM instance ... ...");
		System.out.println("---------------------------------------");
		StartInstancesResponse startInstancesResponse = null;
		try {
			StartInstancesRequest startInstancesRequest = getStartInstancesRequest(instance_id);
			startInstancesResponse = qingCloudWSClient.startInstances(startInstancesRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(startInstancesResponse!=null && startInstancesResponse.getRet_code()==0){
			System.out.println("    Start VM instance request is sent successfully!... ...");
		}else{
			System.out.println("    Start VM instance request is sent failed!");
		}
	}
	
	public String createVolume(){
		System.out.println("---------------------------------------");
		System.out.println("Go to create volume... ...");
		System.out.println("---------------------------------------");
        List<String> volumes=new ArrayList<String>();
		String volume_id=null;
		try {
			CreateVolumesRequest createVolumesRequest = getCreateVolumesRequest();
			CreateVolumesResponse createVolumesResponse = qingCloudWSClient.createVolumes(createVolumesRequest);
			assertTrue(createVolumesResponse!=null);
			assertTrue(createVolumesResponse.getRet_code()==0);
			volumes = createVolumesResponse.getVolumes();
			if(volumes!=null && volumes.size()>0)
			    volume_id = volumes.get(0);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(volume_id!=null){
		    System.out.println("    Create Volume request is sent successfully, waiting for volume to be available... ...");
		}
		return volume_id;
	}
	
	public void attachVolume(String volume_id, String instance_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to attach volume to instance... ...");
		System.out.println("---------------------------------------");
		AttachVolumesResponse attachVolumesResponse = null;
		try {
			List<String> volumes = new ArrayList<String>();
			volumes.add(volume_id);
			AttachVolumesRequest attachVolumesRequest =  getAttachVolumesRequest(volumes, instance_id);
			attachVolumesResponse = qingCloudWSClient.attachVolumes(attachVolumesRequest);
			assertTrue(attachVolumesResponse!=null);
			assertTrue(attachVolumesResponse.getRet_code()==0);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(attachVolumesResponse!=null && attachVolumesResponse.getRet_code()==0){
			System.out.println("    Attach volume to VM instance request is sent successfully!... ...");
		}else{
			System.out.println("    Attach volume to VM instance request is sent failed!");
		}
	}
	
	public void deleteKeyPair(String keypair_id){
		System.out.println("---------------------------------------------");
		System.out.println("Go to detach and delete key pairs... ...");
		System.out.println("---------------------------------------------");
		DeleteKeyPairsResponse deleteKeyPairsResponse = null;
		try {
			DeleteKeyPairsRequest deleteKeyPairsRequest = getDeleteKeyPairsRequest(keypair_id);
			deleteKeyPairsResponse = qingCloudWSClient.deleteKeyPairs(deleteKeyPairsRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(deleteKeyPairsResponse!=null && deleteKeyPairsResponse.getRet_code() == 0){
			System.out.println("    Detach and delete key pair successfully!");
		}else{
			System.out.println("    Detach and delete key pair failed!");
		}
	}
	
	public void terminateInstance(String instance_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to terminate instance... ...");
		System.out.println("---------------------------------------");
		TerminateInstancesResponse terminateInstancesResponse = null;
		try {
			TerminateInstancesRequest terminateInstancesRequest = getTerminateInstancesRequest(instance_id);
			terminateInstancesResponse = qingCloudWSClient.terminateInstances(terminateInstancesRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(terminateInstancesResponse!=null && terminateInstancesResponse.getRet_code()==0){
			System.out.println("    Terminate VM instance request is sent successfully!... ...");
		}else{
			System.out.println("    Terminate VM instance request is sent failed!");
		}
	}
	
	public void deleteSecurityGroup(String security_group_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to delete security group ... ...");
		System.out.println("---------------------------------------");
        DeleteSecurityGroupsRequest deleteSecurityGroupsRequest = new DeleteSecurityGroupsRequest();
		
		List<String> security_groups=new ArrayList<String>();
		security_groups.add(security_group_id);
		
		deleteSecurityGroupsRequest.setSecurity_groups(security_groups);
		deleteSecurityGroupsRequest.setZone(QingCloudZone.PEK2);
		
		DeleteSecurityGroupsResponse deleteSecurityGroupsResponse = null;
		try {
			deleteSecurityGroupsResponse = qingCloudWSClient.deleteSecurityGroups(deleteSecurityGroupsRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(deleteSecurityGroupsResponse!=null && deleteSecurityGroupsResponse.getRet_code() == 0){
			System.out.println("    Delete security group successfully!");
		}else{
			System.out.println("    Delete security group failed!");
		}
	}
	
	public void deleteEIP(String eip_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to delete EIP ... ...");
		System.out.println("---------------------------------------");
		ReleaseEipsRequest releaseEipsRequest = new ReleaseEipsRequest();

		List<String> toReleaseEips = new ArrayList<String>();
		toReleaseEips.add(eip_id);
		releaseEipsRequest.setEips(toReleaseEips);
		releaseEipsRequest.setZone(QingCloudZone.PEK2);
		
		ReleaseEipsResponse releaseEipsResponse = null;
		try {
			releaseEipsResponse = qingCloudWSClient.releaseEips(releaseEipsRequest);
		} catch (QingCloudClientException e1) {
			e1.printStackTrace();
			System.out.println("    Release EIP failed!");
		} catch (QingCloudServiceException e1) {
			e1.printStackTrace();
			System.out.println("    Release EIP failed!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(releaseEipsResponse!=null && releaseEipsResponse.getRet_code() == 0){
			System.out.println("    Release EIP successfully!");
		}else{
			System.out.println("    Release EIP failed!");
		}
	}
	
	public boolean deleteVolume(String volume_id){
		System.out.println("---------------------------------------");
		System.out.println("Go to delete volume ... ...");
		System.out.println("---------------------------------------");
		boolean success = false;
		
		DeleteVolumesRequest deleteVolumesRequest = new DeleteVolumesRequest();
		
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		deleteVolumesRequest.setVolumes(volumes);
		deleteVolumesRequest.setZone(QingCloudZone.PEK2);
		
		DeleteVolumesResponse deleteVolumesResponse = null;
		try {
			deleteVolumesResponse = qingCloudWSClient.deleteVolumes(deleteVolumesRequest);
		} catch (QingCloudClientException e1) {
			//e1.printStackTrace();
		} catch (QingCloudServiceException e1) {
			//e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(deleteVolumesResponse!=null && deleteVolumesResponse.getRet_code() == 0){
			System.out.println("   Delete Volume successfully!");
		}else{
			System.out.println("   Delete Volume failed!");
		}
		if(deleteVolumesResponse!=null){
			int retCode =  deleteVolumesResponse.getRet_code();
			if(retCode==0) success = true;
		}
		
		return success;
	}
	
	public QingCloudVolume getVolume(String volume_id) {
        DescribeVolumesRequest describeVolumesRequest = new DescribeVolumesRequest();
		
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		describeVolumesRequest.setVolumes(volumes);
		describeVolumesRequest.setZone(QingCloudZone.PEK2);
		
		DescribeVolumesResponse describeVolumesResponse = null;
		try {
			describeVolumesResponse = qingCloudWSClient.describeVolumes(describeVolumesRequest);
		} catch (QingCloudClientException e) {
			e.printStackTrace();
		} catch (QingCloudServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		QingCloudVolume volume = null;
		List<QingCloudVolume> fetchedVolumes = describeVolumesResponse.getVolume_set();
		if(fetchedVolumes!=null && fetchedVolumes.size()>0){
			volume = fetchedVolumes.get(0);
		}
		return volume;
		
	}
	
	//@Test
	public void testInstanceLifecylceManagementAPIs() {
		//Create keypair
		String keypair_id = this.createKeyPair();
		
		//Create security group
		String security_group_id = this.createSecurityGroup();
		
		//Add security rules to security group
		this.applyRulesToSecurityGroup(security_group_id);
		
		//Create eip
		String eip_id = this.createEIP();
		
		//Start an instance with keypair and security group and userdata
		String instance_id = this.createInstance(keypair_id, security_group_id);
		
		//Waiting for instance because Running
		waitingForInstance(instance_id, QingCloudInstanceStatus.RUNNING);
		System.out.println("    VM Instance is runing now!");
		
		//Attach eip to instance
		this.attachEIPToInstance(eip_id, instance_id);
		
		//Apply Security Group to instance
		this.applySecurityGroupToInstance(security_group_id, instance_id);
		
		//Stop Instance
		this.stopInstance(instance_id);
		
		//waiting for instance to stop
		waitingForInstance(instance_id, QingCloudInstanceStatus.STOPPED);
		System.out.println("    VM Instance is stopped successfully!");
		
		//Start instance that status is stoppd
		this.startInstance(instance_id);
		
		//waiting for instance to running
		waitingForInstance(instance_id, QingCloudInstanceStatus.RUNNING);
		System.out.println("    VM Instance is started successfully!");
				
		//create volume
		String volume_id = this.createVolume();
		
		//waiting for volume to be available
		waitingForVolume(volume_id, QingCloudVolumeStatus.AVAILABLE);
		System.out.println("    Volume is available now!");
		
		//Attach volume to instance
		this.attachVolume(volume_id, instance_id);
		
		waitingForVolume(volume_id, QingCloudVolumeStatus.INUSE);
		System.out.println("    Volume is attached successfully!");
		
		//terminate instance
		this.terminateInstance(instance_id);
		
		//waiting for instance terminated
		waitingForInstance(instance_id, QingCloudInstanceStatus.TERMINATED);
		
		System.out.println("    VM instance is terminated successfully!");
		
		//Delete keypair
		this.deleteKeyPair(keypair_id);
		
		//delete security group
		this.deleteSecurityGroup(security_group_id);
		
		//delete eip
		this.deleteEIP(eip_id);
		
		//delete Volume
		waitingForVolume(volume_id, QingCloudVolumeStatus.AVAILABLE);
		
		int retries = 10;
		
		while(true){
			boolean success = this.deleteVolume(volume_id);
			retries--;
			if(retries==0){
				break;
			}
			if(success)
				break;
			else{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private void waitingForInstance(String instance_id, String status) {
		int max_tries = 20;
		int try_interval = 5000; //Unit ms
		while(true){
			System.out.println(String.format("    Check if instance status is %s... ...", status));
			DescribeInstancesRequest describeInstancesRequest = getDescribeInstancesRequest(instance_id);
			DescribeInstancesResponse describeInstancesResponse;
			boolean isRunning = false;
			try {
				describeInstancesResponse = qingCloudWSClient.describeInstances(describeInstancesRequest);
				List<QingCloudInstance> instances = describeInstancesResponse.getInstance_set();
				
				for(QingCloudInstance instance : instances){
					if(instance.getInstance_id().equals(instance_id) &&
							instance.getStatus().equals(status) && 
							instance.getTransition_status().equals("")){
						isRunning = true;
						break;
					}
				}
			} catch (QingCloudClientException e) {
				e.printStackTrace();
			} catch (QingCloudServiceException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(isRunning){
				break;
			}
			max_tries--;
			if(max_tries==0)
				break;
			
			try {
				Thread.sleep(try_interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void waitingForVolume(String volume_id, String status) {
		int max_tries = 20;
		int try_interval = 5000; //Unit ms
		while(true){
			System.out.println(String.format("    Check if volume status is %s... ...", status));
			DescribeVolumesRequest describeVolumesRequest = getDescribeVolumesRequest(volume_id);
			boolean isRunning = false;
			try {
				DescribeVolumesResponse describeVolumesResponse = qingCloudWSClient.describeVolumes(describeVolumesRequest);
				List<QingCloudVolume> volumes = describeVolumesResponse.getVolume_set();
				
				for(QingCloudVolume volume : volumes){
					if(volume.getVolume_id().equals(volume_id) &&
							volume.getStatus().equals(status) && 
							volume.getTransition_status().equals("")){
						isRunning = true;
						break;
					}
				}
			} catch (QingCloudClientException e) {
				//e.printStackTrace();
			} catch (QingCloudServiceException e) {
				//e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(isRunning){
				break;
			}
			max_tries--;
			if(max_tries==0)
				break;
			
			try {
				Thread.sleep(try_interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
