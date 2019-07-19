package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyNetworkACLAttributesResponse {
	private String network_acl_id;
	private Integer ret_code;
	private String message;
	
	public static ModifyNetworkACLAttributesResponse fromJson(String modifyNetworkACLAttributesResponseStr){
		Gson gson = new Gson();
		ModifyNetworkACLAttributesResponse modifyNetworkACLAttributesResponse = gson.fromJson(
				modifyNetworkACLAttributesResponseStr, ModifyNetworkACLAttributesResponse.class);
		return modifyNetworkACLAttributesResponse;
	}

	public String getNetwork_acl_id() {
		return network_acl_id;
	}

	public void setNetwork_acl_id(String network_acl_id) {
		this.network_acl_id = network_acl_id;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
