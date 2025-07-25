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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaffInfo extends AbstractModel {

    /**
    * 座席名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 座席邮箱
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 座席电话号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 座席昵称
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 座席工号
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * 用户角色 ID，一个用户绑定了多个角色时以RoleIdList为准
    */
    @SerializedName("RoleId")
    @Expose
    private Long RoleId;

    /**
    * 用户角色id列表
    */
    @SerializedName("RoleIdList")
    @Expose
    private Long RoleIdList;

    /**
    * 用户角色id列表
    */
    @SerializedName("RoleList")
    @Expose
    private Long [] RoleList;

    /**
    * 所属技能组列表
    */
    @SerializedName("SkillGroupList")
    @Expose
    private SkillGroupItem [] SkillGroupList;

    /**
    * 最后修改时间
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * 座席分机号（1 到 8 打头，4 - 6 位）
    */
    @SerializedName("ExtensionNumber")
    @Expose
    private String ExtensionNumber;

    /**
    * 呼叫转移配置
    */
    @SerializedName("ForwardingConfig")
    @Expose
    private ForwardingConfig ForwardingConfig;

    /**
     * Get 座席名称 
     * @return Name 座席名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 座席名称
     * @param Name 座席名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 座席邮箱 
     * @return Mail 座席邮箱
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 座席邮箱
     * @param Mail 座席邮箱
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 座席电话号码 
     * @return Phone 座席电话号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 座席电话号码
     * @param Phone 座席电话号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 座席昵称 
     * @return Nick 座席昵称
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 座席昵称
     * @param Nick 座席昵称
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 座席工号 
     * @return StaffNumber 座席工号
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 座席工号
     * @param StaffNumber 座席工号
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get 用户角色 ID，一个用户绑定了多个角色时以RoleIdList为准 
     * @return RoleId 用户角色 ID，一个用户绑定了多个角色时以RoleIdList为准
     * @deprecated
     */
    @Deprecated
    public Long getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 用户角色 ID，一个用户绑定了多个角色时以RoleIdList为准
     * @param RoleId 用户角色 ID，一个用户绑定了多个角色时以RoleIdList为准
     * @deprecated
     */
    @Deprecated
    public void setRoleId(Long RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 用户角色id列表 
     * @return RoleIdList 用户角色id列表
     * @deprecated
     */
    @Deprecated
    public Long getRoleIdList() {
        return this.RoleIdList;
    }

    /**
     * Set 用户角色id列表
     * @param RoleIdList 用户角色id列表
     * @deprecated
     */
    @Deprecated
    public void setRoleIdList(Long RoleIdList) {
        this.RoleIdList = RoleIdList;
    }

    /**
     * Get 用户角色id列表 
     * @return RoleList 用户角色id列表
     */
    public Long [] getRoleList() {
        return this.RoleList;
    }

    /**
     * Set 用户角色id列表
     * @param RoleList 用户角色id列表
     */
    public void setRoleList(Long [] RoleList) {
        this.RoleList = RoleList;
    }

    /**
     * Get 所属技能组列表 
     * @return SkillGroupList 所属技能组列表
     */
    public SkillGroupItem [] getSkillGroupList() {
        return this.SkillGroupList;
    }

    /**
     * Set 所属技能组列表
     * @param SkillGroupList 所属技能组列表
     */
    public void setSkillGroupList(SkillGroupItem [] SkillGroupList) {
        this.SkillGroupList = SkillGroupList;
    }

    /**
     * Get 最后修改时间 
     * @return LastModifyTimestamp 最后修改时间
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set 最后修改时间
     * @param LastModifyTimestamp 最后修改时间
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get 座席分机号（1 到 8 打头，4 - 6 位） 
     * @return ExtensionNumber 座席分机号（1 到 8 打头，4 - 6 位）
     */
    public String getExtensionNumber() {
        return this.ExtensionNumber;
    }

    /**
     * Set 座席分机号（1 到 8 打头，4 - 6 位）
     * @param ExtensionNumber 座席分机号（1 到 8 打头，4 - 6 位）
     */
    public void setExtensionNumber(String ExtensionNumber) {
        this.ExtensionNumber = ExtensionNumber;
    }

    /**
     * Get 呼叫转移配置 
     * @return ForwardingConfig 呼叫转移配置
     */
    public ForwardingConfig getForwardingConfig() {
        return this.ForwardingConfig;
    }

    /**
     * Set 呼叫转移配置
     * @param ForwardingConfig 呼叫转移配置
     */
    public void setForwardingConfig(ForwardingConfig ForwardingConfig) {
        this.ForwardingConfig = ForwardingConfig;
    }

    public StaffInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaffInfo(StaffInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
        if (source.RoleId != null) {
            this.RoleId = new Long(source.RoleId);
        }
        if (source.RoleIdList != null) {
            this.RoleIdList = new Long(source.RoleIdList);
        }
        if (source.RoleList != null) {
            this.RoleList = new Long[source.RoleList.length];
            for (int i = 0; i < source.RoleList.length; i++) {
                this.RoleList[i] = new Long(source.RoleList[i]);
            }
        }
        if (source.SkillGroupList != null) {
            this.SkillGroupList = new SkillGroupItem[source.SkillGroupList.length];
            for (int i = 0; i < source.SkillGroupList.length; i++) {
                this.SkillGroupList[i] = new SkillGroupItem(source.SkillGroupList[i]);
            }
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
        }
        if (source.ExtensionNumber != null) {
            this.ExtensionNumber = new String(source.ExtensionNumber);
        }
        if (source.ForwardingConfig != null) {
            this.ForwardingConfig = new ForwardingConfig(source.ForwardingConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleIdList", this.RoleIdList);
        this.setParamArraySimple(map, prefix + "RoleList.", this.RoleList);
        this.setParamArrayObj(map, prefix + "SkillGroupList.", this.SkillGroupList);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamSimple(map, prefix + "ExtensionNumber", this.ExtensionNumber);
        this.setParamObj(map, prefix + "ForwardingConfig.", this.ForwardingConfig);

    }
}

