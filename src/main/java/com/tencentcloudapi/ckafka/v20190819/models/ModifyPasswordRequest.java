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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPasswordRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户当前密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 用户新密码
    */
    @SerializedName("PasswordNew")
    @Expose
    private String PasswordNew;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户名称 
     * @return Name 用户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户名称
     * @param Name 用户名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户当前密码 
     * @return Password 用户当前密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 用户当前密码
     * @param Password 用户当前密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 用户新密码 
     * @return PasswordNew 用户新密码
     */
    public String getPasswordNew() {
        return this.PasswordNew;
    }

    /**
     * Set 用户新密码
     * @param PasswordNew 用户新密码
     */
    public void setPasswordNew(String PasswordNew) {
        this.PasswordNew = PasswordNew;
    }

    public ModifyPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPasswordRequest(ModifyPasswordRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.PasswordNew != null) {
            this.PasswordNew = new String(source.PasswordNew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "PasswordNew", this.PasswordNew);

    }
}

