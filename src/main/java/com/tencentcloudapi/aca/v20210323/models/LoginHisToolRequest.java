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

public class LoginHisToolRequest extends AbstractModel {

    /**
    * 请求头
    */
    @SerializedName("Header")
    @Expose
    private LoginHeader Header;

    /**
    * 请求体
    */
    @SerializedName("Data")
    @Expose
    private LoginData Data;

    /**
     * Get 请求头 
     * @return Header 请求头
     */
    public LoginHeader getHeader() {
        return this.Header;
    }

    /**
     * Set 请求头
     * @param Header 请求头
     */
    public void setHeader(LoginHeader Header) {
        this.Header = Header;
    }

    /**
     * Get 请求体 
     * @return Data 请求体
     */
    public LoginData getData() {
        return this.Data;
    }

    /**
     * Set 请求体
     * @param Data 请求体
     */
    public void setData(LoginData Data) {
        this.Data = Data;
    }

    public LoginHisToolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginHisToolRequest(LoginHisToolRequest source) {
        if (source.Header != null) {
            this.Header = new LoginHeader(source.Header);
        }
        if (source.Data != null) {
            this.Data = new LoginData(source.Data);
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

