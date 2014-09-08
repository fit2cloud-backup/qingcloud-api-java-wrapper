package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DescribeVxnetInstancesRequest extends Request {
	private String vxnet;
	private List<String> instances;
	private String instance_type;
	private String status;
	private String image;
	private Integer offset;
	private Integer limit;
	private String zone;

	public String getVxnet() {
		return vxnet;
	}

	public void setVxnet(String vxnet) {
		this.vxnet = vxnet;
	}

	public List<String> getInstances() {
		return instances;
	}

	public void setInstances(List<String> instances) {
		this.instances = instances;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
