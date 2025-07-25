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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidApp extends AbstractModel {

    /**
    * 安卓应用 Id
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * 安卓应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 安卓应用状态（上架、下架）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 安卓应用版本列表
    */
    @SerializedName("AndroidAppVersionInfo")
    @Expose
    private AndroidAppVersionInfo [] AndroidAppVersionInfo;

    /**
    * 安卓应用创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户 Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）
    */
    @SerializedName("AppMode")
    @Expose
    private String AppMode;

    /**
    * 应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态
    */
    @SerializedName("UpdateState")
    @Expose
    private String UpdateState;

    /**
    * 安卓应用包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 安卓应用 Id 
     * @return AndroidAppId 安卓应用 Id
     */
    public String getAndroidAppId() {
        return this.AndroidAppId;
    }

    /**
     * Set 安卓应用 Id
     * @param AndroidAppId 安卓应用 Id
     */
    public void setAndroidAppId(String AndroidAppId) {
        this.AndroidAppId = AndroidAppId;
    }

    /**
     * Get 安卓应用名称 
     * @return Name 安卓应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安卓应用名称
     * @param Name 安卓应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 安卓应用状态（上架、下架） 
     * @return State 安卓应用状态（上架、下架）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 安卓应用状态（上架、下架）
     * @param State 安卓应用状态（上架、下架）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 安卓应用版本列表 
     * @return AndroidAppVersionInfo 安卓应用版本列表
     */
    public AndroidAppVersionInfo [] getAndroidAppVersionInfo() {
        return this.AndroidAppVersionInfo;
    }

    /**
     * Set 安卓应用版本列表
     * @param AndroidAppVersionInfo 安卓应用版本列表
     */
    public void setAndroidAppVersionInfo(AndroidAppVersionInfo [] AndroidAppVersionInfo) {
        this.AndroidAppVersionInfo = AndroidAppVersionInfo;
    }

    /**
     * Get 安卓应用创建时间 
     * @return CreateTime 安卓应用创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 安卓应用创建时间
     * @param CreateTime 安卓应用创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户 Id 
     * @return UserId 用户 Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 Id
     * @param UserId 用户 Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 应用模式（NORMAL : 普通模式；ADVANCED : 高级模式） 
     * @return AppMode 应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）
     */
    public String getAppMode() {
        return this.AppMode;
    }

    /**
     * Set 应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）
     * @param AppMode 应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）
     */
    public void setAppMode(String AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get 应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态 
     * @return UpdateState 应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态
     */
    public String getUpdateState() {
        return this.UpdateState;
    }

    /**
     * Set 应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态
     * @param UpdateState 应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态
     */
    public void setUpdateState(String UpdateState) {
        this.UpdateState = UpdateState;
    }

    /**
     * Get 安卓应用包名 
     * @return PackageName 安卓应用包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 安卓应用包名
     * @param PackageName 安卓应用包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public AndroidApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidApp(AndroidApp source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AndroidAppVersionInfo != null) {
            this.AndroidAppVersionInfo = new AndroidAppVersionInfo[source.AndroidAppVersionInfo.length];
            for (int i = 0; i < source.AndroidAppVersionInfo.length; i++) {
                this.AndroidAppVersionInfo[i] = new AndroidAppVersionInfo(source.AndroidAppVersionInfo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AppMode != null) {
            this.AppMode = new String(source.AppMode);
        }
        if (source.UpdateState != null) {
            this.UpdateState = new String(source.UpdateState);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "AndroidAppVersionInfo.", this.AndroidAppVersionInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "UpdateState", this.UpdateState);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

