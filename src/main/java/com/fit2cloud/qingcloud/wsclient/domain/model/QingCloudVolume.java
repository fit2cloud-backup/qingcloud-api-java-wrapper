package com.fit2cloud.qingcloud.wsclient.domain.model;


public class QingCloudVolume {
	private String volume_id;
    private String volume_name;
    private String description;
    private Integer size;
    private String status;
    private String transition_status;
    
    private String create_time;
    private String status_time;
    private QingCloudInstance instance;
    
	public String getVolume_id() {
		return volume_id;
	}
	public void setVolume_id(String volume_id) {
		this.volume_id = volume_id;
	}
	public String getVolume_name() {
		return volume_name;
	}
	public void setVolume_name(String volume_name) {
		this.volume_name = volume_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
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
	public QingCloudInstance getInstance() {
		return instance;
	}
	public void setInstance(QingCloudInstance instance) {
		this.instance = instance;
	}
    
}
