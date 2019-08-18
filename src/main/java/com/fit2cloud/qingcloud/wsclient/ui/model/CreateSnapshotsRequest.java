package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class CreateSnapshotsRequest extends Request {
    private List<String> resources;
    private String snapshot_name;
    private Integer is_full;
    private String zone;

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getSnapshot_name() {
        return snapshot_name;
    }

    public void setSnapshot_name(String snapshot_name) {
        this.snapshot_name = snapshot_name;
    }

    public Integer getIs_full() {
        return is_full;
    }

    public void setIs_full(Integer is_full) {
        this.is_full = is_full;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
