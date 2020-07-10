package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudS2Server {
    private String s2_server_id;
    private String service_types;
    private String s2_server_name;
    private String description;
    private String service_type;
    private Integer s2_server_type;
    private String private_ip;
    private Integer s2_class;
    private String status;
    private String transition_status;
    private String create_time;
    private String status_time;
    private QingCloudVxnet vxnet;

    public String getS2_server_id() {
        return s2_server_id;
    }

    public void setS2_server_id(String s2_server_id) {
        this.s2_server_id = s2_server_id;
    }

    public String getService_types() {
        return service_types;
    }

    public void setService_types(String service_types) {
        this.service_types = service_types;
    }

    public String getS2_server_name() {
        return s2_server_name;
    }

    public void setS2_server_name(String s2_server_name) {
        this.s2_server_name = s2_server_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public Integer getS2_server_type() {
        return s2_server_type;
    }

    public void setS2_server_type(Integer s2_server_type) {
        this.s2_server_type = s2_server_type;
    }

    public String getPrivate_ip() {
        return private_ip;
    }

    public void setPrivate_ip(String private_ip) {
        this.private_ip = private_ip;
    }

    public Integer getS2_class() {
        return s2_class;
    }

    public void setS2_class(Integer s2_class) {
        this.s2_class = s2_class;
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

    public QingCloudVxnet getVxnet() {
        return vxnet;
    }

    public void setVxnet(QingCloudVxnet vxnet) {
        this.vxnet = vxnet;
    }
}
