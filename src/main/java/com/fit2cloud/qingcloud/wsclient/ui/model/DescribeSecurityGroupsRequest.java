package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeSecurityGroupsRequest extends Request {
	private List<String> security_groups;
    private String search_word;
    private Integer verbose;
    private Integer offset;
    private Integer limit;
    
    private String zone;

	public List<String> getSecurity_groups() {
		return security_groups;
	}

	public void setSecurity_groups(List<String> security_groups) {
		this.security_groups = security_groups;
	}

	public String getSearch_word() {
		return search_word;
	}

	public void setSearch_word(String search_word) {
		this.search_word = search_word;
	}

	public Integer getVerbose() {
		return verbose;
	}

	public void setVerbose(Integer verbose) {
		this.verbose = verbose;
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
