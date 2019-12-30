package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingResourceLease;
import com.google.gson.Gson;


public class GetResourceLeaseResponse {

    private String action;
    private String resource_id;
    private QingResourceLease lease_info;
    private Integer ret_code;


    public static GetResourceLeaseResponse fromJson(String jsonGetResourceLeaseResponse) {
        Gson gson = new Gson();
        GetResourceLeaseResponse getResourceLeaseResponse = gson.fromJson(jsonGetResourceLeaseResponse, GetResourceLeaseResponse.class);
        return getResourceLeaseResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }


    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }

    public QingResourceLease getLease_info() {
        return lease_info;
    }

    public void setLease_info(QingResourceLease lease_info) {
        this.lease_info = lease_info;
    }
}
