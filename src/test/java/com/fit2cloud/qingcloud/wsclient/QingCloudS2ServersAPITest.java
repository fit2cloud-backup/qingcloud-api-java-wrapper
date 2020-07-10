package com.fit2cloud.qingcloud.wsclient;

import com.fit2cloud.qingcloud.wsclient.domain.model.*;
import com.fit2cloud.qingcloud.wsclient.ui.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertTrue;

public class QingCloudS2ServersAPITest {

    private static final String ZONE = "pek3b";
    private static IQingCloudWSClient qingCloudWSClient;
    private static String accessKey;
    private static String secretKey;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("/opt/.qingcloud/credential.txt")));
        accessKey = properties.getProperty("AccessKeyID");
        secretKey = properties.getProperty("SecretKey");
        qingCloudWSClient = new QingCloudWSClient(accessKey, secretKey);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeS2Servers() throws Exception {
        int limit = 100;
        int pageNumber = 1;

        List<String> status = new ArrayList<String>();
        status.add(QingCloudS2ServerStatus.PENDING);
        status.add(QingCloudS2ServerStatus.ACTIVE);
        status.add(QingCloudS2ServerStatus.POWEROFFED);
        status.add(QingCloudS2ServerStatus.SUSPENDED);

        List<String> serviceTypes = new ArrayList<String>();
        serviceTypes.add(QingCloudS2ServerServiveType.VNAS);

        DescribeS2ServersRequest describeS2ServersRequest = new DescribeS2ServersRequest();
        describeS2ServersRequest.setZone("sh1b");
        describeS2ServersRequest.setService_types(serviceTypes);
        describeS2ServersRequest.setLimit(limit);

        while (true) {
            describeS2ServersRequest.setOffset((pageNumber - 1) * limit);
            describeS2ServersRequest.setVerbose(1);
            describeS2ServersRequest.setStatus(status);
            DescribeS2ServersResponse describeS2ServersResponse = qingCloudWSClient.describeS2Servers(describeS2ServersRequest);

            int total = describeS2ServersResponse.getTotal_count();
            if (limit * pageNumber++ > total) {
                break;
            }
            System.out.println("DescribeS2ServersResponse.getRet_code()=" + describeS2ServersResponse.getRet_code() + ", getTotal_count() = " + describeS2ServersResponse.getTotal_count());

            if (describeS2ServersResponse.getRet_code() != 0) {
                String message = describeS2ServersResponse.getMessage();
                System.out.println("message=" + message);
            }
            List<QingCloudS2Server> s2_server_set = describeS2ServersResponse.getS2_server_set();
            for (QingCloudS2Server qingCloudS2Server : s2_server_set) {
                System.out.println("qingCloudS2Server :: " + qingCloudS2Server);
            }
        }
    }

    @Test
    public void testCreateS2Servers() throws Exception {
        DescribeVxnetsRequest describeVxnetsRequest = new DescribeVxnetsRequest();
        describeVxnetsRequest.setZone("sh1b");
        describeVxnetsRequest.setVxnet_type(1);
        DescribeVxnetsResponse describeVxnetsResponse = qingCloudWSClient.describeVxnets(describeVxnetsRequest);
        assertTrue(describeVxnetsResponse!=null);
        System.out.println("DescribeVxnetsResponse.getRet_code()=" + describeVxnetsResponse.getRet_code()+", getTotal_count() = "+describeVxnetsResponse.getTotal_count());

        if(describeVxnetsResponse.getRet_code() != 0) {
            String message = describeVxnetsResponse.getMessage();
            System.out.println("message="+message);
        }

        List<QingCloudVxnetDetail> nets = describeVxnetsResponse.getVxnet_set();
        List<QingCloudVxnetDetail> netsWithVpc = new ArrayList<QingCloudVxnetDetail>();
        for(QingCloudVxnetDetail net : nets) {
            System.out.println("vxnet :: "+net);
            if(net.getVpc_router_id() != null){
                netsWithVpc.add(net);
            }
        }

        CreateS2ServerRequest createS2ServerRequest = new CreateS2ServerRequest();
        createS2ServerRequest.setZone("sh1b");
        createS2ServerRequest.setS2_server_name("ld-test-q");
        createS2ServerRequest.setVxnet(netsWithVpc.get(0).getVxnet_id());
        createS2ServerRequest.setVxnet_id(netsWithVpc.get(0).getVxnet_id());
        createS2ServerRequest.setService_type(QingCloudS2ServerServiveType.VNAS);
        CreateS2ServerResponse createS2ServerResponse = qingCloudWSClient.createS2Server(createS2ServerRequest);
        assertTrue(createS2ServerResponse != null);
        System.out.println("CreateS2ServersResponse.getRet_code()=" + createS2ServerResponse.getRet_code());

        if (createS2ServerResponse.getRet_code() != 0) {
            String message = createS2ServerResponse.getMessage();
            System.out.println("message=" + message);
        }

        //查询创建的S2Server
        DescribeS2ServersRequest describeS2ServersRequest = new DescribeS2ServersRequest();
        describeS2ServersRequest.setZone("sh1b");
        describeS2ServersRequest.setSearch_word(createS2ServerRequest.getS2_server_name());
        DescribeS2ServersResponse describeS2ServersResponse = qingCloudWSClient.describeS2Servers(describeS2ServersRequest);
        List<QingCloudS2Server> s2_server_set = describeS2ServersResponse.getS2_server_set();

        String s2_server_id = createS2ServerResponse.getS2_server_id();
        System.out.println("s2_server_id : " + s2_server_id);

    }
}
