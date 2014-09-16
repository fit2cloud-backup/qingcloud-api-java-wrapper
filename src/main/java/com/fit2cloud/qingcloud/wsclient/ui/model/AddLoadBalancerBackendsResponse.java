package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class AddLoadBalancerBackendsResponse {
	private String action;
	private Integer ret_code;
	private List<String> loadbalancer_backends;
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

	public List<String> getLoadbalancer_backends() {
		return loadbalancer_backends;
	}

	public void setLoadbalancer_backends(List<String> loadbalancer_backends) {
		this.loadbalancer_backends = loadbalancer_backends;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static AddLoadBalancerBackendsResponse fromJson(String jsonAddLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		AddLoadBalancerBackendsResponse addLoadBalancerBackendsResponse = gson.fromJson(jsonAddLoadBalancerBackendsResponse, AddLoadBalancerBackendsResponse.class);
		return addLoadBalancerBackendsResponse;
	}

}
