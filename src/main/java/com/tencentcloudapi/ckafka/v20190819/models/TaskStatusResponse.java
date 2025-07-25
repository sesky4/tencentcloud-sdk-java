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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatusResponse extends AbstractModel {

    /**
    * 任务状态:
0 成功
1 失败
2 进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 输出信息
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
     * Get 任务状态:
0 成功
1 失败
2 进行中 
     * @return Status 任务状态:
0 成功
1 失败
2 进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态:
0 成功
1 失败
2 进行中
     * @param Status 任务状态:
0 成功
1 失败
2 进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 输出信息 
     * @return Output 输出信息
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 输出信息
     * @param Output 输出信息
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    public TaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatusResponse(TaskStatusResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Output", this.Output);

    }
}

