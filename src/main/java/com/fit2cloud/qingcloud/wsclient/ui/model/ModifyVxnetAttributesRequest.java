package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifyVxnetAttributesRequest extends Request {
	private String vxnet;
	private String vxnet_name;
	private String description;
	private String zone;

	public String getVxnet() {
		return vxnet;
	}

	public void setVxnet(String vxnet) {
		this.vxnet = vxnet;
	}

	public String getVxnet_name() {
		return vxnet_name;
	}

	public void setVxnet_name(String vxnet_name) {
		this.vxnet_name = vxnet_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
