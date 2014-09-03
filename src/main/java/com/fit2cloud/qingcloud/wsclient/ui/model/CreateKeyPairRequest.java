package com.fit2cloud.qingcloud.wsclient.ui.model;


public class CreateKeyPairRequest extends Request {
	private String keypair_name;
	private String mode;
	private String encrypt_method;
	private String public_key;	
	private String zone;


	public CreateKeyPairRequest() {
	}


	public String getKeypair_name() {
		return keypair_name;
	}


	public void setKeypair_name(String keypair_name) {
		this.keypair_name = keypair_name;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getEncrypt_method() {
		return encrypt_method;
	}


	public void setEncrypt_method(String encrypt_method) {
		this.encrypt_method = encrypt_method;
	}


	public String getPublic_key() {
		return public_key;
	}


	public void setPublic_key(String public_key) {
		this.public_key = public_key;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}

	

}
