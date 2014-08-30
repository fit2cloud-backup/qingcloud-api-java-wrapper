package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class ModifyImageAttributesResponse {
	
	public static ModifyImageAttributesResponse fromJson(String jsonModifyImageAttributesResponse){
		Gson gson = new Gson();
		ModifyImageAttributesResponse modifyImageAttributesResponse = gson.fromJson(jsonModifyImageAttributesResponse, ModifyImageAttributesResponse.class);
		return modifyImageAttributesResponse;
	}

}
