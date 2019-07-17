package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class AddNetworkACLEntriesResponse {

    private String action;
    private List<String> network_acl_entries;
    private Integer ret_code;
    private String message;


    public static AddNetworkACLEntriesResponse fromJson(
            String jsonAddSecurityGroupRulesResponse) {
        Gson gson = new Gson();
        AddNetworkACLEntriesResponse addSecurityGroupRulesResponse = gson
                .fromJson(jsonAddSecurityGroupRulesResponse,
                        AddNetworkACLEntriesResponse.class);
        return addSecurityGroupRulesResponse;
    }


    public String getAction() {
        return action;
    }


    public void setAction(String action) {
        this.action = action;
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

    public List<String> getNetwork_acl_entries() {
        return network_acl_entries;
    }

    public void setNetwork_acl_entries(List<String> network_acl_entries) {
        this.network_acl_entries = network_acl_entries;
    }
}
