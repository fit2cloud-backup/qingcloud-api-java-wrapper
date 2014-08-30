package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

public class CaptureInstanceFromSnapshotResponse {
	
	public static CaptureInstanceFromSnapshotResponse fromJson(String jsonCaptureInstanceFromSnapshotResponse){
		Gson gson = new Gson();
		CaptureInstanceFromSnapshotResponse captureInstanceFromSnapshotResponse = gson.fromJson(jsonCaptureInstanceFromSnapshotResponse, CaptureInstanceFromSnapshotResponse.class);
		return captureInstanceFromSnapshotResponse;
	}

}
