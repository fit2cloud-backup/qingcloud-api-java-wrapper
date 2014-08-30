package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ResetInstancesRequest extends Request {
	private List<String> instances;
    private String login_mode;
    private String login_keypair;
    private String login_passwd;
    private Integer need_newsid;
    private String zone;
    
	public List<String> getInstances() {
		return instances;
	}
	public void setInstances(List<String> instances) {
		this.instances = instances;
	}
	public String getLogin_mode() {
		return login_mode;
	}
	public void setLogin_mode(String login_mode) {
		this.login_mode = login_mode;
	}
	public String getLogin_keypair() {
		return login_keypair;
	}
	public void setLogin_keypair(String login_keypair) {
		this.login_keypair = login_keypair;
	}
	public String getLogin_passwd() {
		return login_passwd;
	}
	public void setLogin_passwd(String login_passwd) {
		this.login_passwd = login_passwd;
	}
	public Integer getNeed_newsid() {
		return need_newsid;
	}
	public void setNeed_newsid(Integer need_newsid) {
		this.need_newsid = need_newsid;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
    
    
}
