package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeSecurityGroupRulesRequest extends Request {
	private String security_group;
	private List<String> security_group_rules;
	private Integer direction;
	private Integer offset;
	private Integer limit;
	
    private String zone;

	public String getSecurity_group() {
		return security_group;
	}

	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}

	public List<String> getSecurity_group_rules() {
		return security_group_rules;
	}

	public void setSecurity_group_rules(List<String> security_group_rules) {
		this.security_group_rules = security_group_rules;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
    
    
}
