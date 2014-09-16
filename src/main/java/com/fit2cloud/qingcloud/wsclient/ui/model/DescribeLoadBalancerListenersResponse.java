package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerListenerDetail;
import com.google.gson.Gson;

public class DescribeLoadBalancerListenersResponse {
	private String action;
	private List<QingCloudLoadBalancerListenerDetail> loadbalancer_listener_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudLoadBalancerListenerDetail> getLoadbalancer_listener_set() {
		return loadbalancer_listener_set;
	}

	public void setLoadbalancer_listener_set(
			List<QingCloudLoadBalancerListenerDetail> loadbalancer_listener_set) {
		this.loadbalancer_listener_set = loadbalancer_listener_set;
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

	public static DescribeLoadBalancerListenersResponse fromJson(String jsonDescribeLoadBalancerListenersResponse){
		Gson gson = new Gson();
		DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse = gson.fromJson(jsonDescribeLoadBalancerListenersResponse, DescribeLoadBalancerListenersResponse.class);
		return describeLoadBalancerListenersResponse;
	}

}
