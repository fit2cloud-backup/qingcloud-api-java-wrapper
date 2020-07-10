package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeS2ServersRequest extends Request {
    private List<String> s2_servers;
    private List<String> service_types;
    private List<String> status;
    private String search_word;
    
    private Integer offset;
	private Integer limit;
	private Integer verbose;
	
    private String zone;


	public List<String> getS2_servers() {
		return s2_servers;
	}

	public void setS2_servers(List<String> s2_servers) {
		this.s2_servers = s2_servers;
	}

	public List<String> getService_types() {
		return service_types;
	}

	public void setService_types(List<String> service_types) {
		this.service_types = service_types;
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
