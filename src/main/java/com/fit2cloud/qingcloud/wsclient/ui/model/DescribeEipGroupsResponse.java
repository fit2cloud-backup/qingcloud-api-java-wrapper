package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudEIPGroup;
import com.google.gson.Gson;

public class DescribeEipGroupsResponse {
	private String action;
	private List<QingCloudEIPGroup> eip_group_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeEipGroupsResponse fromJson(String jsonDescribeEipGroupsResponse){
		Gson gson = new Gson();
		DescribeEipGroupsResponse describeEipGroupsResponse = gson.fromJson(jsonDescribeEipGroupsResponse, DescribeEipGroupsResponse.class);
		return describeEipGroupsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudEIPGroup> getEip_group_set() {
		return eip_group_set;
	}

	public void setEip_group_set(List<QingCloudEIPGroup> eip_group_set) {
		this.eip_group_set = eip_group_set;
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
