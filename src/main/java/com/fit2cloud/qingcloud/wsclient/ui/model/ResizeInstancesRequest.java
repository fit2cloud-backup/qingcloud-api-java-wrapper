package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ResizeInstancesRequest extends Request {
	private List<String> instances;
    private String instance_type;
    private Integer cpu;
    private Integer memory;
    private String zone;
    private Integer os_disk_size;

	public Integer getOs_disk_size() {
		return os_disk_size;
	}

	public void setOs_disk_size(Integer os_disk_size) {
		this.os_disk_size = os_disk_size;
	}

	public List<String> getInstances() {
		return instances;
	}
	public void setInstances(List<String> instances) {
		this.instances = instances;
	}
	public String getInstance_type() {
		return instance_type;
	}
	public void setInstance_type(String instance_type) {
		this.instance_type = instance_type;
	}
	public Integer getCpu() {
		return cpu;
	}
	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}
	public Integer getMemory() {
		return memory;
	}
	public void setMemory(Integer memory) {
		this.memory = memory;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
    

}
