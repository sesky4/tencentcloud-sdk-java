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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCompliancePolicyItemAffectedAssetListResponse extends AbstractModel {

    /**
    * 返回各检测项所影响的资产的列表。
    */
    @SerializedName("AffectedAssetList")
    @Expose
    private ComplianceAffectedAsset [] AffectedAssetList;

    /**
    * 检测项影响的资产的总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回各检测项所影响的资产的列表。 
     * @return AffectedAssetList 返回各检测项所影响的资产的列表。
     */
    public ComplianceAffectedAsset [] getAffectedAssetList() {
        return this.AffectedAssetList;
    }

    /**
     * Set 返回各检测项所影响的资产的列表。
     * @param AffectedAssetList 返回各检测项所影响的资产的列表。
     */
    public void setAffectedAssetList(ComplianceAffectedAsset [] AffectedAssetList) {
        this.AffectedAssetList = AffectedAssetList;
    }

    /**
     * Get 检测项影响的资产的总数。 
     * @return TotalCount 检测项影响的资产的总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 检测项影响的资产的总数。
     * @param TotalCount 检测项影响的资产的总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeCompliancePolicyItemAffectedAssetListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCompliancePolicyItemAffectedAssetListResponse(DescribeCompliancePolicyItemAffectedAssetListResponse source) {
        if (source.AffectedAssetList != null) {
            this.AffectedAssetList = new ComplianceAffectedAsset[source.AffectedAssetList.length];
            for (int i = 0; i < source.AffectedAssetList.length; i++) {
                this.AffectedAssetList[i] = new ComplianceAffectedAsset(source.AffectedAssetList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AffectedAssetList.", this.AffectedAssetList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

