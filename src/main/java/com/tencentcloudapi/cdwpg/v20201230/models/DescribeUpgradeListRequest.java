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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeListRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页参数，偏移量，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，每页数目，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页参数，偏移量，从0开始 
     * @return Offset 分页参数，偏移量，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，偏移量，从0开始
     * @param Offset 分页参数，偏移量，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，每页数目，默认为10 
     * @return Limit 分页参数，每页数目，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页数目，默认为10
     * @param Limit 分页参数，每页数目，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUpgradeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeListRequest(DescribeUpgradeListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

