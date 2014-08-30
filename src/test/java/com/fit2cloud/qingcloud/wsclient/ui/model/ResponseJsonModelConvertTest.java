package com.fit2cloud.qingcloud.wsclient.ui.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fit2cloud.qingcloud.wsclient.ui.model.RunInstancesResponse;

public class ResponseJsonModelConvertTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRunInstancesResponse() {
		String jsonRunInstancesResponse = "{\"action\":\"RunInstancesResponse\",\"instances\":[\"i-5qyeem9d\"],\"job_id\":\"j-lz8jp11b\",\"ret_code\":0}";
		RunInstancesResponse runInstancesResponse = RunInstancesResponse.fromJson(jsonRunInstancesResponse);
		Integer ret_code = runInstancesResponse.getRet_code();
		List<String> instances = runInstancesResponse.getInstances();
		System.out.println(ret_code);
		for(String instance : instances){
			System.out.println(instance);
		}
		assertTrue(ret_code == 0);
		assertTrue(instances!=null && instances.size()>0);
		
		jsonRunInstancesResponse = "{\"message\":\"PermissionDenied, access denied for zone [pek1]\",\"ret_code\":1400}";
		runInstancesResponse = RunInstancesResponse.fromJson(jsonRunInstancesResponse);
		
		ret_code = runInstancesResponse.getRet_code();
		instances = runInstancesResponse.getInstances();
		System.out.println(ret_code);
		assertTrue(ret_code == 1400);
		assertTrue(instances==null);
	}

}
