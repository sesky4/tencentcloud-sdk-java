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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetVendorHardwareRequest extends AbstractModel {

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页面数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 激活状态，
空：全部；
1:待激活；
2:已激活；
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页面数量 
     * @return PageSize 页面数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面数量
     * @param PageSize 页面数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 关键字 
     * @return Keyword 关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字
     * @param Keyword 关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 激活状态，
空：全部；
1:待激活；
2:已激活； 
     * @return Status 激活状态，
空：全部；
1:待激活；
2:已激活；
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 激活状态，
空：全部；
1:待激活；
2:已激活；
     * @param Status 激活状态，
空：全部；
1:待激活；
2:已激活；
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetVendorHardwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetVendorHardwareRequest(GetVendorHardwareRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

