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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateTemplateRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 模板ID，为32位字符串。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 操作类型，可取值如下:
<ul>
<li>DELETE:  删除</li>
<li>ENABLE: 启用</li>
<li>DISABLE: 停用</li>
<li>COPY: 复制新建</li>
</ul>
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 模板名称，长度不超过64字符。<br>
模板复制时指定有效，若为空，则复制后模板名称为 **原模板名称_副本**。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 模板ID，为32位字符串。 
     * @return TemplateId 模板ID，为32位字符串。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID，为32位字符串。
     * @param TemplateId 模板ID，为32位字符串。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 操作类型，可取值如下:
<ul>
<li>DELETE:  删除</li>
<li>ENABLE: 启用</li>
<li>DISABLE: 停用</li>
<li>COPY: 复制新建</li>
</ul> 
     * @return OperateType 操作类型，可取值如下:
<ul>
<li>DELETE:  删除</li>
<li>ENABLE: 启用</li>
<li>DISABLE: 停用</li>
<li>COPY: 复制新建</li>
</ul>
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型，可取值如下:
<ul>
<li>DELETE:  删除</li>
<li>ENABLE: 启用</li>
<li>DISABLE: 停用</li>
<li>COPY: 复制新建</li>
</ul>
     * @param OperateType 操作类型，可取值如下:
<ul>
<li>DELETE:  删除</li>
<li>ENABLE: 启用</li>
<li>DISABLE: 停用</li>
<li>COPY: 复制新建</li>
</ul>
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 模板名称，长度不超过64字符。<br>
模板复制时指定有效，若为空，则复制后模板名称为 **原模板名称_副本**。 
     * @return TemplateName 模板名称，长度不超过64字符。<br>
模板复制时指定有效，若为空，则复制后模板名称为 **原模板名称_副本**。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称，长度不超过64字符。<br>
模板复制时指定有效，若为空，则复制后模板名称为 **原模板名称_副本**。
     * @param TemplateName 模板名称，长度不超过64字符。<br>
模板复制时指定有效，若为空，则复制后模板名称为 **原模板名称_副本**。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    public OperateTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateTemplateRequest(OperateTemplateRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);

    }
}

