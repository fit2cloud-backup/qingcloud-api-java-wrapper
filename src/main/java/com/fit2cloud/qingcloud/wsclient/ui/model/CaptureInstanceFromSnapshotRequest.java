package com.fit2cloud.qingcloud.wsclient.ui.model;

public class CaptureInstanceFromSnapshotRequest extends Request {
    
    /**
     * 备份ID
     */
    private String snapshot;
    /**
     * 镜像名称
     */
    private String image_name;
    /**
     * 用户Id
     */
    private String owner;
    /**
     * 区域
     */
    private String zone;

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
