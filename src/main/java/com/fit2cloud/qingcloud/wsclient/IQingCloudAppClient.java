package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersResponse;

import java.io.IOException;

/**
 * Created by zhangbohan on 15/8/19.
 */
public interface IQingCloudAppClient {
    public DescribeUsersResponse describeUsers(DescribeUsersRequest describeUsersRequest)
            throws QingCloudClientException, QingCloudServiceException, IOException;
}
