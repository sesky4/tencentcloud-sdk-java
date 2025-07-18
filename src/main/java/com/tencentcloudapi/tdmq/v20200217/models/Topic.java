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

public class Topic extends AbstractModel {

    /**
    * 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastConfirmedEntry")
    @Expose
    private String LastConfirmedEntry;

    /**
    * 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastLedgerCreatedTimestamp")
    @Expose
    private String LastLedgerCreatedTimestamp;

    /**
    * 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateIn")
    @Expose
    private String MsgRateIn;

    /**
    * 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
    * 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private String NumberOfEntries;

    /**
    * 分区数<=0：topic下无子分区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerCount")
    @Expose
    private String ProducerCount;

    /**
    * 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSize")
    @Expose
    private String TotalSize;

    /**
    * 分区topic里面的子分区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubTopicSets")
    @Expose
    private PartitionsTopic [] SubTopicSets;

    /**
    * topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * 环境（命名空间）名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 说明，128个字符以内。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 生产者上限。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerLimit")
    @Expose
    private String ProducerLimit;

    /**
    * 消费者上限。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLimit")
    @Expose
    private String ConsumerLimit;

    /**
    * 0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PulsarTopicType")
    @Expose
    private Long PulsarTopicType;

    /**
    * 未消费消息过期时间，单位：秒

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 用户自定义的租户别名，如果没有，会复用专业集群 ID

    */
    @SerializedName("Tenant")
    @Expose
    private String Tenant;

    /**
    * 是否开启异常消费者隔离
    */
    @SerializedName("IsolateConsumerEnable")
    @Expose
    private Boolean IsolateConsumerEnable;

    /**
    * 消费者 Ack 超时时间，单位：秒
    */
    @SerializedName("AckTimeOut")
    @Expose
    private Long AckTimeOut;

    /**
     * Get 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AverageMsgSize 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AverageMsgSize 最后一次间隔内发布消息的平均byte大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerCount 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerCount() {
        return this.ConsumerCount;
    }

    /**
     * Set 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerCount 消费者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerCount(String ConsumerCount) {
        this.ConsumerCount = ConsumerCount;
    }

    /**
     * Get 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastConfirmedEntry 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastConfirmedEntry() {
        return this.LastConfirmedEntry;
    }

    /**
     * Set 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastConfirmedEntry 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastConfirmedEntry(String LastConfirmedEntry) {
        this.LastConfirmedEntry = LastConfirmedEntry;
    }

    /**
     * Get 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastLedgerCreatedTimestamp 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastLedgerCreatedTimestamp() {
        return this.LastLedgerCreatedTimestamp;
    }

    /**
     * Set 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastLedgerCreatedTimestamp 最后一个ledger创建的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastLedgerCreatedTimestamp(String LastLedgerCreatedTimestamp) {
        this.LastLedgerCreatedTimestamp = LastLedgerCreatedTimestamp;
    }

    /**
     * Get 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateIn 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateIn 本地和复制的发布者每秒发布消息的速率。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateIn(String MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRateOut 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRateOut 本地和复制的消费者每秒分发消息的数量之和。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputIn 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputIn 本地和复制的发布者每秒发布消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgThroughputOut 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgThroughputOut 本地和复制的消费者每秒分发消息的byte。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumberOfEntries 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumberOfEntries 被记录下来的消息总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumberOfEntries(String NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get 分区数<=0：topic下无子分区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 分区数<=0：topic下无子分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区数<=0：topic下无子分区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 分区数<=0：topic下无子分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerCount 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerCount() {
        return this.ProducerCount;
    }

    /**
     * Set 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerCount 生产者数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerCount(String ProducerCount) {
        this.ProducerCount = ProducerCount;
    }

    /**
     * Get 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSize 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSize 以byte计算的所有消息存储总量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSize(String TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 分区topic里面的子分区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubTopicSets 分区topic里面的子分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PartitionsTopic [] getSubTopicSets() {
        return this.SubTopicSets;
    }

    /**
     * Set 分区topic里面的子分区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubTopicSets 分区topic里面的子分区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubTopicSets(PartitionsTopic [] SubTopicSets) {
        this.SubTopicSets = SubTopicSets;
    }

    /**
     * Get topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicType topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicType topic类型描述：
0：普通消息；
1：全局顺序消息；
2：局部顺序消息；
3：重试队列；
4：死信队列；
5：事务消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get 环境（命名空间）名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentId 环境（命名空间）名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentId 环境（命名空间）名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName 主题名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName 主题名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 说明，128个字符以内。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明，128个字符以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，128个字符以内。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明，128个字符以内。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近修改时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 生产者上限。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerLimit 生产者上限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerLimit() {
        return this.ProducerLimit;
    }

    /**
     * Set 生产者上限。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerLimit 生产者上限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerLimit(String ProducerLimit) {
        this.ProducerLimit = ProducerLimit;
    }

    /**
     * Get 消费者上限。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLimit 消费者上限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConsumerLimit() {
        return this.ConsumerLimit;
    }

    /**
     * Set 消费者上限。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLimit 消费者上限。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLimit(String ConsumerLimit) {
        this.ConsumerLimit = ConsumerLimit;
    }

    /**
     * Get 0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PulsarTopicType 0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPulsarTopicType() {
        return this.PulsarTopicType;
    }

    /**
     * Set 0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param PulsarTopicType 0: 非持久非分区
1: 非持久分区
2: 持久非分区
3: 持久分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPulsarTopicType(Long PulsarTopicType) {
        this.PulsarTopicType = PulsarTopicType;
    }

    /**
     * Get 未消费消息过期时间，单位：秒

注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgTTL 未消费消息过期时间，单位：秒

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 未消费消息过期时间，单位：秒

注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgTTL 未消费消息过期时间，单位：秒

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 用户自定义的租户别名，如果没有，会复用专业集群 ID
 
     * @return Tenant 用户自定义的租户别名，如果没有，会复用专业集群 ID

     */
    public String getTenant() {
        return this.Tenant;
    }

