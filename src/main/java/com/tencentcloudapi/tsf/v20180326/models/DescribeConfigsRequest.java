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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigsRequest extends AbstractModel {

    /**
    * 应用ID，不传入时查询全量
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 配置项ID，不传入时查询全量，高优先级
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 配置项ID列表，不传入时查询全量，低优先级
    */
    @SerializedName("ConfigIdList")
    @Expose
    private String [] ConfigIdList;

    /**
    * 配置项名称，精确查询，不传入时查询全量
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项版本，精确查询，不传入时查询全量
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
     * Get 应用ID，不传入时查询全量 
     * @return ApplicationId 应用ID，不传入时查询全量
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，不传入时查询全量
     * @param ApplicationId 应用ID，不传入时查询全量
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 配置项ID，不传入时查询全量，高优先级 
     * @return ConfigId 配置项ID，不传入时查询全量，高优先级
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID，不传入时查询全量，高优先级
     * @param ConfigId 配置项ID，不传入时查询全量，高优先级
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 配置项ID列表，不传入时查询全量，低优先级 
     * @return ConfigIdList 配置项ID列表，不传入时查询全量，低优先级
     */
    public String [] getConfigIdList() {
        return this.ConfigIdList;
    }

    /**
     * Set 配置项ID列表，不传入时查询全量，低优先级
     * @param ConfigIdList 配置项ID列表，不传入时查询全量，低优先级
     */
    public void setConfigIdList(String [] ConfigIdList) {
        this.ConfigIdList = ConfigIdList;
    }

    /**
     * Get 配置项名称，精确查询，不传入时查询全量 
     * @return ConfigName 配置项名称，精确查询，不传入时查询全量
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称，精确查询，不传入时查询全量
     * @param ConfigName 配置项名称，精确查询，不传入时查询全量
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项版本，精确查询，不传入时查询全量 
     * @return ConfigVersion 配置项版本，精确查询，不传入时查询全量
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * Set 配置项版本，精确查询，不传入时查询全量
     * @param ConfigVersion 配置项版本，精确查询，不传入时查询全量
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    public DescribeConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigsRequest(DescribeConfigsRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ConfigIdList != null) {
            this.ConfigIdList = new String[source.ConfigIdList.length];
            for (int i = 0; i < source.ConfigIdList.length; i++) {
                this.ConfigIdList[i] = new String(source.ConfigIdList[i]);
            }
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigVersion != null) {
            this.ConfigVersion = new String(source.ConfigVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ConfigIdList.", this.ConfigIdList);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);

    }
}

