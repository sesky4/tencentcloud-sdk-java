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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest extends AbstractModel {

    /**
    * 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 目的端口转换规则列表。
    */
    @SerializedName("LocalDestinationIpPortTranslationNatRules")
    @Expose
    private DestinationIpPortTranslationNatRuleDiff [] LocalDestinationIpPortTranslationNatRules;

    /**
     * Get 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。 
     * @return NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     * @param NatGatewayId 私网网关唯一`ID`，形如：`intranat-xxxxxxxx`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 目的端口转换规则列表。 
     * @return LocalDestinationIpPortTranslationNatRules 目的端口转换规则列表。
     */
    public DestinationIpPortTranslationNatRuleDiff [] getLocalDestinationIpPortTranslationNatRules() {
        return this.LocalDestinationIpPortTranslationNatRules;
    }

    /**
     * Set 目的端口转换规则列表。
     * @param LocalDestinationIpPortTranslationNatRules 目的端口转换规则列表。
     */
    public void setLocalDestinationIpPortTranslationNatRules(DestinationIpPortTranslationNatRuleDiff [] LocalDestinationIpPortTranslationNatRules) {
        this.LocalDestinationIpPortTranslationNatRules = LocalDestinationIpPortTranslationNatRules;
    }

    public ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest(ModifyPrivateNatGatewayDestinationIpPortTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.LocalDestinationIpPortTranslationNatRules != null) {
            this.LocalDestinationIpPortTranslationNatRules = new DestinationIpPortTranslationNatRuleDiff[source.LocalDestinationIpPortTranslationNatRules.length];
            for (int i = 0; i < source.LocalDestinationIpPortTranslationNatRules.length; i++) {
                this.LocalDestinationIpPortTranslationNatRules[i] = new DestinationIpPortTranslationNatRuleDiff(source.LocalDestinationIpPortTranslationNatRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "LocalDestinationIpPortTranslationNatRules.", this.LocalDestinationIpPortTranslationNatRules);

    }
}

