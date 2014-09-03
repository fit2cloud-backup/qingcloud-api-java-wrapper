package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudSecurityGroupBasic {
    protected String security_group_id;
    protected Integer is_default;
    
	public String getSecurity_group_id() {
		return security_group_id;
	}
	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
	}
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}
    
    
}
