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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBDiagReportContentRequest extends AbstractModel {

    /**
    * 实例名
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 异步任务ID
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB，默认为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例名 
     * @return InstanceId 实例名
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名
     * @param InstanceId 实例名
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 异步任务ID 
     * @return AsyncRequestId 异步任务ID
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务ID
     * @param AsyncRequestId 异步任务ID
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB，默认为"mysql"。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB，默认为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB，默认为"mysql"。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL，"redis" - 云数据库 Redis，"mongodb" - 云数据库 MongoDB，默认为"mysql"。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeDBDiagReportContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBDiagReportContentRequest(DescribeDBDiagReportContentRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

