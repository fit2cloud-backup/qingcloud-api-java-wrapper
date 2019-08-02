package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class ChangeEipsBillingModeRequest extends Request {
	private List<String> eips;
    private String billing_mode;
    private String zone;
    
	public List<String> getEips() {
		return eips;
	}
	public void setEips(List<String> eips) {
		this.eips = eips;
	}

	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getBilling_mode() {
		return billing_mode;
	}

	public void setBilling_mode(String billing_mode) {
		this.billing_mode = billing_mode;
	}
}
