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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationChannelInfo extends AbstractModel {

    /**
    * 设备通道所属的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备通道所属的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 设备通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 该通道是否在上云计划中，如果是，则不能在添加到其他上云计划|true：在上云计划中，false：不在上云计划中
    */
    @SerializedName("InPlan")
    @Expose
    private Boolean InPlan;

    /**
     * Get 设备通道所属的设备ID 
     * @return DeviceId 设备通道所属的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备通道所属的设备ID
     * @param DeviceId 设备通道所属的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备通道所属的设备名称 
     * @return DeviceName 设备通道所属的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备通道所属的设备名称
     * @param DeviceName 设备通道所属的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备通道ID 
     * @return ChannelId 设备通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 设备通道ID
     * @param ChannelId 设备通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 设备通道名称 
     * @return ChannelName 设备通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 设备通道名称
     * @param ChannelName 设备通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 该通道是否在上云计划中，如果是，则不能在添加到其他上云计划|true：在上云计划中，false：不在上云计划中 
     * @return InPlan 该通道是否在上云计划中，如果是，则不能在添加到其他上云计划|true：在上云计划中，false：不在上云计划中
     */
    public Boolean getInPlan() {
        return this.InPlan;
    }

    /**
     * Set 该通道是否在上云计划中，如果是，则不能在添加到其他上云计划|true：在上云计划中，false：不在上云计划中
     * @param InPlan 该通道是否在上云计划中，如果是，则不能在添加到其他上云计划|true：在上云计划中，false：不在上云计划中
     */
    public void setInPlan(Boolean InPlan) {
        this.InPlan = InPlan;
    }

    public OrganizationChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationChannelInfo(OrganizationChannelInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.InPlan != null) {
            this.InPlan = new Boolean(source.InPlan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "InPlan", this.InPlan);

    }
}

