package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancer;
import com.google.gson.Gson;

public class DescribeLoadBalancersResponse {
	
	private String action;
	private List<QingCloudLoadBalancer> loadbalancer_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudLoadBalancer> getLoadbalancer_set() {
		return loadbalancer_set;
	}

	public void setLoadbalancer_set(List<QingCloudLoadBalancer> loadbalancer_set) {
		this.loadbalancer_set = loadbalancer_set;
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

	public static DescribeLoadBalancersResponse fromJson(String jsonDescribeLoadBalancersResponse){
		Gson gson = new Gson();
		DescribeLoadBalancersResponse describeLoadBalancersResponse = gson.fromJson(jsonDescribeLoadBalancersResponse, DescribeLoadBalancersResponse.class);
		return describeLoadBalancersResponse;
	}

}
