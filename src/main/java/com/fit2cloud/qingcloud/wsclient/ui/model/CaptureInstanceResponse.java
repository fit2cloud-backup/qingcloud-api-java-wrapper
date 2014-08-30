package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CaptureInstanceResponse {
	
	public static CaptureInstanceResponse fromJson(String jsonCaptureInstanceResponse){
		Gson gson = new Gson();
		CaptureInstanceResponse captureInstanceResponse = gson.fromJson(jsonCaptureInstanceResponse, CaptureInstanceResponse.class);
		return captureInstanceResponse;
	}

}
