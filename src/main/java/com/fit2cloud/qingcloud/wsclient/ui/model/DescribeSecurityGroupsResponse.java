package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudResource;
import com.google.gson.Gson;

public class DescribeSecurityGroupsResponse {
	
	private String security_group_id;
	private String security_group_name;
	private String description;
	private Integer is_applied;
	private Integer is_default;
	private List<QingCloudResource> resources;
	private String create_time;
	
	
	public static DescribeSecurityGroupsResponse fromJson(String jsonDescribeSecurityGroupsResponse){
		Gson gson = new Gson();
		DescribeSecurityGroupsResponse describeSecurityGroupsResponse = gson.fromJson(jsonDescribeSecurityGroupsResponse, DescribeSecurityGroupsResponse.class);
		return describeSecurityGroupsResponse;
	}


	public String getSecurity_group_id() {
		return security_group_id;
	}


	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
	}


	public String getSecurity_group_name() {
		return security_group_name;
	}


	public void setSecurity_group_name(String security_group_name) {
		this.security_group_name = security_group_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getIs_applied() {
		return is_applied;
	}


	public void setIs_applied(Integer is_applied) {
		this.is_applied = is_applied;
	}


	public Integer getIs_default() {
		return is_default;
	}


	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}


	public List<QingCloudResource> getResources() {
		return resources;
	}


	public void setResources(List<QingCloudResource> resources) {
		this.resources = resources;
	}


	public String getCreate_time() {
		return create_time;
	}


	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	
}
