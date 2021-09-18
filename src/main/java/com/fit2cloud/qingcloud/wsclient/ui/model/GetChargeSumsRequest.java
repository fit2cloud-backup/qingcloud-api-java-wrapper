package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class GetChargeSumsRequest extends Request {
    private List<String> user;
    private String root_user;
    private List<String> project_id;
    private List<String> zone;
    private String duration;
    private String start_time;
    private String end_time;
    private Integer offset;
    private Integer limit;

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public String getRoot_user() {
        return root_user;
    }

    public void setRoot_user(String root_user) {
        this.root_user = root_user;
    }

    public List<String> getProject_id() {
        return project_id;
    }

    public void setProject_id(List<String> project_id) {
        this.project_id = project_id;
    }

    public List<String> getZone() {
        return zone;
    }

    public void setZone(List<String> zone) {
        this.zone = zone;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

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
}

