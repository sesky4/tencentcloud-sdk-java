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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanIgnoreVulListRequest extends AbstractModel {

    /**
    * 需要返回的数量，默认为10，最大值为100
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
    * 过滤条件。
<li>CVEID- string - 是否必填：否 - CVE编号</li>
<li>VulName- string - 是否必填：否 - 漏洞名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * 排序方式:DESC,ACS
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段 UpdateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 需要返回的数量，默认为10，最大值为100 
     * @return Limit 需要返回的数量，默认为10，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，默认为10，最大值为100
     * @param Limit 需要返回的数量，默认为10，最大值为100
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

    /**
     * Get 过滤条件。
<li>CVEID- string - 是否必填：否 - CVE编号</li>
<li>VulName- string - 是否必填：否 - 漏洞名称</li> 
     * @return Filters 过滤条件。
<li>CVEID- string - 是否必填：否 - CVE编号</li>
<li>VulName- string - 是否必填：否 - 漏洞名称</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>CVEID- string - 是否必填：否 - CVE编号</li>
<li>VulName- string - 是否必填：否 - 漏洞名称</li>
     * @param Filters 过滤条件。
<li>CVEID- string - 是否必填：否 - CVE编号</li>
<li>VulName- string - 是否必填：否 - 漏洞名称</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式:DESC,ACS 
     * @return Order 排序方式:DESC,ACS
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式:DESC,ACS
     * @param Order 排序方式:DESC,ACS
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 UpdateTime 
     * @return By 排序字段 UpdateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段 UpdateTime
     * @param By 排序字段 UpdateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeScanIgnoreVulListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanIgnoreVulListRequest(DescribeScanIgnoreVulListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

