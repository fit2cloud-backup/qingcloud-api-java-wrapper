package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudBroker {
    private String instance_id;
    private String broker_host;
    private Integer broker_port;

    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }

    public String getBroker_host() {
        return broker_host;
    }

    public void setBroker_host(String broker_host) {
        this.broker_host = broker_host;
    }

    public Integer getBroker_port() {
        return broker_port;
    }

    public void setBroker_port(Integer broker_port) {
        this.broker_port = broker_port;
    }
}
