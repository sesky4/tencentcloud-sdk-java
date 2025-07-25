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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigFilesByGroupRequest extends AbstractModel {

    /**
    * TSE实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 命名空间名
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 组名
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 返回数量，默认为20，最大值为100。	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get TSE实例id 
     * @return InstanceId TSE实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TSE实例id
     * @param InstanceId TSE实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 命名空间名 
     * @return Namespace 命名空间名
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名
     * @param Namespace 命名空间名
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 组名 
     * @return Group 组名
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 组名
     * @param Group 组名
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。	 
     * @return Limit 返回数量，默认为20，最大值为100。	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。	
     * @param Limit 返回数量，默认为20，最大值为100。	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。	 
     * @return Offset 偏移量，默认为0。	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。	
     * @param Offset 偏移量，默认为0。	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeConfigFilesByGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigFilesByGroupRequest(DescribeConfigFilesByGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

