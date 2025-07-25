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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcEndPointServiceAttributeRequest extends AbstractModel {

    /**
    * 终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。

    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * VPC唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 终端节点服务名称。长度不超过60个字符。
    */
    @SerializedName("EndPointServiceName")
    @Expose
    private String EndPointServiceName;

    /**
    * 是否自动接受终端节点的连接请求。<ul><li>true：自动接受</li><li>false：不自动接受</li></ul>
    */
    @SerializedName("AutoAcceptFlag")
    @Expose
    private Boolean AutoAcceptFlag;

    /**
    * 后端服务的ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；
MYSQL可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；
CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；
GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取

    */
    @SerializedName("ServiceInstanceId")
    @Expose
    private String ServiceInstanceId;

    /**
    * 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
     * Get 终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
 
     * @return EndPointServiceId 终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。

     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。

     * @param EndPointServiceId 终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。

     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get VPC唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。 
     * @return VpcId VPC唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     * @param VpcId VPC唯一ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 终端节点服务名称。长度不超过60个字符。 
     * @return EndPointServiceName 终端节点服务名称。长度不超过60个字符。
     */
    public String getEndPointServiceName() {
        return this.EndPointServiceName;
    }

    /**
     * Set 终端节点服务名称。长度不超过60个字符。
     * @param EndPointServiceName 终端节点服务名称。长度不超过60个字符。
     */
    public void setEndPointServiceName(String EndPointServiceName) {
        this.EndPointServiceName = EndPointServiceName;
    }

    /**
     * Get 是否自动接受终端节点的连接请求。<ul><li>true：自动接受</li><li>false：不自动接受</li></ul> 
     * @return AutoAcceptFlag 是否自动接受终端节点的连接请求。<ul><li>true：自动接受</li><li>false：不自动接受</li></ul>
     */
    public Boolean getAutoAcceptFlag() {
        return this.AutoAcceptFlag;
    }

    /**
     * Set 是否自动接受终端节点的连接请求。<ul><li>true：自动接受</li><li>false：不自动接受</li></ul>
     * @param AutoAcceptFlag 是否自动接受终端节点的连接请求。<ul><li>true：自动接受</li><li>false：不自动接受</li></ul>
     */
    public void setAutoAcceptFlag(Boolean AutoAcceptFlag) {
        this.AutoAcceptFlag = AutoAcceptFlag;
    }

    /**
     * Get 后端服务的ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；
MYSQL可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；
CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；
GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取
 
     * @return ServiceInstanceId 后端服务的ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；
MYSQL可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；
CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；
GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取

     */
    public String getServiceInstanceId() {
        return this.ServiceInstanceId;
    }

    /**
     * Set 后端服务的ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；
MYSQL可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；
CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；
GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取

     * @param ServiceInstanceId 后端服务的ID，比如lb-p1hiksdg。CLB可通过[DescribeLoadBalancers](https://cloud.tencent.com/document/product/1108/48459)接口获取；
MYSQL可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/240/38568)接口获取；
CRS可通过[DescribeInstances](https://cloud.tencent.com/document/product/239/20018)接口获取；
GWLB可通过[DescribeGatewayLoadBalancers](https://cloud.tencent.com/document/product/1782/111683)接口获取

     */
    public void setServiceInstanceId(String ServiceInstanceId) {
        this.ServiceInstanceId = ServiceInstanceId;
    }

    /**
     * Get 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。 
     * @return IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     * @param IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    public ModifyVpcEndPointServiceAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcEndPointServiceAttributeRequest(ModifyVpcEndPointServiceAttributeRequest source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EndPointServiceName != null) {
            this.EndPointServiceName = new String(source.EndPointServiceName);
        }
        if (source.AutoAcceptFlag != null) {
            this.AutoAcceptFlag = new Boolean(source.AutoAcceptFlag);
        }
        if (source.ServiceInstanceId != null) {
            this.ServiceInstanceId = new String(source.ServiceInstanceId);
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EndPointServiceName", this.EndPointServiceName);
        this.setParamSimple(map, prefix + "AutoAcceptFlag", this.AutoAcceptFlag);
        this.setParamSimple(map, prefix + "ServiceInstanceId", this.ServiceInstanceId);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);

    }
}

