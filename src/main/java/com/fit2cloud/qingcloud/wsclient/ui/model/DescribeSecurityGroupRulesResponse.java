package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSecurityGroupRule;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class DescribeSecurityGroupRulesResponse {
	
	private String action;
	private List<QingCloudSecurityGroupRule> security_group_rule_set;
	private Integer total_count;
	private Integer ret_code;
	private String message;
	
	public static DescribeSecurityGroupRulesResponse fromJson(
			String jsonDescribeSecurityGroupRulesResponse) {
		//GsonBuilder gsonBuilder = new GsonBuilder();
		//gsonBuilder.registerTypeAdapter(DescribeKeyPairsResponse.class, new DescribeKeyPairsResponseDeserializer());
		
		Gson gson = new Gson();
		DescribeSecurityGroupRulesResponse describeSecurityGroupRulesResponse = gson
				.fromJson(jsonDescribeSecurityGroupRulesResponse,
						DescribeSecurityGroupRulesResponse.class);
		return describeSecurityGroupRulesResponse;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudSecurityGroupRule> getSecurity_group_rule_set() {
		return security_group_rule_set;
	}

	public void setSecurity_group_rule_set(
			List<QingCloudSecurityGroupRule> security_group_rule_set) {
		this.security_group_rule_set = security_group_rule_set;
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


//class DescribeSecurityGroupRulesResponseDeserializer implements JsonDeserializer<DescribeSecurityGroupRulesResponse> {
//
//	  //@Override
//	  public DescribeSecurityGroupRulesResponse deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
//	      throws JsonParseException {
//			
//	    final JsonObject jsonObject = json.getAsJsonObject();
//		
//	    final JsonElement jsonAction = jsonObject.get("action");
//	    final String action = jsonAction.getAsString();
//	    
//	    final JsonElement jsonTotalCount = jsonObject.get("total_count");
//	    final Integer total_count = Integer.valueOf(jsonTotalCount.getAsInt());
//	    
//	    final JsonElement jsonRetCode = jsonObject.get("ret_code");
//	    final Integer ret_code = Integer.valueOf(jsonRetCode.getAsInt());
//
//	    final JsonElement jsonMessage = jsonObject.get("message");
//	    final String message = jsonMessage.getAsString();
//
//	    final JsonArray jsonSecurityGroupRuleArray = jsonObject.get("security_group_rule_set").getAsJsonArray();
//	    final List<QingCloudSecurityGroupRule> security_group_rule_set = new ArrayList<QingCloudSecurityGroupRule>();
//	    
//	    for (int i = 0; i < jsonSecurityGroupRuleArray.size(); i++) {
//	      final JsonElement jsonSecurityGroupRule = jsonSecurityGroupRuleArray.get(i);
//	      final JsonObject jsonSecurityGroupObject = jsonSecurityGroupRule.getAsJsonObject();
//	      
//	      QingCloudSecurityGroupRule qingCloudSecurityGroupRule = new QingCloudSecurityGroupRule();
//	      
//	      String security_group_id = jsonSecurityGroupObject.get("security_group_id").getAsString();
//	      String security_group_rule_id = jsonSecurityGroupObject.get("security_group_rule_id").getAsString();
//	      Integer priority = jsonSecurityGroupObject.get("priority").getAsInt();
//	      String protocol = jsonSecurityGroupObject.get("protocol").getAsString();
//	      String securityGroupRuleAction = jsonSecurityGroupObject.get("action").getAsString();
//	      String val1 = jsonSecurityGroupObject.get("val1").getAsString();
//	      String val2 = jsonSecurityGroupObject.get("val2").getAsString();
//	      String val3 = jsonSecurityGroupObject.get("val3").getAsString();
//	      
//	      qingCloudSecurityGroupRule.setAction(securityGroupRuleAction);
//	      qingCloudSecurityGroupRule.setPriority(priority);
//	      qingCloudSecurityGroupRule.setProtocol(protocol);
//	      qingCloudSecurityGroupRule.setSecurity_group_id(security_group_id);
//	      qingCloudSecurityGroupRule.setSecurity_group_rule_id(security_group_rule_id);
//	      qingCloudSecurityGroupRule.setVal1(val1);
//	      qingCloudSecurityGroupRule.setVal2(val2);
//	      qingCloudSecurityGroupRule.setVal3(val3);
//	      
//	      security_group_rule_set.add(qingCloudSecurityGroupRule);
//	    }
//
//	    final DescribeSecurityGroupRulesResponse describeSecurityGroupRulesResponse = new DescribeSecurityGroupRulesResponse();
//	    describeSecurityGroupRulesResponse.setAction(action);
//	    describeSecurityGroupRulesResponse.setSecurity_group_rule_set(security_group_rule_set);
//	    describeSecurityGroupRulesResponse.setMessage(message);
//	    describeSecurityGroupRulesResponse.setRet_code(ret_code);
//	    describeSecurityGroupRulesResponse.setTotal_count(total_count);
//	    return describeSecurityGroupRulesResponse;
//	  }
//	}
