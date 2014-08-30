package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifySecurityGroupAttributesRequest extends Request {
	private String security_group;
	private String security_group_name;
	private String description;
	
    private String zone;

	public String getSecurity_group() {
		return security_group;
	}

	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}

	public String getSecurity_group_name() {
		return security_group_name;
	}

	public void setSecurity_group_name(String security_group_name) {
		this.security_group_name = security_group_name;
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
