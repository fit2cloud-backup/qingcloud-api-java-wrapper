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
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudKeyPair;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachKeyPairsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateKeyPairRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateKeyPairResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteKeyPairsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeKeyPairsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DettachKeyPairsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DettachKeyPairsResponse;

public class QingCloudKeyPairsAPITest {

	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
	private static String KEYPAIR_NAME = "kp-env-1";
	
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
	public void testDescribeKeyPairs() throws Exception {
		DescribeKeyPairsRequest describeKeyPairsRequest = new DescribeKeyPairsRequest();
		
//		describeKeyPairsRequest.setEncrypt_method(encrypt_method);
//		describeKeyPairsRequest.setInstance_id(instance_id);
//		describeKeyPairsRequest.setKeypairs(keypairs);
//		describeKeyPairsRequest.setLimit(limit);
//		describeKeyPairsRequest.setOffset(offset);
		describeKeyPairsRequest.setSearch_word(KEYPAIR_NAME);
//		describeKeyPairsRequest.setVerbose(verbose);
		describeKeyPairsRequest.setZone(QingCloudZone.PEK2);
		
		DescribeKeyPairsResponse describeKeyPairsResponse = qingCloudWSClient.describeKeyPairs(describeKeyPairsRequest);
		assertTrue(describeKeyPairsResponse!=null);
		System.out.println("describeKeyPairsResponse.getRet_code()=" + describeKeyPairsResponse.getRet_code());

		if(describeKeyPairsResponse.getRet_code()!=0){
			String message = describeKeyPairsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudKeyPair> keypairs = describeKeyPairsResponse.getKeypair_set();
		for(QingCloudKeyPair keypair : keypairs) {
			System.out.println("keypair_id="+keypair.getKeypair_id());
			System.out.println("keypair_name="+keypair.getKeypair_name());
		}
		
		assertTrue(describeKeyPairsResponse.getRet_code() == 0);
	}
	
	@Test
	public void testCreateKeyPair() throws Exception {
		CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
		
		String keypair_name = KEYPAIR_NAME;
		String mode = "system";
		String encrypt_method = "ssh-rsa";
		createKeyPairRequest.setKeypair_name(keypair_name);
		createKeyPairRequest.setMode(mode);
		createKeyPairRequest.setEncrypt_method(encrypt_method);
		createKeyPairRequest.setZone(QingCloudZone.PEK2);
		
		CreateKeyPairResponse createKeyPairResponse = qingCloudWSClient.createKeyPair(createKeyPairRequest);
		assertTrue(createKeyPairResponse!=null);
		System.out.println("createKeyPairResponse.getRet_code()="+createKeyPairResponse.getRet_code());
		System.out.println("createKeyPairResponse.getKeypair_id()="+createKeyPairResponse.getKeypair_id());
		if(createKeyPairResponse.getRet_code()!=0){
			String message = createKeyPairResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(createKeyPairResponse.getRet_code() == 0);
		assertTrue(createKeyPairResponse.getKeypair_id()!=null);
	}
	
	@Test
	public void testDeleteKeyPair() throws Exception {
		DeleteKeyPairsRequest deleteKeyPairsRequest = new DeleteKeyPairsRequest();
		
		String keypair_id = "kp-3gt2tf7q";
		List<String> keypairs = new ArrayList<String>();
		keypairs.add(keypair_id);
		
		deleteKeyPairsRequest.setKeypairs(keypairs);
		deleteKeyPairsRequest.setZone(QingCloudZone.PEK2);
		
		DeleteKeyPairsResponse deleteKeyPairsResponse = qingCloudWSClient.deleteKeyPairs(deleteKeyPairsRequest);
		assertTrue(deleteKeyPairsResponse!=null);
		System.out.println("deleteKeyPairsResponse.getRet_code()=" + deleteKeyPairsResponse.getRet_code());
		System.out.println("deleteKeyPairsResponse.getKeypairs()=" + deleteKeyPairsResponse.getKeypairs());
		if(deleteKeyPairsResponse.getRet_code()!=0){
			String message = deleteKeyPairsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(deleteKeyPairsResponse.getRet_code() == 0);
		assertTrue(deleteKeyPairsResponse.getKeypairs()!=null);
	}
	
	@Test
	public void testAttachKeyPairs() throws Exception {
		AttachKeyPairsRequest attachKeyPairsRequest = new AttachKeyPairsRequest();
		
		String keypair_name1 = "kp-biuwcphi";
		List<String> keypairs = new ArrayList<String>();
		keypairs.add(keypair_name1);
		
		String instance1 = "i-biuwcphi";
		List<String> instances = new ArrayList<String>();
		instances.add(instance1);
		
		attachKeyPairsRequest.setKeypairs(keypairs);
		attachKeyPairsRequest.setInstances(instances);
		attachKeyPairsRequest.setZone(QingCloudZone.PEK2);
		
		AttachKeyPairsResponse attachKeyPairsResponse = qingCloudWSClient.attachKeyPairs(attachKeyPairsRequest);
		assertTrue(attachKeyPairsResponse!=null);
		System.out.println("attachKeyPairsResponse.getRet_code()=" + attachKeyPairsResponse.getRet_code());

		if(attachKeyPairsResponse.getRet_code()!=0){
			String message = attachKeyPairsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(attachKeyPairsResponse.getRet_code() != 0);
		
	}
	
	@Test
	public void testDettachKeyPairs() throws Exception {
		DettachKeyPairsRequest dettachKeyPairsRequest = new DettachKeyPairsRequest();
		
		String keypair_name1 = "kp-biuwcphi";
		List<String> keypairs = new ArrayList<String>();
		keypairs.add(keypair_name1);
		
		String instance1 = "i-biuwcphi";
		List<String> instances = new ArrayList<String>();
		instances.add(instance1);
		
		dettachKeyPairsRequest.setKeypairs(keypairs);
		dettachKeyPairsRequest.setInstances(instances);
		dettachKeyPairsRequest.setZone(QingCloudZone.PEK2);
		
		DettachKeyPairsResponse dettachKeyPairsResponse = qingCloudWSClient.dettachKeyPairs(dettachKeyPairsRequest);
		assertTrue(dettachKeyPairsResponse!=null);
		System.out.println("dettachKeyPairsResponse.getRet_code()=" + dettachKeyPairsResponse.getRet_code());

		if(dettachKeyPairsResponse.getRet_code()!=0){
			String message = dettachKeyPairsResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(dettachKeyPairsResponse.getRet_code() != 0);
		
	}
	


}
