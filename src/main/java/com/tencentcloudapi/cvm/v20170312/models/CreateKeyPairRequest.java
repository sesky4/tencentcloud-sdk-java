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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyPairRequest extends AbstractModel {

    /**
    * 密钥对名称，可由数字、字母和下划线组成，长度不超过25个字符。密钥对名称不能和已经存在的密钥对名称重复。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥对创建后所属的项目ID，ProjectId为0表示默认项目。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。</li>
<li>通过调用接口 [DescribeProjects](https://cloud.tencent.com/document/api/651/78725)，取返回信息中的`projectId `获取项目ID。</li>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到密钥对。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get 密钥对名称，可由数字、字母和下划线组成，长度不超过25个字符。密钥对名称不能和已经存在的密钥对名称重复。 
     * @return KeyName 密钥对名称，可由数字、字母和下划线组成，长度不超过25个字符。密钥对名称不能和已经存在的密钥对名称重复。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 密钥对名称，可由数字、字母和下划线组成，长度不超过25个字符。密钥对名称不能和已经存在的密钥对名称重复。
     * @param KeyName 密钥对名称，可由数字、字母和下划线组成，长度不超过25个字符。密钥对名称不能和已经存在的密钥对名称重复。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 密钥对创建后所属的项目ID，ProjectId为0表示默认项目。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。</li>
<li>通过调用接口 [DescribeProjects](https://cloud.tencent.com/document/api/651/78725)，取返回信息中的`projectId `获取项目ID。</li> 
     * @return ProjectId 密钥对创建后所属的项目ID，ProjectId为0表示默认项目。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。</li>
<li>通过调用接口 [DescribeProjects](https://cloud.tencent.com/document/api/651/78725)，取返回信息中的`projectId `获取项目ID。</li>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 密钥对创建后所属的项目ID，ProjectId为0表示默认项目。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。</li>
<li>通过调用接口 [DescribeProjects](https://cloud.tencent.com/document/api/651/78725)，取返回信息中的`projectId `获取项目ID。</li>
     * @param ProjectId 密钥对创建后所属的项目ID，ProjectId为0表示默认项目。
可以通过以下方式获取项目ID：
<li>通过项目列表查询项目ID。</li>
<li>通过调用接口 [DescribeProjects](https://cloud.tencent.com/document/api/651/78725)，取返回信息中的`projectId `获取项目ID。</li>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到密钥对。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到密钥对。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到密钥对。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到密钥对。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateKeyPairRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyPairRequest(CreateKeyPairRequest source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

