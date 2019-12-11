package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeAlarmPolicyRulesRequest extends Request {
    private List<String> alarm_policy_rules;
    private String alarm_policy;
    private Integer offset;
    private Integer limit;
    private String zone;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    public List<String> getAlarm_policy_rules() {
        return alarm_policy_rules;
    }

    public void setAlarm_policy_rules(List<String> alarm_policy_rules) {
        this.alarm_policy_rules = alarm_policy_rules;
    }

    public String getAlarm_policy() {
        return alarm_policy;
    }

    public void setAlarm_policy(String alarm_policy) {
        this.alarm_policy = alarm_policy;
    }
}
