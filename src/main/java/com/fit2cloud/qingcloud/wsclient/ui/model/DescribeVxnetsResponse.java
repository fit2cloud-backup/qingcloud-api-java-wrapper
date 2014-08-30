package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeVxnetsResponse {
	
	public static DescribeVxnetsResponse fromJson(String jsonDescribeVxnetsResponse){
		Gson gson = new Gson();
		DescribeVxnetsResponse describeVxnetsResponse = gson.fromJson(jsonDescribeVxnetsResponse, DescribeVxnetsResponse.class);
		return describeVxnetsResponse;
	}

}
