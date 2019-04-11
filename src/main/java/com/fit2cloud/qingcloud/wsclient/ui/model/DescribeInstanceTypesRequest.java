package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DescribeInstanceTypesRequest extends Request {
    private String zone;
    private List<String> instance_types;
    private Integer baremetal;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getInstance_types() {
        return instance_types;
    }

    public void setInstance_types(List<String> instance_types) {
        this.instance_types = instance_types;
    }

    public Integer getBaremetal() {
        return baremetal;
    }

    public void setBaremetal(Integer baremetal) {
        this.baremetal = baremetal;
    }
}
