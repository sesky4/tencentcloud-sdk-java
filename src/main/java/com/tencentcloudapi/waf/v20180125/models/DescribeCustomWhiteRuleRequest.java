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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomWhiteRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 容量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤数组,name可以是如下的值： RuleID,RuleName,Match
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * asc或者desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * exp_ts或者mod_ts
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 容量 
     * @return Limit 容量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 容量
     * @param Limit 容量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤数组,name可以是如下的值： RuleID,RuleName,Match 
     * @return Filters 过滤数组,name可以是如下的值： RuleID,RuleName,Match
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组,name可以是如下的值： RuleID,RuleName,Match
     * @param Filters 过滤数组,name可以是如下的值： RuleID,RuleName,Match
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get asc或者desc 
     * @return Order asc或者desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set asc或者desc
     * @param Order asc或者desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get exp_ts或者mod_ts 
     * @return By exp_ts或者mod_ts
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set exp_ts或者mod_ts
     * @param By exp_ts或者mod_ts
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeCustomWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomWhiteRuleRequest(DescribeCustomWhiteRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

