package com.fit2cloud.qingcloud.wsclient.ui.model;

public class QingCloudInstanceType {
    private String instance_type_id;
    private String instance_type_name;
    private String description;
    private Integer vcpus_current;
    private Integer memory_current;
    private String status;

    public String getInstance_type_id() {
        return instance_type_id;
    }

    public void setInstance_type_id(String instance_type_id) {
        this.instance_type_id = instance_type_id;
    }

    public String getInstance_type_name() {
        return instance_type_name;
    }

    public void setInstance_type_name(String instance_type_name) {
        this.instance_type_name = instance_type_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVcpus_current() {
        return vcpus_current;
    }

    public void setVcpus_current(Integer vcpus_current) {
        this.vcpus_current = vcpus_current;
    }

    public Integer getMemory_current() {
        return memory_current;
    }

    public void setMemory_current(Integer memory_current) {
        this.memory_current = memory_current;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
