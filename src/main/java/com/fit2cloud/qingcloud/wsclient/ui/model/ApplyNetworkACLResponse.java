package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ApplyNetworkACLResponse extends Request {

    private String action;
    private Integer ret_code;
    private String message;

    public String getAction() {
        return action;
    }

    public static ApplyNetworkACLResponse fromJson(String applyNetworkACLResponse){
        Gson gson = new Gson();
        ApplyNetworkACLResponse deleteLoadBalancerListenersResponse = gson.fromJson(applyNetworkACLResponse, ApplyNetworkACLResponse.class);
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
