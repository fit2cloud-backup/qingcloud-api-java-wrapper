package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateSecurityGroupRequest extends Request {
	private String security_group_name;
	private String zone;
	
	public String getSecurity_group_name() {
		return security_group_name;
	}
	public void setSecurity_group_name(String security_group_name) {
		this.security_group_name = security_group_name;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
}
