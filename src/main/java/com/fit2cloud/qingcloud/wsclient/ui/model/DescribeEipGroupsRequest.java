package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeEipGroupsRequest extends Request {
	private List<String> status;
	private Integer offset;
	private Integer limit;

	private String zone;

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
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
