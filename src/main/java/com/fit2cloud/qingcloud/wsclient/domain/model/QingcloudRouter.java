package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingcloudRouter {
    private String router_id;
    private String router_name;
    private String description;
    private Integer router_type;
    private String private_ip;
    private Integer is_applied;
    private String status;
    private String transition_status;
    private String create_time;
    private String status_time;
    private String security_group_id;
    private String dyn_ip_end;
    private String dyn_ip_start;
    private String ip_network;
    private Integer mode;
    private String manager_ip;
    private QingCloudEIP eip;
    private List<QingCloudVxnet> vxnets;
    private String vpc_network;

    public String getRouter_id() {
        return router_id;
    }

    public void setRouter_id(String router_id) {
        this.router_id = router_id;
    }

    public String getRouter_name() {
        return router_name;
    }

    public void setRouter_name(String router_name) {
        this.router_name = router_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRouter_type() {
        return router_type;
    }

    public void setRouter_type(Integer router_type) {
        this.router_type = router_type;
    }

    public String getPrivate_ip() {
        return private_ip;
    }

    public void setPrivate_ip(String private_ip) {
        this.private_ip = private_ip;
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

    public String getSecurity_group_id() {
        return security_group_id;
    }

    public void setSecurity_group_id(String security_group_id) {
        this.security_group_id = security_group_id;
    }

    public QingCloudEIP getEip() {
        return eip;
    }

    public void setEip(QingCloudEIP eip) {
        this.eip = eip;
    }

    public List<QingCloudVxnet> getVxnets() {
        return vxnets;
    }

    public void setVxnets(List<QingCloudVxnet> vxnets) {
        this.vxnets = vxnets;
    }

    @Override
    public String toString() {
        return "QingcloudRouter [router_id=" + router_id + ", router_name="
                + router_name + ", description=" + description
                + ", router_type=" + router_type + ", private_ip=" + private_ip
                + ", is_applied=" + is_applied + ", status=" + status
                + ", transition_status=" + transition_status + ", create_time="
                + create_time + ", status_time=" + status_time
                + ", security_group_id=" + security_group_id + ", eip=" + eip
                + ", vxnets=" + vxnets + ", vpc_network=" + vpc_network + "]";
    }

    public String getDyn_ip_end() {
        return dyn_ip_end;
    }

    public void setDyn_ip_end(String dyn_ip_end) {
        this.dyn_ip_end = dyn_ip_end;
    }

    public String getDyn_ip_start() {
        return dyn_ip_start;
    }

    public void setDyn_ip_start(String dyn_ip_start) {
        this.dyn_ip_start = dyn_ip_start;
    }

    public String getIp_network() {
        return ip_network;
    }

    public void setIp_network(String ip_network) {
        this.ip_network = ip_network;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getManager_ip() {
        return manager_ip;
    }

    public void setManager_ip(String manager_ip) {
        this.manager_ip = manager_ip;
    }

    public String getVpc_network() {
        return vpc_network;
    }

    public void setVpc_network(String vpc_network) {
        this.vpc_network = vpc_network;
    }
}
