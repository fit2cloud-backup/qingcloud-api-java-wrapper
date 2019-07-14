package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateNetworkACLResponse {

    private String network_acl;
    private Integer ret_code;

    public String getNetwork_acl() {
        return network_acl;
    }

    public void setNetwork_acl(String network_acl) {
        this.network_acl = network_acl;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }

    public static CreateNetworkACLResponse fromJson(
            String jsonCreateNetworkACLResponse) {
        Gson gson = new Gson();
        CreateNetworkACLResponse createNetworkACLResponse = gson.fromJson(
                jsonCreateNetworkACLResponse,
                CreateNetworkACLResponse.class);
        return createNetworkACLResponse;
    }
}
