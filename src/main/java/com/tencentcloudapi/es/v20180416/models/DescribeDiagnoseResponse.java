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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiagnoseResponse extends AbstractModel {

    /**
    * 诊断报告个数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 诊断报告列表
    */
    @SerializedName("DiagnoseResults")
    @Expose
    private DiagnoseResult [] DiagnoseResults;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 诊断报告个数 
     * @return Total 诊断报告个数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 诊断报告个数
     * @param Total 诊断报告个数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 诊断报告列表 
     * @return DiagnoseResults 诊断报告列表
     */
    public DiagnoseResult [] getDiagnoseResults() {
        return this.DiagnoseResults;
    }

    /**
     * Set 诊断报告列表
     * @param DiagnoseResults 诊断报告列表
     */
    public void setDiagnoseResults(DiagnoseResult [] DiagnoseResults) {
        this.DiagnoseResults = DiagnoseResults;
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

    public DescribeDiagnoseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiagnoseResponse(DescribeDiagnoseResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.DiagnoseResults != null) {
            this.DiagnoseResults = new DiagnoseResult[source.DiagnoseResults.length];
            for (int i = 0; i < source.DiagnoseResults.length; i++) {
                this.DiagnoseResults[i] = new DiagnoseResult(source.DiagnoseResults[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "DiagnoseResults.", this.DiagnoseResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

