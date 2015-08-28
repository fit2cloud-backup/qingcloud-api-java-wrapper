package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudLoadBalancer {
	private String loadbalancer_id;
	private String loadbalancer_name;
	private String description;
	private List<QingcloudLoadBalancerListener> listeners;
	private Integer is_applied;
	private String status;
	private String transition_status;
	private List<QingCloudEIP> eips;
	private String create_time;
	private String status_time;
	private String security_group_id;
	
	private Integer loadbalancer_type;
	private Integer sub_code;
	private QingCloudVxnet vxnet;
	private String vxnet_id;
	
	public String getLoadbalancer_id() {
		return loadbalancer_id;
	}
	public void setLoadbalancer_id(String loadbalancer_id) {
		this.loadbalancer_id = loadbalancer_id;
	}
	public String getLoadbalancer_name() {
		return loadbalancer_name;
	}
	public void setLoadbalancer_name(String loadbalancer_name) {
		this.loadbalancer_name = loadbalancer_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<QingcloudLoadBalancerListener> getListeners() {
		return listeners;
	}
	public void setListeners(List<QingcloudLoadBalancerListener> listeners) {
		this.listeners = listeners;
	}
	public Integer getIs_applied() {
		return is_applied;
	}
	public void setIs_applied(Integer is_applied) {
		this.is_applied = is_applied;
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
	public List<QingCloudEIP> getEips() {
		return eips;
	}
	public void setEips(List<QingCloudEIP> eips) {
		this.eips = eips;
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
	public String getSecurity_group_id() {
		return security_group_id;
	}
	public void setSecurity_group_id(String security_group_id) {
		this.security_group_id = security_group_id;
	}
	public Integer getLoadbalancer_type() {
		return loadbalancer_type;
	}
	public void setLoadbalancer_type(Integer loadbalancer_type) {
		this.loadbalancer_type = loadbalancer_type;
	}
	public QingCloudVxnet getVxnet() {
		return vxnet;
	}
	public void setVxnet(QingCloudVxnet vxnet) {
		this.vxnet = vxnet;
	}
	public Integer getSub_code() {
		return sub_code;
	}
	public void setSub_code(Integer sub_code) {
		this.sub_code = sub_code;
	}
	public String getVxnet_id() {
		return vxnet_id;
	}
	public void setVxnet_id(String vxnet_id) {
		this.vxnet_id = vxnet_id;
	}
}
