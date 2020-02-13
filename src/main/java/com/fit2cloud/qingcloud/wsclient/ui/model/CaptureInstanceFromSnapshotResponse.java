package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CaptureInstanceFromSnapshotResponse {

	private String image_id;
	private String job_id;
	private Integer ret_code;
	
	public static CaptureInstanceFromSnapshotResponse fromJson(String jsonCaptureInstanceFromSnapshotResponse){
		Gson gson = new Gson();
		CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshotResponse = gson.fromJson(jsonCaptureInstanceFromSnapshotResponse, CaptureInstanceFromSnapshotResponse.class);
		return captureInstanceFromSnapshotResponse;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}
}