    /**
     * Set 用户自定义的租户别名，如果没有，会复用专业集群 ID

     * @param Tenant 用户自定义的租户别名，如果没有，会复用专业集群 ID

     */
    public void setTenant(String Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get 是否开启异常消费者隔离 
     * @return IsolateConsumerEnable 是否开启异常消费者隔离
     */
    public Boolean getIsolateConsumerEnable() {
        return this.IsolateConsumerEnable;
    }

    /**
     * Set 是否开启异常消费者隔离
     * @param IsolateConsumerEnable 是否开启异常消费者隔离
     */
    public void setIsolateConsumerEnable(Boolean IsolateConsumerEnable) {
        this.IsolateConsumerEnable = IsolateConsumerEnable;
    }

    /**
     * Get 消费者 Ack 超时时间，单位：秒 
     * @return AckTimeOut 消费者 Ack 超时时间，单位：秒
     */
    public Long getAckTimeOut() {
        return this.AckTimeOut;
    }

    /**
     * Set 消费者 Ack 超时时间，单位：秒
     * @param AckTimeOut 消费者 Ack 超时时间，单位：秒
     */
    public void setAckTimeOut(Long AckTimeOut) {
        this.AckTimeOut = AckTimeOut;
    }

    public Topic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Topic(Topic source) {
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new String(source.AverageMsgSize);
        }
        if (source.ConsumerCount != null) {
            this.ConsumerCount = new String(source.ConsumerCount);
        }
        if (source.LastConfirmedEntry != null) {
            this.LastConfirmedEntry = new String(source.LastConfirmedEntry);
        }
        if (source.LastLedgerCreatedTimestamp != null) {
            this.LastLedgerCreatedTimestamp = new String(source.LastLedgerCreatedTimestamp);
        }
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new String(source.MsgRateIn);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new String(source.MsgThroughputIn);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.NumberOfEntries != null) {
            this.NumberOfEntries = new String(source.NumberOfEntries);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ProducerCount != null) {
            this.ProducerCount = new String(source.ProducerCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new String(source.TotalSize);
        }
        if (source.SubTopicSets != null) {
            this.SubTopicSets = new PartitionsTopic[source.SubTopicSets.length];
            for (int i = 0; i < source.SubTopicSets.length; i++) {
                this.SubTopicSets[i] = new PartitionsTopic(source.SubTopicSets[i]);
            }
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ProducerLimit != null) {
            this.ProducerLimit = new String(source.ProducerLimit);
        }
        if (source.ConsumerLimit != null) {
            this.ConsumerLimit = new String(source.ConsumerLimit);
        }
        if (source.PulsarTopicType != null) {
            this.PulsarTopicType = new Long(source.PulsarTopicType);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Tenant != null) {
            this.Tenant = new String(source.Tenant);
        }
        if (source.IsolateConsumerEnable != null) {
            this.IsolateConsumerEnable = new Boolean(source.IsolateConsumerEnable);
        }
        if (source.AckTimeOut != null) {
            this.AckTimeOut = new Long(source.AckTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "LastConfirmedEntry", this.LastConfirmedEntry);
        this.setParamSimple(map, prefix + "LastLedgerCreatedTimestamp", this.LastLedgerCreatedTimestamp);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ProducerCount", this.ProducerCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArrayObj(map, prefix + "SubTopicSets.", this.SubTopicSets);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ProducerLimit", this.ProducerLimit);
        this.setParamSimple(map, prefix + "ConsumerLimit", this.ConsumerLimit);
        this.setParamSimple(map, prefix + "PulsarTopicType", this.PulsarTopicType);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Tenant", this.Tenant);
        this.setParamSimple(map, prefix + "IsolateConsumerEnable", this.IsolateConsumerEnable);
        this.setParamSimple(map, prefix + "AckTimeOut", this.AckTimeOut);

    }
}

