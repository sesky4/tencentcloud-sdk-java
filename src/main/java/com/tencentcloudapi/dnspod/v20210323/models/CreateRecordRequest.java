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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。
    */
    @SerializedName("RecordLine")
    @Expose
    private String RecordLine;

    /**
    * 记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 主机记录，如 www，如果不传，默认为 @。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
    */
    @SerializedName("RecordLineId")
    @Expose
    private String RecordLineId;

    /**
    * MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围1-65535。
    */
    @SerializedName("MX")
    @Expose
    private Long MX;

    /**
    * TTL，范围1-604800，不同套餐域名最小值不同。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 开启DNSSEC时，强制添加CNAME/URL记录
    */
    @SerializedName("DnssecConflictMode")
    @Expose
    private String DnssecConflictMode;

    /**
    * 记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。 
     * @return RecordType 记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。
     * @param RecordType 记录类型，可通过接口DescribeRecordType获得，大写英文，比如：A 。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。 
     * @return RecordLine 记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。
     */
    public String getRecordLine() {
        return this.RecordLine;
    }

    /**
     * Set 记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。
     * @param RecordLine 记录线路，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，中文，比如：默认。
     */
    public void setRecordLine(String RecordLine) {
        this.RecordLine = RecordLine;
    }

    /**
     * Get 记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。 
     * @return Value 记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。
     * @param Value 记录值，如 IP : 200.200.200.200， CNAME : cname.dnspod.com.， MX : mail.dnspod.com.。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 主机记录，如 www，如果不传，默认为 @。 
     * @return SubDomain 主机记录，如 www，如果不传，默认为 @。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 主机记录，如 www，如果不传，默认为 @。
     * @param SubDomain 主机记录，如 www，如果不传，默认为 @。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。 
     * @return RecordLineId 线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     */
    public String getRecordLineId() {
        return this.RecordLineId;
    }

    /**
     * Set 线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     * @param RecordLineId 线路的 ID，可以通过接口DescribeRecordLineList查看当前域名允许的线路信息，英文字符串，比如：10=1。参数RecordLineId优先级高于RecordLine，如果同时传递二者，优先使用RecordLineId参数。
     */
    public void setRecordLineId(String RecordLineId) {
        this.RecordLineId = RecordLineId;
    }

    /**
     * Get MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围1-65535。 
     * @return MX MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围1-65535。
     */
    public Long getMX() {
        return this.MX;
    }

    /**
     * Set MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围1-65535。
     * @param MX MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围1-65535。
     */
    public void setMX(Long MX) {
        this.MX = MX;
    }

    /**
     * Get TTL，范围1-604800，不同套餐域名最小值不同。 
     * @return TTL TTL，范围1-604800，不同套餐域名最小值不同。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set TTL，范围1-604800，不同套餐域名最小值不同。
     * @param TTL TTL，范围1-604800，不同套餐域名最小值不同。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。 
     * @return Weight 权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。
     * @param Weight 权重信息，0到100的整数。0 表示关闭，不传该参数，表示不设置权重信息。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。 
     * @return Status 记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。
     * @param Status 记录初始状态，取值范围为 ENABLE 和 DISABLE 。默认为 ENABLE ，如果传入 DISABLE，解析不会生效，也不会验证负载均衡的限制。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 开启DNSSEC时，强制添加CNAME/URL记录 
     * @return DnssecConflictMode 开启DNSSEC时，强制添加CNAME/URL记录
     */
    public String getDnssecConflictMode() {
        return this.DnssecConflictMode;
    }

    /**
     * Set 开启DNSSEC时，强制添加CNAME/URL记录
     * @param DnssecConflictMode 开启DNSSEC时，强制添加CNAME/URL记录
     */
    public void setDnssecConflictMode(String DnssecConflictMode) {
        this.DnssecConflictMode = DnssecConflictMode;
    }

    /**
     * Get 记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。 
     * @return GroupId 记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     * @param GroupId 记录分组 Id。可以通过接口 DescribeRecordGroupList 接口 GroupId 字段获取。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public CreateRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordRequest(CreateRecordRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordLine != null) {
            this.RecordLine = new String(source.RecordLine);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.RecordLineId != null) {
            this.RecordLineId = new String(source.RecordLineId);
        }
        if (source.MX != null) {
            this.MX = new Long(source.MX);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DnssecConflictMode != null) {
            this.DnssecConflictMode = new String(source.DnssecConflictMode);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordLine", this.RecordLine);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "RecordLineId", this.RecordLineId);
        this.setParamSimple(map, prefix + "MX", this.MX);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DnssecConflictMode", this.DnssecConflictMode);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

