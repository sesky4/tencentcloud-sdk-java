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

public class MetricDataPoint extends AbstractModel {

    /**
    * 数据点键
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 数据点值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 数据点标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 数据点键 
     * @return Key 数据点键
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 数据点键
     * @param Key 数据点键
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 数据点值 
     * @return Value 数据点值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 数据点值
     * @param Value 数据点值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 数据点标签 
     * @return Tag 数据点标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 数据点标签
     * @param Tag 数据点标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public MetricDataPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDataPoint(MetricDataPoint source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

