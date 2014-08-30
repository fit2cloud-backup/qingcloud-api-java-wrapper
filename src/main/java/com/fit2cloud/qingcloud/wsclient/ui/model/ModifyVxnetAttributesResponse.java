package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyVxnetAttributesResponse {
	
	public static ModifyVxnetAttributesResponse fromJson(String jsonModifyVxnetAttributesResponse){
		Gson gson = new Gson();
		ModifyVxnetAttributesResponse modifyVxnetAttributesResponse = gson.fromJson(jsonModifyVxnetAttributesResponse, ModifyVxnetAttributesResponse.class);
		return modifyVxnetAttributesResponse;
	}

}
