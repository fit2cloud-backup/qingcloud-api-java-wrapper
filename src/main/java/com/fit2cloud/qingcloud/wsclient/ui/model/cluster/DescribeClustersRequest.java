package com.fit2cloud.qingcloud.wsclient.ui.model.cluster;

import com.fit2cloud.qingcloud.wsclient.ui.model.Request;

import java.util.List;

public class DescribeClustersRequest extends Request {

    private List<String> clusters;
    private String zone;

    public List<String> getClusters() {
        return clusters;
    }

    public void setClusters(List<String> clusters) {
        this.clusters = clusters;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
