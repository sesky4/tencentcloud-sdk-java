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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindDevRequest extends AbstractModel {

    /**
    * 终端用户在IoT Video上的唯一标识ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
     * Get 终端用户在IoT Video上的唯一标识ID 
     * @return AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户在IoT Video上的唯一标识ID
     * @param AccessId 终端用户在IoT Video上的唯一标识ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    public DescribeBindDevRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindDevRequest(DescribeBindDevRequest source) {
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);

    }
}

