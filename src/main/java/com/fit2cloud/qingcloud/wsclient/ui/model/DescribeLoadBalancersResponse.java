package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeLoadBalancersResponse {
	
	public static DescribeLoadBalancersResponse fromJson(String jsonDescribeLoadBalancersResponse){
		Gson gson = new Gson();
		DescribeLoadBalancersResponse describeLoadBalancersResponse = gson.fromJson(jsonDescribeLoadBalancersResponse, DescribeLoadBalancersResponse.class);
		return describeLoadBalancersResponse;
	}

}
