package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ApplySnapshotsRequest extends Request {
    private List<String> snapshots;
    private String zone;

    public List<String> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<String> snapshots) {
        this.snapshots = snapshots;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
