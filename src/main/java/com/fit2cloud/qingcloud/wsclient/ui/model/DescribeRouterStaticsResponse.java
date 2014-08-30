package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeRouterStaticsResponse {
	
	public static DescribeRouterStaticsResponse fromJson(String jsonDescribeRouterStaticsResponse){
		Gson gson = new Gson();
		DescribeRouterStaticsResponse describeRouterStaticsResponse = gson.fromJson(jsonDescribeRouterStaticsResponse, DescribeRouterStaticsResponse.class);
		return describeRouterStaticsResponse;
	}

}
