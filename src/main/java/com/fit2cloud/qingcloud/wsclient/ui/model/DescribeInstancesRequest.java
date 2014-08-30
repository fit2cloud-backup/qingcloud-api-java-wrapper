package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeInstancesRequest extends Request {
    private List<String> instances;
    private String image_id;
    private String instance_type;
    private String status;
    private String search_word;
    
    private Integer offset;
	private Integer limit;
	private Integer verbose;
	
    private String zone;

	public List<String> getInstances() {
		return instances;
	}

	public void setInstances(List<String> instances) {
		this.instances = instances;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	public String getInstance_type() {
		return instance_type;
	}

	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
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
