package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.ui.model.*;

public interface IQingCloudWSClient {

	public DescribeInstancesResponse describeInstances(
			DescribeInstancesRequest describeInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public RunInstancesResponse runInstances(
			RunInstancesRequest runInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public TerminateInstancesResponse terminateInstances(
			TerminateInstancesRequest terminateInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public StopInstancesResponse stopInstances(
			StopInstancesRequest stopInstanceRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public StartInstancesResponse startInstances(
			StartInstancesRequest startInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;
	
	public RestartInstancesResponse restartInstances(
			RestartInstancesRequest restartInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ResizeInstancesResponse resizeInstances(
			ResizeInstancesRequest resizeInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;
	
	public ResetInstancesResponse resetInstances(
			ResetInstancesRequest resetInstancesRequest)
			throws QingCloudClientException, QingCloudServiceException;
	
	public ModifyInstanceAttributesResponse modifyInstanceAttributes(
			ModifyInstanceAttributesRequest modifyInstanceAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;
	
	public UploadUserDataAttachmentResponse uploadUserDataAttachment(
			UploadUserDataAttachmentRequest uploadUserDataAttachmentRequest)
			throws QingCloudClientException, QingCloudServiceException;


	// -----------------------------------KeyPairs------------------------------------------------------
	public CreateKeyPairResponse createKeyPair(
			CreateKeyPairRequest createKeyPairRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DeleteKeyPairsResponse deleteKeyPairs(
			DeleteKeyPairsRequest deleteKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public AttachKeyPairsResponse attachKeyPairs(
			AttachKeyPairsRequest attachKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DettachKeyPairsResponse dettachKeyPairs(
			DettachKeyPairsRequest dettachKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DescribeKeyPairsResponse describeKeyPairs(
			DescribeKeyPairsRequest describeKeyPairsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ModifyKeyPairAttributesResponse modifyKeyPairAttributes(
			ModifyKeyPairAttributesRequest modifyKeyPairAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;

//	public DescribeImagesResponse describeImages(
//			DescribeImagesRequest describeImagesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CaptureInstanceResponse captureInstance(
//			CaptureInstanceRequest captureInstanceRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteImagesResponse deleteImages(
//			DeleteImagesRequest deleteImagesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyImageAttributesResponse modifyImageAttributes(
//			ModifyImageAttributesRequest modifyImageAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//

	public DescribeVolumesResponse describeVolumes(
			DescribeVolumesRequest describeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public CreateVolumesResponse createVolumes(
			CreateVolumesRequest createVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DeleteVolumesResponse deleteVolumes(
			DeleteVolumesRequest deleteVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public AttachVolumesResponse attachVolumes(
			AttachVolumesRequest attachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DetachVolumesResponse detachVolumes(
			DetachVolumesRequest detachVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ResizeVolumesResponse resizeVolumes(
			ResizeVolumesRequest resizeVolumesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ModifyVolumeAttributesResponse modifyVolumeAttributes(
			ModifyVolumeAttributesRequest modifyVolumeAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DescribeSecurityGroupsResponse describeSecurityGroups(
			DescribeSecurityGroupsRequest describeSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public CreateSecurityGroupResponse createSecurityGroup(
			CreateSecurityGroupRequest createSecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ModifySecurityGroupAttributesResponse modifySecurityGroupAttributes(
			ModifySecurityGroupAttributesRequest modifySecurityGroupAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ApplySecurityGroupResponse applySecurityGroup(
			ApplySecurityGroupRequest applySecurityGroupRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DeleteSecurityGroupsResponse deleteSecurityGroups(
			DeleteSecurityGroupsRequest deleteSecurityGroupsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DescribeSecurityGroupRulesResponse describeSecurityGroupRules(
			DescribeSecurityGroupRulesRequest describeSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public AddSecurityGroupRulesResponse addSecurityGroupRules(
			AddSecurityGroupRulesRequest addSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DeleteSecurityGroupRulesResponse deleteSecurityGroupRules(
			DeleteSecurityGroupRulesRequest deleteSecurityGroupRulesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributes(
			ModifySecurityGroupRuleAttributesRequest modifySecurityGroupRuleAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;

//	public DescribeVxnetsResponse describeVxnets(
//			DescribeVxnetsRequest describeVxnetsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CreateVxnetsResponse createVxnets(
//			CreateVxnetsRequest createVxnetsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteVxnetsResponse deleteVxnets(
//			DeleteVxnetsRequest deleteVxnetsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public JoinVxnetResponse joinVxnet(JoinVxnetRequest joinVxnetRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public LeaveVxnetResponse leaveVxnet(LeaveVxnetRequest leaveVxnetRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyVxnetAttributesResponse modifyVxnetAttributes(
//			ModifyVxnetAttributesRequest modifyVxnetAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeVxnetInstancesResponse describeVxnetInstances(
//			DescribeVxnetInstancesRequest describeVxnetInstancesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CreateRoutersResponse createRouters(
//			CreateRoutersRequest createRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public UpdateRoutersResponse updateRouters(
//			UpdateRoutersRequest updateRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteRoutersResponse deleteRouters(
//			DeleteRoutersRequest deleteRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public JoinRouterResponse joinRouter(JoinRouterRequest joinRouterRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public LeaveRouterResponse leaveRouter(LeaveRouterRequest leaveRouterRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public PowerOffRoutersResponse powerOffRouters(
//			PowerOffRoutersRequest powerOffRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public PowerOnRoutersResponse powerOnRouters(
//			PowerOnRoutersRequest powerOnRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeRoutersResponse describeRouters(
//			DescribeRoutersRequest describeRoutersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeRouterVxnetsResponse describeRouterVxnets(
//			DescribeRouterVxnetsRequest describeRouterVxnetsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyRouterAttributesResponse modifyRouterAttributes(
//			ModifyRouterAttributesRequest modifyRouterAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeRouterStaticsResponse describeRouterStatics(
//			DescribeRouterStaticsRequest describeRouterStaticsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public AddRouterStaticsResponse addRouterStatics(
//			AddRouterStaticsRequest addRouterStaticsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteRouterStaticsResponse deleteRouterStatics(
//			DeleteRouterStaticsRequest deleteRouterStaticsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
	public AssociateEipResponse associateEip(
			AssociateEipRequest associateEipRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DissociateEipsResponse dissociateEips(
			DissociateEipsRequest dissociateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public AllocateEipsResponse allocateEips(
			AllocateEipsRequest allocateEipsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ReleaseEipsResponse releaseEips(ReleaseEipsRequest releaseEipsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public DescribeEipsResponse describeEips(
			DescribeEipsRequest describeEipsRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ModifyEipAttributesResponse modifyEipAttributes(
			ModifyEipAttributesRequest modifyEipAttributesRequest)
			throws QingCloudClientException, QingCloudServiceException;

	public ChangeEipsBandwidthResponse changeEipsBandwidth(
			ChangeEipsBandwidthRequest changeEipsBandwidthRequest)
			throws QingCloudClientException, QingCloudServiceException;

//	public DescribeLoadBalancersResponse describeLoadBalancers(
//			DescribeLoadBalancersRequest describeLoadBalancersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CreateLoadBalancerResponse createLoadBalancer(
//			CreateLoadBalancerRequest createLoadBalancerRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteLoadBalancersResponse deleteLoadBalancers(
//			DeleteLoadBalancersRequest deleteLoadBalancersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public AssociateEipsToLoadBalancerResponse associateEipsToLoadBalancer(
//			AssociateEipsToLoadBalancerRequest associateEipsToLoadBalancerRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DissociateEipsFromLoadBalancerResponse dissociateEipsFromLoadBalancer(
//			DissociateEipsFromLoadBalancerRequest dissociateEipsFromLoadBalancerRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public UpdateLoadBalancersResponse updateLoadBalancers(
//			UpdateLoadBalancersRequest updateLoadBalancersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public StopLoadBalancersResponse stopLoadBalancers(
//			StopLoadBalancersRequest stopLoadBalancersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public StartLoadBalancersResponse startLoadBalancers(
//			StartLoadBalancersRequest startLoadBalancersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyLoadBalancerAttributesResponse modifyLoadBalancerAttributes(
//			ModifyLoadBalancerAttributesRequest modifyLoadBalancerAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeLoadBalancerListenersResponse describeLoadBalancerListeners(
//			DescribeLoadBalancerListenersRequest describeLoadBalancerListenersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public AddLoadBalancerListenersResponse addLoadBalancerListeners(
//			AddLoadBalancerListenersRequest addLoadBalancerListenersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteLoadBalancerListenersResponse deleteLoadBalancerListeners(
//			DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyLoadBalancerListenerAttributesResponse modifyLoadBalancerListenerAttributes(
//			ModifyLoadBalancerListenerAttributesRequest modifyLoadBalancerListenerAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public AddLoadBalancerBackendsResponse addLoadBalancerBackends(
//			AddLoadBalancerBackendsRequest addLoadBalancerBackendsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackends(
//			DeleteLoadBalancerBackendsRequest deleteLoadBalancerBackendsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributes(
//			ModifyLoadBalancerBackendAttributesRequest modifyLoadBalancerBackendAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeLoadBalancerBackendsResponse describeLoadBalancerBackends(
//			DescribeLoadBalancerBackendsRequest describeLoadBalancerBackendsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public GetMonitorResponse getMonitor(GetMonitorRequest getMonitorRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public GetLoadBalancerMonitorResponse getLoadBalancerMonitor(
//			GetLoadBalancerMonitorRequest getLoadBalancerMonitorRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CreateSnapshotsResponse createSnapshots(
//			CreateSnapshotsRequest createSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DeleteSnapshotsResponse deleteSnapshots(
//			DeleteSnapshotsRequest deleteSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ApplySnapshotsResponse applySnapshots(
//			ApplySnapshotsRequest applySnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public DescribeSnapshotsResponse describeSnapshots(
//			DescribeSnapshotsRequest describeSnapshotsRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public ModifySnapshotAttributesResponse modifySnapshotAttributes(
//			ModifySnapshotAttributesRequest modifySnapshotAttributesRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshot(
//			CaptureInstanceFromSnapshotRequest captureInstanceFromSnapshotRequest)
//			throws QingCloudClientException, QingCloudServiceException;
//
//	public CreateVolumeFromSnapshotResponse createVolumeFromSnapshot(
//			CreateVolumeFromSnapshotRequest createVolumeFromSnapshotRequest)
//			throws QingCloudClientException, QingCloudServiceException;

}
