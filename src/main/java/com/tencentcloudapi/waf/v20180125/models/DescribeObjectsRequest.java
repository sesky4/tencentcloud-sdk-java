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

public class DescribeObjectsRequest extends AbstractModel {

    /**
    * 支持的过滤器:	ObjectId: clb实例ID	VIP: clb实例的公网IP	InstanceId: waf实例ID	Domain: 精准域名	Status: waf防护开关状态: 0关闭，1开启	ClsStatus: waf日志开关: 0关闭，1开启   
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * 排序方式，支持asc或者desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 根据哪个字段排序
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 支持的过滤器:	ObjectId: clb实例ID	VIP: clb实例的公网IP	InstanceId: waf实例ID	Domain: 精准域名	Status: waf防护开关状态: 0关闭，1开启	ClsStatus: waf日志开关: 0关闭，1开启    
     * @return Filters 支持的过滤器:	ObjectId: clb实例ID	VIP: clb实例的公网IP	InstanceId: waf实例ID	Domain: 精准域名	Status: waf防护开关状态: 0关闭，1开启	ClsStatus: waf日志开关: 0关闭，1开启   
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持的过滤器:	ObjectId: clb实例ID	VIP: clb实例的公网IP	InstanceId: waf实例ID	Domain: 精准域名	Status: waf防护开关状态: 0关闭，1开启	ClsStatus: waf日志开关: 0关闭，1开启   
     * @param Filters 支持的过滤器:	ObjectId: clb实例ID	VIP: clb实例的公网IP	InstanceId: waf实例ID	Domain: 精准域名	Status: waf防护开关状态: 0关闭，1开启	ClsStatus: waf日志开关: 0关闭，1开启   
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，支持asc或者desc 
     * @return Order 排序方式，支持asc或者desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，支持asc或者desc
     * @param Order 排序方式，支持asc或者desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 根据哪个字段排序 
     * @return By 根据哪个字段排序
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 根据哪个字段排序
     * @param By 根据哪个字段排序
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeObjectsRequest(DescribeObjectsRequest source) {
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

