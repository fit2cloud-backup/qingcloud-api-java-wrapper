package com.fit2cloud.qingcloud.wsclient.ui.model;


public class GetResourceLeaseRequest extends Request {

    private String resource;
    private String zone;
    private String user;


    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
