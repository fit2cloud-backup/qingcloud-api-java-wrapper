package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeTagsRequest extends Request {
    private List<String> tags;
    private String search_word;
    
    private Integer offset;
	private Integer limit;
	private Integer verbose;
	
    private String zone;

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getSearch_word() {
		return search_word;
	}

	public void setSearch_word(String search_word) {
		this.search_word = search_word;
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

	public Integer getVerbose() {
		return verbose;
	}

	public void setVerbose(Integer verbose) {
		this.verbose = verbose;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
