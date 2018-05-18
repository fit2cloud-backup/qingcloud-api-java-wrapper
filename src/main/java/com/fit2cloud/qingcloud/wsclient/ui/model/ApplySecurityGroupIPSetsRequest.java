package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;

public class ApplySecurityGroupIPSetsRequest extends Request {
    private String zone;
    private List<String> security_group_ipsets;
    private String owner;


    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getSecurity_group_ipsets() {
        return security_group_ipsets;
    }

    public void setSecurity_group_ipsets(List<String> security_group_ipsets) {
        this.security_group_ipsets = security_group_ipsets;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
