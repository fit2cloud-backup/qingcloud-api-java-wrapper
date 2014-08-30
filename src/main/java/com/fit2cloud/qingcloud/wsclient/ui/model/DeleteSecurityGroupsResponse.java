package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class DeleteSecurityGroupsResponse {
	private String action;
	private List<String> security_groups;
	private Integer ret_code;
	private String message;
	
	public static DeleteSecurityGroupsResponse fromJson(String jsonDeleteSecurityGroupsResponse){
		Gson gson = new Gson();
		DeleteSecurityGroupsResponse celeteSecurityGroupsResponse = gson.fromJson(jsonDeleteSecurityGroupsResponse, DeleteSecurityGroupsResponse.class);
		return celeteSecurityGroupsResponse;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<String> getSecurity_groups() {
		return security_groups;
	}
	public void setSecurity_groups(List<String> security_groups) {
		this.security_groups = security_groups;
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
