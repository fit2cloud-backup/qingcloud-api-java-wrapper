package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudRouterVxnet;
import com.google.gson.Gson;

public class DescribeRouterVxnetsResponse {
	private String action;
	private List<QingCloudRouterVxnet> router_vxnet_set;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;
	public static DescribeRouterVxnetsResponse fromJson(String jsonDescribeRouterVxnetsResponse){
		Gson gson = new Gson();
		DescribeRouterVxnetsResponse describeRouterVxnetsResponse = gson.fromJson(jsonDescribeRouterVxnetsResponse, DescribeRouterVxnetsResponse.class);
		return describeRouterVxnetsResponse;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<QingCloudRouterVxnet> getRouter_vxnet_set() {
		return router_vxnet_set;
	}
	public void setRouter_vxnet_set(List<QingCloudRouterVxnet> router_vxnet_set) {
		this.router_vxnet_set = router_vxnet_set;
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
