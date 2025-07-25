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

public class CreateOfflineTaskResponse extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 导入到编排空间的任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArrangeSpaceTaskId")
    @Expose
    private String ArrangeSpaceTaskId;

    /**
    * 结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 导入到编排空间的任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArrangeSpaceTaskId 导入到编排空间的任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArrangeSpaceTaskId() {
        return this.ArrangeSpaceTaskId;
    }

    /**
     * Set 导入到编排空间的任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArrangeSpaceTaskId 导入到编排空间的任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrangeSpaceTaskId(String ArrangeSpaceTaskId) {
        this.ArrangeSpaceTaskId = ArrangeSpaceTaskId;
    }

    /**
     * Get 结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(String Data) {
        this.Data = Data;
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

    public CreateOfflineTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOfflineTaskResponse(CreateOfflineTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ArrangeSpaceTaskId != null) {
            this.ArrangeSpaceTaskId = new String(source.ArrangeSpaceTaskId);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ArrangeSpaceTaskId", this.ArrangeSpaceTaskId);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

