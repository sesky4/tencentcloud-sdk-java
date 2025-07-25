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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBiddingAppointListRequest extends AbstractModel {

    /**
    * 页码
默认值1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量
默认：20 取值范围[1，200]
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 状态：
1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 排序字段：
默认<空>，不排序
可选值：
AppointEndTime 预约结束时间
BiddingPrice 竞价保证金
BiddingEndTime 竞价结束时间
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序规则：
asc:升序
desc:降序
默认：asc
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 页码
默认值1 
     * @return PageNumber 页码
默认值1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
默认值1
     * @param PageNumber 页码
默认值1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量
默认：20 取值范围[1，200] 
     * @return PageSize 每页数量
默认：20 取值范围[1，200]
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
默认：20 取值范围[1，200]
     * @param PageSize 每页数量
默认：20 取值范围[1，200]
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

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
     * Get 状态：
1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约 
     * @return Status 状态：
1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：
1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     * @param Status 状态：
1 已预约，2 竞价中，3 等待出价 4 竞价失败 5 等待支付 6 等待转移，7 转移中 8 交易成功 9 预约持有者赎回 10 竞价持有者赎回 11 其他阶段持有者赎回 12 违约
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 排序字段：
默认<空>，不排序
可选值：
AppointEndTime 预约结束时间
BiddingPrice 竞价保证金
BiddingEndTime 竞价结束时间 
     * @return SortField 排序字段：
默认<空>，不排序
可选值：
AppointEndTime 预约结束时间
BiddingPrice 竞价保证金
BiddingEndTime 竞价结束时间
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段：
默认<空>，不排序
可选值：
AppointEndTime 预约结束时间
BiddingPrice 竞价保证金
BiddingEndTime 竞价结束时间
     * @param SortField 排序字段：
默认<空>，不排序
可选值：
AppointEndTime 预约结束时间
BiddingPrice 竞价保证金
BiddingEndTime 竞价结束时间
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序规则：
asc:升序
desc:降序
默认：asc 
     * @return SortOrder 排序规则：
asc:升序
desc:降序
默认：asc
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序规则：
asc:升序
desc:降序
默认：asc
     * @param SortOrder 排序规则：
asc:升序
desc:降序
默认：asc
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeBiddingAppointListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingAppointListRequest(DescribeBiddingAppointListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

