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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrivateNatGatewayLimitsResponse extends AbstractModel {

    /**
    * 查询返回结果个数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 私网网关配额。
    */
    @SerializedName("PrivateNatGatewayLimitSet")
    @Expose
    private PrivateNatGatewayLimit [] PrivateNatGatewayLimitSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询返回结果个数。 
     * @return TotalCount 查询返回结果个数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询返回结果个数。
     * @param TotalCount 查询返回结果个数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 私网网关配额。 
     * @return PrivateNatGatewayLimitSet 私网网关配额。
     */
    public PrivateNatGatewayLimit [] getPrivateNatGatewayLimitSet() {
        return this.PrivateNatGatewayLimitSet;
    }

    /**
     * Set 私网网关配额。
     * @param PrivateNatGatewayLimitSet 私网网关配额。
     */
    public void setPrivateNatGatewayLimitSet(PrivateNatGatewayLimit [] PrivateNatGatewayLimitSet) {
        this.PrivateNatGatewayLimitSet = PrivateNatGatewayLimitSet;
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

    public DescribePrivateNatGatewayLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateNatGatewayLimitsResponse(DescribePrivateNatGatewayLimitsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PrivateNatGatewayLimitSet != null) {
            this.PrivateNatGatewayLimitSet = new PrivateNatGatewayLimit[source.PrivateNatGatewayLimitSet.length];
            for (int i = 0; i < source.PrivateNatGatewayLimitSet.length; i++) {
                this.PrivateNatGatewayLimitSet[i] = new PrivateNatGatewayLimit(source.PrivateNatGatewayLimitSet[i]);
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
        this.setParamArrayObj(map, prefix + "PrivateNatGatewayLimitSet.", this.PrivateNatGatewayLimitSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

