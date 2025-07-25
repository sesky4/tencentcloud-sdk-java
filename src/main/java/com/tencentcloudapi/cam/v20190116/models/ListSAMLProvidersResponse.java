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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSAMLProvidersResponse extends AbstractModel {

    /**
    * SAML身份提供商总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * SAML身份提供商列表
    */
    @SerializedName("SAMLProviderSet")
    @Expose
    private SAMLProviderInfo [] SAMLProviderSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SAML身份提供商总数 
     * @return TotalCount SAML身份提供商总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set SAML身份提供商总数
     * @param TotalCount SAML身份提供商总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get SAML身份提供商列表 
     * @return SAMLProviderSet SAML身份提供商列表
     */
    public SAMLProviderInfo [] getSAMLProviderSet() {
        return this.SAMLProviderSet;
    }

    /**
     * Set SAML身份提供商列表
     * @param SAMLProviderSet SAML身份提供商列表
     */
    public void setSAMLProviderSet(SAMLProviderInfo [] SAMLProviderSet) {
        this.SAMLProviderSet = SAMLProviderSet;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListSAMLProvidersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSAMLProvidersResponse(ListSAMLProvidersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SAMLProviderSet != null) {
            this.SAMLProviderSet = new SAMLProviderInfo[source.SAMLProviderSet.length];
            for (int i = 0; i < source.SAMLProviderSet.length; i++) {
                this.SAMLProviderSet[i] = new SAMLProviderInfo(source.SAMLProviderSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "SAMLProviderSet.", this.SAMLProviderSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

