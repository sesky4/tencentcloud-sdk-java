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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 标签数组
    */
    @SerializedName("Tags")
    @Expose
    private TagSpec [] Tags;

    /**
     * Get 项目名 
     * @return Name 项目名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名
     * @param Name 项目名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目描述 
     * @return Description 项目描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目描述
     * @param Description 项目描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 标签数组 
     * @return Tags 标签数组
     */
    public TagSpec [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
     * @param Tags 标签数组
     */
    public void setTags(TagSpec [] Tags) {
        this.Tags = Tags;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new TagSpec[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpec(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

