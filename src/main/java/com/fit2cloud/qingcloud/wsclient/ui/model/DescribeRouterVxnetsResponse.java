package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeRouterVxnetsResponse {
	
	public static DescribeRouterVxnetsResponse fromJson(String jsonDescribeRouterVxnetsResponse){
		Gson gson = new Gson();
		DescribeRouterVxnetsResponse describeRouterVxnetsResponse = gson.fromJson(jsonDescribeRouterVxnetsResponse, DescribeRouterVxnetsResponse.class);
		return describeRouterVxnetsResponse;
	}

}
