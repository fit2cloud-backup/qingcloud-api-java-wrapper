package com.fit2cloud.qingcloud.wsclient.ui.model;

public class CreateNetworkACLRequest extends Request {

    private String network_acl_name;

    public String getNetwork_acl_name() {
        return network_acl_name;
    }

    public void setNetwork_acl_name(String network_acl_name) {
        this.network_acl_name = network_acl_name;
    }
}
