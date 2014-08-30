package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeSnapshotsResponse {
	
	public static DescribeSnapshotsResponse fromJson(String jsonDescribeSnapshotsResponse){
		Gson gson = new Gson();
		DescribeSnapshotsResponse describeSnapshotsResponse = gson.fromJson(jsonDescribeSnapshotsResponse, DescribeSnapshotsResponse.class);
		return describeSnapshotsResponse;
	}

}
