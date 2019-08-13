package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.CloneInstancesSet;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

public class CloneInstancesResponse {
    private String action;
    private String job_id;
    private List<String> instances;
    private Integer ret_code;
    private String message;
    private Map<String, CloneInstancesSet> instance_set;

    public static CloneInstancesResponse fromJson(String jsonCloneInstancesResponse){
        Gson gson = new Gson();
        CloneInstancesResponse cloneInstancesResponse = gson.fromJson(jsonCloneInstancesResponse, CloneInstancesResponse.class);
        return cloneInstancesResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
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

    public Map<String, CloneInstancesSet> getInstance_set() {
        return instance_set;
    }

    public void setInstance_set(Map<String, CloneInstancesSet> instance_set) {
        this.instance_set = instance_set;
    }
}
