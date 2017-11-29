package com.fit2cloud.qingcloud.wsclient.domain.model;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class QingCloudHyperNodeSet {

    private String hyper_node_id;
    private String hyper_node_name;
    private String status;
    private String create_time;
    private String status_time;
    private Integer memory_max;
    private Integer vcpu_max;


    public String getHyper_node_id() {
        return hyper_node_id;
    }

    public void setHyper_node_id(String hyper_node_id) {
        this.hyper_node_id = hyper_node_id;
    }

    public String getHyper_node_name() {
        return hyper_node_name;
    }

    public void setHyper_node_name(String hyper_node_name) {
        this.hyper_node_name = hyper_node_name;
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

    public Integer getMemory_max() {
        return memory_max;
    }

    public void setMemory_max(Integer memory_max) {
        this.memory_max = memory_max;
    }

    public Integer getVcpu_max() {
        return vcpu_max;
    }

    public void setVcpu_max(Integer vcpu_max) {
        this.vcpu_max = vcpu_max;
    }
}
