package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class StartLoadBalancersResponse {
	
	public static StartLoadBalancersResponse fromJson(String jsonStartLoadBalancersResponse){
		Gson gson = new Gson();
		StartLoadBalancersResponse startLoadBalancersResponse = gson.fromJson(jsonStartLoadBalancersResponse, StartLoadBalancersResponse.class);
		return startLoadBalancersResponse;
	}

}
