package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class DeleteLoadBalancerListenersResponse {
	private String action;
	private Integer ret_code;
	private List<String> loadbalancer_listeners;
	private String message;
	
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

	public List<String> getLoadbalancer_listeners() {
		return loadbalancer_listeners;
	}

	public void setLoadbalancer_listeners(List<String> loadbalancer_listeners) {
		this.loadbalancer_listeners = loadbalancer_listeners;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static DeleteLoadBalancerListenersResponse fromJson(String jsonDeleteLoadBalancerListenersResponse){
		Gson gson = new Gson();
		DeleteLoadBalancerListenersResponse deleteLoadBalancerListenersResponse = gson.fromJson(jsonDeleteLoadBalancerListenersResponse, DeleteLoadBalancerListenersResponse.class);
		return deleteLoadBalancerListenersResponse;
	}

}
