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
package com.tencentcloudapi.icr.v20211014.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetIndustryV1HomeMembersReqPayload extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get 用户ID 
     * @return ID 用户ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 用户ID
     * @param ID 用户ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public GetIndustryV1HomeMembersReqPayload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIndustryV1HomeMembersReqPayload(GetIndustryV1HomeMembersReqPayload source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

