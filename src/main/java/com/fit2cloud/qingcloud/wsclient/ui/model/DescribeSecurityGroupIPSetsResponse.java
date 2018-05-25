package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.SecurityGroupIpsetSet;
import com.google.gson.Gson;

import java.util.List;

public class DescribeSecurityGroupIPSetsResponse {

    private String action;
    private List<SecurityGroupIpsetSet> security_group_ipset_set;
    private Integer total_count = 0;
    private Integer ret_code;
    private String message;

    public static DescribeSecurityGroupIPSetsResponse fromJson(String jsonDescribeVolumesResponse){
        Gson gson = new Gson();
        DescribeSecurityGroupIPSetsResponse describeSecurityGroupIPSetsResponse = gson.fromJson(jsonDescribeVolumesResponse, DescribeSecurityGroupIPSetsResponse.class);
        return describeSecurityGroupIPSetsResponse;
    }

    public List<SecurityGroupIpsetSet> getSecurity_group_ipset_set() {
        return security_group_ipset_set;
    }

    public void setSecurity_group_ipset_set(List<SecurityGroupIpsetSet> security_group_ipset_set) {
        this.security_group_ipset_set = security_group_ipset_set;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
	

