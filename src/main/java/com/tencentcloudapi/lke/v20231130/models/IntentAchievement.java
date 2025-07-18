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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentAchievement extends AbstractModel {

    /**
    * 意图达成方式，qa:问答回复、doc：文档回复、workflow：工作流回复，llm：大模型回复
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 意图达成方式描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 意图达成方式，qa:问答回复、doc：文档回复、workflow：工作流回复，llm：大模型回复 
     * @return Name 意图达成方式，qa:问答回复、doc：文档回复、workflow：工作流回复，llm：大模型回复
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 意图达成方式，qa:问答回复、doc：文档回复、workflow：工作流回复，llm：大模型回复
     * @param Name 意图达成方式，qa:问答回复、doc：文档回复、workflow：工作流回复，llm：大模型回复
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 意图达成方式描述 
     * @return Desc 意图达成方式描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 意图达成方式描述
     * @param Desc 意图达成方式描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public IntentAchievement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentAchievement(IntentAchievement source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

