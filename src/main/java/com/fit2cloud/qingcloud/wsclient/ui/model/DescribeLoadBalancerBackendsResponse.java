package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudLoadBalancerBackendDetail;
import com.google.gson.Gson;

public class DescribeLoadBalancerBackendsResponse {
	private String action;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	private List<QingCloudLoadBalancerBackendDetail> loadbalancer_backend_set;
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public List<QingCloudLoadBalancerBackendDetail> getLoadbalancer_backend_set() {
		return loadbalancer_backend_set;
	}

	public void setLoadbalancer_backend_set(
			List<QingCloudLoadBalancerBackendDetail> loadbalancer_backend_set) {
		this.loadbalancer_backend_set = loadbalancer_backend_set;
	}

	public static DescribeLoadBalancerBackendsResponse fromJson(String jsonDescribeLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		DescribeLoadBalancerBackendsResponse describeLoadBalancerBackendsResponse = gson.fromJson(jsonDescribeLoadBalancerBackendsResponse, DescribeLoadBalancerBackendsResponse.class);
		return describeLoadBalancerBackendsResponse;
	}

}
