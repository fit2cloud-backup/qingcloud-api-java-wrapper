package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class AddRouterStaticsResponse {
	private String action;
	private List<String> router_statics;
	private Integer ret_code;
	private String message;
	
	public static AddRouterStaticsResponse fromJson(String jsonAddRouterStaticsResponse){
		Gson gson = new Gson();
		AddRouterStaticsResponse addRouterStaticsResponse = gson.fromJson(jsonAddRouterStaticsResponse, AddRouterStaticsResponse.class);
		return addRouterStaticsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getRouter_statics() {
		return router_statics;
	}

	public void setRouter_statics(List<String> router_statics) {
		this.router_statics = router_statics;
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
