package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class CreateVxnetsResponse {
	private String action;
	private List<String> vxnets;
	private Integer ret_code;
	private String message;
	public static CreateVxnetsResponse fromJson(String jsonCreateVxnetsResponse){
		Gson gson = new Gson();
		CreateVxnetsResponse createVxnetsResponse = gson.fromJson(jsonCreateVxnetsResponse, CreateVxnetsResponse.class);
		return createVxnetsResponse;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<String> getVxnets() {
		return vxnets;
	}
	public void setVxnets(List<String> vxnets) {
		this.vxnets = vxnets;
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
