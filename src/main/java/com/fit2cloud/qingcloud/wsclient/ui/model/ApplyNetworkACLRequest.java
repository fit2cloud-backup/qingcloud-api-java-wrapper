package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;

public class ApplyNetworkACLRequest extends Request {

    private String network_acl;
    private List<String> vxnets;
    private String zone;

	public String getNetwork_acl() {
		return network_acl;
	}

	public void setNetwork_acl(String network_acl) {
		this.network_acl = network_acl;
	}

	public List<String> getVxnets() {
		return vxnets;
	}

	public void setVxnets(List<String> vxnets) {
		this.vxnets = vxnets;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
