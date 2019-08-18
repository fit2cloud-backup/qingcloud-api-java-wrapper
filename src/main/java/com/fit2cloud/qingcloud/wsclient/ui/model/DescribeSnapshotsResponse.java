package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSnapshot;
import com.google.gson.Gson;

import java.util.List;

public class DescribeSnapshotsResponse {
	private String action;
	private List<QingCloudSnapshot> snapshot_set;
	private Integer ret_code;
	private String message;
	private Integer total_count = 0;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudSnapshot> getSnapshot_set() {
		return snapshot_set;
	}

	public void setSnapshot_set(List<QingCloudSnapshot> snapshot_set) {
		this.snapshot_set = snapshot_set;
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

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public static DescribeSnapshotsResponse fromJson(String jsonDescribeSnapshotsResponse){
		Gson gson = new Gson();
		DescribeSnapshotsResponse describeSnapshotsResponse = gson.fromJson(jsonDescribeSnapshotsResponse, DescribeSnapshotsResponse.class);
		return describeSnapshotsResponse;
	}

}
