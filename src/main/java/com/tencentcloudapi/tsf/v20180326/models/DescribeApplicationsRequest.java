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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationsRequest extends AbstractModel {

    /**
    * 搜索字段
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 应用的微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 应用资源类型数组
    */
    @SerializedName("ApplicationResourceTypeList")
    @Expose
    private String [] ApplicationResourceTypeList;

    /**
    * IdList
    */
    @SerializedName("ApplicationIdList")
    @Expose
    private String [] ApplicationIdList;

    /**
    * 查询多种微服务类型的应用
    */
    @SerializedName("MicroserviceTypeList")
    @Expose
    private String [] MicroserviceTypeList;

    /**
     * Get 搜索字段 
     * @return SearchWord 搜索字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段
     * @param SearchWord 搜索字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型 
     * @return OrderType 排序类型
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型
     * @param OrderType 排序类型
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
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
     * Get 分页个数 
     * @return Limit 分页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数
     * @param Limit 分页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 应用类型 
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 应用的微服务类型 
     * @return MicroserviceType 应用的微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 应用的微服务类型
     * @param MicroserviceType 应用的微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 应用资源类型数组 
     * @return ApplicationResourceTypeList 应用资源类型数组
     */
    public String [] getApplicationResourceTypeList() {
        return this.ApplicationResourceTypeList;
    }

    /**
     * Set 应用资源类型数组
     * @param ApplicationResourceTypeList 应用资源类型数组
     */
    public void setApplicationResourceTypeList(String [] ApplicationResourceTypeList) {
        this.ApplicationResourceTypeList = ApplicationResourceTypeList;
    }

    /**
     * Get IdList 
     * @return ApplicationIdList IdList
     */
    public String [] getApplicationIdList() {
        return this.ApplicationIdList;
    }

    /**
     * Set IdList
     * @param ApplicationIdList IdList
     */
    public void setApplicationIdList(String [] ApplicationIdList) {
        this.ApplicationIdList = ApplicationIdList;
    }

    /**
     * Get 查询多种微服务类型的应用 
     * @return MicroserviceTypeList 查询多种微服务类型的应用
     */
    public String [] getMicroserviceTypeList() {
        return this.MicroserviceTypeList;
    }

    /**
     * Set 查询多种微服务类型的应用
     * @param MicroserviceTypeList 查询多种微服务类型的应用
     */
    public void setMicroserviceTypeList(String [] MicroserviceTypeList) {
        this.MicroserviceTypeList = MicroserviceTypeList;
    }

    public DescribeApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationsRequest(DescribeApplicationsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationResourceTypeList != null) {
            this.ApplicationResourceTypeList = new String[source.ApplicationResourceTypeList.length];
            for (int i = 0; i < source.ApplicationResourceTypeList.length; i++) {
                this.ApplicationResourceTypeList[i] = new String(source.ApplicationResourceTypeList[i]);
            }
        }
        if (source.ApplicationIdList != null) {
            this.ApplicationIdList = new String[source.ApplicationIdList.length];
            for (int i = 0; i < source.ApplicationIdList.length; i++) {
                this.ApplicationIdList[i] = new String(source.ApplicationIdList[i]);
            }
        }
        if (source.MicroserviceTypeList != null) {
            this.MicroserviceTypeList = new String[source.MicroserviceTypeList.length];
            for (int i = 0; i < source.MicroserviceTypeList.length; i++) {
                this.MicroserviceTypeList[i] = new String(source.MicroserviceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamArraySimple(map, prefix + "ApplicationResourceTypeList.", this.ApplicationResourceTypeList);
        this.setParamArraySimple(map, prefix + "ApplicationIdList.", this.ApplicationIdList);
        this.setParamArraySimple(map, prefix + "MicroserviceTypeList.", this.MicroserviceTypeList);

    }
}

