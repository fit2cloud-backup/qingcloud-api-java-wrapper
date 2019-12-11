package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingAlarmPolicy;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAlarmItem;
import com.google.gson.Gson;

import java.util.List;

public class DescribeAlarmPoliciesResponse {

    private String action;
    private List<QingAlarmPolicy> alarm_policy_set;
    private Integer ret_code;
    private Integer total_count = 0;


    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public static DescribeAlarmPoliciesResponse fromJson(String jsonDescribeAlarmPoliciesResponse) {
        Gson gson = new Gson();
        DescribeAlarmPoliciesResponse describeSAlarmsResponse = gson.fromJson(jsonDescribeAlarmPoliciesResponse, DescribeAlarmPoliciesResponse.class);
        return describeSAlarmsResponse;
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


    public List<QingAlarmPolicy> getAlarm_policy_set() {
        return alarm_policy_set;
    }

    public void setAlarm_policy_set(List<QingAlarmPolicy> alarm_policy_set) {
        this.alarm_policy_set = alarm_policy_set;
    }
}
