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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityControlTemplatesRequest extends AbstractModel {

    /**
    * 媒体质检模板唯一标识过滤条件，数组长度限制：100。
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * "Preset"：预设，Custom":自定义模板
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 媒体质检模板标识过滤条件，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 媒体质检模板唯一标识过滤条件，数组长度限制：100。 
     * @return Definitions 媒体质检模板唯一标识过滤条件，数组长度限制：100。
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set 媒体质检模板唯一标识过滤条件，数组长度限制：100。
     * @param Definitions 媒体质检模板唯一标识过滤条件，数组长度限制：100。
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li> 
     * @return Limit 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     * @param Limit 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get "Preset"：预设，Custom":自定义模板 
     * @return Type "Preset"：预设，Custom":自定义模板
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set "Preset"：预设，Custom":自定义模板
     * @param Type "Preset"：预设，Custom":自定义模板
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 媒体质检模板标识过滤条件，长度限制：64 个字符。 
     * @return Name 媒体质检模板标识过滤条件，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体质检模板标识过滤条件，长度限制：64 个字符。
     * @param Name 媒体质检模板标识过滤条件，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeQualityControlTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityControlTemplatesRequest(DescribeQualityControlTemplatesRequest source) {
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

