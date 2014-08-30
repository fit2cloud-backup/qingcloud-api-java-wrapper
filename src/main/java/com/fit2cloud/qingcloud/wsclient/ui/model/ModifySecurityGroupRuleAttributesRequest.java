package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifySecurityGroupRuleAttributesRequest extends Request {
	private String security_group_rule;
	private String security_group_rule_name;
	private Integer priority;
	private String zone;
	
	public String getSecurity_group_rule() {
		return security_group_rule;
	}
	public void setSecurity_group_rule(String security_group_rule) {
		this.security_group_rule = security_group_rule;
	}
	public String getSecurity_group_rule_name() {
		return security_group_rule_name;
	}
	public void setSecurity_group_rule_name(String security_group_rule_name) {
		this.security_group_rule_name = security_group_rule_name;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
}
