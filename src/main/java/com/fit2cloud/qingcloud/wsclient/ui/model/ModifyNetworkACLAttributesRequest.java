package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifyNetworkACLAttributesRequest extends Request {
	private String network_acl;
	private String network_acl_name;
	private String owner;
	
    private String zone;

	public String getNetwork_acl() {
		return network_acl;
	}

	public void setNetwork_acl(String network_acl) {
		this.network_acl = network_acl;
	}

	public String getNetwork_acl_name() {
		return network_acl_name;
	}

	public void setNetwork_acl_name(String network_acl_name) {
		this.network_acl_name = network_acl_name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
