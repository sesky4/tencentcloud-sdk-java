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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptConfig extends AbstractModel {

    /**
    * 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 例外规则详情。如果为null，默认使用历史配置。
    */
    @SerializedName("ExceptUserRules")
    @Expose
    private ExceptUserRule [] ExceptUserRules;

    /**
     * Get 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 例外规则详情。如果为null，默认使用历史配置。 
     * @return ExceptUserRules 例外规则详情。如果为null，默认使用历史配置。
     */
    public ExceptUserRule [] getExceptUserRules() {
        return this.ExceptUserRules;
    }

    /**
     * Set 例外规则详情。如果为null，默认使用历史配置。
     * @param ExceptUserRules 例外规则详情。如果为null，默认使用历史配置。
     */
    public void setExceptUserRules(ExceptUserRule [] ExceptUserRules) {
        this.ExceptUserRules = ExceptUserRules;
    }

    public ExceptConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptConfig(ExceptConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ExceptUserRules != null) {
            this.ExceptUserRules = new ExceptUserRule[source.ExceptUserRules.length];
            for (int i = 0; i < source.ExceptUserRules.length; i++) {
                this.ExceptUserRules[i] = new ExceptUserRule(source.ExceptUserRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ExceptUserRules.", this.ExceptUserRules);

    }
}

