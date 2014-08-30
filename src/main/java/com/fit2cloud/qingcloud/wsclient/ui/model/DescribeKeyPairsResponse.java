package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudKeyPair;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.util.ArrayList;

public class DescribeKeyPairsResponse {
	
	private String action;
	private List<QingCloudKeyPair> keypair_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeKeyPairsResponse fromJson(String jsonDescribeKeyPairsResponse){
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(DescribeKeyPairsResponse.class, new DescribeKeyPairsResponseDeserializer());
		Gson gson = new Gson();
		DescribeKeyPairsResponse describeKeyPairsResponse = gson.fromJson(jsonDescribeKeyPairsResponse, DescribeKeyPairsResponse.class);
		return describeKeyPairsResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudKeyPair> getKeypair_set() {
		return keypair_set;
	}

	public void setKeypair_set(List<QingCloudKeyPair> keypair_set) {
		this.keypair_set = keypair_set;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}



class DescribeKeyPairsResponseDeserializer implements JsonDeserializer<DescribeKeyPairsResponse> {

  //@Override
  public DescribeKeyPairsResponse deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
      throws JsonParseException {
    final JsonObject jsonObject = json.getAsJsonObject();
	
    final JsonElement jsonAction = jsonObject.get("action");
    final String action = jsonAction.getAsString();
    
    final JsonElement jsonTotalCount = jsonObject.get("total_count");
    final Integer total_count = Integer.valueOf(jsonTotalCount.getAsInt());
    
    final JsonElement jsonRetCode = jsonObject.get("ret_code");
    final Integer ret_code = Integer.valueOf(jsonRetCode.getAsInt());

    final JsonElement jsonMessage = jsonObject.get("message");
    final String message = jsonMessage.getAsString();

    final JsonArray jsonKeyPairsArray = jsonObject.get("keypair_set").getAsJsonArray();
    final List<QingCloudKeyPair> keypair_set = new ArrayList<QingCloudKeyPair>();
    for (int i = 0; i < jsonKeyPairsArray.size(); i++) {
      final JsonElement jsonKeyPair = jsonKeyPairsArray.get(i);
      final JsonObject jsonKeyPairObject = jsonKeyPair.getAsJsonObject();
      QingCloudKeyPair keypair = new QingCloudKeyPair();
      
      String keypair_id = jsonKeyPairObject.get("keypair_id").getAsString();
      String keypair_name = jsonKeyPairObject.get("keypair_name").getAsString();
      String description = jsonKeyPairObject.get("description").getAsString();
      String encrypt_method = jsonKeyPairObject.get("encrypt_method").getAsString();
      String pub_key = jsonKeyPairObject.get("pub_key").getAsString();
      JsonArray jsonInstanceIdsArray  = jsonKeyPairObject.get("instance_ids").getAsJsonArray();
      List<String> instance_ids = new ArrayList<String>();
      for (int j = 0; j < jsonInstanceIdsArray.size(); j++) {
    	  final JsonElement jsonInstanceId = jsonInstanceIdsArray.get(i);
    	  instance_ids.add(jsonInstanceId.getAsString());
      }
      
      keypair.setDescription(description);
      keypair.setEncrypt_method(encrypt_method);
      keypair.setInstance_ids(instance_ids);
      keypair.setKeypair_id(keypair_id);
      keypair.setKeypair_name(keypair_name);
      keypair.setPub_key(pub_key);
      
      keypair_set.add(keypair);
    }

    final DescribeKeyPairsResponse describeKeyPairsResponse = new DescribeKeyPairsResponse();
    describeKeyPairsResponse.setAction(action);
    describeKeyPairsResponse.setKeypair_set(keypair_set);
    describeKeyPairsResponse.setMessage(message);
    describeKeyPairsResponse.setRet_code(ret_code);
    describeKeyPairsResponse.setTotal_count(total_count);
    return describeKeyPairsResponse;
  }
}
