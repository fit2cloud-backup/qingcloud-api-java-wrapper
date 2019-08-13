package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.Map;

public class CloneInstancesSet {
    private Map<String,String> instance_map;
    private Map<String,String> volumes_map;

    public Map<String, String> getInstance_map() {
        return instance_map;
    }

    public void setInstance_map(Map<String, String> instance_map) {
        this.instance_map = instance_map;
    }

    public Map<String, String> getVolumes_map() {
        return volumes_map;
    }

    public void setVolumes_map(Map<String, String> volumes_map) {
        this.volumes_map = volumes_map;
    }
}
