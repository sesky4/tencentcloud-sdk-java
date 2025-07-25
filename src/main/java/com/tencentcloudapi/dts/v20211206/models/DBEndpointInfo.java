/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBEndpointInfo extends AbstractModel {

    /**
    * 实例所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
    */
    @SerializedName("AccessType")
    @Expose
    private String AccessType;

    /**
    * 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
    */
    @SerializedName("DatabaseType")
    @Expose
    private String DatabaseType;

    /**
    * 节点类型，simple表示普通节点、cluster表示集群节点；
对于mongo业务，取值为replicaset(mongodb副本集)、standalone(mongodb单节点)、cluster(mongodb集群)；
对于redis实例，simple(单节点)、cluster-cache(直连集群)、cluster-proxy(代理集群)；
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 实例具体的连接信息，如ip、port、接入方式等
    */
    @SerializedName("Info")
    @Expose
    private DBInfo [] Info;

    /**
    * 实例服务提供商，如:"aliyun","others"
    */
    @SerializedName("Supplier")
    @Expose
    private String Supplier;

    /**
    * 此参数为数组类型，可以传多个键值对结构对象。
MongoDB可定义如下的参数：
'AuthDatabase':'admin',
'AuthFlag': "1",
'AuthMechanism':"SCRAM-SHA-1",
"fetchMethod":"oplog",
"connectMode":"srv",
"EncryptedConnProtocol":"mongo_atlas_ssl"；
其中fetchMethod表示迁移方式，还可支持change_stream；EncryptedConnProtocol值为mongo_atlas_ssl表示使用atlas ssl连接方式。
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
    * 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
    */
    @SerializedName("DatabaseNetEnv")
    @Expose
    private String DatabaseNetEnv;

    /**
    * tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，Info中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，Info中需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。
    */
    @SerializedName("ConnectType")
    @Expose
    private String ConnectType;

    /**
    * 云联网网关所属账号，如果云联网网关为其他账号资源需要填写
    */
    @SerializedName("CcnOwnerUin")
    @Expose
    private String CcnOwnerUin;

    /**
     * Get 实例所在地域 
     * @return Region 实例所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所在地域
     * @param Region 实例所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路 
     * @return AccessType 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
     */
    public String getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
     * @param AccessType 实例网络接入类型，如：extranet(外网)、ipv6(公网ipv6)、cvm(云主机自建)、dcg(专线接入)、vpncloud(vpn接入的实例)、cdb(云数据库)、ccn(云联网)、intranet(自研上云)、vpc(私有网络)等，注意具体可选值依赖当前链路
     */
    public void setAccessType(String AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等 
     * @return DatabaseType 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
     */
    public String getDatabaseType() {
        return this.DatabaseType;
    }

    /**
     * Set 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
     * @param DatabaseType 实例数据库类型，如：mysql,redis,mongodb,postgresql,mariadb,percona 等
     */
    public void setDatabaseType(String DatabaseType) {
        this.DatabaseType = DatabaseType;
    }

    /**
     * Get 节点类型，simple表示普通节点、cluster表示集群节点；
对于mongo业务，取值为replicaset(mongodb副本集)、standalone(mongodb单节点)、cluster(mongodb集群)；
对于redis实例，simple(单节点)、cluster-cache(直连集群)、cluster-proxy(代理集群)； 
     * @return NodeType 节点类型，simple表示普通节点、cluster表示集群节点；
对于mongo业务，取值为replicaset(mongodb副本集)、standalone(mongodb单节点)、cluster(mongodb集群)；
对于redis实例，simple(单节点)、cluster-cache(直连集群)、cluster-proxy(代理集群)；
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型，simple表示普通节点、cluster表示集群节点；
对于mongo业务，取值为replicaset(mongodb副本集)、standalone(mongodb单节点)、cluster(mongodb集群)；
对于redis实例，simple(单节点)、cluster-cache(直连集群)、cluster-proxy(代理集群)；
     * @param NodeType 节点类型，simple表示普通节点、cluster表示集群节点；
对于mongo业务，取值为replicaset(mongodb副本集)、standalone(mongodb单节点)、cluster(mongodb集群)；
对于redis实例，simple(单节点)、cluster-cache(直连集群)、cluster-proxy(代理集群)；
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 实例具体的连接信息，如ip、port、接入方式等 
     * @return Info 实例具体的连接信息，如ip、port、接入方式等
     */
    public DBInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set 实例具体的连接信息，如ip、port、接入方式等
     * @param Info 实例具体的连接信息，如ip、port、接入方式等
     */
    public void setInfo(DBInfo [] Info) {
        this.Info = Info;
    }

    /**
     * Get 实例服务提供商，如:"aliyun","others" 
     * @return Supplier 实例服务提供商，如:"aliyun","others"
     */
    public String getSupplier() {
        return this.Supplier;
    }

    /**
     * Set 实例服务提供商，如:"aliyun","others"
     * @param Supplier 实例服务提供商，如:"aliyun","others"
     */
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    /**
     * Get 此参数为数组类型，可以传多个键值对结构对象。
MongoDB可定义如下的参数：
'AuthDatabase':'admin',
'AuthFlag': "1",
'AuthMechanism':"SCRAM-SHA-1",
"fetchMethod":"oplog",
"connectMode":"srv",
"EncryptedConnProtocol":"mongo_atlas_ssl"；
其中fetchMethod表示迁移方式，还可支持change_stream；EncryptedConnProtocol值为mongo_atlas_ssl表示使用atlas ssl连接方式。 
     * @return ExtraAttr 此参数为数组类型，可以传多个键值对结构对象。
MongoDB可定义如下的参数：
'AuthDatabase':'admin',
'AuthFlag': "1",
'AuthMechanism':"SCRAM-SHA-1",
"fetchMethod":"oplog",
"connectMode":"srv",
"EncryptedConnProtocol":"mongo_atlas_ssl"；
其中fetchMethod表示迁移方式，还可支持change_stream；EncryptedConnProtocol值为mongo_atlas_ssl表示使用atlas ssl连接方式。
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set 此参数为数组类型，可以传多个键值对结构对象。
MongoDB可定义如下的参数：
'AuthDatabase':'admin',
'AuthFlag': "1",
'AuthMechanism':"SCRAM-SHA-1",
"fetchMethod":"oplog",
"connectMode":"srv",
"EncryptedConnProtocol":"mongo_atlas_ssl"；
其中fetchMethod表示迁移方式，还可支持change_stream；EncryptedConnProtocol值为mongo_atlas_ssl表示使用atlas ssl连接方式。
     * @param ExtraAttr 此参数为数组类型，可以传多个键值对结构对象。
MongoDB可定义如下的参数：
'AuthDatabase':'admin',
'AuthFlag': "1",
'AuthMechanism':"SCRAM-SHA-1",
"fetchMethod":"oplog",
"connectMode":"srv",
"EncryptedConnProtocol":"mongo_atlas_ssl"；
其中fetchMethod表示迁移方式，还可支持change_stream；EncryptedConnProtocol值为mongo_atlas_ssl表示使用atlas ssl连接方式。
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    /**
     * Get 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC； 
     * @return DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
     */
    public String getDatabaseNetEnv() {
        return this.DatabaseNetEnv;
    }

    /**
     * Set 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
     * @param DatabaseNetEnv 数据库所属网络环境，AccessType为云联网(ccn)时必填， UserIDC表示用户IDC、TencentVPC表示腾讯云VPC；
     */
    public void setDatabaseNetEnv(String DatabaseNetEnv) {
        this.DatabaseNetEnv = DatabaseNetEnv;
    }

    /**
     * Get tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，Info中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，Info中需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。 
     * @return ConnectType tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，Info中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，Info中需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。
     */
    public String getConnectType() {
        return this.ConnectType;
    }

    /**
     * Set tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，Info中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，Info中需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。
     * @param ConnectType tdsql连接方式：proxy-通过tdsql proxy主机访问各个set节点，注意只有在自研上云的网络环境下才能通过这种方式连接，Info中只需要提供proxy主机信息。set-直连set节点，如选择直连set方式，Info中需要正确填写proxy主机信息及所有set节点信息。源端是tdsqlmysql类型必填。
     */
    public void setConnectType(String ConnectType) {
        this.ConnectType = ConnectType;
    }

    /**
     * Get 云联网网关所属账号，如果云联网网关为其他账号资源需要填写 
     * @return CcnOwnerUin 云联网网关所属账号，如果云联网网关为其他账号资源需要填写
     */
    public String getCcnOwnerUin() {
        return this.CcnOwnerUin;
    }

    /**
     * Set 云联网网关所属账号，如果云联网网关为其他账号资源需要填写
     * @param CcnOwnerUin 云联网网关所属账号，如果云联网网关为其他账号资源需要填写
     */
    public void setCcnOwnerUin(String CcnOwnerUin) {
        this.CcnOwnerUin = CcnOwnerUin;
    }

    public DBEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBEndpointInfo(DBEndpointInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AccessType != null) {
            this.AccessType = new String(source.AccessType);
        }
        if (source.DatabaseType != null) {
            this.DatabaseType = new String(source.DatabaseType);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.Info != null) {
            this.Info = new DBInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new DBInfo(source.Info[i]);
            }
        }
        if (source.Supplier != null) {
            this.Supplier = new String(source.Supplier);
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
        if (source.DatabaseNetEnv != null) {
            this.DatabaseNetEnv = new String(source.DatabaseNetEnv);
        }
        if (source.ConnectType != null) {
            this.ConnectType = new String(source.ConnectType);
        }
        if (source.CcnOwnerUin != null) {
            this.CcnOwnerUin = new String(source.CcnOwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "DatabaseType", this.DatabaseType);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "Supplier", this.Supplier);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);
        this.setParamSimple(map, prefix + "DatabaseNetEnv", this.DatabaseNetEnv);
        this.setParamSimple(map, prefix + "ConnectType", this.ConnectType);
        this.setParamSimple(map, prefix + "CcnOwnerUin", this.CcnOwnerUin);

    }
}

