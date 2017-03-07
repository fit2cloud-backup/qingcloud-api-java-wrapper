package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.ui.model.annotation.As;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2017/3/7 10:21
 */
public class StopCachesRequest extends Request{
    @As("caches.n")
    private String caches_n;
    private String zone;

    public String getCaches_n() {
        return caches_n;
    }

    public void setCaches_n(String caches_n) {
        this.caches_n = caches_n;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
