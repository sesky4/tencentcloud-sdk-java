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

public class MQTTMessageItem extends AbstractModel {

    /**
    * 消息ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * 消息tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 消息key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private String Keys;

    /**
    * 客户端地址	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * 消息发送时间	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * 死信重发次数	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterResendTimes")
    @Expose
    private Long DeadLetterResendTimes;

    /**
    * 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterResendSuccessTimes")
    @Expose
    private Long DeadLetterResendSuccessTimes;

    /**
    * 子topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubTopic")
    @Expose
    private String SubTopic;

    /**
    * 消息质量等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
     * Get 消息ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgId 消息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get 消息tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 消息tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 消息key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeys() {
        return this.Keys;
    }

    /**
     * Set 消息key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 消息key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(String Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 客户端地址	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerAddr 客户端地址	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set 客户端地址	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerAddr 客户端地址	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get 消息发送时间	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProduceTime 消息发送时间	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set 消息发送时间	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProduceTime 消息发送时间	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get 死信重发次数	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterResendTimes 死信重发次数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeadLetterResendTimes() {
        return this.DeadLetterResendTimes;
    }

    /**
     * Set 死信重发次数	
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterResendTimes 死信重发次数	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterResendTimes(Long DeadLetterResendTimes) {
        this.DeadLetterResendTimes = DeadLetterResendTimes;
    }

    /**
     * Get 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterResendSuccessTimes 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeadLetterResendSuccessTimes() {
        return this.DeadLetterResendSuccessTimes;
    }

    /**
     * Set 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterResendSuccessTimes 死信重发成功次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterResendSuccessTimes(Long DeadLetterResendSuccessTimes) {
        this.DeadLetterResendSuccessTimes = DeadLetterResendSuccessTimes;
    }

    /**
     * Get 子topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubTopic 子topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubTopic() {
        return this.SubTopic;
    }

    /**
     * Set 子topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubTopic 子topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubTopic(String SubTopic) {
        this.SubTopic = SubTopic;
    }

    /**
     * Get 消息质量等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qos 消息质量等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set 消息质量等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qos 消息质量等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    public MQTTMessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTMessageItem(MQTTMessageItem source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Keys != null) {
            this.Keys = new String(source.Keys);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.DeadLetterResendTimes != null) {
            this.DeadLetterResendTimes = new Long(source.DeadLetterResendTimes);
        }
        if (source.DeadLetterResendSuccessTimes != null) {
            this.DeadLetterResendSuccessTimes = new Long(source.DeadLetterResendSuccessTimes);
        }
        if (source.SubTopic != null) {
            this.SubTopic = new String(source.SubTopic);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "DeadLetterResendTimes", this.DeadLetterResendTimes);
        this.setParamSimple(map, prefix + "DeadLetterResendSuccessTimes", this.DeadLetterResendSuccessTimes);
        this.setParamSimple(map, prefix + "SubTopic", this.SubTopic);
        this.setParamSimple(map, prefix + "Qos", this.Qos);

    }
}

