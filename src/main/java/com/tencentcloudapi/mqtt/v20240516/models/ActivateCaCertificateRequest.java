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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivateCaCertificateRequest extends AbstractModel {

    /**
    * 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CA证书的SN序列号，可以从 [DescribeCaCertificates](https://cloud.tencent.com/document/api/1778/116206)接口、控制台、证书文件中获得。
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
     * Get 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。 
     * @return InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     * @param InstanceId 腾讯云MQTT实例ID，从 [DescribeInstanceList](https://cloud.tencent.com/document/api/1778/111029)接口或控制台获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CA证书的SN序列号，可以从 [DescribeCaCertificates](https://cloud.tencent.com/document/api/1778/116206)接口、控制台、证书文件中获得。 
     * @return CaSn CA证书的SN序列号，可以从 [DescribeCaCertificates](https://cloud.tencent.com/document/api/1778/116206)接口、控制台、证书文件中获得。
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set CA证书的SN序列号，可以从 [DescribeCaCertificates](https://cloud.tencent.com/document/api/1778/116206)接口、控制台、证书文件中获得。
     * @param CaSn CA证书的SN序列号，可以从 [DescribeCaCertificates](https://cloud.tencent.com/document/api/1778/116206)接口、控制台、证书文件中获得。
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    public ActivateCaCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivateCaCertificateRequest(ActivateCaCertificateRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);

    }
}

