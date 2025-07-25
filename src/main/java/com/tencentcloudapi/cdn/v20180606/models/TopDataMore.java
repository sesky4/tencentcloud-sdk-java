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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopDataMore extends AbstractModel {

    /**
    * 资源名称，根据查询条件不同分为以下几类：
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * 排序结果详情
    */
    @SerializedName("DetailData")
    @Expose
    private TopDetailDataMore [] DetailData;

    /**
     * Get 资源名称，根据查询条件不同分为以下几类： 
     * @return Resource 资源名称，根据查询条件不同分为以下几类：
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 资源名称，根据查询条件不同分为以下几类：
     * @param Resource 资源名称，根据查询条件不同分为以下几类：
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 排序结果详情 
     * @return DetailData 排序结果详情
     */
    public TopDetailDataMore [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set 排序结果详情
     * @param DetailData 排序结果详情
     */
    public void setDetailData(TopDetailDataMore [] DetailData) {
        this.DetailData = DetailData;
    }

    public TopDataMore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopDataMore(TopDataMore source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.DetailData != null) {
            this.DetailData = new TopDetailDataMore[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new TopDetailDataMore(source.DetailData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

