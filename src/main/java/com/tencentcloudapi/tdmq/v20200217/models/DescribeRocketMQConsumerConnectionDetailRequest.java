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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQConsumerConnectionDetailRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 消费组名称
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 消费端实例ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Retry, Transaction, DeadLetter
    */
    @SerializedName("FilterType")
    @Expose
    private String [] FilterType;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceId 命名空间名称
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceId 命名空间名称
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 消费组名称 
     * @return GroupId 消费组名称
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 消费组名称
     * @param GroupId 消费组名称
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 消费端实例ID 
     * @return ClientId 消费端实例ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 消费端实例ID
     * @param ClientId 消费端实例ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Retry, Transaction, DeadLetter 
     * @return FilterType 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Retry, Transaction, DeadLetter
     */
    public String [] getFilterType() {
        return this.FilterType;
    }

    /**
     * Set 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Retry, Transaction, DeadLetter
     * @param FilterType 按主题类型过滤查询结果，可选择Normal, GlobalOrder, PartitionedOrder, Retry, Transaction, DeadLetter
     */
    public void setFilterType(String [] FilterType) {
        this.FilterType = FilterType;
    }

    public DescribeRocketMQConsumerConnectionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQConsumerConnectionDetailRequest(DescribeRocketMQConsumerConnectionDetailRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FilterType != null) {
            this.FilterType = new String[source.FilterType.length];
            for (int i = 0; i < source.FilterType.length; i++) {
                this.FilterType[i] = new String(source.FilterType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "FilterType.", this.FilterType);

    }
}

