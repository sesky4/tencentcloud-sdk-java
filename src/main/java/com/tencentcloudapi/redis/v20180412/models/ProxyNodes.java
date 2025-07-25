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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyNodes extends AbstractModel {

    /**
    * 节点 ID。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 可用区 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
     * Get 节点 ID。 
     * @return NodeId 节点 ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点 ID。
     * @param NodeId 节点 ID。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 可用区 ID。 
     * @return ZoneId 可用区 ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID。
     * @param ZoneId 可用区 ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    public ProxyNodes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyNodes(ProxyNodes source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

