package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DeleteKeyPairsRequest extends Request {
    private List<String> keypairs;
    private String zone;

	public List<String> getKeypairs() {
		return keypairs;
	}

	public void setKeypairs(List<String> keypairs) {
		this.keypairs = keypairs;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}
