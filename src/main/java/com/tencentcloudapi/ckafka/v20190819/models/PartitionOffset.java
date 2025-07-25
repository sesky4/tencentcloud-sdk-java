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

public class PartitionOffset extends AbstractModel {

    /**
    * 分区
    */
    @SerializedName("Partition")
    @Expose
    private String Partition;

    /**
    * 位点偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 分区 
     * @return Partition 分区
     */
    public String getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区
     * @param Partition 分区
     */
    public void setPartition(String Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 位点偏移量 
     * @return Offset 位点偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 位点偏移量
     * @param Offset 位点偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public PartitionOffset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionOffset(PartitionOffset source) {
        if (source.Partition != null) {
            this.Partition = new String(source.Partition);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

