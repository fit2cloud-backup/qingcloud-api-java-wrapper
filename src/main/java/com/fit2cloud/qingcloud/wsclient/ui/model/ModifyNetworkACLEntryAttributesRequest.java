package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;

public class ModifyNetworkACLEntryAttributesRequest extends Request {

    private String network_acl;
    //  the nacl entry id
    private String network_acl_entry;
	// the nacl entry name
    private String network_acl_entry_name;
    // 1 for disable, 0 for enable || No ||
    private String disabled;
    // level high 0~255 low || No ||
    private Integer priority;
//  4 or 6 || No ||
    private Integer ip_version;
    //  the network cidr || No ||
    private String cidr;
    // 1 for permit, 0 for deny || No ||
    private String entry_action;
    //  1 for outbound of instance, 0 for inbound || No ||
    private Integer egress;

    private List<String> vxnets;
    private String zone;

	public String getNetwork_acl_entry() {
		return network_acl_entry;
	}

	public void setNetwork_acl_entry(String network_acl_entry) {
		this.network_acl_entry = network_acl_entry;
	}

	public String getNetwork_acl_entry_name() {
		return network_acl_entry_name;
	}

	public void setNetwork_acl_entry_name(String network_acl_entry_name) {
		this.network_acl_entry_name = network_acl_entry_name;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getIp_version() {
		return ip_version;
	}

	public void setIp_version(Integer ip_version) {
		this.ip_version = ip_version;
	}

	public String getCidr() {
		return cidr;
	}

	public void setCidr(String cidr) {
		this.cidr = cidr;
	}

	public String getEntry_action() {
		return entry_action;
	}

	public void setEntry_action(String entry_action) {
		this.entry_action = entry_action;
	}

	public Integer getEgress() {
		return egress;
	}

	public void setEgress(Integer egress) {
		this.egress = egress;
	}

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
