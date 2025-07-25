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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvokersRequest extends AbstractModel {

    /**
    * 执行器 ID 列表。

每次请求的上限为 100。

参数不支持同时指定 `InvokerIds ` 和 `Filters ` 。

    */
    @SerializedName("InvokerIds")
    @Expose
    private String [] InvokerIds;

    /**
    * 过滤条件：

- invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。
- command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
- invoker-type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。目前仅支持 SCHEDULE 一种。

每次请求的 `Filters` 的上限为 10，`Filter.Values` 的上限为 5。参数不支持同时指定 `InvokerIds` 和 `Filters` 。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 执行器 ID 列表。

每次请求的上限为 100。

参数不支持同时指定 `InvokerIds ` 和 `Filters ` 。
 
     * @return InvokerIds 执行器 ID 列表。

每次请求的上限为 100。

参数不支持同时指定 `InvokerIds ` 和 `Filters ` 。

     */
    public String [] getInvokerIds() {
        return this.InvokerIds;
    }

    /**
     * Set 执行器 ID 列表。

每次请求的上限为 100。

参数不支持同时指定 `InvokerIds ` 和 `Filters ` 。

     * @param InvokerIds 执行器 ID 列表。

每次请求的上限为 100。

参数不支持同时指定 `InvokerIds ` 和 `Filters ` 。

     */
    public void setInvokerIds(String [] InvokerIds) {
        this.InvokerIds = InvokerIds;
    }

    /**
     * Get 过滤条件：

- invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。
- command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
- invoker-type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。目前仅支持 SCHEDULE 一种。

每次请求的 `Filters` 的上限为 10，`Filter.Values` 的上限为 5。参数不支持同时指定 `InvokerIds` 和 `Filters` 。 
     * @return Filters 过滤条件：

- invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。
- command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
- invoker-type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。目前仅支持 SCHEDULE 一种。

每次请求的 `Filters` 的上限为 10，`Filter.Values` 的上限为 5。参数不支持同时指定 `InvokerIds` 和 `Filters` 。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：

- invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。
- command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
- invoker-type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。目前仅支持 SCHEDULE 一种。

每次请求的 `Filters` 的上限为 10，`Filter.Values` 的上限为 5。参数不支持同时指定 `InvokerIds` 和 `Filters` 。
     * @param Filters 过滤条件：

- invoker-id - String - 是否必填：否 - （过滤条件）按执行器ID过滤。
- command-id - String - 是否必填：否 - （过滤条件）按命令ID过滤。可通过 [DescribeCommands(查询命令详情)](https://cloud.tencent.com/document/api/1340/52681) 接口获取。
- invoker-type - String - 是否必填：否 - （过滤条件）按执行器类型过滤。目前仅支持 SCHEDULE 一种。

每次请求的 `Filters` 的上限为 10，`Filter.Values` 的上限为 5。参数不支持同时指定 `InvokerIds` 和 `Filters` 。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeInvokersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvokersRequest(DescribeInvokersRequest source) {
        if (source.InvokerIds != null) {
            this.InvokerIds = new String[source.InvokerIds.length];
            for (int i = 0; i < source.InvokerIds.length; i++) {
                this.InvokerIds[i] = new String(source.InvokerIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvokerIds.", this.InvokerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

