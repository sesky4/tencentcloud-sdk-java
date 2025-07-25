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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupListRequest extends AbstractModel {

    /**
    * 目标组ID数组。
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * 过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 显示的偏移起始量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 显示条数限制，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 目标组ID数组。 
     * @return TargetGroupIds 目标组ID数组。
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set 目标组ID数组。
     * @param TargetGroupIds 目标组ID数组。
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get 过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。 
     * @return Filters 过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。
     * @param Filters 过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 显示的偏移起始量。 
     * @return Offset 显示的偏移起始量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 显示的偏移起始量。
     * @param Offset 显示的偏移起始量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 显示条数限制，默认为20。 
     * @return Limit 显示条数限制，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 显示条数限制，默认为20。
     * @param Limit 显示条数限制，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTargetGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupListRequest(DescribeTargetGroupListRequest source) {
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

