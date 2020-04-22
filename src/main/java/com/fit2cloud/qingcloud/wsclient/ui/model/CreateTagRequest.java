package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateTagRequest extends Request {
	private String tag_name;
	private String zone;

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
