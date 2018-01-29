package com.fit2cloud.qingcloud.wsclient.domain.model;

/**
 * Created by shenkaibo on 2018/01/29.
 */
public class ReplPolicySet {
    private String repl_policy_id;
    private String description;
    private String create_time;

    public String getRepl_policy_id() {
        return repl_policy_id;
    }

    public void setRepl_policy_id(String repl_policy_id) {
        this.repl_policy_id = repl_policy_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
