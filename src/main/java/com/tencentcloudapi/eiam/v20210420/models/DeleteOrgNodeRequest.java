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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrgNodeRequest extends AbstractModel {

    /**
    * 机构节点ID，是机构节点的全局唯一标识。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
     * Get 机构节点ID，是机构节点的全局唯一标识。 
     * @return OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 机构节点ID，是机构节点的全局唯一标识。
     * @param OrgNodeId 机构节点ID，是机构节点的全局唯一标识。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    public DeleteOrgNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrgNodeRequest(DeleteOrgNodeRequest source) {
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);

    }
}

