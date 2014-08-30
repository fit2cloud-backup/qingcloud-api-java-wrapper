package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ModifyEipAttributesRequest extends Request {
	private String eip;
	private String eip_name;
	private String description;
	private String zone;
	
	public String getEip() {
		return eip;
	}
	public void setEip(String eip) {
		this.eip = eip;
	}
	public String getEip_name() {
		return eip_name;
	}
	public void setEip_name(String eip_name) {
		this.eip_name = eip_name;
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
