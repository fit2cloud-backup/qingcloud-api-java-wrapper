package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class ModifyRouterStaticAttributesResponse {
	private String action;
	private String router_static_id;
	private Integer ret_code;
	private String message;
	
	public static ModifyRouterStaticAttributesResponse fromJson(String jsonModifyRouterStaticAttributesResponse){
		Gson gson = new Gson();
		ModifyRouterStaticAttributesResponse modifyRouterStaticAttributesResponse = gson.fromJson(jsonModifyRouterStaticAttributesResponse, ModifyRouterStaticAttributesResponse.class);
		return modifyRouterStaticAttributesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getRouter_static_id() {
		return router_static_id;
	}

	public void setRouter_static_id(String router_static_id) {
		this.router_static_id = router_static_id;
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
