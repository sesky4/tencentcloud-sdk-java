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
package com.tencentcloudapi.cloudstudio.v20230508.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopWorkspaceRequest extends AbstractModel {

    /**
    * 工作空间 SpaceKey
    */
    @SerializedName("SpaceKey")
    @Expose
    private String SpaceKey;

    /**
     * Get 工作空间 SpaceKey 
     * @return SpaceKey 工作空间 SpaceKey
     */
    public String getSpaceKey() {
        return this.SpaceKey;
    }

    /**
     * Set 工作空间 SpaceKey
     * @param SpaceKey 工作空间 SpaceKey
     */
    public void setSpaceKey(String SpaceKey) {
        this.SpaceKey = SpaceKey;
    }

    public StopWorkspaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopWorkspaceRequest(StopWorkspaceRequest source) {
        if (source.SpaceKey != null) {
            this.SpaceKey = new String(source.SpaceKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceKey", this.SpaceKey);

    }
}

