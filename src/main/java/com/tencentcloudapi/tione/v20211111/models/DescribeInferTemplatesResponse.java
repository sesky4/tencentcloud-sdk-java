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

public class DescribeInferTemplatesResponse extends AbstractModel {

    /**
    * 模板列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkTemplates")
    @Expose
    private InferTemplateGroup [] FrameworkTemplates;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkTemplates 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferTemplateGroup [] getFrameworkTemplates() {
        return this.FrameworkTemplates;
    }

    /**
     * Set 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkTemplates 模板列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkTemplates(InferTemplateGroup [] FrameworkTemplates) {
        this.FrameworkTemplates = FrameworkTemplates;
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

    public DescribeInferTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferTemplatesResponse(DescribeInferTemplatesResponse source) {
        if (source.FrameworkTemplates != null) {
            this.FrameworkTemplates = new InferTemplateGroup[source.FrameworkTemplates.length];
            for (int i = 0; i < source.FrameworkTemplates.length; i++) {
                this.FrameworkTemplates[i] = new InferTemplateGroup(source.FrameworkTemplates[i]);
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
        this.setParamArrayObj(map, prefix + "FrameworkTemplates.", this.FrameworkTemplates);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

