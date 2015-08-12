package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudZoneItem;
import com.google.gson.Gson;

public class DescribeZonesResponse {
	
	private String action;
	private Integer total_count;
	private List<QingCloudZoneItem> zone_set;
	private Integer ret_code;
	private String message;
	
	public static DescribeZonesResponse fromJson(String jsonDescribeZonesResponse){
		Gson gson = new Gson();
		DescribeZonesResponse detachVolumesResponse = gson.fromJson(jsonDescribeZonesResponse, DescribeZonesResponse.class);
		return detachVolumesResponse;
	}

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

	public List<QingCloudZoneItem> getZone_set() {
		return zone_set;
	}

	public void setZone_set(List<QingCloudZoneItem> zone_set) {
		this.zone_set = zone_set;
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

	@Override
	public String toString() {
		return "DescribeZonesResponse [action=" + action + ", total_count="
				+ total_count + ", zone_set=" + zone_set + ", ret_code="
				+ ret_code + ", message=" + message + "]";
	}
	
}
