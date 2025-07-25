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

public class FlowLogStorage extends AbstractModel {

    /**
    * 存储实例Id，当流日志存储类型为ckafka时，必填。
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 主题Id，当流日志存储类型为ckafka时，必填。
    */
    @SerializedName("StorageTopic")
    @Expose
    private String StorageTopic;

    /**
     * Get 存储实例Id，当流日志存储类型为ckafka时，必填。 
     * @return StorageId 存储实例Id，当流日志存储类型为ckafka时，必填。
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 存储实例Id，当流日志存储类型为ckafka时，必填。
     * @param StorageId 存储实例Id，当流日志存储类型为ckafka时，必填。
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 主题Id，当流日志存储类型为ckafka时，必填。 
     * @return StorageTopic 主题Id，当流日志存储类型为ckafka时，必填。
     */
    public String getStorageTopic() {
        return this.StorageTopic;
    }

    /**
     * Set 主题Id，当流日志存储类型为ckafka时，必填。
     * @param StorageTopic 主题Id，当流日志存储类型为ckafka时，必填。
     */
    public void setStorageTopic(String StorageTopic) {
        this.StorageTopic = StorageTopic;
    }

    public FlowLogStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowLogStorage(FlowLogStorage source) {
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageTopic != null) {
            this.StorageTopic = new String(source.StorageTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StorageTopic", this.StorageTopic);

    }
}

