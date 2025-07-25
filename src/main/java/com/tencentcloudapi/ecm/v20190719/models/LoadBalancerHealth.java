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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerHealth extends AbstractModel {

    /**
    * 负载均衡实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 监听器列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Listeners")
    @Expose
    private ListenerHealth [] Listeners;

    /**
     * Get 负载均衡实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerId 负载均衡实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerId 负载均衡实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerName 负载均衡实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerName 负载均衡实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 监听器列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Listeners 监听器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ListenerHealth [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set 监听器列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Listeners 监听器列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListeners(ListenerHealth [] Listeners) {
        this.Listeners = Listeners;
    }

    public LoadBalancerHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerHealth(LoadBalancerHealth source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Listeners != null) {
            this.Listeners = new ListenerHealth[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ListenerHealth(source.Listeners[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);

    }
}

