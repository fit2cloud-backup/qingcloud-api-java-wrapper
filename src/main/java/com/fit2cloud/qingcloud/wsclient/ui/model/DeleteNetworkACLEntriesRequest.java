package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DeleteNetworkACLEntriesRequest extends Request {

    private String zone;
    // the network acl entry ids
    private List<String> network_acl_entries;

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getNetwork_acl_entries() {
        return network_acl_entries;
    }

    public void setNetwork_acl_entries(List<String> network_acl_entries) {
        this.network_acl_entries = network_acl_entries;
    }
}
