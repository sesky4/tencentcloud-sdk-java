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

public class DisassociateHaVipInstanceRequest extends AbstractModel {

    /**
    * HaVip解绑的子机或网卡。最多支持10个实例。
    */
    @SerializedName("HaVipAssociationSet")
    @Expose
    private HaVipAssociation [] HaVipAssociationSet;

    /**
     * Get HaVip解绑的子机或网卡。最多支持10个实例。 
     * @return HaVipAssociationSet HaVip解绑的子机或网卡。最多支持10个实例。
     */
    public HaVipAssociation [] getHaVipAssociationSet() {
        return this.HaVipAssociationSet;
    }

    /**
     * Set HaVip解绑的子机或网卡。最多支持10个实例。
     * @param HaVipAssociationSet HaVip解绑的子机或网卡。最多支持10个实例。
     */
    public void setHaVipAssociationSet(HaVipAssociation [] HaVipAssociationSet) {
        this.HaVipAssociationSet = HaVipAssociationSet;
    }

    public DisassociateHaVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateHaVipInstanceRequest(DisassociateHaVipInstanceRequest source) {
        if (source.HaVipAssociationSet != null) {
            this.HaVipAssociationSet = new HaVipAssociation[source.HaVipAssociationSet.length];
            for (int i = 0; i < source.HaVipAssociationSet.length; i++) {
                this.HaVipAssociationSet[i] = new HaVipAssociation(source.HaVipAssociationSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HaVipAssociationSet.", this.HaVipAssociationSet);

    }
}

