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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserAutonomyProfileRequest extends AbstractModel {

    /**
    * 配置类型，为需要配置的功能枚举值，目前包含一下枚举值：AutonomyGlobal（自治功能全局配置）、RedisAutoScaleUp（Redis自治扩容配置）
    */
    @SerializedName("ProfileType")
    @Expose
    private String ProfileType;

    /**
    * 实列ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 自治功能相关配置，标准JSON字符串格式。
    */
    @SerializedName("NewProfileInfo")
    @Expose
    private String NewProfileInfo;

    /**
     * Get 配置类型，为需要配置的功能枚举值，目前包含一下枚举值：AutonomyGlobal（自治功能全局配置）、RedisAutoScaleUp（Redis自治扩容配置） 
     * @return ProfileType 配置类型，为需要配置的功能枚举值，目前包含一下枚举值：AutonomyGlobal（自治功能全局配置）、RedisAutoScaleUp（Redis自治扩容配置）
     */
    public String getProfileType() {
        return this.ProfileType;
    }

    /**
     * Set 配置类型，为需要配置的功能枚举值，目前包含一下枚举值：AutonomyGlobal（自治功能全局配置）、RedisAutoScaleUp（Redis自治扩容配置）
     * @param ProfileType 配置类型，为需要配置的功能枚举值，目前包含一下枚举值：AutonomyGlobal（自治功能全局配置）、RedisAutoScaleUp（Redis自治扩容配置）
     */
    public void setProfileType(String ProfileType) {
        this.ProfileType = ProfileType;
    }

    /**
     * Get 实列ID。 
     * @return InstanceId 实列ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实列ID。
     * @param InstanceId 实列ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务产品类型，支持值包括： "redis" - 云数据库 Redis。 
     * @return Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     * @param Product 服务产品类型，支持值包括： "redis" - 云数据库 Redis。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 自治功能相关配置，标准JSON字符串格式。 
     * @return NewProfileInfo 自治功能相关配置，标准JSON字符串格式。
     */
    public String getNewProfileInfo() {
        return this.NewProfileInfo;
    }

    /**
     * Set 自治功能相关配置，标准JSON字符串格式。
     * @param NewProfileInfo 自治功能相关配置，标准JSON字符串格式。
     */
    public void setNewProfileInfo(String NewProfileInfo) {
        this.NewProfileInfo = NewProfileInfo;
    }

    public ModifyUserAutonomyProfileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserAutonomyProfileRequest(ModifyUserAutonomyProfileRequest source) {
        if (source.ProfileType != null) {
            this.ProfileType = new String(source.ProfileType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.NewProfileInfo != null) {
            this.NewProfileInfo = new String(source.NewProfileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProfileType", this.ProfileType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "NewProfileInfo", this.NewProfileInfo);

    }
}

