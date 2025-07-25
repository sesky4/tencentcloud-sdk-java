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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserGroupsRequest extends AbstractModel {

    /**
    * 用户目录ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 分页数据
    */
    @SerializedName("Pageable")
    @Expose
    private Pageable Pageable;

    /**
    * Key可选值为condition

<li> **condition** </li>	Values = 查询条件，用户组ID或用户组名称
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 用户目录ID 
     * @return UserStoreId 用户目录ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户目录ID
     * @param UserStoreId 用户目录ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 分页数据 
     * @return Pageable 分页数据
     */
    public Pageable getPageable() {
        return this.Pageable;
    }

    /**
     * Set 分页数据
     * @param Pageable 分页数据
     */
    public void setPageable(Pageable Pageable) {
        this.Pageable = Pageable;
    }

    /**
     * Get Key可选值为condition

<li> **condition** </li>	Values = 查询条件，用户组ID或用户组名称 
     * @return Filters Key可选值为condition

<li> **condition** </li>	Values = 查询条件，用户组ID或用户组名称
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Key可选值为condition

<li> **condition** </li>	Values = 查询条件，用户组ID或用户组名称
     * @param Filters Key可选值为condition

<li> **condition** </li>	Values = 查询条件，用户组ID或用户组名称
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListUserGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserGroupsRequest(ListUserGroupsRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Pageable != null) {
            this.Pageable = new Pageable(source.Pageable);
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
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamObj(map, prefix + "Pageable.", this.Pageable);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

