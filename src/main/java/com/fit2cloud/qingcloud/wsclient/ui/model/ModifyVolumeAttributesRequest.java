package com.fit2cloud.qingcloud.wsclient.ui.model;

public class ModifyVolumeAttributesRequest extends Request {
	private String volume;
	private String volume_name;
	private String description;
	
    private String zone;

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getVolume_name() {
		return volume_name;
	}

	public void setVolume_name(String volume_name) {
		this.volume_name = volume_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

    
}
