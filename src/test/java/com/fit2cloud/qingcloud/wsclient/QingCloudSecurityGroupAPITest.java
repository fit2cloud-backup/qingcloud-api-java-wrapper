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
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudResource;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSecurityGroupRule;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddSecurityGroupRulesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AddSecurityGroupRulesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ApplySecurityGroupRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ApplySecurityGroupResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateSecurityGroupRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateSecurityGroupResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupRulesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupRulesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteSecurityGroupsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeSecurityGroupRulesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeSecurityGroupRulesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeSecurityGroupsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeSecurityGroupsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifySecurityGroupAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifySecurityGroupAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifySecurityGroupRuleAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifySecurityGroupRuleAttributesResponse;


public class QingCloudSecurityGroupAPITest {

	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
	private static String SECURITY_GROUP_NAME = "sg-wordpress-web";
	
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
	public void testDescribeSecurityGroups() throws Exception {
		DescribeSecurityGroupsRequest describeSecurityGroupsRequest = new DescribeSecurityGroupsRequest();
		
		String security_group = "sg-y5o2pzjt";
		List<String> security_groups = new ArrayList<String>();
		security_groups.add(security_group);
		Integer verbose = 1;
		Integer limit = 20;
		Integer offset = 0;
		String search_word = "wordpress";
		//describeSecurityGroupsRequest.setLimit(limit);
		//describeSecurityGroupsRequest.setOffset(offset);
		//describeSecurityGroupsRequest.setSearch_word(search_word);
		describeSecurityGroupsRequest.setSecurity_groups(security_groups);
		describeSecurityGroupsRequest.setVerbose(verbose);
		describeSecurityGroupsRequest.setZone(QingCloudZone.PEK2);
		
		DescribeSecurityGroupsResponse describeSecurityGroupsResponse = qingCloudWSClient.describeSecurityGroups(describeSecurityGroupsRequest);
		assertTrue(describeSecurityGroupsResponse!=null);
		
		List<QingCloudResource> resources = describeSecurityGroupsResponse.getResources();
		for(QingCloudResource resource : resources){
			System.out.println("resources="+resource.getResource_id());
		}
	}
	
