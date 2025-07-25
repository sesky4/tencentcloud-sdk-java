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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchTags extends AbstractModel {

    /**
    * 标签的键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签的值
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 1表示只输入标签的键，没有输入值；0表示输入键时且输入值
    */
    @SerializedName("AllValue")
    @Expose
    private Long AllValue;

    /**
     * Get 标签的键 
     * @return TagKey 标签的键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签的键
     * @param TagKey 标签的键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签的值 
     * @return TagValue 标签的值
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签的值
     * @param TagValue 标签的值
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 1表示只输入标签的键，没有输入值；0表示输入键时且输入值 
     * @return AllValue 1表示只输入标签的键，没有输入值；0表示输入键时且输入值
     */
    public Long getAllValue() {
        return this.AllValue;
    }

    /**
     * Set 1表示只输入标签的键，没有输入值；0表示输入键时且输入值
     * @param AllValue 1表示只输入标签的键，没有输入值；0表示输入键时且输入值
     */
    public void setAllValue(Long AllValue) {
        this.AllValue = AllValue;
    }

    public SearchTags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchTags(SearchTags source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.AllValue != null) {
            this.AllValue = new Long(source.AllValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "AllValue", this.AllValue);

    }
}

