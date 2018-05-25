package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class DeleteSecurityGroupIPSetsResponse {
    
	private String action;
	private List<String> security_group_ipsets;
	private Integer ret_code;
	private String message;
	
	public static DeleteSecurityGroupIPSetsResponse fromJson(String jsonDeleteSecurityGroupRulesResponse){
		Gson gson = new Gson();
		DeleteSecurityGroupIPSetsResponse deleteSecurityGroupRulesResponse = gson.fromJson(jsonDeleteSecurityGroupRulesResponse, DeleteSecurityGroupIPSetsResponse.class);
		return deleteSecurityGroupRulesResponse;
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

	public List<String> getSecurity_group_ipsets() {
		return security_group_ipsets;
	}

	public void setSecurity_group_ipsets(List<String> security_group_ipsets) {
		this.security_group_ipsets = security_group_ipsets;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
