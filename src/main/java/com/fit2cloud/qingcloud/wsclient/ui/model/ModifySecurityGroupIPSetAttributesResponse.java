package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;


public class ModifySecurityGroupIPSetAttributesResponse {
    
	private String action;
	private String security_group_ipset_id;
	private Integer ret_code;
	private String message;
	
	public static ModifySecurityGroupIPSetAttributesResponse fromJson(String jsonDeleteSecurityGroupRulesResponse){
		Gson gson = new Gson();
		ModifySecurityGroupIPSetAttributesResponse modifySecurityGroupIPSetAttributesResponse = gson.fromJson(jsonDeleteSecurityGroupRulesResponse, ModifySecurityGroupIPSetAttributesResponse.class);
		return modifySecurityGroupIPSetAttributesResponse;
	}

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

	public String getSecurity_group_ipset_id() {
		return security_group_ipset_id;
	}

	public void setSecurity_group_ipset_id(String security_group_ipset_id) {
		this.security_group_ipset_id = security_group_ipset_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
