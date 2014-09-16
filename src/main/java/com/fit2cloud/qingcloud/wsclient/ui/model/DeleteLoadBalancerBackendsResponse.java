package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.google.gson.Gson;

public class DeleteLoadBalancerBackendsResponse {
	private String action;
	private List<String> loadbalancer_backends;
	private Integer ret_code;
	private String message;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<String> getLoadbalancer_backends() {
		return loadbalancer_backends;
	}
	public void setLoadbalancer_backends(List<String> loadbalancer_backends) {
		this.loadbalancer_backends = loadbalancer_backends;
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
	public static DeleteLoadBalancerBackendsResponse fromJson(String jsonDeleteLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		DeleteLoadBalancerBackendsResponse deleteLoadBalancerBackendsResponse = gson.fromJson(jsonDeleteLoadBalancerBackendsResponse, DeleteLoadBalancerBackendsResponse.class);
		return deleteLoadBalancerBackendsResponse;
	}

}
