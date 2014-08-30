package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudVxnet {
    private String vxnet_name;
    private Integer vxnet_type;
    private String vxnet_id;
    private String nic_id;
    private String private_ip;
    
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
	public String getVxnet_id() {
		return vxnet_id;
	}
	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}
	public String getNic_id() {
		return nic_id;
	}
	public void setNic_id(String nic_id) {
		this.nic_id = nic_id;
	}
	public String getPrivate_ip() {
		return private_ip;
	}
	public void setPrivate_ip(String private_ip) {
		this.private_ip = private_ip;
	}
    
    
}
