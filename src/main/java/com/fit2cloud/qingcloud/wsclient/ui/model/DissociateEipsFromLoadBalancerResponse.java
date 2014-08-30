package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DissociateEipsFromLoadBalancerResponse {
	
	public static DissociateEipsFromLoadBalancerResponse fromJson(String jsonDissociateEipsFromLoadBalancerResponse){
		Gson gson = new Gson();
		DissociateEipsFromLoadBalancerResponse dissociateEipsFromLoadBalancerResponse = gson.fromJson(jsonDissociateEipsFromLoadBalancerResponse, DissociateEipsFromLoadBalancerResponse.class);
		return dissociateEipsFromLoadBalancerResponse;
	}

}
