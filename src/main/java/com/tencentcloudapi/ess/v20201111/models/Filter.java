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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 查询过滤条件的Key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 查询过滤条件的Value列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 查询过滤条件的Key 
     * @return Key 查询过滤条件的Key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 查询过滤条件的Key
     * @param Key 查询过滤条件的Key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 查询过滤条件的Value列表 
     * @return Values 查询过滤条件的Value列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 查询过滤条件的Value列表
     * @param Values 查询过滤条件的Value列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

