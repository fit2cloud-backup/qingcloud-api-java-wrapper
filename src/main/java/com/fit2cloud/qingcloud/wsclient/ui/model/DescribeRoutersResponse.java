package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingcloudRouter;
import com.google.gson.Gson;

public class DescribeRoutersResponse {

	private String action;
	private List<QingcloudRouter> router_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;

	public static DescribeRoutersResponse fromJson(
			String jsonDescribeRoutersResponse) {
		Gson gson = new Gson();
		DescribeRoutersResponse describeRoutersResponse = gson.fromJson(
				jsonDescribeRoutersResponse, DescribeRoutersResponse.class);
		return describeRoutersResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingcloudRouter> getRouter_set() {
		return router_set;
	}

	public void setRouter_set(List<QingcloudRouter> router_set) {
		this.router_set = router_set;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
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
