package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartRDBsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StartRDBsResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopRDBsRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.StopRDBsResponse;
import org.junit.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudRDBsAPITest {
	
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
	public void testStartRDBs() throws Exception {
		StartRDBsRequest startRDBsRequest = new StartRDBsRequest();
		startRDBsRequest.setRdbs_n("rdb-olevtnxe");
		startRDBsRequest.setZone(QingCloudZone.PEK3);

		StartRDBsResponse startRDBsResponse = qingCloudWSClient.startRDBs(startRDBsRequest);
		assertTrue(startRDBsResponse!=null);
		assertTrue(startRDBsResponse.getRet_code()==0);
		List<String> rdbs = startRDBsResponse.getRdbs();
		for(String rdb : rdbs){
			System.out.println(rdb);
		}
		System.out.println("QingCloudWSClientTest");
	}
	//@Test
	public void testStopRDBs() throws Exception {
		StopRDBsRequest stopRDBsRequest = new StopRDBsRequest();
		stopRDBsRequest.setRdbs_n("rdb-olevtnxe");
		stopRDBsRequest.setZone(QingCloudZone.PEK3);

		StopRDBsResponse stopRDBsResponse = qingCloudWSClient.stopRDBs(stopRDBsRequest);
		assertTrue(stopRDBsResponse!=null);
		assertTrue(stopRDBsResponse.getRet_code()==0);
		List<String> rdbs = stopRDBsResponse.getRdbs();
		for(String rdb : rdbs){
			System.out.println(rdb);
		}
		System.out.println("QingCloudWSClientTest");
	}
}
