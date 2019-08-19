package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudSnapshot {
    private String snapshot_id;
    private String snapshot_name;
    private String description;
    private Integer snapshot_type;
    private String status;
    private String transition_status;
    private String create_time;
    private String status_time;
    private String snapshot_time;
    private Integer is_taken;
    private Integer is_head;

    private String root_id;
    private String parent_id;

    private Integer size;
    private Integer total_size;
    private Integer total_count;

    private String lastest_snapshot_time;

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public String getSnapshot_name() {
        return snapshot_name;
    }

    public void setSnapshot_name(String snapshot_name) {
        this.snapshot_name = snapshot_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSnapshot_type() {
        return snapshot_type;
    }

    public void setSnapshot_type(Integer snapshot_type) {
        this.snapshot_type = snapshot_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransition_status() {
        return transition_status;
    }

    public void setTransition_status(String transition_status) {
        this.transition_status = transition_status;
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

    public String getSnapshot_time() {
        return snapshot_time;
    }

    public void setSnapshot_time(String snapshot_time) {
        this.snapshot_time = snapshot_time;
    }

    public Integer getIs_taken() {
        return is_taken;
    }

    public void setIs_taken(Integer is_taken) {
        this.is_taken = is_taken;
    }

    public Integer getIs_head() {
        return is_head;
    }

    public void setIs_head(Integer is_head) {
        this.is_head = is_head;
    }

    public String getRoot_id() {
        return root_id;
    }

    public void setRoot_id(String root_id) {
        this.root_id = root_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal_size() {
        return total_size;
    }

    public void setTotal_size(Integer total_size) {
        this.total_size = total_size;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public String getLastest_snapshot_time() {
        return lastest_snapshot_time;
    }

    public void setLastest_snapshot_time(String lastest_snapshot_time) {
        this.lastest_snapshot_time = lastest_snapshot_time;
    }
}
