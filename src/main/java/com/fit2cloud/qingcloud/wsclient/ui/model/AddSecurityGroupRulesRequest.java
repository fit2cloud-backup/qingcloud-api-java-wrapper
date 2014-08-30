package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudSecurityGroupRule;

public class AddSecurityGroupRulesRequest extends Request {
    private String security_group;
    private List<QingCloudSecurityGroupRule> rules;
    private String zone;
    
	public String getSecurity_group() {
		return security_group;
	}
	public void setSecurity_group(String security_group) {
		this.security_group = security_group;
	}
	public List<QingCloudSecurityGroupRule> getRules() {
		return rules;
	}
	public void setRules(List<QingCloudSecurityGroupRule> rules) {
		this.rules = rules;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	public Map<String, String> toMap() {
		Map<String, String> retParametersMap = new HashMap<String, String>();

		retParametersMap.put("security_group", this.security_group);
		if(this.rules!=null && rules.size()>0){
			int index = 0;
			for(QingCloudSecurityGroupRule rule : this.rules){
				retParametersMap.put(String.format("rules.%s.protocol", index), String.valueOf(rule.getProtocol()));
				retParametersMap.put(String.format("rules.%s.priority", index), String.valueOf(rule.getPriority()));
				retParametersMap.put(String.format("rules.%s.security_group_rule_name", index), String.valueOf(rule.getSecurity_group_rule_name()));
				retParametersMap.put(String.format("rules.%s.action", index), String.valueOf(rule.getAction()));
				retParametersMap.put(String.format("rules.%s.direction", index), String.valueOf(rule.getDirection()));
				retParametersMap.put(String.format("rules.%s.val1", index), String.valueOf(rule.getVal1()));
				retParametersMap.put(String.format("rules.%s.val2", index), String.valueOf(rule.getVal2()));
				retParametersMap.put(String.format("rules.%s.val3", index), String.valueOf(rule.getVal3()));
				index++;
			}
		}
		retParametersMap.put("zone", zone);

		return retParametersMap;
	}
    
    
}
