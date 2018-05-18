package com.fit2cloud.qingcloud.wsclient;

import java.io.IOException;

import com.fit2cloud.qingcloud.wsclient.ui.model.*;

public interface IQingCloudWSClient {

	// -----------------------------------Instances-----------------------------------------------------
	public DescribeInstancesResponse describeInstances(
			DescribeInstancesRequest describeInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public RunInstancesResponse runInstances(
			RunInstancesRequest runInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public TerminateInstancesResponse terminateInstances(
			TerminateInstancesRequest terminateInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public StopInstancesResponse stopInstances(
			StopInstancesRequest stopInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public StartInstancesResponse startInstances(
			StartInstancesRequest startInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public RestartInstancesResponse restartInstances(
			RestartInstancesRequest restartInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ResizeInstancesResponse resizeInstances(
			ResizeInstancesRequest resizeInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public ResetInstancesResponse resetInstances(
			ResetInstancesRequest resetInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public ModifyInstanceAttributesResponse modifyInstanceAttributes(
			ModifyInstanceAttributesRequest modifyInstanceAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public UploadUserDataAttachmentResponse uploadUserDataAttachment(
			UploadUserDataAttachmentRequest uploadUserDataAttachmentRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;


	// -----------------------------------KeyPairs------------------------------------------------------
	public CreateKeyPairResponse createKeyPair(
			CreateKeyPairRequest createKeyPairRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteKeyPairsResponse deleteKeyPairs(
			DeleteKeyPairsRequest deleteKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AttachKeyPairsResponse attachKeyPairs(
			AttachKeyPairsRequest attachKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DettachKeyPairsResponse dettachKeyPairs(
			DettachKeyPairsRequest dettachKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeKeyPairsResponse describeKeyPairs(
			DescribeKeyPairsRequest describeKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyKeyPairAttributesResponse modifyKeyPairAttributes(
			ModifyKeyPairAttributesRequest modifyKeyPairAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	// -----------------------------------Images------------------------------------------------------
	public DescribeImagesResponse describeImages(
			DescribeImagesRequest describeImagesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CaptureInstanceResponse captureInstance(
			CaptureInstanceRequest captureInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteImagesResponse deleteImages(
			DeleteImagesRequest deleteImagesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyImageAttributesResponse modifyImageAttributes(
			ModifyImageAttributesRequest modifyImageAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public GrantImageToUsersResponse grantImageToUsers(
			GrantImageToUsersRequest grantImageToUsersRequest)
					throws QingCloudClientException, QingCloudServiceException, IOException;

	public RevokeImageFromUsersResponse revokeImageFromUsers(
			RevokeImageFromUsersRequest revokeImageFromUsersRequest)
					throws QingCloudClientException, QingCloudServiceException, IOException;
	
	
	// -----------------------------------Volumes------------------------------------------------------
	public DescribeVolumesResponse describeVolumes(
			DescribeVolumesRequest describeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CreateVolumesResponse createVolumes(
			CreateVolumesRequest createVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteVolumesResponse deleteVolumes(
			DeleteVolumesRequest deleteVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AttachVolumesResponse attachVolumes(
			AttachVolumesRequest attachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DetachVolumesResponse detachVolumes(
			DetachVolumesRequest detachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ResizeVolumesResponse resizeVolumes(
			ResizeVolumesRequest resizeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyVolumeAttributesResponse modifyVolumeAttributes(
			ModifyVolumeAttributesRequest modifyVolumeAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	// -----------------------------------Security Group------------------------------------------------------
	public DescribeSecurityGroupsResponse describeSecurityGroups(
			DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CreateSecurityGroupResponse createSecurityGroup(
			CreateSecurityGroupRequest createSecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifySecurityGroupAttributesResponse modifySecurityGroupAttributes(
			ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ApplySecurityGroupResponse applySecurityGroup(
			ApplySecurityGroupRequest applySecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteSecurityGroupsResponse deleteSecurityGroups(
			DeleteSecurityGroupsRequest deleteSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeSecurityGroupRulesResponse describeSecurityGroupRules(
			DescribeSecurityGroupRulesRequest describeSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AddSecurityGroupRulesResponse addSecurityGroupRules(
			AddSecurityGroupRulesRequest addSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteSecurityGroupRulesResponse deleteSecurityGroupRules(
			DeleteSecurityGroupRulesRequest deleteSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributes(
			ModifySecurityGroupRuleAttributesRequest modifySecurityGroupRuleAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeSecurityGroupIPSetsResponse describeSecurityGroupIPSets(
			DescribeSecurityGroupIPSetsRequest describeSecurityGroupIPSetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CreateSecurityGroupIPSetResponse createSecurityGroupIPSet(
			CreateSecurityGroupIPSetRequest createSecurityGroupIPSetRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteSecurityGroupIPSetsResponse deleteSecurityGroupIPSets(
			DeleteSecurityGroupIPSetsRequest deleteSecurityGroupIPSetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifySecurityGroupIPSetAttributesResponse modifySecurityGroupIPSetAttributes(
			ModifySecurityGroupIPSetAttributesRequest modifySecurityGroupIPSetAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ApplySecurityGroupIPSetsResponse applySecurityGroupIPSets(
			ApplySecurityGroupIPSetsRequest applySecurityGroupIPSetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;


		// -----------------------------------Vxnets------------------------------------------------------
	public DescribeVxnetsResponse describeVxnets(
			DescribeVxnetsRequest describeVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CreateVxnetsResponse createVxnets(
			CreateVxnetsRequest createVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteVxnetsResponse deleteVxnets(
			DeleteVxnetsRequest deleteVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public JoinVxnetResponse joinVxnet(JoinVxnetRequest joinVxnetRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public LeaveVxnetResponse leaveVxnet(LeaveVxnetRequest leaveVxnetRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyVxnetAttributesResponse modifyVxnetAttributes(
			ModifyVxnetAttributesRequest modifyVxnetAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeVxnetInstancesResponse describeVxnetInstances(
			DescribeVxnetInstancesRequest describeVxnetInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	//-----------------------------------Routers------------------------------------------------------
	public CreateRoutersResponse createRouters(
			CreateRoutersRequest createRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public UpdateRoutersResponse updateRouters(
			UpdateRoutersRequest updateRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteRoutersResponse deleteRouters(
			DeleteRoutersRequest deleteRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public JoinRouterResponse joinRouter(JoinRouterRequest joinRouterRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public LeaveRouterResponse leaveRouter(LeaveRouterRequest leaveRouterRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public PowerOffRoutersResponse powerOffRouters(
			PowerOffRoutersRequest powerOffRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public PowerOnRoutersResponse powerOnRouters(
			PowerOnRoutersRequest powerOnRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeRoutersResponse describeRouters(
			DescribeRoutersRequest describeRoutersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeRouterVxnetsResponse describeRouterVxnets(
			DescribeRouterVxnetsRequest describeRouterVxnetsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyRouterAttributesResponse modifyRouterAttributes(
			ModifyRouterAttributesRequest modifyRouterAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeRouterStaticsResponse describeRouterStatics(
			DescribeRouterStaticsRequest describeRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AddRouterStaticsResponse addRouterStatics(
			AddRouterStaticsRequest addRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteRouterStaticsResponse deleteRouterStatics(
			DeleteRouterStaticsRequest deleteRouterStaticsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyRouterStaticAttributesResponse modifyRouterStaticAttributes(
			ModifyRouterStaticAttributesRequest modifyRouterStaticAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
					
    //-----------------------------------EIPs------------------------------------------------------
	public AssociateEipResponse associateEip(
			AssociateEipRequest associateEipRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DissociateEipsResponse dissociateEips(
			DissociateEipsRequest dissociateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AllocateEipsResponse allocateEips(
			AllocateEipsRequest allocateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ReleaseEipsResponse releaseEips(ReleaseEipsRequest releaseEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeEipsResponse describeEips(
			DescribeEipsRequest describeEipsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyEipAttributesResponse modifyEipAttributes(
			ModifyEipAttributesRequest modifyEipAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ChangeEipsBandwidthResponse changeEipsBandwidth(
			ChangeEipsBandwidthRequest changeEipsBandwidthRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public DescribeEipGroupsResponse describeEipGroups(
			DescribeEipGroupsRequest describeEipGroupsRequest)
					throws QingCloudClientException, QingCloudServiceException, IOException;
	
	//-----------------------------------Load Balancers------------------------------------------------------
	public DescribeLoadBalancersResponse describeLoadBalancers(
			DescribeLoadBalancersRequest describeLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public CreateLoadBalancerResponse createLoadBalancer(
			CreateLoadBalancerRequest createLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteLoadBalancersResponse deleteLoadBalancers(
			DeleteLoadBalancersRequest deleteLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AssociateEipsToLoadBalancerResponse associateEipsToLoadBalancer(
			AssociateEipsToLoadBalancerRequest associateEipsToLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DissociateEipsFromLoadBalancerResponse dissociateEipsFromLoadBalancer(
			DissociateEipsFromLoadBalancerRequest dissociateEipsFromLoadBalancerRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public UpdateLoadBalancersResponse updateLoadBalancers(
			UpdateLoadBalancersRequest updateLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public StopLoadBalancersResponse stopLoadBalancers(
			StopLoadBalancersRequest stopLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public StartLoadBalancersResponse startLoadBalancers(
			StartLoadBalancersRequest startLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyLoadBalancerAttributesResponse modifyLoadBalancerAttributes(
			ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ResizeLoadBalancersResponse resizeLoadBalancers(
			ResizeLoadBalancersRequest resizeLoadBalancersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;
	
	public DescribeLoadBalancerListenersResponse describeLoadBalancerListeners(
			DescribeLoadBalancerListenersRequest describeLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AddLoadBalancerListenersResponse addLoadBalancerListeners(
			AddLoadBalancerListenersRequest addLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteLoadBalancerListenersResponse deleteLoadBalancerListeners(
			DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyLoadBalancerListenerAttributesResponse modifyLoadBalancerListenerAttributes(
			ModifyLoadBalancerListenerAttributesRequest modifyLoadBalancerListenerAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public AddLoadBalancerBackendsResponse addLoadBalancerBackends(
			AddLoadBalancerBackendsRequest addLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackends(
			DeleteLoadBalancerBackendsRequest deleteLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributes(
			ModifyLoadBalancerBackendAttributesRequest modifyLoadBalancerBackendAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public DescribeLoadBalancerBackendsResponse describeLoadBalancerBackends(
			DescribeLoadBalancerBackendsRequest describeLoadBalancerBackendsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public GetMonitorResponse getMonitor(GetMonitorRequest getMonitorRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

	public GetLoadBalancerMonitorResponse getLoadBalancerMonitor(
			GetLoadBalancerMonitorRequest getLoadBalancerMonitorRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

//	//-----------------------------------Snapshots------------------------------------------------------
//	public CreateSnapshotsResponse createSnapshots(
//			CreateSnapshotsRequest createSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public DeleteSnapshotsResponse deleteSnapshots(
//			DeleteSnapshotsRequest deleteSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public ApplySnapshotsResponse applySnapshots(
//			ApplySnapshotsRequest applySnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public DescribeSnapshotsResponse describeSnapshots(
//			DescribeSnapshotsRequest describeSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public ModifySnapshotAttributesResponse modifySnapshotAttributes(
//			ModifySnapshotAttributesRequest modifySnapshotAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshot(
//			CaptureInstanceFromSnapshotRequest captureInstanceFromSnapshotRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;
//
//	public CreateVolumeFromSnapshotResponse createVolumeFromSnapshot(
//			CreateVolumeFromSnapshotRequest createVolumeFromSnapshotRequest)
//			throws QingCloudClientException, QingCloudServiceException, IOException;

	//-----------------------------------Jobs------------------------------------------------------
	public DescribeJobsResponse DescribeJobs(
			DescribeJobsRequest describeJobsRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;	
	
	//-----------------------------------Zones------------------------------------------------------
	public DescribeZonesResponse describeZones(
			DescribeZonesRequest describeZonesRequest)
			throws QingCloudClientException, QingCloudServiceException, IOException;

    public DescribeHyperNodesResponse describeHyperNodes(
    		DescribeHyperNodesRequest describeHyperNodesRequest)
		     throws QingCloudClientException,QingCloudServiceException,IOException;

    public DescribeBotsResponse describeBots(
			DescribeBotsRequest describeBotsRequest)
			throws QingCloudClientException,QingCloudServiceException,IOException;

	public DescribeReplPolicysResponse describeReplPolicys(
			DescribeReplPolicysRequest describeReplPolicysRequest)
			throws QingCloudClientException,QingCloudServiceException,IOException;
}
