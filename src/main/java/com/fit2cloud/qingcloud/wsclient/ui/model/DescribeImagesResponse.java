package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudImage;
import com.google.gson.Gson;

public class DescribeImagesResponse {
	
	private String action;
	private Integer total_count = 0;
	private Integer ret_code;
	private String message;
	private List<QingCloudImage> image_set;
	
	public static DescribeImagesResponse fromJson(String jsonDescribeImagesResponse){
		Gson gson = new Gson();
		DescribeImagesResponse describeImagesResponse = gson.fromJson(jsonDescribeImagesResponse, DescribeImagesResponse.class);
		return describeImagesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<QingCloudImage> getImage_set() {
		return image_set;
	}

	public void setImage_set(List<QingCloudImage> image_set) {
		this.image_set = image_set;
	}
}
