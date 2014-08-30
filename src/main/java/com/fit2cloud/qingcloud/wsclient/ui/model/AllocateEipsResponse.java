package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class AllocateEipsResponse {
	
	private String action;
	private List<String> eips;
	private Integer ret_code;
	private String message;
	
	public static AllocateEipsResponse fromJson(String jsonAllocateEipsResponse){
		Gson gson = new Gson();
		AllocateEipsResponse allocateEipsResponse = gson.fromJson(jsonAllocateEipsResponse, AllocateEipsResponse.class);
		return allocateEipsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getEips() {
		return eips;
	}

	public void setEips(List<String> eips) {
		this.eips = eips;
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
