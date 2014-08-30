package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudEIP;
import com.google.gson.Gson;

public class DescribeEipsResponse {
	
	private String action;
	private List<QingCloudEIP> eip_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeEipsResponse fromJson(String jsonDescribeEipsResponse){
		Gson gson = new Gson();
		DescribeEipsResponse describeEipsResponse = gson.fromJson(jsonDescribeEipsResponse, DescribeEipsResponse.class);
		return describeEipsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudEIP> getEip_set() {
		return eip_set;
	}

	public void setEip_set(List<QingCloudEIP> eip_set) {
		this.eip_set = eip_set;
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
