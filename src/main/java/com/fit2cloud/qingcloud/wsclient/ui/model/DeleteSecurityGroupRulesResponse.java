package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class DeleteSecurityGroupRulesResponse {
    
	private String action;
	private List<String> security_group_rules;
	private Integer ret_code;
	private String message;
	
	public static DeleteSecurityGroupRulesResponse fromJson(String jsonDeleteSecurityGroupRulesResponse){
		Gson gson = new Gson();
		DeleteSecurityGroupRulesResponse deleteSecurityGroupRulesResponse = gson.fromJson(jsonDeleteSecurityGroupRulesResponse, DeleteSecurityGroupRulesResponse.class);
		return deleteSecurityGroupRulesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getSecurity_group_rules() {
		return security_group_rules;
	}

	public void setSecurity_group_rules(List<String> security_group_rules) {
		this.security_group_rules = security_group_rules;
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
