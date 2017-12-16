# 青云 API Java封装库 使用指南

## 背景介绍
Fit2Cloud是一个建立在IaaS之上的云管理及DevOps协作平台，帮助开发人员、测试人员以及运维人员实现应用全生命周期的自动化管理，包括创建环境、软件安装、代码部署、自动配置、监控告警和自动伸缩等。Fit2Cloud打通了从代码到服务的转化通道，实现了云应用的持续交付和自动化运维，极大地提高了开发和运维的效率。

在集成青云的过程中，需要调用青云API进行各种操作。我们使用java语言完整封装了青云的API。我们相信云计算的使用哲学是通过API(或者基于API的第三方工具)来动态管理资源，
因此我们决定将我们封装好的青云API Java SDK开源出去。

## 第一步：引用Jar包

### 方法1：使用Maven

```xml

<!-- repository -->
<repositories>
	<repository>
		<id>fit2cloud</id>
		<url>http://repository.fit2cloud.com/content/groups/public/</url>
		<releases>
			<enabled>true</enabled>
		</releases>
		<snapshots>
			<enabled>true</enabled>
		</snapshots>
	</repository>  
</repositories>

<!-- dependency -->
<dependency>
  <groupId>com.fit2cloud.qingcloud</groupId>
  <artifactId>qingcloud-api-sdk</artifactId>
  <version>1.0</version>
</dependency>
```

### 方法2：直接下载Jar包

下载地址是：
http://repository.fit2cloud.com/content/repositories/fit2cloud/com/fit2cloud/qingcloud/qingcloud-api-sdk/1.0/qingcloud-api-sdk-1.0-jar-with-dependencies.jar

## 第二步：调用青云API

```java
 		String ACCESS_KEY_ID = "您的青云API Access key";
    	String ACCESS_KEY_SECRET = "您的青云API Secret key";
        IQingCloudWSClient client = new QingCloudWSClient(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        
        CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
		
		String keypair_name = "您的SSH密钥名称";
		String mode = "system";
		String encrypt_method = "ssh-rsa";
		
		createKeyPairRequest.setKeypair_name(keypair_name);
		createKeyPairRequest.setMode(mode);
		createKeyPairRequest.setEncrypt_method(encrypt_method);
		createKeyPairRequest.setZone(QingCloudZone.PEK2);
		
		CreateKeyPairResponse createKeyPairResponse = client.createKeyPair(createKeyPairRequest);
		String keypair_id = createKeyPairResponse.getKeypair_id();
```

## 以下是API列表:
API参数说明: https://docs.qingcloud.com/api/index.html

```

#区域 APIs
describeZones

#映像 APIs
describeImages
captureInstance
deleteImages
modifyImageAttributes
grantImageToUsers
revokeImageFromUsers

#主机 APIs
describeInstances
runInstances
terminateInstances
startInstances
restartInstances
stopInstances
resizeInstances
resetInstances
modifyInstanceAttributes
uploadUserDataAttachment

#硬盘 APIs
describeVolumes
createVolumes
deleteVolumes
attachVolumes
detachVolumes
resizeVolumes
modifyVolumeAttributes

#SSH密钥 APIs
describeKeyPairs
createKeyPair
deleteKeyPairs
attachKeyPairs
detachKeyPairs
modifyKeyPairAttributes

#防火墙 APIs
describeSecurityGroups
createSecurityGroup
modifySecurityGroupAttributes
applySecurityGroup
deleteSecurityGroups
describeSecurityGroupRules
addSecurityGroupRules
deleteSecurityGroupRules
modifySecurityGroupRuleAttributes

#网络 APIs
describeVxnets
createVxnets
deleteVxnets
joinVxnet
leaveVxnet
modifyVxnetAttributes
describeVxnetInstances

#路由器 APIs
createRouters
updateRouters
deleteRouters
joinRouter
leaveRouter
powerOffRouters
powerOnRouters
describeRouters
describeRouterVxnets
modifyRouterAttributes
describeRouterStatics
addRouterStatics
deleteRouterStatics

#公网IP APIs
associateEip
dissociateEips
allocateEips
releaseEips
describeEips
modifyEipAttributes
changeEipsBandwidth

#负载均衡器 APIs
describeLoadBalancers
createLoadBalancer
deleteLoadBalancers
associateEipsToLoadBalancer
dissociateEipsFromLoadBalancer
updateLoadBalancers
resizeLoadBalancers
stopLoadBalancers
startLoadBalancers
modifyLoadBalancerAttributes
describeLoadBalancerListeners
addLoadBalancerListeners
deleteLoadBalancerListeners
modifyLoadBalancerListenerAttributes
addLoadBalancerBackends
deleteLoadBalancerBackends
modifyLoadBalancerBackendAttributes
describeLoadBalancerBackends
getMonitor
getLoadBalancerMonitor

#RDB APIs
startRDBs
stopRDBs

#Mongo APIs
startMongos
stopMongos

#Cache APIs
startCaches
stopCaches

#备份 APIs
createSnapshots
deleteSnapshots
applySnapshots
describeSnapshots
modifySnapshotAttributes
captureInstanceFromSnapshot
createVolumeFromSnapshot

#操作日志 APIs
DescribeJobs

```
##青云应用API
```java

        String ACCESS_KEY_ID = "您的青云APP ID";
 		String SECRET_APP_KEY = "您的青云APP Secret key";
    	String ACCESS_TOKEN = "访问资源需要用到的access token";
        IQingCloudAppClient qingCloudAppClient = new QingCloudAppClient(ACCESS_KEY_ID, SECRET_APP_KEY);
		QingCloudAppPayload qingCloudAppPayload = iQingCloudAppClient.extractPayload(pyaload, signature);
        ACCESS_TOKEN = qingCloudAppPayload.getAccess_token();
        iQingCloudAppClient.setAccessToken(ACCESS_TOKEN);

        DescribeUsersRequest describeUsersRequest = new DescribeUsersRequest();
        DescribeUsersResponse response = qingCloudAppClient.describeUsers(describeUsersRequest);
```

```
## 以下是API列表:
API参数说明: https://api.qingcloud.com/app/

#用户信息 API
describeUsers

```
## 每个API调用都会有三类异常：

1. QingCloudClientException: 客戶端錯誤，比如参数不对
2. QingCloudServiceException: 服务器端错误，青云会返回错误代码和具体消息
3. IOException: 网络IO问题


