package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingAlarmPolicyRule;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudAlarmItem;
import com.google.gson.Gson;

import java.util.List;

public class DescribeAlarmPolicyRulesResponse {
    private String action;
    private List<QingAlarmPolicyRule> alarm_policy_rule_set;
    private Integer ret_code;
    private Integer total_count = 0;


    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public static DescribeAlarmPolicyRulesResponse fromJson(String jsonDescribeAlarmPolicyRulesResponse) {
        Gson gson = new Gson();
        DescribeAlarmPolicyRulesResponse describeSAlarmsResponse = gson.fromJson(jsonDescribeAlarmPolicyRulesResponse, DescribeAlarmPolicyRulesResponse.class);
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

    public List<QingAlarmPolicyRule> getAlarm_policy_rule_set() {
        return alarm_policy_rule_set;
    }

    public void setAlarm_policy_rule_set(List<QingAlarmPolicyRule> alarm_policy_rule_set) {
        this.alarm_policy_rule_set = alarm_policy_rule_set;
    }
}
