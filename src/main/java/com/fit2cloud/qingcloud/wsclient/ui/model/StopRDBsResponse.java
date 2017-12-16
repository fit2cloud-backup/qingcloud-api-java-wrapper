package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2017/3/7 10:21
 */
public class StopRDBsResponse {
    private String action;
    private String job_id;
    private Integer ret_code;
    private String message;
    private List<String> rdbs;

    public static StopRDBsResponse fromJson(String jsonStartRDBsResponse) {
        Gson gson = new Gson();
        StopRDBsResponse startRDBsResponse = gson.fromJson(jsonStartRDBsResponse, StopRDBsResponse.class);
        return startRDBsResponse;
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

    public List<String> getRdbs() {
        return rdbs;
    }

    public void setRdbs(List<String> rdbs) {
        this.rdbs = rdbs;
    }
}
