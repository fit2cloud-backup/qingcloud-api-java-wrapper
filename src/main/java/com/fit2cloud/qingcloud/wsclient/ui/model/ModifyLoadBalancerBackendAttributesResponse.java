package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyLoadBalancerBackendAttributesResponse {
	private String action;
	private Integer ret_code;
	private String message;
	
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static ModifyLoadBalancerBackendAttributesResponse fromJson(String jsonModifyLoadBalancerBackendAttributesResponse){
		Gson gson = new Gson();
		ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributesResponse = gson.fromJson(jsonModifyLoadBalancerBackendAttributesResponse, ModifyLoadBalancerBackendAttributesResponse.class);
		return modifyLoadBalancerBackendAttributesResponse;
	}

}