	//@Test
	public void testCreateSecurityGroup() throws Exception {
		CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
		
		String security_group_name = SECURITY_GROUP_NAME;
		
		createSecurityGroupRequest.setSecurity_group_name(security_group_name);
		createSecurityGroupRequest.setZone(QingCloudZone.PEK2);
		
		CreateSecurityGroupResponse createSecurityGroupResponse = qingCloudWSClient.createSecurityGroup(createSecurityGroupRequest);
		assertTrue(createSecurityGroupResponse!=null);
		System.out.println("createSecurityGroupResponse.getRet_code()="+createSecurityGroupResponse.getRet_code());

		if(createSecurityGroupResponse.getRet_code()!=0){
			String message = createSecurityGroupResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(createSecurityGroupResponse.getRet_code() == 0);
		assertTrue(createSecurityGroupResponse.getSecurity_group_id()!=null);
	}
	
	//@Test
	public void testDeleteSecurityGroups() throws Exception {
		DeleteSecurityGroupsRequest deleteSecurityGroupsRequest = new DeleteSecurityGroupsRequest();
		
		List<String> security_groups=new ArrayList<String>();
		security_groups.add("sg-y5o2pzjt");
		
		deleteSecurityGroupsRequest.setSecurity_groups(security_groups);
		deleteSecurityGroupsRequest.setZone(QingCloudZone.PEK2);
		
		DeleteSecurityGroupsResponse deleteSecurityGroupsResponse = qingCloudWSClient.deleteSecurityGroups(deleteSecurityGroupsRequest);
		assertTrue(deleteSecurityGroupsResponse!=null);
		System.out.println("deleteSecurityGroupsResponse.getRet_code()="+deleteSecurityGroupsResponse.getRet_code());

		if(deleteSecurityGroupsResponse.getRet_code()!=0){
			String message = deleteSecurityGroupsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(deleteSecurityGroupsResponse.getRet_code() != 0);
		assertTrue(deleteSecurityGroupsResponse.getSecurity_groups()==null);
	}
	
	//@Test
	public void testApplySecurityGroups() throws Exception {
		ApplySecurityGroupRequest applySecurityGroupRequest = new ApplySecurityGroupRequest();
		
		String security_group = "sg-y5o2pzjt";
		List<String> instances=new ArrayList<String>();
		instances.add("i-7dzmvwdg");
		
		applySecurityGroupRequest.setSecurity_group(security_group);
		applySecurityGroupRequest.setInstances(instances);
		applySecurityGroupRequest.setZone(QingCloudZone.PEK2);
		
		ApplySecurityGroupResponse applySecurityGroupResponse = qingCloudWSClient.applySecurityGroup(applySecurityGroupRequest);
		assertTrue(applySecurityGroupResponse!=null);
		System.out.println("applySecurityGroupResponse.getRet_code()="+applySecurityGroupResponse.getRet_code());

		if(applySecurityGroupResponse.getRet_code()!=0){
			String message = applySecurityGroupResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(applySecurityGroupResponse.getRet_code() != 0);
	}
	
	//@Test
	public void testModifySecurityGroupAttributes() throws Exception {
		ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest = new ModifySecurityGroupAttributesRequest();
		
		String description = "Wordpress web firewall";
		String security_group = "sg-y5o2pzjt";
		String security_group_name = "sg-wordpress-web";
		modifySecurityGroupAttributesRequest.setDescription(description);
		modifySecurityGroupAttributesRequest.setSecurity_group(security_group);
		modifySecurityGroupAttributesRequest.setSecurity_group_name(security_group_name);
		modifySecurityGroupAttributesRequest.setZone(QingCloudZone.PEK2);
		
		ModifySecurityGroupAttributesResponse modifySecurityGroupAttributesResponse = qingCloudWSClient.modifySecurityGroupAttributes(modifySecurityGroupAttributesRequest);
		assertTrue(modifySecurityGroupAttributesResponse!=null);
		System.out.println("modifySecurityGroupAttributesResponse.getRet_code()="+modifySecurityGroupAttributesResponse.getRet_code());

		if(modifySecurityGroupAttributesResponse.getRet_code()!=0){
			String message = modifySecurityGroupAttributesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(modifySecurityGroupAttributesResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testDescribeSecurityGroupRules() throws Exception {
		DescribeSecurityGroupRulesRequest describeSecurityGroupRulesRequest = new DescribeSecurityGroupRulesRequest();
		
		String security_group = "sg-y5o2pzjt";
		describeSecurityGroupRulesRequest.setSecurity_group(security_group);
		//describeSecurityGroupRulesRequest.setSecurity_group_rules(security_group_rules);
		//describeSecurityGroupRulesRequest.setDirection(direction);
		//describeSecurityGroupRulesRequest.setLimit(limit);
		//describeSecurityGroupRulesRequest.setOffset(offset);
		describeSecurityGroupRulesRequest.setZone(QingCloudZone.PEK2);
		
		DescribeSecurityGroupRulesResponse describeSecurityGroupRulesResponse = qingCloudWSClient.describeSecurityGroupRules(describeSecurityGroupRulesRequest);
		assertTrue(describeSecurityGroupRulesResponse!=null);
		System.out.println("describeSecurityGroupRulesResponse.getRet_code()="+describeSecurityGroupRulesResponse.getRet_code());

		if(describeSecurityGroupRulesResponse.getRet_code()!=0){
			String message = describeSecurityGroupRulesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(describeSecurityGroupRulesResponse.getRet_code() == 0);
		
		List<QingCloudSecurityGroupRule> security_group_rule_set = describeSecurityGroupRulesResponse.getSecurity_group_rule_set();
		for(QingCloudSecurityGroupRule sgRule : security_group_rule_set){
			System.out.println("sgRule.getAction()="+sgRule.getAction());
		}
	}

	//@Test
	public void testAddSecurityGroupRules() throws Exception {
		AddSecurityGroupRulesRequest addSecurityGroupRulesRequest = new AddSecurityGroupRulesRequest();
		
		String security_group = "sg-y5o2pzjt";
		List<QingCloudSecurityGroupRule> rules = new ArrayList<QingCloudSecurityGroupRule>();
		QingCloudSecurityGroupRule qingCloudSecurityGroupRule = new QingCloudSecurityGroupRule();
		
		String action = "accept";
		Integer priority = 1;
		String protocol = "tcp";
		String security_group_rule_name = "zookeeperPublic";
		Integer direction = 0;
		String val1 = "9003";
		String val2 = "9003";
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
		
		addSecurityGroupRulesRequest.setSecurity_group(security_group);
		addSecurityGroupRulesRequest.setRules(rules);
		addSecurityGroupRulesRequest.setZone(QingCloudZone.PEK2);
		
		AddSecurityGroupRulesResponse addSecurityGroupRulesResponse = qingCloudWSClient.addSecurityGroupRules(addSecurityGroupRulesRequest);
		assertTrue(addSecurityGroupRulesResponse!=null);
		System.out.println("addSecurityGroupRulesResponse.getRet_code()="+addSecurityGroupRulesResponse.getRet_code());

		if(addSecurityGroupRulesResponse.getRet_code()!=0){
			String message = addSecurityGroupRulesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(addSecurityGroupRulesResponse.getRet_code() == 0);
	}

	//@Test
	public void testDeleteSecurityGroupRules() throws Exception {
		DeleteSecurityGroupRulesRequest deleteSecurityGroupRulesRequest = new DeleteSecurityGroupRulesRequest();
		
		List<String> security_group_rules = new ArrayList<String>();
		security_group_rules.add("sgr-u61ri1z5");
		deleteSecurityGroupRulesRequest.setSecurity_group_rules(security_group_rules);
		deleteSecurityGroupRulesRequest.setZone(QingCloudZone.PEK2);
		
		DeleteSecurityGroupRulesResponse deleteSecurityGroupRulesResponse = qingCloudWSClient.deleteSecurityGroupRules(deleteSecurityGroupRulesRequest);
		assertTrue(deleteSecurityGroupRulesResponse!=null);
		System.out.println("deleteSecurityGroupRulesResponse.getRet_code()="+deleteSecurityGroupRulesResponse.getRet_code());

		if(deleteSecurityGroupRulesResponse.getRet_code()!=0){
			String message = deleteSecurityGroupRulesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(deleteSecurityGroupRulesResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testModifySecurityGroupRuleAttributes() throws Exception {
		ModifySecurityGroupRuleAttributesRequest modifySecurityGroupRuleAttributesRequest = new ModifySecurityGroupRuleAttributesRequest();
		
		String security_group_rule = "sgr-fdmbv8om";
		String security_group_rule_name = "http80";
		Integer priority = 2;
		modifySecurityGroupRuleAttributesRequest.setSecurity_group_rule(security_group_rule);
		modifySecurityGroupRuleAttributesRequest.setSecurity_group_rule_name(security_group_rule_name);
		modifySecurityGroupRuleAttributesRequest.setPriority(priority);
		modifySecurityGroupRuleAttributesRequest.setZone(QingCloudZone.PEK2);
		
		ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributesResponse = qingCloudWSClient.modifySecurityGroupRuleAttributes(modifySecurityGroupRuleAttributesRequest);
		assertTrue(modifySecurityGroupRuleAttributesResponse!=null);
		System.out.println("modifySecurityGroupRuleAttributesResponse.getRet_code()="+modifySecurityGroupRuleAttributesResponse.getRet_code());

		if(modifySecurityGroupRuleAttributesResponse.getRet_code()!=0){
			String message = modifySecurityGroupRuleAttributesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(modifySecurityGroupRuleAttributesResponse.getRet_code() == 0);
	}

}
