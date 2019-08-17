package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeSnapshotsRequest extends Request {
    private List<String> snapshots;
    private String resource_id;
    private Integer snapshot_type;
    private List<String> status;
    private String search_word;
    private List<String> tags;
    private Integer verbose;
    private Integer offset;
    private Integer limit;

    private String zone;

    public List<String> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<String> snapshots) {
        this.snapshots = snapshots;
    }

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public Integer getSnapshot_type() {
        return snapshot_type;
    }

    public void setSnapshot_type(Integer snapshot_type) {
        this.snapshot_type = snapshot_type;
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

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getVerbose() {
        return verbose;
    }

    public void setVerbose(Integer verbose) {
        this.verbose = verbose;
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

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
