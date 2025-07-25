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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 入站规则
    */
    @SerializedName("InboundSet")
    @Expose
    private SecurityGroupPolicy [] InboundSet;

    /**
    * 出站规则
    */
    @SerializedName("OutboundSet")
    @Expose
    private SecurityGroupPolicy [] OutboundSet;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建时间，时间格式：yyyy-mm-dd hh:mm:ss 
     * @return CreateTime 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     * @param CreateTime 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 入站规则 
     * @return InboundSet 入站规则
     */
    public SecurityGroupPolicy [] getInboundSet() {
        return this.InboundSet;
    }

    /**
     * Set 入站规则
     * @param InboundSet 入站规则
     */
    public void setInboundSet(SecurityGroupPolicy [] InboundSet) {
        this.InboundSet = InboundSet;
    }

    /**
     * Get 出站规则 
     * @return OutboundSet 出站规则
     */
    public SecurityGroupPolicy [] getOutboundSet() {
        return this.OutboundSet;
    }

    /**
     * Set 出站规则
     * @param OutboundSet 出站规则
     */
    public void setOutboundSet(SecurityGroupPolicy [] OutboundSet) {
        this.OutboundSet = OutboundSet;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupId 安全组ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupId 安全组ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组名称 
     * @return SecurityGroupName 安全组名称
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set 安全组名称
     * @param SecurityGroupName 安全组名称
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get 安全组备注 
     * @return SecurityGroupRemark 安全组备注
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set 安全组备注
     * @param SecurityGroupRemark 安全组备注
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InboundSet != null) {
            this.InboundSet = new SecurityGroupPolicy[source.InboundSet.length];
            for (int i = 0; i < source.InboundSet.length; i++) {
                this.InboundSet[i] = new SecurityGroupPolicy(source.InboundSet[i]);
            }
        }
        if (source.OutboundSet != null) {
            this.OutboundSet = new SecurityGroupPolicy[source.OutboundSet.length];
            for (int i = 0; i < source.OutboundSet.length; i++) {
                this.OutboundSet[i] = new SecurityGroupPolicy(source.OutboundSet[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupRemark != null) {
            this.SecurityGroupRemark = new String(source.SecurityGroupRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "InboundSet.", this.InboundSet);
        this.setParamArrayObj(map, prefix + "OutboundSet.", this.OutboundSet);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);

    }
}

