package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifySecurityGroupAttributesResponse {
	private String security_group_id;
	private Integer ret_code;
	private String message;
	
	public static ModifySecurityGroupAttributesResponse fromJson(String jsonModifySecurityGroupAttributesResponse){
		Gson gson = new Gson();
		ModifySecurityGroupAttributesResponse modifySecurityGroupAttributesResponse = gson.fromJson(
				jsonModifySecurityGroupAttributesResponse, ModifySecurityGroupAttributesResponse.class);
		return modifySecurityGroupAttributesResponse;
	}

	
	public String getSecurity_group_id() {
		return security_group_id;
	}


	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
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
