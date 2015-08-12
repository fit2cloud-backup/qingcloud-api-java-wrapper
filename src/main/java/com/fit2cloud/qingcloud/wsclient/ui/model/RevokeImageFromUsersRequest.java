package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class RevokeImageFromUsersRequest extends Request {
    
	private List<String> users;
	private String zone;
	private String image;
	public List<String> getUsers() {
		return users;
	}
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
