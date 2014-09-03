package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudSecurityGroup extends QingCloudSecurityGroupBasic {

	private Integer is_applied;
	private String description;
	private String security_group_name;
	private String create_time;
	private String owner;

	public Integer getIs_applied() {
		return is_applied;
	}

	public void setIs_applied(Integer is_applied) {
		this.is_applied = is_applied;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSecurity_group_name() {
		return security_group_name;
	}

	public void setSecurity_group_name(String security_group_name) {
		this.security_group_name = security_group_name;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
