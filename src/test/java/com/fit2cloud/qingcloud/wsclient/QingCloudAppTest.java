package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersRequest;
import com.fit2cloud.qingcloud.wsclient.ui.model.DescribeUsersResponse;
import com.google.gson.Gson;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by zhangbohan on 15/8/19.
 */
public class QingCloudAppTest {
    private static IQingCloudAppClient iQingCloudAppClient;
    private static String appId;
    private static String secretAppKey;
    private static String accessToken;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("/opt/.qingcloud/credential.txt")));
        appId = properties.getProperty("appId");
        secretAppKey = properties.getProperty("secretAppKey");
        accessToken = properties.getProperty("accessToken");
        iQingCloudAppClient = new QingCloudAppClient(appId, secretAppKey,accessToken);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeUser(){
        DescribeUsersRequest describeUsersRequest = new DescribeUsersRequest();
        try {
            DescribeUsersResponse response = iQingCloudAppClient.describeUsers(describeUsersRequest);
            System.out.println(new Gson().toJson(response));
        } catch (QingCloudClientException e) {
            e.printStackTrace();
        } catch (QingCloudServiceException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
