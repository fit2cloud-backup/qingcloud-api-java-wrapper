package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.ui.model.annotation.As;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2017/3/7 10:21
 */
public class StartMongosRequest extends Request{
    @As("mongos.n")
    private String mongos_n;
    private String zone;

    public String getMongos_n() {
        return mongos_n;
    }

    public void setMongos_n(String mongos_n) {
        this.mongos_n = mongos_n;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
