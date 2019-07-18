package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

/**
 * Delete network acl response;
 *
 * @author <a href="mailto:gcx909109@sina.cn">弓成龙</a>"
 * @since 2019-07-18 20:51
 **/
public class DeleteNetworkACLsResponse {
    private String action;
    private String job_id;
    private Integer ret_code;
    private String message;

    public static DeleteNetworkACLsResponse fromJson(String deleteNetworkACLsResponseStr){
        Gson gson = new Gson();
        DeleteNetworkACLsResponse deleteNetworkACLsResponse = gson.fromJson(deleteNetworkACLsResponseStr, DeleteNetworkACLsResponse.class);
        return deleteNetworkACLsResponse;
    }
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
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
