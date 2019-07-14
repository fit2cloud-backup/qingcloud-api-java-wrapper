package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudNetworkEntry {

    private Integer priority;
    private String network_acl_id;
    private String network_acl_entry_id;
    private String root_user_id;
    private String console_id;
    private Integer disabled;
    private Integer ip_version;
    private String controller;
    private Integer egress;
    private String create_time;
    private String owner;
    private String status_time;
    private String cidr;
    private String network_acl_entry_name;
    private Integer entry_action;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getNetwork_acl_id() {
        return network_acl_id;
    }

    public void setNetwork_acl_id(String network_acl_id) {
        this.network_acl_id = network_acl_id;
    }

    public String getNetwork_acl_entry_id() {
        return network_acl_entry_id;
    }

    public void setNetwork_acl_entry_id(String network_acl_entry_id) {
        this.network_acl_entry_id = network_acl_entry_id;
    }

    public String getRoot_user_id() {
        return root_user_id;
    }

    public void setRoot_user_id(String root_user_id) {
        this.root_user_id = root_user_id;
    }

    public String getConsole_id() {
        return console_id;
    }

    public void setConsole_id(String console_id) {
        this.console_id = console_id;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Integer getIp_version() {
        return ip_version;
    }

    public void setIp_version(Integer ip_version) {
        this.ip_version = ip_version;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Integer getEgress() {
        return egress;
    }

    public void setEgress(Integer egress) {
        this.egress = egress;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time;
    }

    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public String getNetwork_acl_entry_name() {
        return network_acl_entry_name;
    }

    public void setNetwork_acl_entry_name(String network_acl_entry_name) {
        this.network_acl_entry_name = network_acl_entry_name;
    }

    public Integer getEntry_action() {
        return entry_action;
    }

    public void setEntry_action(Integer entry_action) {
        this.entry_action = entry_action;
    }
}
