package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudVxnetInstance {
	private String vxnet_id;
	private String instance_id;
	private String instance_name;
	private String description;
	private String instance_type;
	private Integer vcpus_current;
	private Integer memory_current;
	private String status;
	private String transition_status;
	private String create_time;
	private String status_time;
	private String image_id;
	private QingCloudDHCP dhcp_options;
	private String private_ip;
	private String nic_id;

	public String getVxnet_id() {
		return vxnet_id;
	}

	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}

	public String getInstance_id() {
		return instance_id;
	}

	public void setInstance_id(String instance_id) {
		this.instance_id = instance_id;
	}

	public String getInstance_name() {
		return instance_name;
	}

	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstance_type() {
		return instance_type;
	}

	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
	}

	public Integer getVcpus_current() {
		return vcpus_current;
	}

	public void setVcpus_current(Integer vcpus_current) {
		this.vcpus_current = vcpus_current;
	}

	public Integer getMemory_current() {
		return memory_current;
	}

	public void setMemory_current(Integer memory_current) {
		this.memory_current = memory_current;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransition_status() {
		return transition_status;
	}

	public void setTransition_status(String transition_status) {
		this.transition_status = transition_status;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getStatus_time() {
		return status_time;
	}

	public void setStatus_time(String status_time) {
		this.status_time = status_time;
	}

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	public QingCloudDHCP getDhcp_options() {
		return dhcp_options;
	}

	public void setDhcp_options(QingCloudDHCP dhcp_options) {
		this.dhcp_options = dhcp_options;
	}

	public String getPrivate_ip() {
		return private_ip;
	}

	public void setPrivate_ip(String private_ip) {
		this.private_ip = private_ip;
	}

	public String getNic_id() {
		return nic_id;
	}

	public void setNic_id(String nic_id) {
		this.nic_id = nic_id;
	}

	@Override
	public String toString() {
		return "QingCloudVxnetInstance [vxnet_id=" + vxnet_id
				+ ", instance_id=" + instance_id + ", instance_name="
				+ instance_name + ", description=" + description
				+ ", instance_type=" + instance_type + ", vcpus_current="
				+ vcpus_current + ", memory_current=" + memory_current
				+ ", status=" + status + ", transition_status="
				+ transition_status + ", create_time=" + create_time
				+ ", status_time=" + status_time + ", image_id=" + image_id
				+ ", dhcp_options=" + dhcp_options + ", private_ip="
				+ private_ip + ", nic_id=" + nic_id + "]";
	}

}
