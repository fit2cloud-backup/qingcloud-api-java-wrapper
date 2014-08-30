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
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolume;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolumeType;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZone;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.AttachVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.CreateVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DeleteVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.DetachVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DetachVolumesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyVolumeAttributesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ModifyVolumeAttributesResponse;
import com.fit2cloud.qingcloud.wsclient.ui.model.ResizeVolumesRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.ResizeVolumesResponse;

public class QingCloudVolumesAPITest {

	private static IQingCloudWSClient qingCloudWSClient;
	private static String accessKey;
	private static String secretKey;
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

	//@Test
	public void testDescribeVolumes() throws Exception {
		DescribeVolumesRequest describeVolumesRequest = new DescribeVolumesRequest();
		
		String instance_id = "";
		List<String> volumes = new ArrayList<String>();
		int limit = 10;
		int offset = 0;
		
//		describeVolumesRequest.setInstance_id(instance_id);
//		describeVolumesRequest.setVolumes(volumes);
//		describeVolumesRequest.setLimit(limit);
//		describeVolumesRequest.setOffset(offset);
		describeVolumesRequest.setZone(QingCloudZone.PEK2);
		
		DescribeVolumesResponse describeVolumesResponse = qingCloudWSClient.describeVolumes(describeVolumesRequest);
		assertTrue(describeVolumesResponse!=null);
		System.out.println("describeVolumesResponse.getRet_code()=" + describeVolumesResponse.getRet_code());

		if(describeVolumesResponse.getRet_code()!=0){
			String message = describeVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		List<QingCloudVolume> Volumes = describeVolumesResponse.getVolume_set();
		for(QingCloudVolume volume : Volumes) {
			System.out.println("getVolume_id="+volume.getVolume_id());
			System.out.println("getVolume_name="+volume.getVolume_name());
		}
		
		assertTrue(describeVolumesResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testCreateVolumes() throws Exception {
		//PermissionDenied, high capacity volume minimum size should be [100 GB]
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
		
		CreateVolumesResponse createVolumesResponse = qingCloudWSClient.createVolumes(createVolumesRequest);
		assertTrue(createVolumesResponse!=null);
		System.out.println("createVolumesResponse.getRet_code()="+createVolumesResponse.getRet_code());
		if(createVolumesResponse.getRet_code()!=0){
			String message = createVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(createVolumesResponse.getRet_code() == 0);
		List<String> volumes = createVolumesResponse.getVolumes();
		assertTrue(volumes!=null && volumes.size()>0);
		
	}
	
	//@Test
	public void testDeleteVolumes() throws Exception {
		DeleteVolumesRequest deleteVolumesRequest = new DeleteVolumesRequest();
		
		String volume_id = "vol-xiv00o5x";
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		
		deleteVolumesRequest.setVolumes(volumes);
		deleteVolumesRequest.setZone(QingCloudZone.PEK2);
		
		DeleteVolumesResponse deleteVolumesResponse = qingCloudWSClient.deleteVolumes(deleteVolumesRequest);
		assertTrue(deleteVolumesResponse!=null);
		System.out.println("deleteVolumesResponse.getRet_code()=" + deleteVolumesResponse.getRet_code());
		if(deleteVolumesResponse.getRet_code()!=0){
			String message = deleteVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(deleteVolumesResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testAttachVolumes() throws Exception {
		AttachVolumesRequest attachVolumesRequest = new AttachVolumesRequest();
		
		String volume_id = "vol-uoo5zq2l";
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		
		String instance_id = "i-72sa513c";
		
		attachVolumesRequest.setVolumes(volumes);
		attachVolumesRequest.setInstance(instance_id);
		attachVolumesRequest.setZone(QingCloudZone.PEK2);
		
		AttachVolumesResponse attachVolumesResponse = qingCloudWSClient.attachVolumes(attachVolumesRequest);
		assertTrue(attachVolumesResponse!=null);
		System.out.println("attachVolumesResponse.getRet_code()=" + attachVolumesResponse.getRet_code());

		if(attachVolumesResponse.getRet_code()!=0){
			String message = attachVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(attachVolumesResponse.getRet_code() != 0);
		
	}
	
	//@Test
	public void testDetachVolumes() throws Exception {
		DetachVolumesRequest detachVolumesRequest = new DetachVolumesRequest();
		
		String volume_id = "vol-uoo5zq2l";
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		
		String instance_id = "i-72sa513c";
		
		detachVolumesRequest.setVolumes(volumes);
		detachVolumesRequest.setInstance(instance_id);
		detachVolumesRequest.setZone(QingCloudZone.PEK2);
		
		DetachVolumesResponse detachVolumesResponse = qingCloudWSClient.detachVolumes(detachVolumesRequest);
		assertTrue(detachVolumesResponse!=null);
		System.out.println("detachVolumesResponse.getRet_code()=" + detachVolumesResponse.getRet_code());

		if(detachVolumesResponse.getRet_code()!=0){
			String message = detachVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(detachVolumesResponse.getRet_code() == 0);
	}
	
	//@Test
	public void testResizeVolumes() throws Exception {
		ResizeVolumesRequest resizeVolumesRequest = new ResizeVolumesRequest();
		
		String volume_id = "vol-uoo5zq2l";
		List<String> volumes = new ArrayList<String>();
		volumes.add(volume_id);
		
		Integer size = 20;
		
		resizeVolumesRequest.setVolumes(volumes);
		resizeVolumesRequest.setSize(size);
		resizeVolumesRequest.setZone(QingCloudZone.PEK2);
		
		ResizeVolumesResponse resizeVolumesResponse = qingCloudWSClient.resizeVolumes(resizeVolumesRequest);
		assertTrue(resizeVolumesResponse!=null);
		System.out.println("resizeVolumesResponse.getRet_code()=" + resizeVolumesResponse.getRet_code());

		if(resizeVolumesResponse.getRet_code()!=0){
			String message = resizeVolumesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(resizeVolumesResponse.getRet_code() == 0);
		
	}
	
	
	//@Test
	public void testModifyVolumeAttributes() throws Exception {
		ModifyVolumeAttributesRequest modifyVolumeAttributesRequest = new ModifyVolumeAttributesRequest();
		
		String volume_id = "vol-uoo5zq2l";
		String volume_name = "testModifyVolumeName";
		String volume_description = "testModifyVolumeDescription";
		
		modifyVolumeAttributesRequest.setVolume(volume_id);
		modifyVolumeAttributesRequest.setVolume_name(volume_name);
		modifyVolumeAttributesRequest.setDescription(volume_description);
		modifyVolumeAttributesRequest.setZone(QingCloudZone.PEK2);
		
		ModifyVolumeAttributesResponse modifyVolumeAttributesResponse = qingCloudWSClient.modifyVolumeAttributes(modifyVolumeAttributesRequest);
		assertTrue(modifyVolumeAttributesResponse!=null);
		System.out.println("modifyVolumeAttributesResponse.getRet_code()=" + modifyVolumeAttributesResponse.getRet_code());

		if(modifyVolumeAttributesResponse.getRet_code()!=0){
			String message = modifyVolumeAttributesResponse.getMessage();
			System.out.println("message="+message);
		}
		
		assertTrue(modifyVolumeAttributesResponse.getRet_code() == 0);
		
	}


}
