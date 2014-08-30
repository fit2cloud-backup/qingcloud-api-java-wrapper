package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class AssociateEipsToLoadBalancerResponse {
	
	public static AssociateEipsToLoadBalancerResponse fromJson(String jsonAssociateEipsToLoadBalancerResponse){
		Gson gson = new Gson();
		AssociateEipsToLoadBalancerResponse associateEipsToLoadBalancerResponse = gson.fromJson(jsonAssociateEipsToLoadBalancerResponse, AssociateEipsToLoadBalancerResponse.class);
		return associateEipsToLoadBalancerResponse;
	}

}
