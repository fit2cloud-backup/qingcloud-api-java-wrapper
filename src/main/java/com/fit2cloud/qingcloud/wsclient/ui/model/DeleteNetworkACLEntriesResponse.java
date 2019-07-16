package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class DeleteNetworkACLEntriesResponse extends Request {

    private String action;
    private Integer ret_code;
    private String message;

    public String getAction() {
        return action;
    }

    public static DeleteNetworkACLEntriesResponse fromJson(String DeleteNetworkACLEntriesResponse){
        Gson gson = new Gson();
        DeleteNetworkACLEntriesResponse deleteLoadBalancerListenersResponse = gson.fromJson(DeleteNetworkACLEntriesResponse, DeleteNetworkACLEntriesResponse.class);
        return deleteLoadBalancerListenersResponse;
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
}
