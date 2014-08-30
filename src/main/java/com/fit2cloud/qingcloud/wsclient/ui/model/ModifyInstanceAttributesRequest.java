package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifyInstanceAttributesRequest extends Request {
    
	private String instance;
	private String instance_name;
	private String description;
	private String zone;
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getInstance_name() {
		return instance_name;
	}
	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
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
