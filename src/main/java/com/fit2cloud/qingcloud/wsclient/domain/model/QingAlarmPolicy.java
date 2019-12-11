package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingAlarmPolicy {
    private String alarm_policy_id;
    private String alarm_policy_name;
    private String description;
    private List<String> resources;
    private String alarm_policy_type;
    private Integer is_applied;
    private String status;
    private String create_time;
    private String status_time;

    public String getAlarm_policy_id() {
        return alarm_policy_id;
    }

    public void setAlarm_policy_id(String alarm_policy_id) {
        this.alarm_policy_id = alarm_policy_id;
    }

    public String getAlarm_policy_name() {
        return alarm_policy_name;
    }

    public void setAlarm_policy_name(String alarm_policy_name) {
        this.alarm_policy_name = alarm_policy_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getAlarm_policy_type() {
        return alarm_policy_type;
    }

    public void setAlarm_policy_type(String alarm_policy_type) {
        this.alarm_policy_type = alarm_policy_type;
    }

    public Integer getIs_applied() {
        return is_applied;
    }

    public void setIs_applied(Integer is_applied) {
        this.is_applied = is_applied;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time;
    }
}
