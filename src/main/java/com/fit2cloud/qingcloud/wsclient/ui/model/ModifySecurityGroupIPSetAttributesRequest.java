package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifySecurityGroupIPSetAttributesRequest extends Request {
    private String zone;
    private String security_group_ipset;
    private String security_group_ipset_name;
    private String description;
    private String val;


    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getSecurity_group_ipset() {
        return security_group_ipset;
    }

    public void setSecurity_group_ipset(String security_group_ipset) {
        this.security_group_ipset = security_group_ipset;
    }

    public String getSecurity_group_ipset_name() {
        return security_group_ipset_name;
    }

    public void setSecurity_group_ipset_name(String security_group_ipset_name) {
        this.security_group_ipset_name = security_group_ipset_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
