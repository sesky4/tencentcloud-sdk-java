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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigFileReleaseHistoriesResponse extends AbstractModel {

    /**
    * 数据总数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 配置文件发布历史列表
    */
    @SerializedName("ConfigFileReleaseHistories")
    @Expose
    private ConfigFileReleaseHistory [] ConfigFileReleaseHistories;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据总数量 
     * @return TotalCount 数据总数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据总数量
     * @param TotalCount 数据总数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 配置文件发布历史列表 
     * @return ConfigFileReleaseHistories 配置文件发布历史列表
     */
    public ConfigFileReleaseHistory [] getConfigFileReleaseHistories() {
        return this.ConfigFileReleaseHistories;
    }

    /**
     * Set 配置文件发布历史列表
     * @param ConfigFileReleaseHistories 配置文件发布历史列表
     */
    public void setConfigFileReleaseHistories(ConfigFileReleaseHistory [] ConfigFileReleaseHistories) {
        this.ConfigFileReleaseHistories = ConfigFileReleaseHistories;
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

    public DescribeConfigFileReleaseHistoriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFileReleaseHistoriesResponse(DescribeConfigFileReleaseHistoriesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ConfigFileReleaseHistories != null) {
            this.ConfigFileReleaseHistories = new ConfigFileReleaseHistory[source.ConfigFileReleaseHistories.length];
            for (int i = 0; i < source.ConfigFileReleaseHistories.length; i++) {
                this.ConfigFileReleaseHistories[i] = new ConfigFileReleaseHistory(source.ConfigFileReleaseHistories[i]);
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
        this.setParamArrayObj(map, prefix + "ConfigFileReleaseHistories.", this.ConfigFileReleaseHistories);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

