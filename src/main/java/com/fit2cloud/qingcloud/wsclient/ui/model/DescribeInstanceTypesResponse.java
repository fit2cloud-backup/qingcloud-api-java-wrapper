package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.*;

import java.util.List;

public class DescribeInstanceTypesResponse {
    private String action;
    private Integer total_count = 0;
    private List<QingCloudInstanceType> instance_type_set;

    public static DescribeInstanceTypesResponse fromJson(String jsonDescribeInstanceTypesResponse){
        Gson gson = new Gson();
        DescribeInstanceTypesResponse describeInstanceTypesResponse = gson.fromJson(convertResponse(jsonDescribeInstanceTypesResponse), DescribeInstanceTypesResponse.class);
        return describeInstanceTypesResponse;
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

    public List<QingCloudInstanceType> getInstance_type_set() {
        return instance_type_set;
    }

    public void setInstance_type_set(List<QingCloudInstanceType> instance_type_set) {
        this.instance_type_set = instance_type_set;
    }

    /**
     * 青云API变更，通过方法转换
     * @param jsonDescribeInstanceTypesResponse 转换值
     * @return 转换后的JsonObject
     */
    private static JsonObject convertResponse (String jsonDescribeInstanceTypesResponse) {
        JsonParser parser = new JsonParser();
        JsonObject jsonObj = parser.parse(jsonDescribeInstanceTypesResponse).getAsJsonObject();
        if (jsonObj.get("total_count").isJsonArray()) {
            int totalCount = 0;
            JsonArray totalCountArray = jsonObj.getAsJsonArray("total_count");
            jsonObj.remove("total_count");
            for (JsonElement countEle: totalCountArray) {
                JsonObject asJsonObject = countEle.getAsJsonObject();
                int count = asJsonObject.get("count").getAsInt();
                totalCount += count;
            }
            jsonObj.add("total_count", new Gson().toJsonTree(totalCount));
        }
        return jsonObj;
    }
}
