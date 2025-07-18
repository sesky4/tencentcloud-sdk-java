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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLPFileDetectResultRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 查询ID，即提交送检任务接口（CreateDLPFileDetectionTask）返回的任务ID（DLPFileDetectionTaskID）
    */
    @SerializedName("QueryID")
    @Expose
    private String QueryID;

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get 查询ID，即提交送检任务接口（CreateDLPFileDetectionTask）返回的任务ID（DLPFileDetectionTaskID） 
     * @return QueryID 查询ID，即提交送检任务接口（CreateDLPFileDetectionTask）返回的任务ID（DLPFileDetectionTaskID）
     */
    public String getQueryID() {
        return this.QueryID;
    }

    /**
     * Set 查询ID，即提交送检任务接口（CreateDLPFileDetectionTask）返回的任务ID（DLPFileDetectionTaskID）
     * @param QueryID 查询ID，即提交送检任务接口（CreateDLPFileDetectionTask）返回的任务ID（DLPFileDetectionTaskID）
     */
    public void setQueryID(String QueryID) {
        this.QueryID = QueryID;
    }

    public DescribeDLPFileDetectResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLPFileDetectResultRequest(DescribeDLPFileDetectResultRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.QueryID != null) {
            this.QueryID = new String(source.QueryID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "QueryID", this.QueryID);

    }
}

