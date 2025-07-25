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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * 需要过滤的字段。过滤条件数量限制为10。
Name可选值：VpcId, SubnetId, ClsTopicId, ClsLogsetId, Role, CfsId, CfsMountInsId, Eip；Values 长度限制为1。
Name可选值：Status, Runtime, FunctionType, PublicNetStatus, AsyncRunEnable, TraceEnable；Values 长度限制为20。
当 Name = Runtime 时，CustomImage 表示过滤镜像类型函数。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段的过滤值。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 需要过滤的字段。过滤条件数量限制为10。
Name可选值：VpcId, SubnetId, ClsTopicId, ClsLogsetId, Role, CfsId, CfsMountInsId, Eip；Values 长度限制为1。
Name可选值：Status, Runtime, FunctionType, PublicNetStatus, AsyncRunEnable, TraceEnable；Values 长度限制为20。
当 Name = Runtime 时，CustomImage 表示过滤镜像类型函数。 
     * @return Name 需要过滤的字段。过滤条件数量限制为10。
Name可选值：VpcId, SubnetId, ClsTopicId, ClsLogsetId, Role, CfsId, CfsMountInsId, Eip；Values 长度限制为1。
Name可选值：Status, Runtime, FunctionType, PublicNetStatus, AsyncRunEnable, TraceEnable；Values 长度限制为20。
当 Name = Runtime 时，CustomImage 表示过滤镜像类型函数。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 需要过滤的字段。过滤条件数量限制为10。
Name可选值：VpcId, SubnetId, ClsTopicId, ClsLogsetId, Role, CfsId, CfsMountInsId, Eip；Values 长度限制为1。
Name可选值：Status, Runtime, FunctionType, PublicNetStatus, AsyncRunEnable, TraceEnable；Values 长度限制为20。
当 Name = Runtime 时，CustomImage 表示过滤镜像类型函数。
     * @param Name 需要过滤的字段。过滤条件数量限制为10。
Name可选值：VpcId, SubnetId, ClsTopicId, ClsLogsetId, Role, CfsId, CfsMountInsId, Eip；Values 长度限制为1。
Name可选值：Status, Runtime, FunctionType, PublicNetStatus, AsyncRunEnable, TraceEnable；Values 长度限制为20。
当 Name = Runtime 时，CustomImage 表示过滤镜像类型函数。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段的过滤值。 
     * @return Values 字段的过滤值。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 字段的过滤值。
     * @param Values 字段的过滤值。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

