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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EtlFilter extends AbstractModel {

    /**
    * 语法Rule规则保持一致
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
     * Get 语法Rule规则保持一致 
     * @return Filter 语法Rule规则保持一致
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 语法Rule规则保持一致
     * @param Filter 语法Rule规则保持一致
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public EtlFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EtlFilter(EtlFilter source) {
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Filter", this.Filter);

    }
}

