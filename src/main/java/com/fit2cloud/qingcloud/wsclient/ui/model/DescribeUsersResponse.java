package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudUser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by zhangbohan on 15/8/19.
 */
public class DescribeUsersResponse {
    private String action;
    private List<QingCloudUser> user_set;
    private Integer total_count;
    private Integer ret_code;

    public static DescribeUsersResponse fromJson(String describeUsersResponse){
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm'Z'").create();
        DescribeUsersResponse describeVolumesResponse = gson.fromJson(describeUsersResponse, DescribeUsersResponse.class);
        return describeVolumesResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudUser> getUser_set() {
        return user_set;
    }

    public void setUser_set(List<QingCloudUser> user_set) {
        this.user_set = user_set;
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
}
