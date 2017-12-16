package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudMongosAPITest {
	
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
	public void testStartMongos() throws Exception {
		StartMongosRequest startMongosRequest = new StartMongosRequest();
		startMongosRequest.setMongos_n("mongo-0fdq5jkl");
		startMongosRequest.setZone(QingCloudZone.PEK3);

		StartMongosResponse startMongosResponse = qingCloudWSClient.startMongos(startMongosRequest);
		assertTrue(startMongosResponse!=null);
		assertTrue(startMongosResponse.getRet_code()==0);
		List<String> mongos = startMongosResponse.getMongo_ids();
		for(String mongo : mongos){
			System.out.println(mongo);
		}
		System.out.println("QingCloudWSClientTest");
	}
	//@Test
	public void testStopMongos() throws Exception {
		StopMongosRequest stopMongosRequest = new StopMongosRequest();
		stopMongosRequest.setMongos_n("mongo-0fdq5jkl");
		stopMongosRequest.setZone(QingCloudZone.PEK3);

		StopMongosResponse stopMongosResponse = qingCloudWSClient.stopMongos(stopMongosRequest);
		assertTrue(stopMongosResponse!=null);
		assertTrue(stopMongosResponse.getRet_code()==0);
		List<String> mongos = stopMongosResponse.getMongo_ids();
		for(String mongo : mongos){
			System.out.println(mongo);
		}
		System.out.println("QingCloudWSClientTest");
	}
}
