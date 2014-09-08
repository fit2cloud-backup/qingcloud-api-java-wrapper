package com.fit2cloud.qingcloud.wsclient.ui.model;

public class CreateVxnetsRequest extends Request {

	private String vxnet_name;
	private Integer vxnet_type;
	private Integer count;
	private String zone;

	public String getVxnet_name() {
		return vxnet_name;
	}

	public void setVxnet_name(String vxnet_name) {
		this.vxnet_name = vxnet_name;
	}

	public Integer getVxnet_type() {
		return vxnet_type;
	}

	public void setVxnet_type(Integer vxnet_type) {
		this.vxnet_type = vxnet_type;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
