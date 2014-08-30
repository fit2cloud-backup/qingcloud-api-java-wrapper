package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class StopLoadBalancersResponse {
	
	public static StopLoadBalancersResponse fromJson(String jsonStopLoadBalancersResponse){
		Gson gson = new Gson();
		StopLoadBalancersResponse stopLoadBalancersResponse = gson.fromJson(jsonStopLoadBalancersResponse, StopLoadBalancersResponse.class);
		return stopLoadBalancersResponse;
	}

}
