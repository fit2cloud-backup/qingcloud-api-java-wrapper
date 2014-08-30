package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class AddLoadBalancerBackendsResponse {
	
	public static AddLoadBalancerBackendsResponse fromJson(String jsonAddLoadBalancerBackendsResponse){
		Gson gson = new Gson();
		AddLoadBalancerBackendsResponse addLoadBalancerBackendsResponse = gson.fromJson(jsonAddLoadBalancerBackendsResponse, AddLoadBalancerBackendsResponse.class);
		return addLoadBalancerBackendsResponse;
	}

}
