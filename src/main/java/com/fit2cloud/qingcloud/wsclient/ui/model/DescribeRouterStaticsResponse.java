package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterStatics;
import com.google.gson.Gson;

public class DescribeRouterStaticsResponse {
	private String action;
	private List<QingCloudRouterStatics> router_static_set;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;
	public static DescribeRouterStaticsResponse fromJson(String jsonDescribeRouterStaticsResponse){
		Gson gson = new Gson();
		DescribeRouterStaticsResponse describeRouterStaticsResponse = gson.fromJson(jsonDescribeRouterStaticsResponse, DescribeRouterStaticsResponse.class);
		return describeRouterStaticsResponse;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<QingCloudRouterStatics> getRouter_static_set() {
		return router_static_set;
	}
	public void setRouter_static_set(List<QingCloudRouterStatics> router_static_set) {
		this.router_static_set = router_static_set;
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
