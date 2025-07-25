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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Source extends AbstractModel {

    /**
    * 解析请求来源线路id
    */
    @SerializedName("DnsLineId")
    @Expose
    private Long DnsLineId;

    /**
    * 解析请求来源线路名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 解析请求来源线路id 
     * @return DnsLineId 解析请求来源线路id
     */
    public Long getDnsLineId() {
        return this.DnsLineId;
    }

    /**
     * Set 解析请求来源线路id
     * @param DnsLineId 解析请求来源线路id
     */
    public void setDnsLineId(Long DnsLineId) {
        this.DnsLineId = DnsLineId;
    }

    /**
     * Get 解析请求来源线路名 
     * @return Name 解析请求来源线路名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 解析请求来源线路名
     * @param Name 解析请求来源线路名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public Source() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Source(Source source) {
        if (source.DnsLineId != null) {
            this.DnsLineId = new Long(source.DnsLineId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DnsLineId", this.DnsLineId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

