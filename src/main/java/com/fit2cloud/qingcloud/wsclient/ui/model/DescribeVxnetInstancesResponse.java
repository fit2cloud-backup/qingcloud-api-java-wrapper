package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVxnetInstance;
import com.google.gson.Gson;

public class DescribeVxnetInstancesResponse {
	private String action;
	private List<QingCloudVxnetInstance> instance_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudVxnetInstance> getInstance_set() {
		return instance_set;
	}

	public void setInstance_set(List<QingCloudVxnetInstance> instance_set) {
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

	public static DescribeVxnetInstancesResponse fromJson(
			String jsonDescribeVxnetInstancesResponse) {
		Gson gson = new Gson();
		DescribeVxnetInstancesResponse describeVxnetInstancesResponse = gson
				.fromJson(jsonDescribeVxnetInstancesResponse,
						DescribeVxnetInstancesResponse.class);
		return describeVxnetInstancesResponse;
	}

}
