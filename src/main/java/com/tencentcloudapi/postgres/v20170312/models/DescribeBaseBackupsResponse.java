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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaseBackupsResponse extends AbstractModel {

    /**
    * 查询到的数据备份数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据备份详细信息列表。
    */
    @SerializedName("BaseBackupSet")
    @Expose
    private BaseBackup [] BaseBackupSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询到的数据备份数量。 
     * @return TotalCount 查询到的数据备份数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询到的数据备份数量。
     * @param TotalCount 查询到的数据备份数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 数据备份详细信息列表。 
     * @return BaseBackupSet 数据备份详细信息列表。
     */
    public BaseBackup [] getBaseBackupSet() {
        return this.BaseBackupSet;
    }

    /**
     * Set 数据备份详细信息列表。
     * @param BaseBackupSet 数据备份详细信息列表。
     */
    public void setBaseBackupSet(BaseBackup [] BaseBackupSet) {
        this.BaseBackupSet = BaseBackupSet;
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

    public DescribeBaseBackupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaseBackupsResponse(DescribeBaseBackupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BaseBackupSet != null) {
            this.BaseBackupSet = new BaseBackup[source.BaseBackupSet.length];
            for (int i = 0; i < source.BaseBackupSet.length; i++) {
                this.BaseBackupSet[i] = new BaseBackup(source.BaseBackupSet[i]);
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
        this.setParamArrayObj(map, prefix + "BaseBackupSet.", this.BaseBackupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

