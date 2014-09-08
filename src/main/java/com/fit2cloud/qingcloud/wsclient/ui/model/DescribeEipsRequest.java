package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DescribeEipsRequest extends Request {
	private List<String> eips;
	private String instance_id;
	private String status;
	private String search_word;
	private Integer offset;
	private Integer limit;

	private String zone;

	public List<String> getEips() {
		return eips;
	}

	public void setEips(List<String> eips) {
		this.eips = eips;
	}

	public String getInstance_id() {
		return instance_id;
	}

	public void setInstance_id(String instance_id) {
		this.instance_id = instance_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
