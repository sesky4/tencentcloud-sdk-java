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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DurationAnalysis extends AbstractModel {

    /**
    * 慢SQL耗时，时段
    */
    @SerializedName("TimeSegment")
    @Expose
    private String TimeSegment;

    /**
    * 对应时段区间慢SQL 条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 慢SQL耗时，时段 
     * @return TimeSegment 慢SQL耗时，时段
     */
    public String getTimeSegment() {
        return this.TimeSegment;
    }

    /**
     * Set 慢SQL耗时，时段
     * @param TimeSegment 慢SQL耗时，时段
     */
    public void setTimeSegment(String TimeSegment) {
        this.TimeSegment = TimeSegment;
    }

    /**
     * Get 对应时段区间慢SQL 条数 
     * @return Count 对应时段区间慢SQL 条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 对应时段区间慢SQL 条数
     * @param Count 对应时段区间慢SQL 条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DurationAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DurationAnalysis(DurationAnalysis source) {
        if (source.TimeSegment != null) {
            this.TimeSegment = new String(source.TimeSegment);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSegment", this.TimeSegment);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

