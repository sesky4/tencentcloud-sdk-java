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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDsTaskVersionListRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否仅返回当前编辑版本
    */
    @SerializedName("IsOnlyCurrentEditingVersion")
    @Expose
    private Boolean IsOnlyCurrentEditingVersion;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否仅返回当前编辑版本 
     * @return IsOnlyCurrentEditingVersion 是否仅返回当前编辑版本
     */
    public Boolean getIsOnlyCurrentEditingVersion() {
        return this.IsOnlyCurrentEditingVersion;
    }

    /**
     * Set 是否仅返回当前编辑版本
     * @param IsOnlyCurrentEditingVersion 是否仅返回当前编辑版本
     */
    public void setIsOnlyCurrentEditingVersion(Boolean IsOnlyCurrentEditingVersion) {
        this.IsOnlyCurrentEditingVersion = IsOnlyCurrentEditingVersion;
    }

    public DescribeDsTaskVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsTaskVersionListRequest(DescribeDsTaskVersionListRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.IsOnlyCurrentEditingVersion != null) {
            this.IsOnlyCurrentEditingVersion = new Boolean(source.IsOnlyCurrentEditingVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsOnlyCurrentEditingVersion", this.IsOnlyCurrentEditingVersion);

    }
}

