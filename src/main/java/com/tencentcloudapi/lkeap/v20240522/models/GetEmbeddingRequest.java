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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingRequest extends AbstractModel {

    /**
    * 说明：选择生成向量的模型
备注：仅一个模型可选
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 说明：需要 embedding 的文本
备注：单条query最多2000个字符，总条数最多7条
    */
    @SerializedName("Inputs")
    @Expose
    private String [] Inputs;

    /**
     * Get 说明：选择生成向量的模型
备注：仅一个模型可选 
     * @return Model 说明：选择生成向量的模型
备注：仅一个模型可选
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 说明：选择生成向量的模型
备注：仅一个模型可选
     * @param Model 说明：选择生成向量的模型
备注：仅一个模型可选
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 说明：需要 embedding 的文本
备注：单条query最多2000个字符，总条数最多7条 
     * @return Inputs 说明：需要 embedding 的文本
备注：单条query最多2000个字符，总条数最多7条
     */
    public String [] getInputs() {
        return this.Inputs;
    }

    /**
     * Set 说明：需要 embedding 的文本
备注：单条query最多2000个字符，总条数最多7条
     * @param Inputs 说明：需要 embedding 的文本
备注：单条query最多2000个字符，总条数最多7条
     */
    public void setInputs(String [] Inputs) {
        this.Inputs = Inputs;
    }

    public GetEmbeddingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingRequest(GetEmbeddingRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Inputs != null) {
            this.Inputs = new String[source.Inputs.length];
            for (int i = 0; i < source.Inputs.length; i++) {
                this.Inputs[i] = new String(source.Inputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArraySimple(map, prefix + "Inputs.", this.Inputs);

    }
}

