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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealtimeScanConfigRequest extends AbstractModel {

    /**
    * 应用ID。
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
     * Get 应用ID。 
     * @return BizId 应用ID。
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID。
     * @param BizId 应用ID。
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    public DescribeRealtimeScanConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealtimeScanConfigRequest(DescribeRealtimeScanConfigRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);

    }
}

