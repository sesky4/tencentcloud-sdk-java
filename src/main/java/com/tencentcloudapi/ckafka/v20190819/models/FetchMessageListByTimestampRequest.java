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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchMessageListByTimestampRequest extends AbstractModel {

    /**
    * ckafka集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主题名
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 分区id
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 查询开始时间，13位时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 最大查询条数，默认20，最大20, 最小1
    */
    @SerializedName("SinglePartitionRecordNumber")
    @Expose
    private Long SinglePartitionRecordNumber;

    /**
     * Get ckafka集群实例Id 
     * @return InstanceId ckafka集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id
     * @param InstanceId ckafka集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主题名 
     * @return Topic 主题名
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set 主题名
     * @param Topic 主题名
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get 分区id 
     * @return Partition 分区id
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区id
     * @param Partition 分区id
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 查询开始时间，13位时间戳 
     * @return StartTime 查询开始时间，13位时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，13位时间戳
     * @param StartTime 查询开始时间，13位时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 最大查询条数，默认20，最大20, 最小1 
     * @return SinglePartitionRecordNumber 最大查询条数，默认20，最大20, 最小1
     */
    public Long getSinglePartitionRecordNumber() {
        return this.SinglePartitionRecordNumber;
    }

    /**
     * Set 最大查询条数，默认20，最大20, 最小1
     * @param SinglePartitionRecordNumber 最大查询条数，默认20，最大20, 最小1
     */
    public void setSinglePartitionRecordNumber(Long SinglePartitionRecordNumber) {
        this.SinglePartitionRecordNumber = SinglePartitionRecordNumber;
    }

    public FetchMessageListByTimestampRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchMessageListByTimestampRequest(FetchMessageListByTimestampRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.SinglePartitionRecordNumber != null) {
            this.SinglePartitionRecordNumber = new Long(source.SinglePartitionRecordNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SinglePartitionRecordNumber", this.SinglePartitionRecordNumber);

    }
}

