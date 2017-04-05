package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSecurityGroup;
import com.google.gson.Gson;

public class DescribeSecurityGroupsResponse {

	private String action;
	private List<QingCloudSecurityGroup> security_group_set;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;

	public static DescribeSecurityGroupsResponse fromJson(
			String jsonDescribeSecurityGroupsResponse) {
		Gson gson = new Gson();
		DescribeSecurityGroupsResponse describeSecurityGroupsResponse = gson
				.fromJson(jsonDescribeSecurityGroupsResponse,
						DescribeSecurityGroupsResponse.class);
		return describeSecurityGroupsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudSecurityGroup> getSecurity_group_set() {
		return security_group_set;
	}

	public void setSecurity_group_set(
			List<QingCloudSecurityGroup> security_group_set) {
		this.security_group_set = security_group_set;
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
