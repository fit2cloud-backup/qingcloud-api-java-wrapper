package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudBotSet;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class DescribeBotsResponse {

    private String action;
    private List<QingCloudBotSet> bot_set;
    private Integer total_count;
    private Integer ret_code;

    public static DescribeBotsResponse fromJson(String jsonDescribeBotsResponse){
        Gson gson = new Gson();
        DescribeBotsResponse describeBotsResponse = gson.fromJson(jsonDescribeBotsResponse,DescribeBotsResponse.class);
        return  describeBotsResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudBotSet> getBot_set() {
        return bot_set;
    }

    public void setBot_set(List<QingCloudBotSet> bot_set) {
        this.bot_set = bot_set;
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
