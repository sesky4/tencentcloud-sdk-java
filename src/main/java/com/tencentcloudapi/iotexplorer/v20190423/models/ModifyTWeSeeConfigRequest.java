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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTWeSeeConfigRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 是否开启视频摘要，不传则不修改
    */
    @SerializedName("EnableSummary")
    @Expose
    private Boolean EnableSummary;

    /**
    * 是否开启视频搜索，不传则不修改
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * 配置参数，不传则不修改
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 通道ID 
     * @return ChannelId 通道ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID
     * @param ChannelId 通道ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 是否开启视频摘要，不传则不修改 
     * @return EnableSummary 是否开启视频摘要，不传则不修改
     */
    public Boolean getEnableSummary() {
        return this.EnableSummary;
    }

    /**
     * Set 是否开启视频摘要，不传则不修改
     * @param EnableSummary 是否开启视频摘要，不传则不修改
     */
    public void setEnableSummary(Boolean EnableSummary) {
        this.EnableSummary = EnableSummary;
    }

    /**
     * Get 是否开启视频搜索，不传则不修改 
     * @return EnableSearch 是否开启视频搜索，不传则不修改
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 是否开启视频搜索，不传则不修改
     * @param EnableSearch 是否开启视频搜索，不传则不修改
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get 配置参数，不传则不修改 
     * @return Config 配置参数，不传则不修改
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置参数，不传则不修改
     * @param Config 配置参数，不传则不修改
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public ModifyTWeSeeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTWeSeeConfigRequest(ModifyTWeSeeConfigRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.EnableSummary != null) {
            this.EnableSummary = new Boolean(source.EnableSummary);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "EnableSummary", this.EnableSummary);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

