package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVxnetDetail;
import com.google.gson.Gson;

public class DescribeVxnetsResponse {
	private String action;
	private List<QingCloudVxnetDetail> vxnet_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	public static DescribeVxnetsResponse fromJson(String jsonDescribeVxnetsResponse){
		Gson gson = new Gson();
		DescribeVxnetsResponse describeVxnetsResponse = gson.fromJson(jsonDescribeVxnetsResponse, DescribeVxnetsResponse.class);
		return describeVxnetsResponse;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<QingCloudVxnetDetail> getVxnet_set() {
		return vxnet_set;
	}
	public void setVxnet_set(List<QingCloudVxnetDetail> vxnet_set) {
		this.vxnet_set = vxnet_set;
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
