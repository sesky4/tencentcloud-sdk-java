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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShareUnitsRequest extends AbstractModel {

    /**
    * 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 偏移量。取值是limit的整数倍。默认值 : 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目。取值范围：1~50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键字。支持UnitId和Name搜索。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。 
     * @return Area 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     * @param Area 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 偏移量。取值是limit的整数倍。默认值 : 0。 
     * @return Offset 偏移量。取值是limit的整数倍。默认值 : 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。取值是limit的整数倍。默认值 : 0。
     * @param Offset 偏移量。取值是limit的整数倍。默认值 : 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目。取值范围：1~50。 
     * @return Limit 限制数目。取值范围：1~50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目。取值范围：1~50。
     * @param Limit 限制数目。取值范围：1~50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键字。支持UnitId和Name搜索。 
     * @return SearchKey 搜索关键字。支持UnitId和Name搜索。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索关键字。支持UnitId和Name搜索。
     * @param SearchKey 搜索关键字。支持UnitId和Name搜索。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeShareUnitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShareUnitsRequest(DescribeShareUnitsRequest source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

