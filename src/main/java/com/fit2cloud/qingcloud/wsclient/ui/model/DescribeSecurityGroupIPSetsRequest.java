package com.fit2cloud.qingcloud.wsclient.ui.model;


import java.util.List;

public class DescribeSecurityGroupIPSetsRequest extends Request {
    private String zone;

    private Integer ipset_type;

    private List<String> security_group_ipsets;

    private String security_group_ipset_name;

    private Integer limit;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public DescribeSecurityGroupIPSetsRequest() {
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getIpset_type() {
        return ipset_type;
    }

    public void setIpset_type(Integer ipset_type) {
        this.ipset_type = ipset_type;
    }

    public List<String> getSecurity_group_ipsets() {
        return security_group_ipsets;
    }

    public void setSecurity_group_ipsets(List<String> security_group_ipsets) {
        this.security_group_ipsets = security_group_ipsets;
    }

    public String getSecurity_group_ipset_name() {
        return security_group_ipset_name;
    }

    public void setSecurity_group_ipset_name(String security_group_ipset_name) {
        this.security_group_ipset_name = security_group_ipset_name;
    }
}
