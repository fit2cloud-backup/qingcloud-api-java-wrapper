package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudNetworkACL {

    private String network_acl_id;
    private Integer is_applied;
    private String network_acl_name;
    private String root_user_id;
    private String console_id;
    private String controller;
    private List<QingCloudNetworkEntry> network_entry_set;
    private String create_time;
    private String status_time;
    private String owner;
    private List<QingCloudVxnet> vxnets;

    public String getNetwork_acl_id() {
        return network_acl_id;
    }

    public void setNetwork_acl_id(String network_acl_id) {
        this.network_acl_id = network_acl_id;
    }

    public Integer getIs_applied() {
        return is_applied;
    }

    public void setIs_applied(Integer is_applied) {
        this.is_applied = is_applied;
    }

    public String getNetwork_acl_name() {
        return network_acl_name;
    }

    public void setNetwork_acl_name(String network_acl_name) {
        this.network_acl_name = network_acl_name;
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

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public List<QingCloudNetworkEntry> getNetwork_entry_set() {
        return network_entry_set;
    }

    public void setNetwork_entry_set(List<QingCloudNetworkEntry> network_entry_set) {
        this.network_entry_set = network_entry_set;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus_time() {
        return status_time;
    }

    public void setStatus_time(String status_time) {
        this.status_time = status_time;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<QingCloudVxnet> getVxnets() {
        return vxnets;
    }

    public void setVxnets(List<QingCloudVxnet> vxnets) {
        this.vxnets = vxnets;
    }
}
