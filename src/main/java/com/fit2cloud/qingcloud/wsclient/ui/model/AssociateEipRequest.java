package com.fit2cloud.qingcloud.wsclient.ui.model;


public class AssociateEipRequest extends Request {
    private String eip;
    private String instance;
    
    private String zone;

	public String getEip() {
		return eip;
	}

	public void setEip(String eip) {
		this.eip = eip;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
    
    

}
