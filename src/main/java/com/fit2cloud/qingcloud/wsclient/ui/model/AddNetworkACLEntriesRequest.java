package com.fit2cloud.qingcloud.wsclient.ui.model;


import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudNetworkACLRuleEntry;

import java.util.List;

public class AddNetworkACLEntriesRequest extends Request {

    private String network_acl;
    private List<QingCloudNetworkACLRuleEntry> entries;
    private String zone;

	public String getNetwork_acl() {
		return network_acl;
	}

	public void setNetwork_acl(String network_acl) {
		this.network_acl = network_acl;
	}

	public List<QingCloudNetworkACLRuleEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<QingCloudNetworkACLRuleEntry> entries) {
		this.entries = entries;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
