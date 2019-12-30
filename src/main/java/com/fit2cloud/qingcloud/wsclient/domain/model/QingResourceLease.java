package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingResourceLease {
    private String resource_id;
    private String status;
    private String lease_time;
    private String renewal_time;
    private QingResourceContract contract;
    private String renewal;
    private String unlease_time;

    public String getResource_id() {
        return resource_id;
    }

    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLease_time() {
        return lease_time;
    }

    public void setLease_time(String lease_time) {
        this.lease_time = lease_time;
    }

    public String getRenewal_time() {
        return renewal_time;
    }

    public void setRenewal_time(String renewal_time) {
        this.renewal_time = renewal_time;
    }

    public QingResourceContract getContract() {
        return contract;
    }

    public void setContract(QingResourceContract contract) {
        this.contract = contract;
    }

    public String getRenewal() {
        return renewal;
    }

    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    public String getUnlease_time() {
        return unlease_time;
    }

    public void setUnlease_time(String unlease_time) {
        this.unlease_time = unlease_time;
    }
}
