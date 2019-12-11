package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeAlarmsRequest extends Request {
    private List<String> alarm;
    private String policy;
    private String status;
    private String resource;
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

    public List<String> getAlarm() {
        return alarm;
    }

    public void setAlarm(List<String> alarm) {
        this.alarm = alarm;
    }


    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
