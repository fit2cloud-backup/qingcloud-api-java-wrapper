package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolume;
import com.google.gson.Gson;

public class DescribeVolumesResponse {
	
	private String action;
	private List<QingCloudVolume> volume_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeVolumesResponse fromJson(String jsonDescribeVolumesResponse){
		Gson gson = new Gson();
		DescribeVolumesResponse describeVolumesResponse = gson.fromJson(jsonDescribeVolumesResponse, DescribeVolumesResponse.class);
		return describeVolumesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudVolume> getVolume_set() {
		return volume_set;
	}

	public void setVolume_set(List<QingCloudVolume> volume_set) {
		this.volume_set = volume_set;
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
