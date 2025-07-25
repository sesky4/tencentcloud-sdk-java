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

public class ModifyRecordToGroupRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 分组 ID，可通过DescribeRecordGroupList接口获取所有记录分组
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 记录 ID，多个 ID 用竖线“|”分割，可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

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
     * Get 分组 ID，可通过DescribeRecordGroupList接口获取所有记录分组 
     * @return GroupId 分组 ID，可通过DescribeRecordGroupList接口获取所有记录分组
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组 ID，可通过DescribeRecordGroupList接口获取所有记录分组
     * @param GroupId 分组 ID，可通过DescribeRecordGroupList接口获取所有记录分组
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 记录 ID，多个 ID 用竖线“|”分割，可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId 
     * @return RecordId 记录 ID，多个 ID 用竖线“|”分割，可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录 ID，多个 ID 用竖线“|”分割，可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     * @param RecordId 记录 ID，多个 ID 用竖线“|”分割，可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。可以通过接口DescribeDomainList查到所有的Domain以及DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyRecordToGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordToGroupRequest(ModifyRecordToGroupRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

