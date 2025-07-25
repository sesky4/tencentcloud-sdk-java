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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateConsumerGroupRequest extends AbstractModel {

    /**
    * 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 最大重试次数，取值范围0～1000
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * 是否开启消费
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * 顺序投递：true
并发投递：false
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 备注信息，最多 128 个字符
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 标签列表
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。 
     * @return InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     * @param InstanceId 腾讯云 RocketMQ 实例 ID，从 [DescribeFusionInstanceList](https://cloud.tencent.com/document/api/1493/106745) 接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 最大重试次数，取值范围0～1000 
     * @return MaxRetryTimes 最大重试次数，取值范围0～1000
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set 最大重试次数，取值范围0～1000
     * @param MaxRetryTimes 最大重试次数，取值范围0～1000
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get 是否开启消费 
     * @return ConsumeEnable 是否开启消费
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set 是否开启消费
     * @param ConsumeEnable 是否开启消费
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get 顺序投递：true
并发投递：false 
     * @return ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set 顺序投递：true
并发投递：false
     * @param ConsumeMessageOrderly 顺序投递：true
并发投递：false
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。 
     * @return ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     * @param ConsumerGroup 消费组名称，从 [DescribeConsumerGroupList](https://cloud.tencent.com/document/api/1493/101535) 接口返回的 [ConsumeGroupItem](https://cloud.tencent.com/document/api/1493/96031#ConsumeGroupItem) 或控制台获得。
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 备注信息，最多 128 个字符 
     * @return Remark 备注信息，最多 128 个字符
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息，最多 128 个字符
     * @param Remark 备注信息，最多 128 个字符
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 标签列表 
     * @return TagList 标签列表
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签列表
     * @param TagList 标签列表
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateConsumerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConsumerGroupRequest(CreateConsumerGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

