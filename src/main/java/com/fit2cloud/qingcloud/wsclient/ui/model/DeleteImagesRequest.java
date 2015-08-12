package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteImagesRequest extends Request {
    
	private List<String> images;
	private String zone;
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
}
