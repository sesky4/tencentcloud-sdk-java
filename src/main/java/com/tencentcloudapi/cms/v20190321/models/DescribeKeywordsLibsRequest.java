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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKeywordsLibsRequest extends AbstractModel {

    /**
    * 单页条数，最大为100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 条数偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤器(支持LibName模糊查询,CustomLibIDs词库id列表过滤)
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get 单页条数，最大为100条 
     * @return Limit 单页条数，最大为100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数，最大为100条
     * @param Limit 单页条数，最大为100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 条数偏移量 
     * @return Offset 条数偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 条数偏移量
     * @param Offset 条数偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤器(支持LibName模糊查询,CustomLibIDs词库id列表过滤) 
     * @return Filters 过滤器(支持LibName模糊查询,CustomLibIDs词库id列表过滤)
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器(支持LibName模糊查询,CustomLibIDs词库id列表过滤)
     * @param Filters 过滤器(支持LibName模糊查询,CustomLibIDs词库id列表过滤)
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeKeywordsLibsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeywordsLibsRequest(DescribeKeywordsLibsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

