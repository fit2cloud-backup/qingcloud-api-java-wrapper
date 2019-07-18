package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

/**
 * Delete network acl request;
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>"
 * @since 2019-07-18 20:52
 **/
public class DeleteNetworkACLsRequest extends Request {

    private List<String> network_acls;
    private String zone;;
    private String owner;

    public List<String> getNetwork_acls() {
        return network_acls;
    }

    public void setNetwork_acls(List<String> network_acls) {
        this.network_acls = network_acls;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
