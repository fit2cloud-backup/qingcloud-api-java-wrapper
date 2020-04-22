package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudResourceTagPair;

import java.util.List;


public class AttachTagsRequest extends Request {
	private List<QingCloudResourceTagPair> resource_tag_pairs;
    private String zone;

	public List<QingCloudResourceTagPair> getResource_tag_pairs() {
		return resource_tag_pairs;
	}

	public void setResource_tag_pairs(List<QingCloudResourceTagPair> resource_tag_pairs) {
		this.resource_tag_pairs = resource_tag_pairs;
	}

	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
}
