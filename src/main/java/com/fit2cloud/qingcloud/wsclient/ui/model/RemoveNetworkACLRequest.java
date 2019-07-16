package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerBackendBase;

import java.util.List;

public class RemoveNetworkACLRequest extends Request {
	private String zone;
	// the vxnet ids
	private List<String> vxnets;


	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<String> getVxnets() {
		return vxnets;
	}

	public void setVxnets(List<String> vxnets) {
		this.vxnets = vxnets;
	}
}
