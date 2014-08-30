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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;












/**
 * ToDo: Each Request's parameters' check
 * @author jason
 *
 */
public class QingCloudWSClient implements IQingCloudWSClient {
	private static final String API_VERSION = "1";
	private static final String ENDPOINT = "https://api.qingcloud.com/iaas/";
	private static final String ISO8601_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	private static final String ENCODING = "UTF-8";

	private String accessKeyId;
	private String secretKey;

	public QingCloudWSClient(String accessKeyId, String secretKey) {
		this.accessKeyId = accessKeyId;
		this.secretKey = secretKey;
	}
	
	public DescribeInstancesResponse describeInstances(
			DescribeInstancesRequest describeInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException{
		
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
			RunInstancesRequest runInstancesRequest) throws QingCloudClientException, QingCloudServiceException {
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
			TerminateInstancesRequest terminateInstancesRequest) throws QingCloudClientException, QingCloudServiceException {
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
			StopInstancesRequest stopInstancesRequest) throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
		return null;
	}
	
	
	public CreateKeyPairResponse createKeyPair(
			CreateKeyPairRequest createKeyPairRequest) 
			throws QingCloudClientException, QingCloudServiceException{
		
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
			throws QingCloudClientException, QingCloudServiceException{
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
			throws QingCloudClientException, QingCloudServiceException{
		
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
			throws QingCloudClientException, QingCloudServiceException{
		
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
			throws QingCloudClientException, QingCloudServiceException{
		
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
			throws QingCloudClientException, QingCloudServiceException{
		
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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

	public AssociateEipResponse associateEip(
			AssociateEipRequest associateEipRequest)
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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

	public DescribeLoadBalancerListenersResponse describeLoadBalancerListeners(
			DescribeLoadBalancerListenersRequest describeLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
			throws QingCloudClientException, QingCloudServiceException {
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
	
	
	//==================================================================================================
	private String sendRequest(String httpMethod, String action, Request request)
			throws QingCloudClientException, QingCloudServiceException {
		Map<String, String> parameters = request.toMap();
		addCommonParams(httpMethod, action, parameters);

		// debug to print all parameters of final request
		for (Map.Entry<String, String> entry : parameters.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			//System.out.println(String.format("%s=%s", key, value));
		}

		InputStream content = null;
		HttpURLConnection connection = null;
		try {
			String query = paramsToQueryString(parameters);
			URL url = new URL(ENDPOINT + "?" + query);

			System.out.println("url=" + url);
			connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			if (code >= 400) {
				content = connection.getErrorStream();
				String message = readContent(content);
				System.out.println("errorMessage=" + message);
				QingCloudServiceException exception = new QingCloudServiceException(
						message);
				exception.setStatusCode(code);
				throw exception;
			} else {
				content = connection.getInputStream();
				String message = readContent(content);
				System.out.println("message=" + message);
				return message;
			}
		} catch (IOException e) {
			throw new QingCloudClientException("Failed to connect to Qingyun:"
					+ e.getMessage());
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

	

}
