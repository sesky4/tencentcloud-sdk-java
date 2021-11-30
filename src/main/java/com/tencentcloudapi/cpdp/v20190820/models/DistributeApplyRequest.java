/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributeApplyRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 商户分账单号
    */
    @SerializedName("OutDistributeNo")
    @Expose
    private String OutDistributeNo;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 分账明细
    */
    @SerializedName("Details")
    @Expose
    private MultiApplyDetail [] Details;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 商户交易订单号，和OrderNo二者传其一
    */
    @SerializedName("DeveloperNo")
    @Expose
    private String DeveloperNo;

    /**
    * 平台交易订单号，和DeveloperNo二者传其一
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 商户分账单号 
     * @return OutDistributeNo 商户分账单号
     */
    public String getOutDistributeNo() {
        return this.OutDistributeNo;
    }

    /**
     * Set 商户分账单号
     * @param OutDistributeNo 商户分账单号
     */
    public void setOutDistributeNo(String OutDistributeNo) {
        this.OutDistributeNo = OutDistributeNo;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 分账明细 
     * @return Details 分账明细
     */
    public MultiApplyDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 分账明细
     * @param Details 分账明细
     */
    public void setDetails(MultiApplyDetail [] Details) {
        this.Details = Details;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 商户交易订单号，和OrderNo二者传其一 
     * @return DeveloperNo 商户交易订单号，和OrderNo二者传其一
     */
    public String getDeveloperNo() {
        return this.DeveloperNo;
    }

    /**
     * Set 商户交易订单号，和OrderNo二者传其一
     * @param DeveloperNo 商户交易订单号，和OrderNo二者传其一
     */
    public void setDeveloperNo(String DeveloperNo) {
        this.DeveloperNo = DeveloperNo;
    }

    /**
     * Get 平台交易订单号，和DeveloperNo二者传其一 
     * @return OrderNo 平台交易订单号，和DeveloperNo二者传其一
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台交易订单号，和DeveloperNo二者传其一
     * @param OrderNo 平台交易订单号，和DeveloperNo二者传其一
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public DistributeApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeApplyRequest(DistributeApplyRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OutDistributeNo != null) {
            this.OutDistributeNo = new String(source.OutDistributeNo);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.Details != null) {
            this.Details = new MultiApplyDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new MultiApplyDetail(source.Details[i]);
            }
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DeveloperNo != null) {
            this.DeveloperNo = new String(source.DeveloperNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OutDistributeNo", this.OutDistributeNo);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DeveloperNo", this.DeveloperNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}
