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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePositionsRequest extends AbstractModel {

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <li><strong>rack-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机架ID</strong>】进行过滤。例如：15082。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;"></p> <li><strong> rack-name</strong></li> <p style="padding-left: 30px;">按照【<strong>机架名称</strong>】进行过滤，机架名称例如：M301-E10。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong> idc-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机房ID</strong>】进行过滤，机房ID例如：159。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>  <li><strong>idc-unit-id </strong></li> <p style="padding-left: 30px;">按照【<strong>机房管理单元ID</strong>】进行过滤，机房管理ID例如：568。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>position-status</strong></li> <p style="padding-left: 30px;">按照【<strong>机位状态</strong>】进行过滤，机位状态只包含以下四种：机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留，例如： 0。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>op-status</strong></li> <p style="padding-left: 30px;">按照【<strong>操作状态</strong>】进行过滤，操作状态只包含两种：FINISH 操作完成，PENDING 操作中，例如： PENDING。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <li><strong>rack-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机架ID</strong>】进行过滤。例如：15082。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;"></p> <li><strong> rack-name</strong></li> <p style="padding-left: 30px;">按照【<strong>机架名称</strong>】进行过滤，机架名称例如：M301-E10。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong> idc-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机房ID</strong>】进行过滤，机房ID例如：159。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>  <li><strong>idc-unit-id </strong></li> <p style="padding-left: 30px;">按照【<strong>机房管理单元ID</strong>】进行过滤，机房管理ID例如：568。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>position-status</strong></li> <p style="padding-left: 30px;">按照【<strong>机位状态</strong>】进行过滤，机位状态只包含以下四种：机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留，例如： 0。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>op-status</strong></li> <p style="padding-left: 30px;">按照【<strong>操作状态</strong>】进行过滤，操作状态只包含两种：FINISH 操作完成，PENDING 操作中，例如： PENDING。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
 
     * @return Filters <li><strong>rack-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机架ID</strong>】进行过滤。例如：15082。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;"></p> <li><strong> rack-name</strong></li> <p style="padding-left: 30px;">按照【<strong>机架名称</strong>】进行过滤，机架名称例如：M301-E10。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong> idc-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机房ID</strong>】进行过滤，机房ID例如：159。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>  <li><strong>idc-unit-id </strong></li> <p style="padding-left: 30px;">按照【<strong>机房管理单元ID</strong>】进行过滤，机房管理ID例如：568。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>position-status</strong></li> <p style="padding-left: 30px;">按照【<strong>机位状态</strong>】进行过滤，机位状态只包含以下四种：机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留，例如： 0。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>op-status</strong></li> <p style="padding-left: 30px;">按照【<strong>操作状态</strong>】进行过滤，操作状态只包含两种：FINISH 操作完成，PENDING 操作中，例如： PENDING。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>rack-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机架ID</strong>】进行过滤。例如：15082。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;"></p> <li><strong> rack-name</strong></li> <p style="padding-left: 30px;">按照【<strong>机架名称</strong>】进行过滤，机架名称例如：M301-E10。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong> idc-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机房ID</strong>】进行过滤，机房ID例如：159。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>  <li><strong>idc-unit-id </strong></li> <p style="padding-left: 30px;">按照【<strong>机房管理单元ID</strong>】进行过滤，机房管理ID例如：568。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>position-status</strong></li> <p style="padding-left: 30px;">按照【<strong>机位状态</strong>】进行过滤，机位状态只包含以下四种：机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留，例如： 0。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>op-status</strong></li> <p style="padding-left: 30px;">按照【<strong>操作状态</strong>】进行过滤，操作状态只包含两种：FINISH 操作完成，PENDING 操作中，例如： PENDING。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>

     * @param Filters <li><strong>rack-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机架ID</strong>】进行过滤。例如：15082。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;"></p> <li><strong> rack-name</strong></li> <p style="padding-left: 30px;">按照【<strong>机架名称</strong>】进行过滤，机架名称例如：M301-E10。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong> idc-id</strong></li> <p style="padding-left: 30px;">按照【<strong>机房ID</strong>】进行过滤，机房ID例如：159。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>  <li><strong>idc-unit-id </strong></li> <p style="padding-left: 30px;">按照【<strong>机房管理单元ID</strong>】进行过滤，机房管理ID例如：568。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p> <li><strong>position-status</strong></li> <p style="padding-left: 30px;">按照【<strong>机位状态</strong>】进行过滤，机位状态只包含以下四种：机位状态,0 空闲,1 已用,2 不可用,3 预占用,4 预留，例如： 0。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>op-status</strong></li> <p style="padding-left: 30px;">按照【<strong>操作状态</strong>】进行过滤，操作状态只包含两种：FINISH 操作完成，PENDING 操作中，例如： PENDING。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePositionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePositionsRequest(DescribePositionsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

