package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudNetworkACLRuleEntry {

    private String network_acl_entry_name;
    private Integer priority;
    private Integer egress;
    private Integer ip_version;
    private Integer entry_action;
    private String cidr;

    public String getNetwork_acl_entry_name() {
        return network_acl_entry_name;
    }

    public void setNetwork_acl_entry_name(String network_acl_entry_name) {
        this.network_acl_entry_name = network_acl_entry_name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEgress() {
        return egress;
    }

    public void setEgress(Integer egress) {
        this.egress = egress;
    }

    public Integer getIp_version() {
        return ip_version;
    }

    public void setIp_version(Integer ip_version) {
        this.ip_version = ip_version;
    }

    public Integer getEntry_action() {
        return entry_action;
    }

    public void setEntry_action(Integer entry_action) {
        this.entry_action = entry_action;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }
}
