package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteSecurityGroupsRequest extends Request {
	private List<String> security_groups;
    private String zone;
    
	public List<String> getSecurity_groups() {
		return security_groups;
	}
	public void setSecurity_groups(List<String> security_groups) {
		this.security_groups = security_groups;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
	
}
