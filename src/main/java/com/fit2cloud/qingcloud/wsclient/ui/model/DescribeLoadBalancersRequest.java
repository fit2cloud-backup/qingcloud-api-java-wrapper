package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeLoadBalancersRequest extends Request {
    
	private List<String> loadbalancers;
	private List<String> status;
	private String search_word;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	public List<String> getLoadbalancers() {
		return loadbalancers;
	}
	public void setLoadbalancers(List<String> loadbalancers) {
		this.loadbalancers = loadbalancers;
	}
	public List<String> getStatus() {
		return status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
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
