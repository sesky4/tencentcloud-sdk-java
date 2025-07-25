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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubnetRequest extends AbstractModel {

    /**
    * 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称，最大长度不能超过60个字节。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * IPv6 CIDR
    */
    @SerializedName("IPv6CidrBlock")
    @Expose
    private String IPv6CidrBlock;

    /**
     * Get 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。 
     * @return VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称，最大长度不能超过60个字节。 
     * @return SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称，最大长度不能超过60个字节。
     * @param SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。 
     * @return CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     * @param CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。 
     * @return Zone 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     * @param Zone 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get IPv6 CIDR 
     * @return IPv6CidrBlock IPv6 CIDR
     */
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    /**
     * Set IPv6 CIDR
     * @param IPv6CidrBlock IPv6 CIDR
     */
    public void setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
    }

    public CreateSubnetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubnetRequest(CreateSubnetRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IPv6CidrBlock != null) {
            this.IPv6CidrBlock = new String(source.IPv6CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IPv6CidrBlock", this.IPv6CidrBlock);

    }
}

