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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorHotKeyRequest extends AbstractModel {

    /**
    * 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询时间范围。
- 1：实时。
- 2：近30分钟。
- 3：近6小时。
- 4：近24小时。
    */
    @SerializedName("SpanType")
    @Expose
    private Long SpanType;

    /**
     * Get 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询时间范围。
- 1：实时。
- 2：近30分钟。
- 3：近6小时。
- 4：近24小时。 
     * @return SpanType 查询时间范围。
- 1：实时。
- 2：近30分钟。
- 3：近6小时。
- 4：近24小时。
     */
    public Long getSpanType() {
        return this.SpanType;
    }

    /**
     * Set 查询时间范围。
- 1：实时。
- 2：近30分钟。
- 3：近6小时。
- 4：近24小时。
     * @param SpanType 查询时间范围。
- 1：实时。
- 2：近30分钟。
- 3：近6小时。
- 4：近24小时。
     */
    public void setSpanType(Long SpanType) {
        this.SpanType = SpanType;
    }

    public DescribeInstanceMonitorHotKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceMonitorHotKeyRequest(DescribeInstanceMonitorHotKeyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpanType != null) {
            this.SpanType = new Long(source.SpanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpanType", this.SpanType);

    }
}

