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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsetsRequest extends AbstractModel {

    /**
    * logsetName
- 按照【日志集名称】进行过滤。
- 类型：String
- 必选：否

logsetId
- 按照【日志集ID】进行过滤。
- 类型：String
- 必选：否

tagKey
- 按照【标签键】进行过滤。
- 类型：String
- 必选：否

tag:tagKey
- 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换。
- 类型：String
- 必选：否

每次请求的Filters的上限为10，Filter.Values的上限为5。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页的偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页的限制数目，默认值为20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get logsetName
- 按照【日志集名称】进行过滤。
- 类型：String
- 必选：否

logsetId
- 按照【日志集ID】进行过滤。
- 类型：String
- 必选：否

tagKey
- 按照【标签键】进行过滤。
- 类型：String
- 必选：否

tag:tagKey
- 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换。
- 类型：String
- 必选：否

每次请求的Filters的上限为10，Filter.Values的上限为5。 
     * @return Filters logsetName
- 按照【日志集名称】进行过滤。
- 类型：String
- 必选：否

logsetId
- 按照【日志集ID】进行过滤。
- 类型：String
- 必选：否

tagKey
- 按照【标签键】进行过滤。
- 类型：String
- 必选：否

tag:tagKey
- 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换。
- 类型：String
- 必选：否

每次请求的Filters的上限为10，Filter.Values的上限为5。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set logsetName
- 按照【日志集名称】进行过滤。
- 类型：String
- 必选：否

logsetId
- 按照【日志集ID】进行过滤。
- 类型：String
- 必选：否

tagKey
- 按照【标签键】进行过滤。
- 类型：String
- 必选：否

tag:tagKey
- 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换。
- 类型：String
- 必选：否

每次请求的Filters的上限为10，Filter.Values的上限为5。
     * @param Filters logsetName
- 按照【日志集名称】进行过滤。
- 类型：String
- 必选：否

logsetId
- 按照【日志集ID】进行过滤。
- 类型：String
- 必选：否

tagKey
- 按照【标签键】进行过滤。
- 类型：String
- 必选：否

tag:tagKey
- 按照【标签键值对】进行过滤。tagKey使用具体的标签键进行替换。
- 类型：String
- 必选：否

每次请求的Filters的上限为10，Filter.Values的上限为5。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页的偏移量，默认值为0 
     * @return Offset 分页的偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0
     * @param Offset 分页的偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页的限制数目，默认值为20，最大值100 
     * @return Limit 分页单页的限制数目，默认值为20，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页的限制数目，默认值为20，最大值100
     * @param Limit 分页单页的限制数目，默认值为20，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLogsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogsetsRequest(DescribeLogsetsRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

