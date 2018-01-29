package com.fit2cloud.qingcloud.wsclient.ui.model;

public class CreateVolumesRequest extends Request {
	private String volume_name;
	private Integer volume_type;
	private Integer size;
	private Integer count;	
	private String zone;
	private String repl = null;

	public String getVolume_name() {
		return volume_name;
	}
	public void setVolume_name(String volume_name) {
		this.volume_name = volume_name;
	}
	public Integer getVolume_type() {
		return volume_type;
	}
	public void setVolume_type(Integer volume_type) {
		this.volume_type = volume_type;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getRepl() {
		return repl;
	}

	public void setRepl(String repl) {
		this.repl = repl;
	}
}
