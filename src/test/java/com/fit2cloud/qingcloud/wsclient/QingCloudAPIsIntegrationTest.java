package com.fit2cloud.qingcloud.wsclient;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
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
    
	public static CreateKeyPairRequest getCreateKeyPairRequest(){
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
	
	public static CreateSecurityGroupRequest getCreateSecurityGroupRequest(){
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
	
	@Test
	public void testInstanceLifecylcesManagement() throws Exception {
		//create keypair
		CreateKeyPairRequest createKeyPairRequest = this.getCreateKeyPairRequest();
		CreateKeyPairResponse createKeyPairResponse = qingCloudWSClient.createKeyPair(createKeyPairRequest);
		String keypair_id = createKeyPairResponse.getKeypair_id();
		assertTrue(keypair_id!=null);
		
		String private_key = createKeyPairResponse.getPrivate_key();
		String strPrivateKeyPath = "/tmp/key-"+System.currentTimeMillis()+".pem";
		FileUtils.writeStringToFile(new File(strPrivateKeyPath), private_key);
		System.out.println(String.format("KeyPair %s created!", keypair_id));
		
		//create security group
		CreateSecurityGroupRequest createSecurityGroupRequest = this.getCreateSecurityGroupRequest();
		CreateSecurityGroupResponse createSecurityGroupResponse = qingCloudWSClient.createSecurityGroup(createSecurityGroupRequest);
		String security_group_id = createSecurityGroupResponse.getSecurity_group_id();
		System.out.println(String.format("SecurityGroup %s created!", security_group_id));
		assertTrue(security_group_id!=null);
		
		//Add security rules to security group
		List<QingCloudSecurityGroupRule> rules = getSecurityGroupRules();
		AddSecurityGroupRulesRequest addSecurityGroupRulesRequest = getAddSecurityGroupRulesRequest(security_group_id, rules);
		AddSecurityGroupRulesResponse addSecurityGroupRulesResponse = qingCloudWSClient.addSecurityGroupRules(addSecurityGroupRulesRequest);
		List<String> securityGroupRules = addSecurityGroupRulesResponse.getSecurity_group_rules();
		for(String rule : securityGroupRules){
			System.out.println(String.format("SecurityGroupRule %s added to SecurityGroup %s!", rule, security_group_id));
		}
		
		//Create eip
		AllocateEipsRequest allocateEipsRequest = getAllocateEipsRequest();
		AllocateEipsResponse allocateEipsResponse = qingCloudWSClient.allocateEips(allocateEipsRequest);
		List<String> eips = allocateEipsResponse.getEips();
		String eip_id = eips.get(0);
		assertTrue(eip_id!=null);
		System.out.println(String.format("EIP %s created!", eip_id));
		
		//Start an instance with keypair and security group and userdata
		RunInstancesRequest runInstancesRequest = getRunInstancesRequest(keypair_id, security_group_id);
		RunInstancesResponse runInstancesResponse = qingCloudWSClient.runInstances(runInstancesRequest);
		List<String> instances = runInstancesResponse.getInstances();
		String instance_id = instances.get(0);
		assertTrue(instance_id!=null);
		System.out.println(String.format("VM %s created!", instance_id));
		
		//Attach eip to instance
		waitingForInstance(instance_id, QingCloudInstanceStatus.RUNNING);
		
		AssociateEipRequest associateEipRequest = getAssociateEipRequest(eip_id, instance_id);
		AssociateEipResponse associateEipResponse = qingCloudWSClient.associateEip(associateEipRequest);
		assertTrue(associateEipResponse.getRet_code()==0);
		
		//Apply Security Group to instance
		ApplySecurityGroupRequest applySecurityGroupRequest = getApplySecurityGroupRequest(instance_id, security_group_id);
		ApplySecurityGroupResponse applySecurityGroupResponse = qingCloudWSClient.applySecurityGroup(applySecurityGroupRequest);
		assertTrue(applySecurityGroupResponse.getRet_code()==0);
		
		StopInstancesRequest stopInstancesRequest = getStopInstancesRequest(instance_id);
		StopInstancesResponse stopInstancesResponse = qingCloudWSClient.stopInstances(stopInstancesRequest);
		assertTrue(stopInstancesResponse!=null);
		assertTrue(stopInstancesResponse.getRet_code()==0);
		
		waitingForInstance(instance_id, QingCloudInstanceStatus.STOPPED);
		
		StartInstancesRequest startInstancesRequest = getStartInstancesRequest(instance_id);
		StartInstancesResponse startInstancesResponse = qingCloudWSClient.startInstances(startInstancesRequest);
		assertTrue(startInstancesResponse!=null);
		assertTrue(startInstancesResponse.getRet_code()==0);
		
		waitingForInstance(instance_id, QingCloudInstanceStatus.RUNNING);
				
		//create volume
        CreateVolumesRequest createVolumesRequest = getCreateVolumesRequest();
		CreateVolumesResponse createVolumesResponse = qingCloudWSClient.createVolumes(createVolumesRequest);
		assertTrue(createVolumesResponse!=null);
		assertTrue(createVolumesResponse.getRet_code()==0);
		List<String> volumes = createVolumesResponse.getVolumes();
		String volume_id = volumes.get(0);
		
		waitingForVolume(volume_id, QingCloudVolumeStatus.AVAILABLE);
		
		//attach volume to instance
		AttachVolumesRequest attachVolumesRequest =  getAttachVolumesRequest(volumes, instance_id);
		AttachVolumesResponse attachVolumesResponse = qingCloudWSClient.attachVolumes(attachVolumesRequest);
		assertTrue(attachVolumesResponse!=null);
		assertTrue(attachVolumesResponse.getRet_code()==0);
		
		waitingForVolume(volume_id, QingCloudVolumeStatus.INUSE);
		
		
		//terminate instance
		TerminateInstancesRequest terminateInstancesRequest = getTerminateInstancesRequest(instance_id);
		TerminateInstancesResponse terminateInstancesResponse = qingCloudWSClient.terminateInstances(terminateInstancesRequest);
		assertTrue(terminateInstancesResponse!=null);
		assertTrue(terminateInstancesResponse.getRet_code()==0);
		
		waitingForInstance(instance_id, QingCloudInstanceStatus.TERMINATED);
		
		//detach and delete keypair
		DeleteKeyPairsRequest deleteKeyPairsRequest = getDeleteKeyPairsRequest(keypair_id);
		DeleteKeyPairsResponse deleteKeyPairsResponse = qingCloudWSClient.deleteKeyPairs(deleteKeyPairsRequest);
		assertTrue(deleteKeyPairsResponse!=null);
		assertTrue(deleteKeyPairsResponse.getRet_code() == 0);
		
		//delete security group
        DeleteSecurityGroupsRequest deleteSecurityGroupsRequest = new DeleteSecurityGroupsRequest();
		
		List<String> security_groups=new ArrayList<String>();
		security_groups.add(security_group_id);
		
		deleteSecurityGroupsRequest.setSecurity_groups(security_groups);
		deleteSecurityGroupsRequest.setZone(QingCloudZone.PEK2);
		
		DeleteSecurityGroupsResponse deleteSecurityGroupsResponse = qingCloudWSClient.deleteSecurityGroups(deleteSecurityGroupsRequest);
		assertTrue(deleteSecurityGroupsResponse!=null);
		assertTrue(deleteSecurityGroupsResponse.getRet_code()==0);
		
		//delete eip
		ReleaseEipsRequest releaseEipsRequest = new ReleaseEipsRequest();

		List<String> toReleaseEips = new ArrayList<String>();
		toReleaseEips.add(eip_id);
		releaseEipsRequest.setEips(toReleaseEips);
		releaseEipsRequest.setZone(QingCloudZone.PEK2);
		
		ReleaseEipsResponse releaseEipsResponse = qingCloudWSClient.releaseEips(releaseEipsRequest);
		assertTrue(releaseEipsResponse!=null);
		assertTrue(releaseEipsResponse.getRet_code()==0);
		
		//delete Volume
		waitingForVolume(volume_id, QingCloudVolumeStatus.AVAILABLE);
		
		int retries = 10;
		
		while(true){
			DeleteVolumesRequest deleteVolumesRequest = new DeleteVolumesRequest();
			
			deleteVolumesRequest.setVolumes(volumes);
			deleteVolumesRequest.setZone(QingCloudZone.PEK2);
			
			DeleteVolumesResponse deleteVolumesResponse = qingCloudWSClient.deleteVolumes(deleteVolumesRequest);
			retries--;
			if(retries==0){
				break;
			}
			
			System.out.println("deleteVolumesResponse.getRet_code()=" + deleteVolumesResponse.getRet_code());
			
			if(deleteVolumesResponse.getRet_code()==0)
				break;
			else{
				Thread.sleep(5000);
			}
		}
	}
	
	private void waitingForInstance(String instance_id, String status) throws Exception {
		int max_tries = 20;
		int try_interval = 5000; //Unit ms
		while(true){
			DescribeInstancesRequest describeInstancesRequest = getDescribeInstancesRequest(instance_id);
			DescribeInstancesResponse describeInstancesResponse = qingCloudWSClient.describeInstances(describeInstancesRequest);
			List<QingCloudInstance> instances = describeInstancesResponse.getInstance_set();
			boolean isRunning = false;
			for(QingCloudInstance instance : instances){
				if(instance.getInstance_id().equals(instance_id) &&
						instance.getStatus().equals(status) && 
						instance.getTransition_status().equals("")){
					isRunning = true;
					break;
				}
			}
			if(isRunning){
				break;
			}
			max_tries--;
			if(max_tries==0)
				break;
			Thread.sleep(try_interval);
		}
	}
	
	private void waitingForVolume(String volume_id, String status) throws Exception {
		int max_tries = 20;
		int try_interval = 5000; //Unit ms
		while(true){
			DescribeVolumesRequest describeVolumesRequest = getDescribeVolumesRequest(volume_id);
			DescribeVolumesResponse describeVolumesResponse = qingCloudWSClient.describeVolumes(describeVolumesRequest);
			List<QingCloudVolume> volumes = describeVolumesResponse.getVolume_set();
			boolean isRunning = false;
			for(QingCloudVolume volume : volumes){
				if(volume.getVolume_id().equals(volume_id) &&
						volume.getStatus().equals(status) && 
						volume.getTransition_status().equals("")){
					isRunning = true;
					break;
				}
			}
			if(isRunning){
				break;
			}
			max_tries--;
			if(max_tries==0)
				break;
			Thread.sleep(try_interval);
		}
	}
	
}
