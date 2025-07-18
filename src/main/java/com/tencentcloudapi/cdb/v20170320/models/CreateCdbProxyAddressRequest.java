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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCdbProxyAddressRequest extends AbstractModel {

    /**
    * 代理组 ID。可通过 [DescribeCdbProxyInfo](https://cloud.tencent.com/document/api/236/90585) 接口获取。
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 权重分配模式，
系统自动分配："system"， 自定义："custom"
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 是否开启延迟剔除，取值："true" | "false"
    */
    @SerializedName("IsKickOut")
    @Expose
    private Boolean IsKickOut;

    /**
    * 最小保留数量，最小取值：0
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * 延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 是否开启故障转移，取值："true" | "false"
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * 是否自动添加RO，取值："true" | "false"
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
    * 是否是只读，取值："true" | "false"
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 是否开启事务分离，取值："true" | "false"
    */
    @SerializedName("TransSplit")
    @Expose
    private Boolean TransSplit;

    /**
    * 读写权重分配
    */
    @SerializedName("ProxyAllocation")
    @Expose
    private ProxyAllocation [] ProxyAllocation;

    /**
    * 私有网络 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 私有子网 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 是否开启连接池。默认关闭。
注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。
    */
    @SerializedName("ConnectionPool")
    @Expose
    private Boolean ConnectionPool;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口。默认值3306。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。
    */
    @SerializedName("ConnectionPoolType")
    @Expose
    private String ConnectionPoolType;

    /**
    * 是否开启自适应负载均衡。默认关闭。
    */
    @SerializedName("AutoLoadBalance")
    @Expose
    private Boolean AutoLoadBalance;

    /**
    * 接入模式。nearBy - 就近访问，balance - 均衡分配，默认值：nearBy。
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
     * Get 代理组 ID。可通过 [DescribeCdbProxyInfo](https://cloud.tencent.com/document/api/236/90585) 接口获取。 
     * @return ProxyGroupId 代理组 ID。可通过 [DescribeCdbProxyInfo](https://cloud.tencent.com/document/api/236/90585) 接口获取。
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 代理组 ID。可通过 [DescribeCdbProxyInfo](https://cloud.tencent.com/document/api/236/90585) 接口获取。
     * @param ProxyGroupId 代理组 ID。可通过 [DescribeCdbProxyInfo](https://cloud.tencent.com/document/api/236/90585) 接口获取。
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 权重分配模式，
系统自动分配："system"， 自定义："custom" 
     * @return WeightMode 权重分配模式，
系统自动分配："system"， 自定义："custom"
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 权重分配模式，
系统自动分配："system"， 自定义："custom"
     * @param WeightMode 权重分配模式，
系统自动分配："system"， 自定义："custom"
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 是否开启延迟剔除，取值："true" | "false" 
     * @return IsKickOut 是否开启延迟剔除，取值："true" | "false"
     */
    public Boolean getIsKickOut() {
        return this.IsKickOut;
    }

    /**
     * Set 是否开启延迟剔除，取值："true" | "false"
     * @param IsKickOut 是否开启延迟剔除，取值："true" | "false"
     */
    public void setIsKickOut(Boolean IsKickOut) {
        this.IsKickOut = IsKickOut;
    }

    /**
     * Get 最小保留数量，最小取值：0 
     * @return MinCount 最小保留数量，最小取值：0
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set 最小保留数量，最小取值：0
     * @param MinCount 最小保留数量，最小取值：0
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get 延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。 
     * @return MaxDelay 延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。
     * @param MaxDelay 延迟剔除阈值，最小取值：1，范围：1 - 10000，整数。
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 是否开启故障转移，取值："true" | "false" 
     * @return FailOver 是否开启故障转移，取值："true" | "false"
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移，取值："true" | "false"
     * @param FailOver 是否开启故障转移，取值："true" | "false"
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否自动添加RO，取值："true" | "false" 
     * @return AutoAddRo 是否自动添加RO，取值："true" | "false"
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加RO，取值："true" | "false"
     * @param AutoAddRo 是否自动添加RO，取值："true" | "false"
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    /**
     * Get 是否是只读，取值："true" | "false" 
     * @return ReadOnly 是否是只读，取值："true" | "false"
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否是只读，取值："true" | "false"
     * @param ReadOnly 是否是只读，取值："true" | "false"
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 是否开启事务分离，取值："true" | "false" 
     * @return TransSplit 是否开启事务分离，取值："true" | "false"
     */
    public Boolean getTransSplit() {
        return this.TransSplit;
    }

    /**
     * Set 是否开启事务分离，取值："true" | "false"
     * @param TransSplit 是否开启事务分离，取值："true" | "false"
     */
    public void setTransSplit(Boolean TransSplit) {
        this.TransSplit = TransSplit;
    }

    /**
     * Get 读写权重分配 
     * @return ProxyAllocation 读写权重分配
     */
    public ProxyAllocation [] getProxyAllocation() {
        return this.ProxyAllocation;
    }

    /**
     * Set 读写权重分配
     * @param ProxyAllocation 读写权重分配
     */
    public void setProxyAllocation(ProxyAllocation [] ProxyAllocation) {
        this.ProxyAllocation = ProxyAllocation;
    }

    /**
     * Get 私有网络 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return UniqVpcId 私有网络 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param UniqVpcId 私有网络 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 私有子网 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return UniqSubnetId 私有子网 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 私有子网 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param UniqSubnetId 私有子网 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 是否开启连接池。默认关闭。
注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。 
     * @return ConnectionPool 是否开启连接池。默认关闭。
注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。
     */
    public Boolean getConnectionPool() {
        return this.ConnectionPool;
    }

    /**
     * Set 是否开启连接池。默认关闭。
注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。
     * @param ConnectionPool 是否开启连接池。默认关闭。
注意：如需使用数据库代理连接池能力，MySQL 8.0 主实例的内核小版本要大于等于 MySQL 8.0 20230630。
     */
    public void setConnectionPool(Boolean ConnectionPool) {
        this.ConnectionPool = ConnectionPool;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。 
     * @return Vip IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。
     * @param Vip IP 地址。不填则默认为所选 VPC 下支持的随机一个 IP。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口。默认值3306。 
     * @return VPort 端口。默认值3306。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 端口。默认值3306。
     * @param VPort 端口。默认值3306。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 安全组 
     * @return SecurityGroup 安全组
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组
     * @param SecurityGroup 安全组
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。 
     * @return ConnectionPoolType 连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。
     */
    public String getConnectionPoolType() {
        return this.ConnectionPoolType;
    }

    /**
     * Set 连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。
     * @param ConnectionPoolType 连接池类型。可选值 transaction（事务级别连接池），connection（会话级别连接池），ConnectionPool 为 true 时生效。默认值：connection。
     */
    public void setConnectionPoolType(String ConnectionPoolType) {
        this.ConnectionPoolType = ConnectionPoolType;
    }

    /**
     * Get 是否开启自适应负载均衡。默认关闭。 
     * @return AutoLoadBalance 是否开启自适应负载均衡。默认关闭。
     */
    public Boolean getAutoLoadBalance() {
        return this.AutoLoadBalance;
    }

    /**
     * Set 是否开启自适应负载均衡。默认关闭。
     * @param AutoLoadBalance 是否开启自适应负载均衡。默认关闭。
     */
    public void setAutoLoadBalance(Boolean AutoLoadBalance) {
        this.AutoLoadBalance = AutoLoadBalance;
    }

    /**
     * Get 接入模式。nearBy - 就近访问，balance - 均衡分配，默认值：nearBy。 
     * @return AccessMode 接入模式。nearBy - 就近访问，balance - 均衡分配，默认值：nearBy。
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 接入模式。nearBy - 就近访问，balance - 均衡分配，默认值：nearBy。
     * @param AccessMode 接入模式。nearBy - 就近访问，balance - 均衡分配，默认值：nearBy。
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    public CreateCdbProxyAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCdbProxyAddressRequest(CreateCdbProxyAddressRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.IsKickOut != null) {
            this.IsKickOut = new Boolean(source.IsKickOut);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.TransSplit != null) {
            this.TransSplit = new Boolean(source.TransSplit);
        }
        if (source.ProxyAllocation != null) {
            this.ProxyAllocation = new ProxyAllocation[source.ProxyAllocation.length];
            for (int i = 0; i < source.ProxyAllocation.length; i++) {
                this.ProxyAllocation[i] = new ProxyAllocation(source.ProxyAllocation[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.ConnectionPool != null) {
            this.ConnectionPool = new Boolean(source.ConnectionPool);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.ConnectionPoolType != null) {
            this.ConnectionPoolType = new String(source.ConnectionPoolType);
        }
        if (source.AutoLoadBalance != null) {
            this.AutoLoadBalance = new Boolean(source.AutoLoadBalance);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamSimple(map, prefix + "IsKickOut", this.IsKickOut);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "TransSplit", this.TransSplit);
        this.setParamArrayObj(map, prefix + "ProxyAllocation.", this.ProxyAllocation);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "ConnectionPool", this.ConnectionPool);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ConnectionPoolType", this.ConnectionPoolType);
        this.setParamSimple(map, prefix + "AutoLoadBalance", this.AutoLoadBalance);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);

    }
}

