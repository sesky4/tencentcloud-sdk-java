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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsistencyOption extends AbstractModel {

    /**
    * 一致性检测类型: full(全量检测迁移对象)、noCheck(不检测)、notConfigured(未配置)
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 一致性检测类型: full(全量检测迁移对象)、noCheck(不检测)、notConfigured(未配置) 
     * @return Mode 一致性检测类型: full(全量检测迁移对象)、noCheck(不检测)、notConfigured(未配置)
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 一致性检测类型: full(全量检测迁移对象)、noCheck(不检测)、notConfigured(未配置)
     * @param Mode 一致性检测类型: full(全量检测迁移对象)、noCheck(不检测)、notConfigured(未配置)
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public ConsistencyOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsistencyOption(ConsistencyOption source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

