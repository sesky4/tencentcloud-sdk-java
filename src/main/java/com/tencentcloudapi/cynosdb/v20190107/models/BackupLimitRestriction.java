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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupLimitRestriction extends AbstractModel {

    /**
    * 限制类型
    */
    @SerializedName("LimitType")
    @Expose
    private String LimitType;

    /**
    * 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
    */
    @SerializedName("VpcComparisonSymbol")
    @Expose
    private String VpcComparisonSymbol;

    /**
    * In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
    */
    @SerializedName("IpComparisonSymbol")
    @Expose
    private String IpComparisonSymbol;

    /**
    * 限制下载的vpc设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitVpcs")
    @Expose
    private BackupLimitVpcItem [] LimitVpcs;

    /**
    * 限制下载的ip设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitIps")
    @Expose
    private String [] LimitIps;

    /**
     * Get 限制类型 
     * @return LimitType 限制类型
     */
    public String getLimitType() {
        return this.LimitType;
    }

    /**
     * Set 限制类型
     * @param LimitType 限制类型
     */
    public void setLimitType(String LimitType) {
        this.LimitType = LimitType;
    }

    /**
     * Get 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In 
     * @return VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     */
    public String getVpcComparisonSymbol() {
        return this.VpcComparisonSymbol;
    }

    /**
     * Set 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     * @param VpcComparisonSymbol 该参数仅支持 In， 表示 LimitVpc 指定的vpc可以下载。默认为In
     */
    public void setVpcComparisonSymbol(String VpcComparisonSymbol) {
        this.VpcComparisonSymbol = VpcComparisonSymbol;
    }

    /**
     * Get In: 指定的ip可以下载； NotIn: 指定的ip不可以下载 
     * @return IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     */
    public String getIpComparisonSymbol() {
        return this.IpComparisonSymbol;
    }

    /**
     * Set In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     * @param IpComparisonSymbol In: 指定的ip可以下载； NotIn: 指定的ip不可以下载
     */
    public void setIpComparisonSymbol(String IpComparisonSymbol) {
        this.IpComparisonSymbol = IpComparisonSymbol;
    }

    /**
     * Get 限制下载的vpc设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitVpcs 限制下载的vpc设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupLimitVpcItem [] getLimitVpcs() {
        return this.LimitVpcs;
    }

    /**
     * Set 限制下载的vpc设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitVpcs 限制下载的vpc设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitVpcs(BackupLimitVpcItem [] LimitVpcs) {
        this.LimitVpcs = LimitVpcs;
    }

    /**
     * Get 限制下载的ip设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitIps 限制下载的ip设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLimitIps() {
        return this.LimitIps;
    }

    /**
     * Set 限制下载的ip设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitIps 限制下载的ip设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitIps(String [] LimitIps) {
        this.LimitIps = LimitIps;
    }

    public BackupLimitRestriction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupLimitRestriction(BackupLimitRestriction source) {
        if (source.LimitType != null) {
            this.LimitType = new String(source.LimitType);
        }
        if (source.VpcComparisonSymbol != null) {
            this.VpcComparisonSymbol = new String(source.VpcComparisonSymbol);
        }
        if (source.IpComparisonSymbol != null) {
            this.IpComparisonSymbol = new String(source.IpComparisonSymbol);
        }
        if (source.LimitVpcs != null) {
            this.LimitVpcs = new BackupLimitVpcItem[source.LimitVpcs.length];
            for (int i = 0; i < source.LimitVpcs.length; i++) {
                this.LimitVpcs[i] = new BackupLimitVpcItem(source.LimitVpcs[i]);
            }
        }
        if (source.LimitIps != null) {
            this.LimitIps = new String[source.LimitIps.length];
            for (int i = 0; i < source.LimitIps.length; i++) {
                this.LimitIps[i] = new String(source.LimitIps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitType", this.LimitType);
        this.setParamSimple(map, prefix + "VpcComparisonSymbol", this.VpcComparisonSymbol);
        this.setParamSimple(map, prefix + "IpComparisonSymbol", this.IpComparisonSymbol);
        this.setParamArrayObj(map, prefix + "LimitVpcs.", this.LimitVpcs);
        this.setParamArraySimple(map, prefix + "LimitIps.", this.LimitIps);

    }
}

