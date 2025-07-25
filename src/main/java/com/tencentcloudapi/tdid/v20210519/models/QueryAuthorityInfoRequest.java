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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAuthorityInfoRequest extends AbstractModel {

    /**
    * DID标识
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * DID应用id
    */
    @SerializedName("DAPId")
    @Expose
    private Long DAPId;

    /**
    * 权威机构名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get DID标识 
     * @return Did DID标识
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set DID标识
     * @param Did DID标识
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get DID应用id 
     * @return DAPId DID应用id
     */
    public Long getDAPId() {
        return this.DAPId;
    }

    /**
     * Set DID应用id
     * @param DAPId DID应用id
     */
    public void setDAPId(Long DAPId) {
        this.DAPId = DAPId;
    }

    /**
     * Get 权威机构名称 
     * @return Name 权威机构名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 权威机构名称
     * @param Name 权威机构名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public QueryAuthorityInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryAuthorityInfoRequest(QueryAuthorityInfoRequest source) {
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.DAPId != null) {
            this.DAPId = new Long(source.DAPId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "DAPId", this.DAPId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

