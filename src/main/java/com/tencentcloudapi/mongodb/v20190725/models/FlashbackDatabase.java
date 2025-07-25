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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlashbackDatabase extends AbstractModel {

    /**
    * 按key回档源数据所在库
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 按key回档的集群数组
    */
    @SerializedName("Collections")
    @Expose
    private FlashbackCollection [] Collections;

    /**
     * Get 按key回档源数据所在库 
     * @return DBName 按key回档源数据所在库
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 按key回档源数据所在库
     * @param DBName 按key回档源数据所在库
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 按key回档的集群数组 
     * @return Collections 按key回档的集群数组
     */
    public FlashbackCollection [] getCollections() {
        return this.Collections;
    }

    /**
     * Set 按key回档的集群数组
     * @param Collections 按key回档的集群数组
     */
    public void setCollections(FlashbackCollection [] Collections) {
        this.Collections = Collections;
    }

    public FlashbackDatabase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlashbackDatabase(FlashbackDatabase source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Collections != null) {
            this.Collections = new FlashbackCollection[source.Collections.length];
            for (int i = 0; i < source.Collections.length; i++) {
                this.Collections[i] = new FlashbackCollection(source.Collections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamArrayObj(map, prefix + "Collections.", this.Collections);

    }
}

