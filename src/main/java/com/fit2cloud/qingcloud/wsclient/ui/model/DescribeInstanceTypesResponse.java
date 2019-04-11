package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class DescribeInstanceTypesResponse {
    private String action;
    private Integer total_count = 0;
    private List<QingCloudInstanceType> instance_type_set;

    public static DescribeInstanceTypesResponse fromJson(String jsonDescribeInstanceTypesResponse){
        Gson gson = new Gson();
        DescribeInstanceTypesResponse describeInstanceTypesResponse = gson.fromJson(jsonDescribeInstanceTypesResponse, DescribeInstanceTypesResponse.class);
        return describeInstanceTypesResponse;
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

    public List<QingCloudInstanceType> getInstance_type_set() {
        return instance_type_set;
    }

    public void setInstance_type_set(List<QingCloudInstanceType> instance_type_set) {
        this.instance_type_set = instance_type_set;
    }
}
