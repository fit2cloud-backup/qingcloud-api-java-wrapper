package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class DescribeImagesResponse {
	
	public static DescribeImagesResponse fromJson(String jsonDescribeImagesResponse){
		Gson gson = new Gson();
		DescribeImagesResponse describeImagesResponse = gson.fromJson(jsonDescribeImagesResponse, DescribeImagesResponse.class);
		return describeImagesResponse;
	}

}
