package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.ui.model.annotation.As;

/**
 * @author <a href="mailto:fivesmallq@gmail.com">fivesmallq</a>
 * @version Revision: 1.0
 * @date 2017/3/7 10:21
 */
public class StartRDBsRequest extends Request{
    @As("rdbs.n")
    private String rdbs_n;
    private String zone;

    public String getRdbs_n() {
        return rdbs_n;
    }

    public void setRdbs_n(String rdbs_n) {
        this.rdbs_n = rdbs_n;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
