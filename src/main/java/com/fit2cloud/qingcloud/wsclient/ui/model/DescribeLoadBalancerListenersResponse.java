package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeLoadBalancerListenersResponse {
	
	public static DescribeLoadBalancerListenersResponse fromJson(String jsonDescribeLoadBalancerListenersResponse){
		Gson gson = new Gson();
		DescribeLoadBalancerListenersResponse describeLoadBalancerListenersResponse = gson.fromJson(jsonDescribeLoadBalancerListenersResponse, DescribeLoadBalancerListenersResponse.class);
		return describeLoadBalancerListenersResponse;
	}

}
