package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudHyperNodeSet;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by zk.wang on 2017/11/29.
 */
public class DescribeHyperNodesResponse {
    private String action;
    private Integer total_count;
    private Integer ret_code;
    List<QingCloudHyperNodeSet> hyper_node_set;

    public static DescribeHyperNodesResponse fromJson(String jsonDescribeHyperNodesResponse){
        Gson gson = new Gson();
        DescribeHyperNodesResponse describeHyperNodesResponse = gson.fromJson(jsonDescribeHyperNodesResponse,DescribeHyperNodesResponse.class);
        return describeHyperNodesResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public List<QingCloudHyperNodeSet> getHyper_node_set() {
        return hyper_node_set;
    }

    public void setHyper_node_set(List<QingCloudHyperNodeSet> hyper_node_set) {
        this.hyper_node_set = hyper_node_set;
    }
}
