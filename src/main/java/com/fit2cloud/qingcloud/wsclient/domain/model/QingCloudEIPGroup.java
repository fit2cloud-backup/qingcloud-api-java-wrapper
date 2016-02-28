package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudEIPGroup {
    private String eip_group_id;
    private String eip_group_name;
    private String status;
    private String create_time;
    
	public String getEip_group_id() {
		return eip_group_id;
	}
	public void setEip_group_id(String eip_group_id) {
		this.eip_group_id = eip_group_id;
	}
	public String getEip_group_name() {
		return eip_group_name;
	}
	public void setEip_group_name(String eip_group_name) {
		this.eip_group_name = eip_group_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
