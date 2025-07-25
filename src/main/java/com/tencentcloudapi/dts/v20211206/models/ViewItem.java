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

public class ViewItem extends AbstractModel {

    /**
    * 视图名称
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * 迁移后的视图名称
    */
    @SerializedName("NewViewName")
    @Expose
    private String NewViewName;

    /**
     * Get 视图名称 
     * @return ViewName 视图名称
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set 视图名称
     * @param ViewName 视图名称
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get 迁移后的视图名称 
     * @return NewViewName 迁移后的视图名称
     */
    public String getNewViewName() {
        return this.NewViewName;
    }

    /**
     * Set 迁移后的视图名称
     * @param NewViewName 迁移后的视图名称
     */
    public void setNewViewName(String NewViewName) {
        this.NewViewName = NewViewName;
    }

    public ViewItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewItem(ViewItem source) {
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.NewViewName != null) {
            this.NewViewName = new String(source.NewViewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "NewViewName", this.NewViewName);

    }
}

