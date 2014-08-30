package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class Response {
	
	private Integer ret_code;
	private String message;
	
	public static Response fromJson(String jsonResponse){
		Gson gson = new Gson();
		Response response = gson.fromJson(jsonResponse, Response.class);
		return response;
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
