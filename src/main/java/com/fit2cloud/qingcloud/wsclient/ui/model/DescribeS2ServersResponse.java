package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudS2Server;
import com.google.gson.Gson;

import java.util.List;

public class DescribeS2ServersResponse {
	
	private String action;
	private List<QingCloudS2Server> s2_server_set;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;
	
	public static DescribeS2ServersResponse fromJson(String jsonDescribeS2ServersResponse){
		Gson gson = new Gson();
		DescribeS2ServersResponse describeInstancesResponse = gson.fromJson(jsonDescribeS2ServersResponse, DescribeS2ServersResponse.class);
		return describeInstancesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudS2Server> getS2_server_set() {
		return s2_server_set;
	}

	public void setS2_server_set(List<QingCloudS2Server> s2_server_set) {
		this.s2_server_set = s2_server_set;
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
