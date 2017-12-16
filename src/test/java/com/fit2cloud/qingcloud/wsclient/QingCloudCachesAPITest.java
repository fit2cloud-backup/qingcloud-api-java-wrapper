package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartCachesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartCachesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopCachesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopCachesResponse;
import org.junit.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudCachesAPITest {
	
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
	public void testStartCaches() throws Exception {
		StartCachesRequest startCachesRequest = new StartCachesRequest();
		startCachesRequest.setCaches_n("c-bitdo0a9");
		startCachesRequest.setZone(QingCloudZone.PEK3);

		StartCachesResponse startCachesResponse = qingCloudWSClient.startCaches(startCachesRequest);
		assertTrue(startCachesResponse!=null);
		assertTrue(startCachesResponse.getRet_code()==0);
		System.out.println("QingCloudWSClientTest");
	}
	//@Test
	public void testStopCaches() throws Exception {
		StopCachesRequest stopCachesRequest = new StopCachesRequest();
		stopCachesRequest.setCaches_n("c-bitdo0a9");
		stopCachesRequest.setZone(QingCloudZone.PEK3);

		StopCachesResponse stopCachesResponse = qingCloudWSClient.stopCaches(stopCachesRequest);
		assertTrue(stopCachesResponse!=null);
		assertTrue(stopCachesResponse.getRet_code()==0);
		System.out.println("QingCloudWSClientTest");
	}
}
