package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class AddLoadBalancerListenersResponse {
	
	public static AddLoadBalancerListenersResponse fromJson(String jsonAddLoadBalancerListenersResponse){
		Gson gson = new Gson();
		AddLoadBalancerListenersResponse addLoadBalancerListenersResponse = gson.fromJson(jsonAddLoadBalancerListenersResponse, AddLoadBalancerListenersResponse.class);
		return addLoadBalancerListenersResponse;
	}

}
