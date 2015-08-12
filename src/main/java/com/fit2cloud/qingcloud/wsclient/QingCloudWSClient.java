package com.fit2cloud.qingcloud.wsclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.SimpleTimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAction;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;


/**
 * ToDo: 
 * 1) Each Request's parameters' check
 * 2) Vxnet APIs
 * 3) Router APIs
 * 4) Image APIs
 * 5) Snapshot APIs
 * 6) Load Balancer APIs
 * 7) Monitor APIs
 * @author jason
 *
 */
public class QingCloudWSClient implements IQingCloudWSClient {
	private static final String API_VERSION = "1";
	private static final String ENDPOINT = "https://api.qingcloud.com/iaas/";
	private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	private static final String ENCODING = "UTF-8";
	private static final boolean DEBUG = false;
	

	private String accessKeyId;
	private String secretKey;

	public QingCloudWSClient(String accessKeyId, String secretKey) {
		this.accessKeyId = accessKeyId;
		this.secretKey = secretKey;
	}
	
	public DescribeInstancesResponse describeInstances(
			DescribeInstancesRequest describeInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		DescribeInstancesResponse describeInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeInstanceRequest);
			describeInstancesResponse = DescribeInstancesResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeInstancesResponse;
		
	}

	public RunInstancesResponse runInstances(
			RunInstancesRequest runInstancesRequest) throws QingCloudClientException, QingCloudServiceException, IOException {
		RunInstancesResponse runInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RUN_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					runInstancesRequest);
			runInstancesResponse = RunInstancesResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return runInstancesResponse;
	}

	public TerminateInstancesResponse terminateInstances(
			TerminateInstancesRequest terminateInstancesRequest) throws QingCloudClientException, QingCloudServiceException, IOException {
		TerminateInstancesResponse terminateInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.TERMINATE_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					terminateInstancesRequest);
			terminateInstancesResponse = TerminateInstancesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return terminateInstancesResponse;
	}
	
	public StopInstancesResponse stopInstances(
			StopInstancesRequest stopInstancesRequest) throws QingCloudClientException, QingCloudServiceException, IOException {
		StopInstancesResponse stopInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.STOP_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
						stopInstancesRequest);
			stopInstancesResponse = StopInstancesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return stopInstancesResponse;
	}
	
	
	public StartInstancesResponse startInstances(
			StartInstancesRequest startInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		StartInstancesResponse startInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.START_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
						startInstancesRequest);
			startInstancesResponse = StartInstancesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return startInstancesResponse;
	}
	
	public RestartInstancesResponse restartInstances(
			RestartInstancesRequest restartInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		RestartInstancesResponse restartInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RESTART_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					restartInstancesRequest);
			restartInstancesResponse = RestartInstancesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return restartInstancesResponse;
	}

	public ResizeInstancesResponse resizeInstances(
			ResizeInstancesRequest resizeInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		ResizeInstancesResponse resizeInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RESIZE_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					resizeInstancesRequest);
			resizeInstancesResponse = ResizeInstancesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return resizeInstancesResponse;
	}
	
	public ResetInstancesResponse resetInstances(
			ResetInstancesRequest resetInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		ResetInstancesResponse resetInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RESET_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					resetInstancesRequest);
			resetInstancesResponse = ResetInstancesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return resetInstancesResponse;
	}
	
	public ModifyInstanceAttributesResponse modifyInstanceAttributes(
			ModifyInstanceAttributesRequest modifyInstanceAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		ModifyInstanceAttributesResponse modifyInstanceAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_INSTANCE_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyInstanceAttributesRequest);
			modifyInstanceAttributesResponse = ModifyInstanceAttributesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyInstanceAttributesResponse;
	}
	
	public UploadUserDataAttachmentResponse uploadUserDataAttachment(
			UploadUserDataAttachmentRequest uploadUserDataAttachmentRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException{
		return null;
	}
	
	
	public CreateKeyPairResponse createKeyPair(
			CreateKeyPairRequest createKeyPairRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		CreateKeyPairResponse createKeyPairResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_KEY_PAIR;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createKeyPairRequest);
			createKeyPairResponse = CreateKeyPairResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createKeyPairResponse;
	}
	
	public DeleteKeyPairsResponse deleteKeyPairs(
			DeleteKeyPairsRequest deleteKeyPairsRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		DeleteKeyPairsResponse deleteKeyPairsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_KEY_PAIRS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteKeyPairsRequest);
			deleteKeyPairsResponse = DeleteKeyPairsResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteKeyPairsResponse;
		
	}
	
	public AttachKeyPairsResponse attachKeyPairs(
			AttachKeyPairsRequest attachKeyPairsRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		AttachKeyPairsResponse attachKeyPairsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ATTACH_KEY_PAIRS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					attachKeyPairsRequest);
			attachKeyPairsResponse = AttachKeyPairsResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return attachKeyPairsResponse;
	}
	
	public DettachKeyPairsResponse dettachKeyPairs(
			DettachKeyPairsRequest dettachKeyPairsRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		DettachKeyPairsResponse dettachKeyPairsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DETACH_KEY_PAIRS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					dettachKeyPairsRequest);
			dettachKeyPairsResponse = DettachKeyPairsResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return dettachKeyPairsResponse;
	}
	
	public DescribeKeyPairsResponse describeKeyPairs(
			DescribeKeyPairsRequest describeKeyPairsRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		DescribeKeyPairsResponse describeKeyPairsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_KEY_PAIRS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeKeyPairsRequest);
			describeKeyPairsResponse = DescribeKeyPairsResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeKeyPairsResponse;
	}
	
	public ModifyKeyPairAttributesResponse modifyKeyPairAttributes(
			ModifyKeyPairAttributesRequest modifyKeyPairAttributesRequest) 
			throws QingCloudClientException, QingCloudServiceException, IOException{
		
		ModifyKeyPairAttributesResponse modifyKeyPairAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_KEYPAIR_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyKeyPairAttributesRequest);
			modifyKeyPairAttributesResponse = ModifyKeyPairAttributesResponse
						.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyKeyPairAttributesResponse;
		
	}
	
	public DescribeSecurityGroupsResponse describeSecurityGroups(
			DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeSecurityGroupsResponse describeSecurityGroupsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_SECURITY_GROUPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeSecurityGroupsRequest);
			describeSecurityGroupsResponse = DescribeSecurityGroupsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeSecurityGroupsResponse;
	}

	public CreateSecurityGroupResponse createSecurityGroup(
			CreateSecurityGroupRequest createSecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateSecurityGroupResponse createSecurityGroupResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_SECURITY_GROUP;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createSecurityGroupRequest);
			createSecurityGroupResponse = CreateSecurityGroupResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createSecurityGroupResponse;
	}

	public ModifySecurityGroupAttributesResponse modifySecurityGroupAttributes(
			ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifySecurityGroupAttributesResponse modifySecurityGroupAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_SECURITY_GROUP_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifySecurityGroupAttributesRequest);
			modifySecurityGroupAttributesResponse = ModifySecurityGroupAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifySecurityGroupAttributesResponse;
	}

	public ApplySecurityGroupResponse applySecurityGroup(
			ApplySecurityGroupRequest applySecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ApplySecurityGroupResponse applySecurityGroupResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.APPLY_SECURITY_GROUP;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action, applySecurityGroupRequest);
			applySecurityGroupResponse = ApplySecurityGroupResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return applySecurityGroupResponse;
	}

	public DeleteSecurityGroupsResponse deleteSecurityGroups(
			DeleteSecurityGroupsRequest deleteSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteSecurityGroupsResponse deleteSecurityGroupsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_SECURITY_GROUPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteSecurityGroupsRequest);
			deleteSecurityGroupsResponse = DeleteSecurityGroupsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteSecurityGroupsResponse;
	}

	public DescribeSecurityGroupRulesResponse describeSecurityGroupRules(
			DescribeSecurityGroupRulesRequest describeSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeSecurityGroupRulesResponse describeSecurityGroupRulesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_SECURITY_GROUP_RULES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeSecurityGroupRulesRequest);
			describeSecurityGroupRulesResponse = DescribeSecurityGroupRulesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeSecurityGroupRulesResponse;
	}

	public AddSecurityGroupRulesResponse addSecurityGroupRules(
			AddSecurityGroupRulesRequest addSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AddSecurityGroupRulesResponse addSecurityGroupRulesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ADD_SECURITY_GROUP_RULES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					addSecurityGroupRulesRequest);
			addSecurityGroupRulesResponse = AddSecurityGroupRulesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return addSecurityGroupRulesResponse;
	}

	public DeleteSecurityGroupRulesResponse deleteSecurityGroupRules(
			DeleteSecurityGroupRulesRequest deleteSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteSecurityGroupRulesResponse deleteSecurityGroupRulesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_SECURITY_GROUP_RULES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteSecurityGroupRulesRequest);
			deleteSecurityGroupRulesResponse = DeleteSecurityGroupRulesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteSecurityGroupRulesResponse;
	}

	public ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributes(
			ModifySecurityGroupRuleAttributesRequest modifySecurityGroupRuleAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_SECURITY_GROUP_RULE_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifySecurityGroupRuleAttributesRequest);
			modifySecurityGroupRuleAttributesResponse = ModifySecurityGroupRuleAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifySecurityGroupRuleAttributesResponse;
	}
	
	public DescribeVolumesResponse describeVolumes(
			DescribeVolumesRequest describeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeVolumesResponse describeVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeVolumesRequest);
			describeVolumesResponse = DescribeVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeVolumesResponse;
	}

	public CreateVolumesResponse createVolumes(
			CreateVolumesRequest createVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateVolumesResponse createVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createVolumesRequest);
			createVolumesResponse = CreateVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createVolumesResponse;
	}

	public DeleteVolumesResponse deleteVolumes(
			DeleteVolumesRequest deleteVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteVolumesResponse deleteVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteVolumesRequest);
			deleteVolumesResponse = DeleteVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteVolumesResponse;
	}

	public AttachVolumesResponse attachVolumes(
			AttachVolumesRequest attachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AttachVolumesResponse attachVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ATTACH_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					attachVolumesRequest);
			attachVolumesResponse = AttachVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return attachVolumesResponse;
	}

	public DetachVolumesResponse detachVolumes(
			DetachVolumesRequest detachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DetachVolumesResponse detachVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DETACH_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					detachVolumesRequest);
			detachVolumesResponse = DetachVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return detachVolumesResponse;
	}

	public ResizeVolumesResponse resizeVolumes(
			ResizeVolumesRequest resizeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ResizeVolumesResponse resizeVolumesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RESIZE_VOLUMES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					resizeVolumesRequest);
			resizeVolumesResponse = ResizeVolumesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return resizeVolumesResponse;
	}

	public ModifyVolumeAttributesResponse modifyVolumeAttributes(
			ModifyVolumeAttributesRequest modifyVolumeAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyVolumeAttributesResponse modifyVolumeAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_VOLUME_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyVolumeAttributesRequest);
			modifyVolumeAttributesResponse = ModifyVolumeAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyVolumeAttributesResponse;
	}


	public DescribeVxnetsResponse describeVxnets(
			DescribeVxnetsRequest describeVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeVxnetsResponse describeVxnetsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_VXNETS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeVxnetsRequest);
			describeVxnetsResponse = DescribeVxnetsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeVxnetsResponse;
	}

	public CreateVxnetsResponse createVxnets(
			CreateVxnetsRequest createVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateVxnetsResponse createVxnetsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_VXNETS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createVxnetsRequest);
			createVxnetsResponse = CreateVxnetsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createVxnetsResponse;
	}

	public DeleteVxnetsResponse deleteVxnets(
			DeleteVxnetsRequest deleteVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteVxnetsResponse deleteVxnetsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_VXNETS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteVxnetsRequest);
			deleteVxnetsResponse = DeleteVxnetsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteVxnetsResponse;
	}

	public JoinVxnetResponse joinVxnet(JoinVxnetRequest joinVxnetRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		JoinVxnetResponse joinVxnetResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.JOIN_VXNET;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					joinVxnetRequest);
			joinVxnetResponse = JoinVxnetResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return joinVxnetResponse;
	}

	public LeaveVxnetResponse leaveVxnet(LeaveVxnetRequest leaveVxnetRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		LeaveVxnetResponse leaveVxnetResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.LEAVE_VXNET;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					leaveVxnetRequest);
			leaveVxnetResponse = LeaveVxnetResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return leaveVxnetResponse;
	}

	public ModifyVxnetAttributesResponse modifyVxnetAttributes(
			ModifyVxnetAttributesRequest modifyVxnetAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyVxnetAttributesResponse modifyVxnetAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_VXNET_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyVxnetAttributesRequest);
			modifyVxnetAttributesResponse = ModifyVxnetAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyVxnetAttributesResponse;
	}

	public DescribeVxnetInstancesResponse describeVxnetInstances(
			DescribeVxnetInstancesRequest describeVxnetInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeVxnetInstancesResponse describeVxnetInstancesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_VXNET_INSTANCES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeVxnetInstancesRequest);
			describeVxnetInstancesResponse = DescribeVxnetInstancesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeVxnetInstancesResponse;
	}

	public CreateRoutersResponse createRouters(
			CreateRoutersRequest createRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateRoutersResponse createRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createRoutersRequest);
			createRoutersResponse = CreateRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createRoutersResponse;
	}

	public UpdateRoutersResponse updateRouters(
			UpdateRoutersRequest updateRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		UpdateRoutersResponse updateRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.UPDATE_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					updateRoutersRequest);
			updateRoutersResponse = UpdateRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return updateRoutersResponse;
	}

	public DeleteRoutersResponse deleteRouters(
			DeleteRoutersRequest deleteRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteRoutersResponse deleteRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteRoutersRequest);
			deleteRoutersResponse = DeleteRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteRoutersResponse;
	}

	public JoinRouterResponse joinRouter(JoinRouterRequest joinRouterRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		JoinRouterResponse joinRouterResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.JOIN_ROUTER;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					joinRouterRequest);
			joinRouterResponse = JoinRouterResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return joinRouterResponse;
	}

	public LeaveRouterResponse leaveRouter(LeaveRouterRequest leaveRouterRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		LeaveRouterResponse leaveRouterResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.LEAVE_ROUTER;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					leaveRouterRequest);
			leaveRouterResponse = LeaveRouterResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return leaveRouterResponse;
	}

	public PowerOffRoutersResponse powerOffRouters(
			PowerOffRoutersRequest powerOffRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		PowerOffRoutersResponse powerOffRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.POWEROFF_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					powerOffRoutersRequest);
			powerOffRoutersResponse = PowerOffRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return powerOffRoutersResponse;
	}

	public PowerOnRoutersResponse powerOnRouters(
			PowerOnRoutersRequest powerOnRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		PowerOnRoutersResponse powerOnRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.POWERON_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					powerOnRoutersRequest);
			powerOnRoutersResponse = PowerOnRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return powerOnRoutersResponse;
	}

	public DescribeRoutersResponse describeRouters(
			DescribeRoutersRequest describeRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeRoutersResponse describeRoutersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_ROUTERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeRoutersRequest);
			describeRoutersResponse = DescribeRoutersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeRoutersResponse;
	}

	public DescribeRouterVxnetsResponse describeRouterVxnets(
			DescribeRouterVxnetsRequest describeRouterVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeRouterVxnetsResponse describeRouterVxnetsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_ROUTER_VXNETS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeRouterVxnetsRequest);
			describeRouterVxnetsResponse = DescribeRouterVxnetsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeRouterVxnetsResponse;
	}

	public ModifyRouterAttributesResponse modifyRouterAttributes(
			ModifyRouterAttributesRequest modifyRouterAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyRouterAttributesResponse modifyRouterAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_ROUTER_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyRouterAttributesRequest);
			modifyRouterAttributesResponse = ModifyRouterAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyRouterAttributesResponse;
	}

	public DescribeRouterStaticsResponse describeRouterStatics(
			DescribeRouterStaticsRequest describeRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeRouterStaticsResponse describeRouterStaticsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_ROUTER_STATICS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeRouterStaticsRequest);
			describeRouterStaticsResponse = DescribeRouterStaticsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeRouterStaticsResponse;
	}

	public AddRouterStaticsResponse addRouterStatics(
			AddRouterStaticsRequest addRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AddRouterStaticsResponse addRouterStaticsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ADD_ROUTER_STATICS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					addRouterStaticsRequest);
			addRouterStaticsResponse = AddRouterStaticsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return addRouterStaticsResponse;
	}

	public DeleteRouterStaticsResponse deleteRouterStatics(
			DeleteRouterStaticsRequest deleteRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteRouterStaticsResponse deleteRouterStaticsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_ROUTER_STATICS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteRouterStaticsRequest);
			deleteRouterStaticsResponse = DeleteRouterStaticsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteRouterStaticsResponse;
	}
	
	public ModifyRouterStaticAttributesResponse modifyRouterStaticAttributes(
			ModifyRouterStaticAttributesRequest modifyRouterStaticAttributesRequest)
					throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyRouterStaticAttributesResponse modifyRouterStaticAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_ROUTER_STATIC_ATTRIBUTES;
		
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyRouterStaticAttributesRequest);
			modifyRouterStaticAttributesResponse = ModifyRouterStaticAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyRouterStaticAttributesResponse;
	}
	

	public AssociateEipResponse associateEip(
			AssociateEipRequest associateEipRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AssociateEipResponse associateEipResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ASSOCIATE_EIP;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					associateEipRequest);
			associateEipResponse = AssociateEipResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return associateEipResponse;
	}

	public DissociateEipsResponse dissociateEips(
			DissociateEipsRequest dissociateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DissociateEipsResponse dissociateEipsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DISSOCIATE_EIPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					dissociateEipsRequest);
			dissociateEipsResponse = DissociateEipsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return dissociateEipsResponse;
	}

	public AllocateEipsResponse allocateEips(
			AllocateEipsRequest allocateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AllocateEipsResponse allocateEipsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ALLOCATE_EIPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					allocateEipsRequest);
			allocateEipsResponse = AllocateEipsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return allocateEipsResponse;
	}

	public ReleaseEipsResponse releaseEips(ReleaseEipsRequest releaseEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ReleaseEipsResponse releaseEipsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RELEASE_EIPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					releaseEipsRequest);
			releaseEipsResponse = ReleaseEipsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return releaseEipsResponse;
	}

	public DescribeEipsResponse describeEips(
			DescribeEipsRequest describeEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeEipsResponse describeEipsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_EIPS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeEipsRequest);
			describeEipsResponse = DescribeEipsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeEipsResponse;
	}

	public ModifyEipAttributesResponse modifyEipAttributes(
			ModifyEipAttributesRequest modifyEipAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyEipAttributesResponse modifyEipAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_EIP_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyEipAttributesRequest);
			modifyEipAttributesResponse = ModifyEipAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyEipAttributesResponse;
	}

	public ChangeEipsBandwidthResponse changeEipsBandwidth(
			ChangeEipsBandwidthRequest changeEipsBandwidthRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ChangeEipsBandwidthResponse changeEipsBandwidthResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CHANGE_EIPS_BANDWIDTH;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					changeEipsBandwidthRequest);
			changeEipsBandwidthResponse = ChangeEipsBandwidthResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return changeEipsBandwidthResponse;
	}

	public DescribeLoadBalancersResponse describeLoadBalancers(
			DescribeLoadBalancersRequest describeLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeLoadBalancersResponse describeLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeLoadBalancersRequest);
			describeLoadBalancersResponse = DescribeLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeLoadBalancersResponse;
	}

	public CreateLoadBalancerResponse createLoadBalancer(
			CreateLoadBalancerRequest createLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateLoadBalancerResponse createLoadBalancerResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_LOADBALANCER;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createLoadBalancerRequest);
			createLoadBalancerResponse = CreateLoadBalancerResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createLoadBalancerResponse;
	}

	public DeleteLoadBalancersResponse deleteLoadBalancers(
			DeleteLoadBalancersRequest deleteLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteLoadBalancersResponse deleteLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteLoadBalancersRequest);
			deleteLoadBalancersResponse = DeleteLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteLoadBalancersResponse;
	}

	public AssociateEipsToLoadBalancerResponse associateEipsToLoadBalancer(
			AssociateEipsToLoadBalancerRequest associateEipsToLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AssociateEipsToLoadBalancerResponse associateEipsToLoadBalancerResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ASSOCIATE_EIPS_TO_LOADBALANCER;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					associateEipsToLoadBalancerRequest);
			associateEipsToLoadBalancerResponse = AssociateEipsToLoadBalancerResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return associateEipsToLoadBalancerResponse;
	}

	public DissociateEipsFromLoadBalancerResponse dissociateEipsFromLoadBalancer(
			DissociateEipsFromLoadBalancerRequest dissociateEipsFromLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DissociateEipsFromLoadBalancerResponse dissociateEipsFromLoadBalancerResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DISSOCIATE_EIPS_FROM_LOADBALANCER;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					dissociateEipsFromLoadBalancerRequest);
			dissociateEipsFromLoadBalancerResponse = DissociateEipsFromLoadBalancerResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return dissociateEipsFromLoadBalancerResponse;
	}

	public UpdateLoadBalancersResponse updateLoadBalancers(
			UpdateLoadBalancersRequest updateLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		UpdateLoadBalancersResponse updateLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.UPDATE_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					updateLoadBalancersRequest);
			updateLoadBalancersResponse = UpdateLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return updateLoadBalancersResponse;
	}

	public StopLoadBalancersResponse stopLoadBalancers(
			StopLoadBalancersRequest stopLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		StopLoadBalancersResponse stopLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.STOP_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					stopLoadBalancersRequest);
			stopLoadBalancersResponse = StopLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return stopLoadBalancersResponse;
	}

	public StartLoadBalancersResponse startLoadBalancers(
			StartLoadBalancersRequest startLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		StartLoadBalancersResponse startLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.START_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					startLoadBalancersRequest);
			startLoadBalancersResponse = StartLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return startLoadBalancersResponse;
	}

	public ModifyLoadBalancerAttributesResponse modifyLoadBalancerAttributes(
			ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyLoadBalancerAttributesResponse modifyLoadBalancerAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_LOADBALANCER_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyLoadBalancerAttributesRequest);
			modifyLoadBalancerAttributesResponse = ModifyLoadBalancerAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyLoadBalancerAttributesResponse;
	}

	public ResizeLoadBalancersResponse resizeLoadBalancers(
			ResizeLoadBalancersRequest resizeLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		ResizeLoadBalancersResponse resizeLoadBalancersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.RESIZE_LOADBALANCERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					resizeLoadBalancersRequest);
			resizeLoadBalancersResponse = ResizeLoadBalancersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return resizeLoadBalancersResponse;
	}
	
	public DescribeLoadBalancerListenersResponse describeLoadBalancerListeners(
			DescribeLoadBalancerListenersRequest describeLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_LOADBALANCER_LISTENERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeLoadBalancerListenersRequest);
			describeLoadBalancerListenersResponse = DescribeLoadBalancerListenersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeLoadBalancerListenersResponse;
	}

	public AddLoadBalancerListenersResponse addLoadBalancerListeners(
			AddLoadBalancerListenersRequest addLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AddLoadBalancerListenersResponse addLoadBalancerListenersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ADD_LOADBALANCER_LISTENERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					addLoadBalancerListenersRequest);
			addLoadBalancerListenersResponse = AddLoadBalancerListenersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return addLoadBalancerListenersResponse;
	}

	public DeleteLoadBalancerListenersResponse deleteLoadBalancerListeners(
			DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteLoadBalancerListenersResponse deleteLoadBalancerListenersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_LOADBALANCER_LISTENERS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteLoadBalancerListenersRequest);
			deleteLoadBalancerListenersResponse = DeleteLoadBalancerListenersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteLoadBalancerListenersResponse;
	}

	public ModifyLoadBalancerListenerAttributesResponse modifyLoadBalancerListenerAttributes(
			ModifyLoadBalancerListenerAttributesRequest modifyLoadBalancerListenerAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyLoadBalancerListenerAttributesResponse modifyLoadBalancerListenerAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_LOADBALANCER_LISTENER_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyLoadBalancerListenerAttributesRequest);
			modifyLoadBalancerListenerAttributesResponse = ModifyLoadBalancerListenerAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyLoadBalancerListenerAttributesResponse;
	}

	public AddLoadBalancerBackendsResponse addLoadBalancerBackends(
			AddLoadBalancerBackendsRequest addLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		AddLoadBalancerBackendsResponse addLoadBalancerBackendsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.ADD_LOADBALANCER_BACKENDS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					addLoadBalancerBackendsRequest);
			addLoadBalancerBackendsResponse = AddLoadBalancerBackendsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return addLoadBalancerBackendsResponse;
	}

	public DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackends(
			DeleteLoadBalancerBackendsRequest deleteLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackendsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_LOADBALANCER_BACKENDS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteLoadBalancerBackendsRequest);
			deleteLoadBalancerBackendsResponse = DeleteLoadBalancerBackendsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteLoadBalancerBackendsResponse;
	}

	public ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributes(
			ModifyLoadBalancerBackendAttributesRequest modifyLoadBalancerBackendAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_LOADBALANCER_BACKEND_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyLoadBalancerBackendAttributesRequest);
			modifyLoadBalancerBackendAttributesResponse = ModifyLoadBalancerBackendAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyLoadBalancerBackendAttributesResponse;
	}

	public DescribeLoadBalancerBackendsResponse describeLoadBalancerBackends(
			DescribeLoadBalancerBackendsRequest describeLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeLoadBalancerBackendsResponse describeLoadBalancerBackendsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_LOADBALANCER_BACKENDS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeLoadBalancerBackendsRequest);
			describeLoadBalancerBackendsResponse = DescribeLoadBalancerBackendsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeLoadBalancerBackendsResponse;
	}

	public GetMonitorResponse getMonitor(GetMonitorRequest getMonitorRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		GetMonitorResponse getMonitorResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.GET_MONITOR;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					getMonitorRequest);
			getMonitorResponse = GetMonitorResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return getMonitorResponse;
	}

	public GetLoadBalancerMonitorResponse getLoadBalancerMonitor(
			GetLoadBalancerMonitorRequest getLoadBalancerMonitorRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		GetLoadBalancerMonitorResponse getLoadBalancerMonitorResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.GET_LOADBALANCER_MONITOR;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					getLoadBalancerMonitorRequest);
			getLoadBalancerMonitorResponse = GetLoadBalancerMonitorResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return getLoadBalancerMonitorResponse;
	}

	public CreateSnapshotsResponse createSnapshots(
			CreateSnapshotsRequest createSnapshotsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateSnapshotsResponse createSnapshotsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_SNAPSHOTS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createSnapshotsRequest);
			createSnapshotsResponse = CreateSnapshotsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createSnapshotsResponse;
	}

	public DeleteSnapshotsResponse deleteSnapshots(
			DeleteSnapshotsRequest deleteSnapshotsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DeleteSnapshotsResponse deleteSnapshotsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_SNAPSHOTS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteSnapshotsRequest);
			deleteSnapshotsResponse = DeleteSnapshotsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteSnapshotsResponse;
	}

	public ApplySnapshotsResponse applySnapshots(
			ApplySnapshotsRequest applySnapshotsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ApplySnapshotsResponse applySnapshotsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.APPLY_SNAPSHOTS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					applySnapshotsRequest);
			applySnapshotsResponse = ApplySnapshotsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return applySnapshotsResponse;
	}

	public DescribeSnapshotsResponse describeSnapshots(
			DescribeSnapshotsRequest describeSnapshotsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeSnapshotsResponse describeSnapshotsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_SNAPSHOTS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeSnapshotsRequest);
			describeSnapshotsResponse = DescribeSnapshotsResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeSnapshotsResponse;
	}

	public ModifySnapshotAttributesResponse modifySnapshotAttributes(
			ModifySnapshotAttributesRequest modifySnapshotAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		ModifySnapshotAttributesResponse modifySnapshotAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_SNAPSHOT_ATTRIBUTES;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifySnapshotAttributesRequest);
			modifySnapshotAttributesResponse = ModifySnapshotAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifySnapshotAttributesResponse;
	}

	public CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshot(
			CaptureInstanceFromSnapshotRequest captureInstanceFromSnapshotRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshotResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CAPTURE_INSTANCE_FROM_SNAPSHOT;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					captureInstanceFromSnapshotRequest);
			captureInstanceFromSnapshotResponse = CaptureInstanceFromSnapshotResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return captureInstanceFromSnapshotResponse;
	}

	public CreateVolumeFromSnapshotResponse createVolumeFromSnapshot(
			CreateVolumeFromSnapshotRequest createVolumeFromSnapshotRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		CreateVolumeFromSnapshotResponse createVolumeFromSnapshotResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CREATE_VOLUME_FROM_SNAPSHOT;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					createVolumeFromSnapshotRequest);
			createVolumeFromSnapshotResponse = CreateVolumeFromSnapshotResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return createVolumeFromSnapshotResponse;
	}
	
	public DescribeJobsResponse DescribeJobs(
			DescribeJobsRequest describeJobsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		DescribeJobsResponse describeJobsResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_JOBS;

		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeJobsRequest);
			describeJobsResponse = DescribeJobsResponse.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeJobsResponse;
	}
	
	//==================================================================================================
	private String sendRequest(String httpMethod, String action, Request request)
			throws QingCloudClientException, QingCloudServiceException, IOException {
		Map<String, String> parameters = request.toMap();
		addCommonParams(httpMethod, action, parameters);

		// debug to print all parameters of final request
		for (Map.Entry<String, String> entry : parameters.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if(DEBUG) System.out.println(String.format("%s=%s", key, value));
		}

		InputStream content = null;
		HttpURLConnection connection = null;
		try {
			String query = paramsToQueryString(parameters);
			URL url = new URL(ENDPOINT + "?" + query);

			if(DEBUG) System.out.println("url=" + url);
			
			connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			
			if(DEBUG) System.out.println("code=" + code);
			
			if (code >= 400) {
				content = connection.getErrorStream();
				String message = readContent(content);
				
				QingCloudServiceException exception = new QingCloudServiceException(
						message);
				exception.setServiceName(action);
				exception.setStatusCode(code);
				throw exception;
			} else {
				content = connection.getInputStream();
				String message = readContent(content);
				if(DEBUG) System.out.println("message=" + message);
				
				//check retcode
				Response response = Response.fromJson(message);
				int retCode = response.getRet_code();
				if(retCode!=0){
					String errorMessage = response.getMessage();
					if(retCode >= 5000){
						QingCloudServiceException exception = new QingCloudServiceException(
								errorMessage);
						exception.setServiceName(action);
						exception.setStatusCode(code);
						exception.setErrorCode(retCode);
						exception.setErrorMessage(errorMessage);
						throw exception;
					}else{
						QingCloudClientException exception = new QingCloudClientException(
								errorMessage);
						exception.setServiceName(action);
						exception.setErrorCode(retCode);
						exception.setErrorMessage(errorMessage);
						throw exception;
					}
				}
				return message;
			}
		} catch (IOException e) {
			throw e;
		} finally {
			safeClose(content);
			connection.disconnect();
		}
	}

	private void addCommonParams(String httpMethod, String action,
			Map<String, String> parameters) {
		parameters.put("action", action);
		parameters.put("version", API_VERSION);
		parameters.put("access_key_id", accessKeyId);
		parameters.put("time_stamp", formatIso8601Date(new Date()));
		parameters.put("signature_method", "HmacSHA256");
		parameters.put("signature_version", "1");
		parameters.put("signature", computeSignature(httpMethod, parameters));
	}

	private String computeSignature(String httpMethod,
			Map<String, String> parameters) {
		String[] sortedKeys = parameters.keySet().toArray(new String[] {});
		Arrays.sort(sortedKeys);
		final String SEPARATOR = "&";

		StringBuilder sbStringToSign = new StringBuilder();
		sbStringToSign.append(String.format("%s\n/iaas/\n", httpMethod));

		String signature = "";
		try {
			int count = 0;

			for (String key : sortedKeys) {
				if (count != 0) {
					sbStringToSign.append(SEPARATOR);
				}
				sbStringToSign.append(percentEncode(key)).append("=")
						.append(percentEncode(parameters.get(key)));
				count++;
			}

			String strToSign = sbStringToSign.toString();
			signature = calculateSignature(secretKey, strToSign);
		} catch (UnsupportedEncodingException e) {
		} catch (Exception e) {
		}
		return signature;
	}

	private String formatIso8601Date(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(ISO8601_DATE_FORMAT);
		df.setTimeZone(new SimpleTimeZone(8 * 60 * 60 * 1000, "GMT"));
		return df.format(date);
	}

	private String calculateSignature(String key, String stringToSign) {
		final String ALGORITHM = "HmacSHA256";
		byte[] signData = null;
		try {
			Mac mac = Mac.getInstance(ALGORITHM);
			mac.init(new SecretKeySpec(key.getBytes(ENCODING), ALGORITHM));
			signData = mac.doFinal(stringToSign.getBytes(ENCODING));
		} catch (InvalidKeyException e) {
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (IllegalStateException e) {
		}
		return new String(Base64.encodeBase64(signData));
	}

	private String percentEncode(String value)
			throws UnsupportedEncodingException {
		return value != null ? URLEncoder.encode(value, ENCODING)
				.replace("+", "%20").replace("*", "%2A").replace("%7E", "~")
				: null;
	}

	private String paramsToQueryString(Map<String, String> params)
			throws UnsupportedEncodingException {
		if (params == null || params.size() == 0) {
			return null;
		}
		String[] sortedKeys = params.keySet().toArray(new String[] {});
		Arrays.sort(sortedKeys);

		StringBuilder paramString = new StringBuilder();
		boolean first = true;
		for (String key : sortedKeys) {
			Object val = params.get(key);
			if (!first) {
				paramString.append("&");
			}
			if (val instanceof String) {
				paramString.append(URLEncoder.encode(key, ENCODING));
				if (val != null) {
					String strValue = (String) val;
					paramString.append("=").append(
							URLEncoder.encode(strValue, ENCODING));
				}
			}
			first = false;
		}
		return paramString.toString();
	}

	private String readContent(InputStream content) throws IOException {
		if (content == null)
			return "";

		Reader reader = null;
		Writer writer = new StringWriter();
		String result;

		char[] buffer = new char[1024];
		try {
			reader = new BufferedReader(
					new InputStreamReader(content, ENCODING));
			int n;
			while ((n = reader.read(buffer)) > 0) {
				writer.write(buffer, 0, n);
			}
			result = writer.toString();
		} finally {
			content.close();
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		return result;
	}

	private void safeClose(InputStream inputStream) {
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
			}
		}
	}

	public DescribeZonesResponse describeZones(
			DescribeZonesRequest describeZonesRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		DescribeZonesResponse describeZonesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_ZONES;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeZonesRequest);
			describeZonesResponse = DescribeZonesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		
		return describeZonesResponse;
	}

	public DescribeImagesResponse describeImages(
			DescribeImagesRequest describeImagesRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		DescribeImagesResponse describeImagesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DESCRIBE_IMAGES;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					describeImagesRequest);
			describeImagesResponse = DescribeImagesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return describeImagesResponse;
	}

	public CaptureInstanceResponse captureInstance(
			CaptureInstanceRequest captureInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		CaptureInstanceResponse captureInstanceResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.CAPTURE_INSTANCE;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					captureInstanceRequest);
			captureInstanceResponse = CaptureInstanceResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return captureInstanceResponse;
	}

	public DeleteImagesResponse deleteImages(
			DeleteImagesRequest deleteImagesRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		DeleteImagesResponse deleteImagesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.DELETE_IMAGES;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					deleteImagesRequest);
			deleteImagesResponse = DeleteImagesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return deleteImagesResponse;
	}

	public ModifyImageAttributesResponse modifyImageAttributes(
			ModifyImageAttributesRequest modifyImageAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		ModifyImageAttributesResponse modifyImageAttributesResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.MODIFY_IMAGE_ATTRIBUTES;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					modifyImageAttributesRequest);
			modifyImageAttributesResponse = ModifyImageAttributesResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return modifyImageAttributesResponse;
	}

	public GrantImageToUsersResponse grantImageToUsers(
			GrantImageToUsersRequest grantImageToUsersRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		GrantImageToUsersResponse grantImageToUsersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.GRANT_IMAGE_TO_USERS;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					grantImageToUsersRequest);
			grantImageToUsersResponse = GrantImageToUsersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return grantImageToUsersResponse;
	}

	public RevokeImageFromUsersResponse revokeImageFromUsers(
			RevokeImageFromUsersRequest revokeImageFromUsersRequest)
			throws QingCloudClientException, QingCloudServiceException,
			IOException {
		RevokeImageFromUsersResponse revokeImageFromUsersResponse = null;
		String httpMethod = "GET";
		String action = QingCloudAction.REVOKE_IMAGE_FROM_USERS;
		try {
			String jsonResponse = this.sendRequest(httpMethod, action,
					revokeImageFromUsersRequest);
			revokeImageFromUsersResponse = RevokeImageFromUsersResponse
					.fromJson(jsonResponse);
		} catch (QingCloudClientException e) {
			throw e;
		} catch (QingCloudServiceException e) {
			throw e;
		}
		return revokeImageFromUsersResponse;
	}
}
