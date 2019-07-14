package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudNetworkACL;
import com.google.gson.Gson;

import java.util.List;

public class DescribeNetworkACLsResponse {

    private String action;
    private List<QingCloudNetworkACL> network_acl_set;
    private Integer total_count = 0;
    private Integer ret_code;
    private String message;

    public static DescribeNetworkACLsResponse fromJson(String jsonDescribeNetworkACLsResponse) {
        Gson gson = new Gson();
        DescribeNetworkACLsResponse describeNetworkACLsResponse = gson.fromJson(
                jsonDescribeNetworkACLsResponse, DescribeNetworkACLsResponse.class);
        return describeNetworkACLsResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudNetworkACL> getNetwork_acl_set() {
        return network_acl_set;
    }

    public void setNetwork_acl_set(List<QingCloudNetworkACL> network_acl_set) {
        this.network_acl_set = network_acl_set;
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
