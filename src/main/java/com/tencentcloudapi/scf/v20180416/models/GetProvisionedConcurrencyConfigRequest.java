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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetProvisionedConcurrencyConfigRequest extends AbstractModel {

    /**
    * 需要获取预置并发详情的函数名称。
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数所在的命名空间，默认为default。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数版本号，不传则返回函数所有版本的预置并发信息。
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get 需要获取预置并发详情的函数名称。 
     * @return FunctionName 需要获取预置并发详情的函数名称。
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 需要获取预置并发详情的函数名称。
     * @param FunctionName 需要获取预置并发详情的函数名称。
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数所在的命名空间，默认为default。 
     * @return Namespace 函数所在的命名空间，默认为default。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所在的命名空间，默认为default。
     * @param Namespace 函数所在的命名空间，默认为default。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数版本号，不传则返回函数所有版本的预置并发信息。 
     * @return Qualifier 函数版本号，不传则返回函数所有版本的预置并发信息。
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本号，不传则返回函数所有版本的预置并发信息。
     * @param Qualifier 函数版本号，不传则返回函数所有版本的预置并发信息。
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public GetProvisionedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetProvisionedConcurrencyConfigRequest(GetProvisionedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

