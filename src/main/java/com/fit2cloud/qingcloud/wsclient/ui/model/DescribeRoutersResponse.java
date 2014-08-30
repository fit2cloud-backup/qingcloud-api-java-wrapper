package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeRoutersResponse {
	
	public static DescribeRoutersResponse fromJson(String jsonDescribeRoutersResponse){
		Gson gson = new Gson();
		DescribeRoutersResponse describeRoutersResponse = gson.fromJson(jsonDescribeRoutersResponse, DescribeRoutersResponse.class);
		return describeRoutersResponse;
	}

}
