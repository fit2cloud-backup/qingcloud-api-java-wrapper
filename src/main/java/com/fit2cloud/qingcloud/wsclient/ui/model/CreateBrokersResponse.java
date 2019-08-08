package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudBroker;
import com.google.gson.Gson;

import java.util.List;

public class CreateBrokersResponse {
    private String action;
    private List<QingCloudBroker> brokers;
    private Integer ret_code;
    private String message;

    public static CreateBrokersResponse fromJson(String jsonCreateBrokersResponse){
        Gson gson = new Gson();
        CreateBrokersResponse createBrokersResponse = gson.fromJson(jsonCreateBrokersResponse, CreateBrokersResponse.class);
        return createBrokersResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudBroker> getBrokers() {
        return brokers;
    }

    public void setBrokers(List<QingCloudBroker> brokers) {
        this.brokers = brokers;
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
