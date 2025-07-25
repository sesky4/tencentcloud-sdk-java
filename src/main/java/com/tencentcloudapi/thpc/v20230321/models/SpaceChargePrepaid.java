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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceChargePrepaid extends AbstractModel {

    /**
    * 购买实例的时长，单位：月。取值范围：1, 2, 3, 12, 24, 36。默认取值为1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费

NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费

DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费


默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get 购买实例的时长，单位：月。取值范围：1, 2, 3, 12, 24, 36。默认取值为1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 购买实例的时长，单位：月。取值范围：1, 2, 3, 12, 24, 36。默认取值为1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买实例的时长，单位：月。取值范围：1, 2, 3, 12, 24, 36。默认取值为1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 购买实例的时长，单位：月。取值范围：1, 2, 3, 12, 24, 36。默认取值为1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费

NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费

DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费


默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费

NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费

DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费


默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费

NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费

DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费


默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 自动续费标识。取值范围：

NOTIFY_AND_AUTO_RENEW：通知过期且自动续费

NOTIFY_AND_MANUAL_RENEW：通知过期不自动续费

DISABLE_NOTIFY_AND_MANUAL_RENEW：不通知过期不自动续费


默认取值：NOTIFY_AND_MANUAL_RENEW。若该参数指定为NOTIFY_AND_AUTO_RENEW，在账户余额充足的情况下，实例到期后将按月自动续费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public SpaceChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceChargePrepaid(SpaceChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

