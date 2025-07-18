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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueInfo extends AbstractModel {

    /**
    * 字段的分词符
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * 字段类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段是否开启分析功能
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * 是否包含中文
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
     * Get 字段的分词符 
     * @return Tokenizer 字段的分词符
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set 字段的分词符
     * @param Tokenizer 字段的分词符
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get 字段类型 
     * @return Type 字段类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
     * @param Type 字段类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段是否开启分析功能 
     * @return SqlFlag 字段是否开启分析功能
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set 字段是否开启分析功能
     * @param SqlFlag 字段是否开启分析功能
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get 是否包含中文 
     * @return ContainZH 是否包含中文
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set 是否包含中文
     * @param ContainZH 是否包含中文
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);

    }
}

