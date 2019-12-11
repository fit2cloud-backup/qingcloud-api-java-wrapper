package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeAlarmPoliciesRequest extends Request {
    private List<String> alarm_policies;
    private String alarm_policy_name;
    private String alarm_policy_type;
    private List<String> status;
    private String search_word;
    private Integer verbose;
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


    public List<String> getAlarm_policies() {
        return alarm_policies;
    }

    public void setAlarm_policies(List<String> alarm_policies) {
        this.alarm_policies = alarm_policies;
    }

    public String getAlarm_policy_name() {
        return alarm_policy_name;
    }

    public void setAlarm_policy_name(String alarm_policy_name) {
        this.alarm_policy_name = alarm_policy_name;
    }

    public String getAlarm_policy_type() {
        return alarm_policy_type;
    }

    public void setAlarm_policy_type(String alarm_policy_type) {
        this.alarm_policy_type = alarm_policy_type;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public String getSearch_word() {
        return search_word;
    }

    public void setSearch_word(String search_word) {
        this.search_word = search_word;
    }

    public Integer getVerbose() {
        return verbose;
    }

    public void setVerbose(Integer verbose) {
        this.verbose = verbose;
    }
}
