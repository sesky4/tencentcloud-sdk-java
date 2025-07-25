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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAnchorContractInfoRequest extends AbstractModel {

    /**
    * 起始时间，格式为yyyy-MM-dd
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 起始时间，格式为yyyy-MM-dd
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 起始时间，格式为yyyy-MM-dd 
     * @return BeginTime 起始时间，格式为yyyy-MM-dd
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 起始时间，格式为yyyy-MM-dd
     * @param BeginTime 起始时间，格式为yyyy-MM-dd
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 起始时间，格式为yyyy-MM-dd 
     * @return EndTime 起始时间，格式为yyyy-MM-dd
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 起始时间，格式为yyyy-MM-dd
     * @param EndTime 起始时间，格式为yyyy-MM-dd
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public QueryAnchorContractInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAnchorContractInfoRequest(QueryAnchorContractInfoRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

