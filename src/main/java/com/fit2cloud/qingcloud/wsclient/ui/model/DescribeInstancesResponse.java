package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudInstance;
import com.google.gson.Gson;

public class DescribeInstancesResponse {
	
	private String action;
	private List<QingCloudInstance> instance_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeInstancesResponse fromJson(String jsonDescribeInstancesResponse){
		Gson gson = new Gson();
		DescribeInstancesResponse describeInstancesResponse = gson.fromJson(jsonDescribeInstancesResponse, DescribeInstancesResponse.class);
		return describeInstancesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudInstance> getInstance_set() {
		return instance_set;
	}

	public void setInstance_set(List<QingCloudInstance> instance_set) {
		this.instance_set = instance_set;
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
