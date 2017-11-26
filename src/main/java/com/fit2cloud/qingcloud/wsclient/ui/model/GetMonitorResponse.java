package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.*;

import java.util.HashMap;
import java.util.Map;

public class GetMonitorResponse {

	private String action;
	private String resource_id;
	private Map<String, Object> meter_set;
	private Integer ret_code;

	
	public static GetMonitorResponse fromJson(String jsonGetMonitorResponse){
		GetMonitorResponse getMonitorResponse = new GetMonitorResponse();
		JsonObject jsonObject = new JsonParser().parse(jsonGetMonitorResponse).getAsJsonObject();
		String action = jsonObject.get("action").getAsString();
		getMonitorResponse.setAction(action);
		String resource_id = jsonObject.get("resource_id").getAsString();
		getMonitorResponse.setResource_id(resource_id);
		Integer ret_code = jsonObject.get("ret_code").getAsInt();
		getMonitorResponse.setRet_code(ret_code);
		JsonArray jsonArray = jsonObject.getAsJsonArray("meter_set");
		Map<String,Object> meter_set = new HashMap<String,Object>();
		for(JsonElement element : jsonArray){
			JsonObject jsonObj1  = element.getAsJsonObject();
			String meter = jsonObj1.get("meter_id").getAsString();
			JsonArray jsonArr = jsonObj1.getAsJsonArray("data");
			meter_set.put(meter,jsonArr.get(0).getAsJsonArray().get(1).getAsInt());
		}
		getMonitorResponse.setMeter_set(meter_set);
		return getMonitorResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getResource_id() {
		return resource_id;
	}

	public void setResource_id(String resource_id) {
		this.resource_id = resource_id;
	}

	public Map<String, Object> getMeter_set() {
		return meter_set;
	}

	public void setMeter_set(Map<String, Object> meter_set) {
		this.meter_set = meter_set;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}
}
