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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Qualifier extends AbstractModel {

    /**
    * 额外属性的名称。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 额外属性的值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 额外属性的名称。 
     * @return Key 额外属性的名称。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 额外属性的名称。
     * @param Key 额外属性的名称。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 额外属性的值。 
     * @return Value 额外属性的值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 额外属性的值。
     * @param Value 额外属性的值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Qualifier() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Qualifier(Qualifier source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

