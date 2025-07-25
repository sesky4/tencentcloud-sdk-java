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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetServiceStatusResponse extends AbstractModel {

    /**
    * KMS服务是否开通， true 表示已开通
    */
    @SerializedName("ServiceEnabled")
    @Expose
    private Boolean ServiceEnabled;

    /**
    * 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
    */
    @SerializedName("InvalidType")
    @Expose
    private Long InvalidType;

    /**
    * 0-普通版，1-旗舰版
    */
    @SerializedName("UserLevel")
    @Expose
    private Long UserLevel;

    /**
    * 旗舰版到期时间（Epoch Unix Timestamp）。
    */
    @SerializedName("ProExpireTime")
    @Expose
    private Long ProExpireTime;

    /**
    * 旗舰版是否自动续费：0-不自动续费，1-自动续费
    */
    @SerializedName("ProRenewFlag")
    @Expose
    private Long ProRenewFlag;

    /**
    * 旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空
    */
    @SerializedName("ProResourceId")
    @Expose
    private String ProResourceId;

    /**
    * 是否开通 KMS 托管版
    */
    @SerializedName("ExclusiveVSMEnabled")
    @Expose
    private Boolean ExclusiveVSMEnabled;

    /**
    * 是否开通 KMS 独享版
    */
    @SerializedName("ExclusiveHSMEnabled")
    @Expose
    private Boolean ExclusiveHSMEnabled;

    /**
    * KMS 订阅信息。
    */
    @SerializedName("SubscriptionInfo")
    @Expose
    private String SubscriptionInfo;

    /**
    * 返回KMS用户密钥使用数量
    */
    @SerializedName("CmkUserCount")
    @Expose
    private Long CmkUserCount;

    /**
    * 返回KMS用户密钥规格数量
    */
    @SerializedName("CmkLimit")
    @Expose
    private Long CmkLimit;

    /**
    * 返回独享集群组
    */
    @SerializedName("ExclusiveHSMList")
    @Expose
    private ExclusiveHSM [] ExclusiveHSMList;

    /**
    * 是否支持数据密钥托管。1:支持，0:不支持。
    */
    @SerializedName("IsAllowedDataKeyHosted")
    @Expose
    private Boolean IsAllowedDataKeyHosted;

    /**
    * IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度
    */
    @SerializedName("DataKeyLimit")
    @Expose
    private Long DataKeyLimit;

    /**
    * IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。
    */
    @SerializedName("FreeDataKeyLimit")
    @Expose
    private Long FreeDataKeyLimit;

    /**
    * IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。
    */
    @SerializedName("DataKeyUsedCount")
    @Expose
    private Long DataKeyUsedCount;

    /**
    * 同步任务的目标地域信息
    */
    @SerializedName("SyncTaskList")
    @Expose
    private DestinationSyncConfig [] SyncTaskList;

    /**
    * 是否支持同步任务。true:支持，false:不支持。
    */
    @SerializedName("IsAllowedSync")
    @Expose
    private Boolean IsAllowedSync;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get KMS服务是否开通， true 表示已开通 
     * @return ServiceEnabled KMS服务是否开通， true 表示已开通
     */
    public Boolean getServiceEnabled() {
        return this.ServiceEnabled;
    }

    /**
     * Set KMS服务是否开通， true 表示已开通
     * @param ServiceEnabled KMS服务是否开通， true 表示已开通
     */
    public void setServiceEnabled(Boolean ServiceEnabled) {
        this.ServiceEnabled = ServiceEnabled;
    }

    /**
     * Get 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放 
     * @return InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
     */
    public Long getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
     * @param InvalidType 服务不可用类型： 0-未购买，1-正常， 2-欠费停服， 3-资源释放
     */
    public void setInvalidType(Long InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get 0-普通版，1-旗舰版 
     * @return UserLevel 0-普通版，1-旗舰版
     */
    public Long getUserLevel() {
        return this.UserLevel;
    }

    /**
     * Set 0-普通版，1-旗舰版
     * @param UserLevel 0-普通版，1-旗舰版
     */
    public void setUserLevel(Long UserLevel) {
        this.UserLevel = UserLevel;
    }

    /**
     * Get 旗舰版到期时间（Epoch Unix Timestamp）。 
     * @return ProExpireTime 旗舰版到期时间（Epoch Unix Timestamp）。
     */
    public Long getProExpireTime() {
        return this.ProExpireTime;
    }

    /**
     * Set 旗舰版到期时间（Epoch Unix Timestamp）。
     * @param ProExpireTime 旗舰版到期时间（Epoch Unix Timestamp）。
     */
    public void setProExpireTime(Long ProExpireTime) {
        this.ProExpireTime = ProExpireTime;
    }

    /**
     * Get 旗舰版是否自动续费：0-不自动续费，1-自动续费 
     * @return ProRenewFlag 旗舰版是否自动续费：0-不自动续费，1-自动续费
     */
    public Long getProRenewFlag() {
        return this.ProRenewFlag;
    }

    /**
     * Set 旗舰版是否自动续费：0-不自动续费，1-自动续费
     * @param ProRenewFlag 旗舰版是否自动续费：0-不自动续费，1-自动续费
     */
    public void setProRenewFlag(Long ProRenewFlag) {
        this.ProRenewFlag = ProRenewFlag;
    }

    /**
     * Get 旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空 
     * @return ProResourceId 旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空
     */
    public String getProResourceId() {
        return this.ProResourceId;
    }

    /**
     * Set 旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空
     * @param ProResourceId 旗舰版购买记录的唯一性标识。如果未开通旗舰版，则返回值为空
     */
    public void setProResourceId(String ProResourceId) {
        this.ProResourceId = ProResourceId;
    }

    /**
     * Get 是否开通 KMS 托管版 
     * @return ExclusiveVSMEnabled 是否开通 KMS 托管版
     */
    public Boolean getExclusiveVSMEnabled() {
        return this.ExclusiveVSMEnabled;
    }

    /**
     * Set 是否开通 KMS 托管版
     * @param ExclusiveVSMEnabled 是否开通 KMS 托管版
     */
    public void setExclusiveVSMEnabled(Boolean ExclusiveVSMEnabled) {
        this.ExclusiveVSMEnabled = ExclusiveVSMEnabled;
    }

    /**
     * Get 是否开通 KMS 独享版 
     * @return ExclusiveHSMEnabled 是否开通 KMS 独享版
     */
    public Boolean getExclusiveHSMEnabled() {
        return this.ExclusiveHSMEnabled;
    }

    /**
     * Set 是否开通 KMS 独享版
     * @param ExclusiveHSMEnabled 是否开通 KMS 独享版
     */
    public void setExclusiveHSMEnabled(Boolean ExclusiveHSMEnabled) {
        this.ExclusiveHSMEnabled = ExclusiveHSMEnabled;
    }

    /**
     * Get KMS 订阅信息。 
     * @return SubscriptionInfo KMS 订阅信息。
     */
    public String getSubscriptionInfo() {
        return this.SubscriptionInfo;
    }

    /**
     * Set KMS 订阅信息。
     * @param SubscriptionInfo KMS 订阅信息。
     */
    public void setSubscriptionInfo(String SubscriptionInfo) {
        this.SubscriptionInfo = SubscriptionInfo;
    }

    /**
     * Get 返回KMS用户密钥使用数量 
     * @return CmkUserCount 返回KMS用户密钥使用数量
     */
    public Long getCmkUserCount() {
        return this.CmkUserCount;
    }

    /**
     * Set 返回KMS用户密钥使用数量
     * @param CmkUserCount 返回KMS用户密钥使用数量
     */
    public void setCmkUserCount(Long CmkUserCount) {
        this.CmkUserCount = CmkUserCount;
    }

    /**
     * Get 返回KMS用户密钥规格数量 
     * @return CmkLimit 返回KMS用户密钥规格数量
     */
    public Long getCmkLimit() {
        return this.CmkLimit;
    }

    /**
     * Set 返回KMS用户密钥规格数量
     * @param CmkLimit 返回KMS用户密钥规格数量
     */
    public void setCmkLimit(Long CmkLimit) {
        this.CmkLimit = CmkLimit;
    }

    /**
     * Get 返回独享集群组 
     * @return ExclusiveHSMList 返回独享集群组
     */
    public ExclusiveHSM [] getExclusiveHSMList() {
        return this.ExclusiveHSMList;
    }

    /**
     * Set 返回独享集群组
     * @param ExclusiveHSMList 返回独享集群组
     */
    public void setExclusiveHSMList(ExclusiveHSM [] ExclusiveHSMList) {
        this.ExclusiveHSMList = ExclusiveHSMList;
    }

    /**
     * Get 是否支持数据密钥托管。1:支持，0:不支持。 
     * @return IsAllowedDataKeyHosted 是否支持数据密钥托管。1:支持，0:不支持。
     */
    public Boolean getIsAllowedDataKeyHosted() {
        return this.IsAllowedDataKeyHosted;
    }

    /**
     * Set 是否支持数据密钥托管。1:支持，0:不支持。
     * @param IsAllowedDataKeyHosted 是否支持数据密钥托管。1:支持，0:不支持。
     */
    public void setIsAllowedDataKeyHosted(Boolean IsAllowedDataKeyHosted) {
        this.IsAllowedDataKeyHosted = IsAllowedDataKeyHosted;
    }

    /**
     * Get IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度 
     * @return DataKeyLimit IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度
     */
    public Long getDataKeyLimit() {
        return this.DataKeyLimit;
    }

    /**
     * Set IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度
     * @param DataKeyLimit IsAllowedDataKeyHosted为1时有效，数据密钥的购买额度
     */
    public void setDataKeyLimit(Long DataKeyLimit) {
        this.DataKeyLimit = DataKeyLimit;
    }

    /**
     * Get IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。 
     * @return FreeDataKeyLimit IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。
     */
    public Long getFreeDataKeyLimit() {
        return this.FreeDataKeyLimit;
    }

    /**
     * Set IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。
     * @param FreeDataKeyLimit IsAllowedDataKeyHosted为1时有效，数据密钥免费额度。
     */
    public void setFreeDataKeyLimit(Long FreeDataKeyLimit) {
        this.FreeDataKeyLimit = FreeDataKeyLimit;
    }

    /**
     * Get IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。 
     * @return DataKeyUsedCount IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。
     */
    public Long getDataKeyUsedCount() {
        return this.DataKeyUsedCount;
    }

    /**
     * Set IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。
     * @param DataKeyUsedCount IsAllowedDataKeyHosted为1时有效，已使用的数据密钥数量。
     */
    public void setDataKeyUsedCount(Long DataKeyUsedCount) {
        this.DataKeyUsedCount = DataKeyUsedCount;
    }

    /**
     * Get 同步任务的目标地域信息 
     * @return SyncTaskList 同步任务的目标地域信息
     */
    public DestinationSyncConfig [] getSyncTaskList() {
        return this.SyncTaskList;
    }

    /**
     * Set 同步任务的目标地域信息
     * @param SyncTaskList 同步任务的目标地域信息
     */
    public void setSyncTaskList(DestinationSyncConfig [] SyncTaskList) {
        this.SyncTaskList = SyncTaskList;
    }

    /**
     * Get 是否支持同步任务。true:支持，false:不支持。 
     * @return IsAllowedSync 是否支持同步任务。true:支持，false:不支持。
     */
    public Boolean getIsAllowedSync() {
        return this.IsAllowedSync;
    }

    /**
     * Set 是否支持同步任务。true:支持，false:不支持。
     * @param IsAllowedSync 是否支持同步任务。true:支持，false:不支持。
     */
    public void setIsAllowedSync(Boolean IsAllowedSync) {
        this.IsAllowedSync = IsAllowedSync;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetServiceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetServiceStatusResponse(GetServiceStatusResponse source) {
        if (source.ServiceEnabled != null) {
            this.ServiceEnabled = new Boolean(source.ServiceEnabled);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new Long(source.InvalidType);
        }
        if (source.UserLevel != null) {
            this.UserLevel = new Long(source.UserLevel);
        }
        if (source.ProExpireTime != null) {
            this.ProExpireTime = new Long(source.ProExpireTime);
        }
        if (source.ProRenewFlag != null) {
            this.ProRenewFlag = new Long(source.ProRenewFlag);
        }
        if (source.ProResourceId != null) {
            this.ProResourceId = new String(source.ProResourceId);
        }
        if (source.ExclusiveVSMEnabled != null) {
            this.ExclusiveVSMEnabled = new Boolean(source.ExclusiveVSMEnabled);
        }
        if (source.ExclusiveHSMEnabled != null) {
            this.ExclusiveHSMEnabled = new Boolean(source.ExclusiveHSMEnabled);
        }
        if (source.SubscriptionInfo != null) {
            this.SubscriptionInfo = new String(source.SubscriptionInfo);
        }
        if (source.CmkUserCount != null) {
            this.CmkUserCount = new Long(source.CmkUserCount);
        }
        if (source.CmkLimit != null) {
            this.CmkLimit = new Long(source.CmkLimit);
        }
        if (source.ExclusiveHSMList != null) {
            this.ExclusiveHSMList = new ExclusiveHSM[source.ExclusiveHSMList.length];
            for (int i = 0; i < source.ExclusiveHSMList.length; i++) {
                this.ExclusiveHSMList[i] = new ExclusiveHSM(source.ExclusiveHSMList[i]);
            }
        }
        if (source.IsAllowedDataKeyHosted != null) {
            this.IsAllowedDataKeyHosted = new Boolean(source.IsAllowedDataKeyHosted);
        }
        if (source.DataKeyLimit != null) {
            this.DataKeyLimit = new Long(source.DataKeyLimit);
        }
        if (source.FreeDataKeyLimit != null) {
            this.FreeDataKeyLimit = new Long(source.FreeDataKeyLimit);
        }
        if (source.DataKeyUsedCount != null) {
            this.DataKeyUsedCount = new Long(source.DataKeyUsedCount);
        }
        if (source.SyncTaskList != null) {
            this.SyncTaskList = new DestinationSyncConfig[source.SyncTaskList.length];
            for (int i = 0; i < source.SyncTaskList.length; i++) {
                this.SyncTaskList[i] = new DestinationSyncConfig(source.SyncTaskList[i]);
            }
        }
        if (source.IsAllowedSync != null) {
            this.IsAllowedSync = new Boolean(source.IsAllowedSync);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEnabled", this.ServiceEnabled);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "UserLevel", this.UserLevel);
        this.setParamSimple(map, prefix + "ProExpireTime", this.ProExpireTime);
        this.setParamSimple(map, prefix + "ProRenewFlag", this.ProRenewFlag);
        this.setParamSimple(map, prefix + "ProResourceId", this.ProResourceId);
        this.setParamSimple(map, prefix + "ExclusiveVSMEnabled", this.ExclusiveVSMEnabled);
        this.setParamSimple(map, prefix + "ExclusiveHSMEnabled", this.ExclusiveHSMEnabled);
        this.setParamSimple(map, prefix + "SubscriptionInfo", this.SubscriptionInfo);
        this.setParamSimple(map, prefix + "CmkUserCount", this.CmkUserCount);
        this.setParamSimple(map, prefix + "CmkLimit", this.CmkLimit);
        this.setParamArrayObj(map, prefix + "ExclusiveHSMList.", this.ExclusiveHSMList);
        this.setParamSimple(map, prefix + "IsAllowedDataKeyHosted", this.IsAllowedDataKeyHosted);
        this.setParamSimple(map, prefix + "DataKeyLimit", this.DataKeyLimit);
        this.setParamSimple(map, prefix + "FreeDataKeyLimit", this.FreeDataKeyLimit);
        this.setParamSimple(map, prefix + "DataKeyUsedCount", this.DataKeyUsedCount);
        this.setParamArrayObj(map, prefix + "SyncTaskList.", this.SyncTaskList);
        this.setParamSimple(map, prefix + "IsAllowedSync", this.IsAllowedSync);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

