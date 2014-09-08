package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeRoutersRequest extends Request {
    
	private String zone;
	private List<String> routers;
	private List<String> status;
	private String search_word;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public List<String> getRouters() {
		return routers;
	}
	public void setRouters(List<String> routers) {
		this.routers = routers;
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
}
