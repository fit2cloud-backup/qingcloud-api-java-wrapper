package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudSecurityGroupRule {
	private String security_group_id;
    private String security_group_rule_id;
    private String security_group_rule_name;
    private Integer priority;
    private String protocol;
    private Integer direction;
    private String action;
    private String val1;
    private String val2;
    private String val3;
    
    
	public String getSecurity_group_id() {
		return security_group_id;
	}
	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
	}
	public String getSecurity_group_rule_id() {
		return security_group_rule_id;
	}
	public void setSecurity_group_rule_id(String security_group_rule_id) {
		this.security_group_rule_id = security_group_rule_id;
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
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	public Integer getDirection() {
		return direction;
	}
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
    
    
}
