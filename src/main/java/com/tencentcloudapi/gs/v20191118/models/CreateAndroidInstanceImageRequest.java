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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstanceImageRequest extends AbstractModel {

    /**
    * 安卓实例镜像名称
    */
    @SerializedName("AndroidInstanceImageName")
    @Expose
    private String AndroidInstanceImageName;

    /**
    * 安卓实例 ID
    */
    @SerializedName("AndroidInstanceId")
    @Expose
    private String AndroidInstanceId;

    /**
    * 安卓实例镜像描述
    */
    @SerializedName("AndroidInstanceImageDescription")
    @Expose
    private String AndroidInstanceImageDescription;

    /**
     * Get 安卓实例镜像名称 
     * @return AndroidInstanceImageName 安卓实例镜像名称
     */
    public String getAndroidInstanceImageName() {
        return this.AndroidInstanceImageName;
    }

    /**
     * Set 安卓实例镜像名称
     * @param AndroidInstanceImageName 安卓实例镜像名称
     */
    public void setAndroidInstanceImageName(String AndroidInstanceImageName) {
        this.AndroidInstanceImageName = AndroidInstanceImageName;
    }

    /**
     * Get 安卓实例 ID 
     * @return AndroidInstanceId 安卓实例 ID
     */
    public String getAndroidInstanceId() {
        return this.AndroidInstanceId;
    }

    /**
     * Set 安卓实例 ID
     * @param AndroidInstanceId 安卓实例 ID
     */
    public void setAndroidInstanceId(String AndroidInstanceId) {
        this.AndroidInstanceId = AndroidInstanceId;
    }

    /**
     * Get 安卓实例镜像描述 
     * @return AndroidInstanceImageDescription 安卓实例镜像描述
     */
    public String getAndroidInstanceImageDescription() {
        return this.AndroidInstanceImageDescription;
    }

    /**
     * Set 安卓实例镜像描述
     * @param AndroidInstanceImageDescription 安卓实例镜像描述
     */
    public void setAndroidInstanceImageDescription(String AndroidInstanceImageDescription) {
        this.AndroidInstanceImageDescription = AndroidInstanceImageDescription;
    }

    public CreateAndroidInstanceImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceImageRequest(CreateAndroidInstanceImageRequest source) {
        if (source.AndroidInstanceImageName != null) {
            this.AndroidInstanceImageName = new String(source.AndroidInstanceImageName);
        }
        if (source.AndroidInstanceId != null) {
            this.AndroidInstanceId = new String(source.AndroidInstanceId);
        }
        if (source.AndroidInstanceImageDescription != null) {
            this.AndroidInstanceImageDescription = new String(source.AndroidInstanceImageDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceImageName", this.AndroidInstanceImageName);
        this.setParamSimple(map, prefix + "AndroidInstanceId", this.AndroidInstanceId);
        this.setParamSimple(map, prefix + "AndroidInstanceImageDescription", this.AndroidInstanceImageDescription);

    }
}

