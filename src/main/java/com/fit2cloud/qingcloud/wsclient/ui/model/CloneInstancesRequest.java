package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class CloneInstancesRequest extends Request {
    private List<String> instances;
    private List<String> vxnets;
    private String zone;

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    public List<String> getVxnets() {
        return vxnets;
    }

    public void setVxnets(List<String> vxnets) {
        this.vxnets = vxnets;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
