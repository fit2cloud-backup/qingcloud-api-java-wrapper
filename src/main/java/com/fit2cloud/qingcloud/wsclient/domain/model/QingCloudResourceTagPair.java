package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudResourceTagPair {
	private String tag_id;
	private String resource_type;
	private String resource_id;

	public String getTag_id() {
		return tag_id;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}

	public String getResource_id() {
		return resource_id;
	}

	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}
}
