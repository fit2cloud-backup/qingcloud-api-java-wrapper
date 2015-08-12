package com.fit2cloud.qingcloud.wsclient.ui.model;

public class CaptureInstanceRequest extends Request {
	private String instance;
	private String image_name;
	private String zone;
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getImage_name() {
		return image_name;
	}
	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
