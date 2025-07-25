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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentRiskTemplateVulnerableListRequest extends AbstractModel {

    /**
    * dspa实例id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险面
    */
    @SerializedName("RiskSide")
    @Expose
    private String RiskSide;

    /**
     * Get dspa实例id 
     * @return DspaId dspa实例id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例id
     * @param DspaId dspa实例id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险面 
     * @return RiskSide 风险面
     */
    public String getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面
     * @param RiskSide 风险面
     */
    public void setRiskSide(String RiskSide) {
        this.RiskSide = RiskSide;
    }

    public DescribeDSPAAssessmentRiskTemplateVulnerableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentRiskTemplateVulnerableListRequest(DescribeDSPAAssessmentRiskTemplateVulnerableListRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String(source.RiskSide);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskSide", this.RiskSide);

    }
}

