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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelAccelerateTaskRequest extends AbstractModel {

    /**
    * 模型加速任务ID
    */
    @SerializedName("ModelAccTaskId")
    @Expose
    private String ModelAccTaskId;

    /**
     * Get 模型加速任务ID 
     * @return ModelAccTaskId 模型加速任务ID
     */
    public String getModelAccTaskId() {
        return this.ModelAccTaskId;
    }

    /**
     * Set 模型加速任务ID
     * @param ModelAccTaskId 模型加速任务ID
     */
    public void setModelAccTaskId(String ModelAccTaskId) {
        this.ModelAccTaskId = ModelAccTaskId;
    }

    public DescribeModelAccelerateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelAccelerateTaskRequest(DescribeModelAccelerateTaskRequest source) {
        if (source.ModelAccTaskId != null) {
            this.ModelAccTaskId = new String(source.ModelAccTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelAccTaskId", this.ModelAccTaskId);

    }
}

