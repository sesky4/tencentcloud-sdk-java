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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfsRulesRequest extends AbstractModel {

    /**
    * 权限组 ID，可通过[DescribeCfsPGroups接口](https://cloud.tencent.com/document/api/582/38157)获取
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
     * Get 权限组 ID，可通过[DescribeCfsPGroups接口](https://cloud.tencent.com/document/api/582/38157)获取 
     * @return PGroupId 权限组 ID，可通过[DescribeCfsPGroups接口](https://cloud.tencent.com/document/api/582/38157)获取
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set 权限组 ID，可通过[DescribeCfsPGroups接口](https://cloud.tencent.com/document/api/582/38157)获取
     * @param PGroupId 权限组 ID，可通过[DescribeCfsPGroups接口](https://cloud.tencent.com/document/api/582/38157)获取
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    public DescribeCfsRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsRulesRequest(DescribeCfsRulesRequest source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);

    }
}

