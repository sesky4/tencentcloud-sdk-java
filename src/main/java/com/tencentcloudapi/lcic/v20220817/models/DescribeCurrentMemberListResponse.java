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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentMemberListResponse extends AbstractModel {

    /**
    * 记录总数。当前房间的总人数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 成员记录列表。
    */
    @SerializedName("MemberRecords")
    @Expose
    private MemberRecord [] MemberRecords;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 记录总数。当前房间的总人数。 
     * @return Total 记录总数。当前房间的总人数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 记录总数。当前房间的总人数。
     * @param Total 记录总数。当前房间的总人数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 成员记录列表。 
     * @return MemberRecords 成员记录列表。
     */
    public MemberRecord [] getMemberRecords() {
        return this.MemberRecords;
    }

    /**
     * Set 成员记录列表。
     * @param MemberRecords 成员记录列表。
     */
    public void setMemberRecords(MemberRecord [] MemberRecords) {
        this.MemberRecords = MemberRecords;
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

    public DescribeCurrentMemberListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentMemberListResponse(DescribeCurrentMemberListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.MemberRecords != null) {
            this.MemberRecords = new MemberRecord[source.MemberRecords.length];
            for (int i = 0; i < source.MemberRecords.length; i++) {
                this.MemberRecords[i] = new MemberRecord(source.MemberRecords[i]);
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
        this.setParamArrayObj(map, prefix + "MemberRecords.", this.MemberRecords);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

