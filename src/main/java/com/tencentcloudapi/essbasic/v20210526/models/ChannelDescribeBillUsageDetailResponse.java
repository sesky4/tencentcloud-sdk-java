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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeBillUsageDetailResponse extends AbstractModel {

    /**
    * 返回查询记录总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 消耗记录详情
    */
    @SerializedName("Details")
    @Expose
    private ChannelBillUsageDetail [] Details;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回查询记录总数 
     * @return Total 返回查询记录总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回查询记录总数
     * @param Total 返回查询记录总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 消耗记录详情 
     * @return Details 消耗记录详情
     */
    public ChannelBillUsageDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 消耗记录详情
     * @param Details 消耗记录详情
     */
    public void setDetails(ChannelBillUsageDetail [] Details) {
        this.Details = Details;
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

    public ChannelDescribeBillUsageDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeBillUsageDetailResponse(ChannelDescribeBillUsageDetailResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Details != null) {
            this.Details = new ChannelBillUsageDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new ChannelBillUsageDetail(source.Details[i]);
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
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

