package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeLoadBalancerBackendsResponse {
	
	public static DescribeLoadBalancerBackendsResponse fromJson(String jsonDescribeLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		DescribeLoadBalancerBackendsResponse describeLoadBalancerBackendsResponse = gson.fromJson(jsonDescribeLoadBalancerBackendsResponse, DescribeLoadBalancerBackendsResponse.class);
		return describeLoadBalancerBackendsResponse;
	}

}
