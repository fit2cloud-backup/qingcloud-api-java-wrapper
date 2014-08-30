package com.fit2cloud.qingcloud.wsclient.ui.model;

public class Response {
	
	protected String RequestId;

	public String getRequestId() {
		return RequestId;
	}

	public void setRequestId(String requestId) {
		RequestId = requestId;
	}

	@Override
	public String toString() {
		return "Response [RequestId=" + RequestId + "]";
	}
	
}
