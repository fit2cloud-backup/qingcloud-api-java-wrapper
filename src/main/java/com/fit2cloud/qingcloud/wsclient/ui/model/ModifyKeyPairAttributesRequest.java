package com.fit2cloud.qingcloud.wsclient.ui.model;


public class ModifyKeyPairAttributesRequest extends Request {
	
	private String keypair;
	private String keypair_name;
	private String description;
	private String zone;


	public ModifyKeyPairAttributesRequest() {
	}


	public String getKeypair() {
		return keypair;
	}


	public void setKeypair(String keypair) {
		this.keypair = keypair;
	}


	public String getKeypair_name() {
		return keypair_name;
	}


	public void setKeypair_name(String keypair_name) {
		this.keypair_name = keypair_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}
    
}
