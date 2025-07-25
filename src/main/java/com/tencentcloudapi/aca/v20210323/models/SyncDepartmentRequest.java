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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDepartmentRequest extends AbstractModel {

    /**
    * 请求头
    */
    @SerializedName("Header")
    @Expose
    private CommonHeader Header;

    /**
    * 同步数据
    */
    @SerializedName("Data")
    @Expose
    private SyncDepartmentData Data;

    /**
     * Get 请求头 
     * @return Header 请求头
     */
    public CommonHeader getHeader() {
        return this.Header;
    }

    /**
     * Set 请求头
     * @param Header 请求头
     */
    public void setHeader(CommonHeader Header) {
        this.Header = Header;
    }

    /**
     * Get 同步数据 
     * @return Data 同步数据
     */
    public SyncDepartmentData getData() {
        return this.Data;
    }

    /**
     * Set 同步数据
     * @param Data 同步数据
     */
    public void setData(SyncDepartmentData Data) {
        this.Data = Data;
    }

    public SyncDepartmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDepartmentRequest(SyncDepartmentRequest source) {
        if (source.Header != null) {
            this.Header = new CommonHeader(source.Header);
        }
        if (source.Data != null) {
            this.Data = new SyncDepartmentData(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Header.", this.Header);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

