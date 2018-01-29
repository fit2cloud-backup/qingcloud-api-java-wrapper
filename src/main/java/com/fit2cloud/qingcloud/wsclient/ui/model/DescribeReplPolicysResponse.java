package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudBotSet;
import com.fit2cloud.qingcloud.wsclient.domain.model.ReplPolicySet;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by shenkaibo on 2018/01/29.
 */
public class DescribeReplPolicysResponse {

    private String action;
    private List<ReplPolicySet> repl_policy_set;
    private Integer total_count;
    private Integer ret_code;

    public static DescribeReplPolicysResponse fromJson(String jsonDescribeReplPolicysResponse){
        Gson gson = new Gson();
        DescribeReplPolicysResponse describeReplPolicysResponse = gson.fromJson(jsonDescribeReplPolicysResponse,DescribeReplPolicysResponse.class);
        return  describeReplPolicysResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<ReplPolicySet> getRepl_policy_set() {
        return repl_policy_set;
    }

    public void setRepl_policy_set(List<ReplPolicySet> repl_policy_set) {
        this.repl_policy_set = repl_policy_set;
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
}
