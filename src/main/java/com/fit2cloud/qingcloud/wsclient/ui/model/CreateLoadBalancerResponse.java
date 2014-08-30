package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CreateLoadBalancerResponse {
	
	public static CreateLoadBalancerResponse fromJson(String jsonCreateLoadBalancerResponse){
		Gson gson = new Gson();
		CreateLoadBalancerResponse createLoadBalancerResponse = gson.fromJson(jsonCreateLoadBalancerResponse, CreateLoadBalancerResponse.class);
		return createLoadBalancerResponse;
	}

}
