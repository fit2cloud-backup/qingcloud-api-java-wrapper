package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateSecurityGroupIPSetRequest extends Request {
    private String zone;
    private String security_group_ipset_name;
    private Integer ipset_type;
    private String val;

    public String getSecurity_group_ipset_name() {
        return security_group_ipset_name;
    }

    public void setSecurity_group_ipset_name(String security_group_ipset_name) {
        this.security_group_ipset_name = security_group_ipset_name;
    }

    public Integer getIpset_type() {
        return ipset_type;
    }

    public void setIpset_type(Integer ipset_type) {
        this.ipset_type = ipset_type;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
