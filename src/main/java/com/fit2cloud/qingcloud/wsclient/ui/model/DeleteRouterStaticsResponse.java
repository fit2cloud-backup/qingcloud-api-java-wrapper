package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class DeleteRouterStaticsResponse {
	private String action;
	private Integer ret_code;
	private List<String> router_statics;
	private String message;

	public static DeleteRouterStaticsResponse fromJson(
			String jsonDeleteRouterStaticsResponse) {
		Gson gson = new Gson();
		DeleteRouterStaticsResponse deleteRouterStaticsResponse = gson
				.fromJson(jsonDeleteRouterStaticsResponse,
						DeleteRouterStaticsResponse.class);
		return deleteRouterStaticsResponse;
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

	public List<String> getRouter_statics() {
		return router_statics;
	}

	public void setRouter_statics(List<String> router_statics) {
		this.router_statics = router_statics;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
