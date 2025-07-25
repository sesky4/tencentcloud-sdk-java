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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatherRuleSummary extends AbstractModel {

    /**
    * 分账规则表达式
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
     * Get 分账规则表达式 
     * @return RuleDetail 分账规则表达式
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set 分账规则表达式
     * @param RuleDetail 分账规则表达式
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
    }

    public GatherRuleSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatherRuleSummary(GatherRuleSummary source) {
        if (source.RuleDetail != null) {
            this.RuleDetail = new AllocationRuleExpression(source.RuleDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);

    }
}

