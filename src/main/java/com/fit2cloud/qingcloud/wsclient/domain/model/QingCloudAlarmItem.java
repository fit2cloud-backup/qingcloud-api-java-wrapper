package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudAlarmItem {
    private String alarm_id;
    private String status;
    private String alarm_policy_id;
    private String resource_id;
    private String related_resource;
    private String create_time;

    public String getAlarm_id() {
        return alarm_id;
    }

    public void setAlarm_id(String alarm_id) {
        this.alarm_id = alarm_id;
    }


    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlarm_policy_id() {
        return alarm_policy_id;
    }

    public void setAlarm_policy_id(String alarm_policy_id) {
        this.alarm_policy_id = alarm_policy_id;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public String getRelated_resource() {
        return related_resource;
    }

    public void setRelated_resource(String related_resource) {
        this.related_resource = related_resource;
    }
}
