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
package com.tencentcloudapi.tdcpg.v20211118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransformClusterPayModeRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 当前付费模式，目前只支持：POSTPAID_BY_HOUR(按小时后付费)
    */
    @SerializedName("CurrentPayMode")
    @Expose
    private String CurrentPayMode;

    /**
    * 目标付费模式，目前只支持：PREPAID(预付费)
    */
    @SerializedName("TargetPayMode")
    @Expose
    private String TargetPayMode;

    /**
    * 购买时长，单位：月。取值范围为[1,60]，默认值为1。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 当前付费模式，目前只支持：POSTPAID_BY_HOUR(按小时后付费) 
     * @return CurrentPayMode 当前付费模式，目前只支持：POSTPAID_BY_HOUR(按小时后付费)
     */
    public String getCurrentPayMode() {
        return this.CurrentPayMode;
    }

    /**
     * Set 当前付费模式，目前只支持：POSTPAID_BY_HOUR(按小时后付费)
     * @param CurrentPayMode 当前付费模式，目前只支持：POSTPAID_BY_HOUR(按小时后付费)
     */
    public void setCurrentPayMode(String CurrentPayMode) {
        this.CurrentPayMode = CurrentPayMode;
    }

    /**
     * Get 目标付费模式，目前只支持：PREPAID(预付费) 
     * @return TargetPayMode 目标付费模式，目前只支持：PREPAID(预付费)
     */
    public String getTargetPayMode() {
        return this.TargetPayMode;
    }

    /**
     * Set 目标付费模式，目前只支持：PREPAID(预付费)
     * @param TargetPayMode 目标付费模式，目前只支持：PREPAID(预付费)
     */
    public void setTargetPayMode(String TargetPayMode) {
        this.TargetPayMode = TargetPayMode;
    }

    /**
     * Get 购买时长，单位：月。取值范围为[1,60]，默认值为1。 
     * @return Period 购买时长，单位：月。取值范围为[1,60]，默认值为1。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。取值范围为[1,60]，默认值为1。
     * @param Period 购买时长，单位：月。取值范围为[1,60]，默认值为1。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public TransformClusterPayModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransformClusterPayModeRequest(TransformClusterPayModeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CurrentPayMode != null) {
            this.CurrentPayMode = new String(source.CurrentPayMode);
        }
        if (source.TargetPayMode != null) {
            this.TargetPayMode = new String(source.TargetPayMode);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CurrentPayMode", this.CurrentPayMode);
        this.setParamSimple(map, prefix + "TargetPayMode", this.TargetPayMode);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

