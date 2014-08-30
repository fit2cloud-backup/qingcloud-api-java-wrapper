package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyLoadBalancerBackendAttributesResponse {
	
	public static ModifyLoadBalancerBackendAttributesResponse fromJson(String jsonModifyLoadBalancerBackendAttributesResponse){
		Gson gson = new Gson();
		ModifyLoadBalancerBackendAttributesResponse modifyLoadBalancerBackendAttributesResponse = gson.fromJson(jsonModifyLoadBalancerBackendAttributesResponse, ModifyLoadBalancerBackendAttributesResponse.class);
		return modifyLoadBalancerBackendAttributesResponse;
	}

}
