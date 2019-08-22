package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class AddRouterStaticEntriesResponse {
	private String action;
	private List<String> router_static_entries;
	private Integer ret_code;
	private String message;
	
	public static AddRouterStaticEntriesResponse fromJson(String jsonAddRouterStaticsResponse){
		Gson gson = new Gson();
		AddRouterStaticEntriesResponse addRouterStaticsResponse = gson.fromJson(jsonAddRouterStaticsResponse, AddRouterStaticEntriesResponse.class);
		return addRouterStaticsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getRouter_statics() {
		return router_static_entries;
	}

	public void setRouter_statics(List<String> router_statics) {
		this.router_static_entries = router_statics;
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
