package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyNetworkACLEntryAttributesResponse {
	private String action;
	private Integer ret_code;
	private String network_acl_entry;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public static ModifyNetworkACLEntryAttributesResponse fromJson(String jsonModifyLoadBalancerListenerAttributesResponse){
		Gson gson = new Gson();
		ModifyNetworkACLEntryAttributesResponse modifyLoadBalancerListenerAttributesResponse = gson.fromJson(jsonModifyLoadBalancerListenerAttributesResponse, ModifyNetworkACLEntryAttributesResponse.class);
		return modifyLoadBalancerListenerAttributesResponse;
	}

	public String getNetwork_acl_entry() {
		return network_acl_entry;
	}

	public void setNetwork_acl_entry(String network_acl_entry) {
		this.network_acl_entry = network_acl_entry;
	}
}
