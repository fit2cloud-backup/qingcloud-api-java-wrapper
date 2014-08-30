package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeVxnetInstancesResponse {
	
	public static DescribeVxnetInstancesResponse fromJson(String jsonDescribeVxnetInstancesResponse){
		Gson gson = new Gson();
		DescribeVxnetInstancesResponse describeVxnetInstancesResponse = gson.fromJson(jsonDescribeVxnetInstancesResponse, DescribeVxnetInstancesResponse.class);
		return describeVxnetInstancesResponse;
	}

}
