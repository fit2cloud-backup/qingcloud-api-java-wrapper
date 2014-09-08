package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifySecurityGroupRuleAttributesResponse {
	private String action;
	private String security_group_rule_id;
	private Integer ret_code;
	private String message;
	
	public static ModifySecurityGroupRuleAttributesResponse fromJson(String jsonModifySecurityGroupRuleAttributesResponse){
		Gson gson = new Gson();
		ModifySecurityGroupRuleAttributesResponse modifySecurityGroupRuleAttributesResponse = gson.fromJson(jsonModifySecurityGroupRuleAttributesResponse, ModifySecurityGroupRuleAttributesResponse.class);
		return modifySecurityGroupRuleAttributesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getSecurity_group_rule_id() {
		return security_group_rule_id;
	}

	public void setSecurity_group_rule_id(String security_group_rule_id) {
		this.security_group_rule_id = security_group_rule_id;
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
