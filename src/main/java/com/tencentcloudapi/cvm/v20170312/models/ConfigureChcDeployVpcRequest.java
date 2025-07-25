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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigureChcDeployVpcRequest extends AbstractModel {

    /**
    * CHC物理服务器的实例Id。
    */
    @SerializedName("ChcIds")
    @Expose
    private String [] ChcIds;

    /**
    * 部署网络信息。
    */
    @SerializedName("DeployVirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud DeployVirtualPrivateCloud;

    /**
    * 部署网络的安全组列表。
    */
    @SerializedName("DeploySecurityGroupIds")
    @Expose
    private String [] DeploySecurityGroupIds;

    /**
    * 部署所需要的dhcp选项参数
    */
    @SerializedName("ChcDeployExtraConfig")
    @Expose
    private ChcDeployExtraConfig ChcDeployExtraConfig;

    /**
     * Get CHC物理服务器的实例Id。 
     * @return ChcIds CHC物理服务器的实例Id。
     */
    public String [] getChcIds() {
        return this.ChcIds;
    }

    /**
     * Set CHC物理服务器的实例Id。
     * @param ChcIds CHC物理服务器的实例Id。
     */
    public void setChcIds(String [] ChcIds) {
        this.ChcIds = ChcIds;
    }

    /**
     * Get 部署网络信息。 
     * @return DeployVirtualPrivateCloud 部署网络信息。
     */
    public VirtualPrivateCloud getDeployVirtualPrivateCloud() {
        return this.DeployVirtualPrivateCloud;
    }

    /**
     * Set 部署网络信息。
     * @param DeployVirtualPrivateCloud 部署网络信息。
     */
    public void setDeployVirtualPrivateCloud(VirtualPrivateCloud DeployVirtualPrivateCloud) {
        this.DeployVirtualPrivateCloud = DeployVirtualPrivateCloud;
    }

    /**
     * Get 部署网络的安全组列表。 
     * @return DeploySecurityGroupIds 部署网络的安全组列表。
     */
    public String [] getDeploySecurityGroupIds() {
        return this.DeploySecurityGroupIds;
    }

    /**
     * Set 部署网络的安全组列表。
     * @param DeploySecurityGroupIds 部署网络的安全组列表。
     */
    public void setDeploySecurityGroupIds(String [] DeploySecurityGroupIds) {
        this.DeploySecurityGroupIds = DeploySecurityGroupIds;
    }

    /**
     * Get 部署所需要的dhcp选项参数 
     * @return ChcDeployExtraConfig 部署所需要的dhcp选项参数
     */
    public ChcDeployExtraConfig getChcDeployExtraConfig() {
        return this.ChcDeployExtraConfig;
    }

    /**
     * Set 部署所需要的dhcp选项参数
     * @param ChcDeployExtraConfig 部署所需要的dhcp选项参数
     */
    public void setChcDeployExtraConfig(ChcDeployExtraConfig ChcDeployExtraConfig) {
        this.ChcDeployExtraConfig = ChcDeployExtraConfig;
    }

    public ConfigureChcDeployVpcRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigureChcDeployVpcRequest(ConfigureChcDeployVpcRequest source) {
        if (source.ChcIds != null) {
            this.ChcIds = new String[source.ChcIds.length];
            for (int i = 0; i < source.ChcIds.length; i++) {
                this.ChcIds[i] = new String(source.ChcIds[i]);
            }
        }
        if (source.DeployVirtualPrivateCloud != null) {
            this.DeployVirtualPrivateCloud = new VirtualPrivateCloud(source.DeployVirtualPrivateCloud);
        }
        if (source.DeploySecurityGroupIds != null) {
            this.DeploySecurityGroupIds = new String[source.DeploySecurityGroupIds.length];
            for (int i = 0; i < source.DeploySecurityGroupIds.length; i++) {
                this.DeploySecurityGroupIds[i] = new String(source.DeploySecurityGroupIds[i]);
            }
        }
        if (source.ChcDeployExtraConfig != null) {
            this.ChcDeployExtraConfig = new ChcDeployExtraConfig(source.ChcDeployExtraConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ChcIds.", this.ChcIds);
        this.setParamObj(map, prefix + "DeployVirtualPrivateCloud.", this.DeployVirtualPrivateCloud);
        this.setParamArraySimple(map, prefix + "DeploySecurityGroupIds.", this.DeploySecurityGroupIds);
        this.setParamObj(map, prefix + "ChcDeployExtraConfig.", this.ChcDeployExtraConfig);

    }
}

