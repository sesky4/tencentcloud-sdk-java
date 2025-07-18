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

public class RunRerankRequest extends AbstractModel {

    /**
    * 查询内容
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 文档列表，最多20个
    */
    @SerializedName("Docs")
    @Expose
    private String [] Docs;

    /**
    * 模型名称, 默认: lke-reranker-base
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get 查询内容 
     * @return Query 查询内容
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容
     * @param Query 查询内容
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 文档列表，最多20个 
     * @return Docs 文档列表，最多20个
     */
    public String [] getDocs() {
        return this.Docs;
    }

    /**
     * Set 文档列表，最多20个
     * @param Docs 文档列表，最多20个
     */
    public void setDocs(String [] Docs) {
        this.Docs = Docs;
    }

    /**
     * Get 模型名称, 默认: lke-reranker-base 
     * @return Model 模型名称, 默认: lke-reranker-base
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称, 默认: lke-reranker-base
     * @param Model 模型名称, 默认: lke-reranker-base
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public RunRerankRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunRerankRequest(RunRerankRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Docs != null) {
            this.Docs = new String[source.Docs.length];
            for (int i = 0; i < source.Docs.length; i++) {
                this.Docs[i] = new String(source.Docs[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamArraySimple(map, prefix + "Docs.", this.Docs);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

