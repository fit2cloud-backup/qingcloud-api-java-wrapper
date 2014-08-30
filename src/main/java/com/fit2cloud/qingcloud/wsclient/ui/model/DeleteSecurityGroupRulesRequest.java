package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteSecurityGroupRulesRequest extends Request {
	private List<String> security_group_rules;
    private String zone;
    
	public List<String> getSecurity_group_rules() {
		return security_group_rules;
	}
	public void setSecurity_group_rules(List<String> security_group_rules) {
		this.security_group_rules = security_group_rules;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
    
}
