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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * 会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 是否以流式接口的形式返回数据，默认true。
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 是否开启联网搜索。默认为 false。
    */
    @SerializedName("OnlineSearch")
    @Expose
    private Boolean OnlineSearch;

    /**
    * 当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。
    */
    @SerializedName("OnlineSearchOptions")
    @Expose
    private OnlineSearchOptions OnlineSearchOptions;

    /**
     * Get 会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。 
     * @return Messages 会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。
     * @param Messages 会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。 
     * @return ModelName 模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。
     * @param ModelName 模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 是否以流式接口的形式返回数据，默认true。 
     * @return Stream 是否以流式接口的形式返回数据，默认true。
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 是否以流式接口的形式返回数据，默认true。
     * @param Stream 是否以流式接口的形式返回数据，默认true。
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。 
     * @return TopP 取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。
     * @param TopP 取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。 
     * @return Temperature 取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。
     * @param Temperature 取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 是否开启联网搜索。默认为 false。 
     * @return OnlineSearch 是否开启联网搜索。默认为 false。
     */
    public Boolean getOnlineSearch() {
        return this.OnlineSearch;
    }

    /**
     * Set 是否开启联网搜索。默认为 false。
     * @param OnlineSearch 是否开启联网搜索。默认为 false。
     */
    public void setOnlineSearch(Boolean OnlineSearch) {
        this.OnlineSearch = OnlineSearch;
    }

    /**
     * Get 当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。 
     * @return OnlineSearchOptions 当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。
     */
    public OnlineSearchOptions getOnlineSearchOptions() {
        return this.OnlineSearchOptions;
    }

    /**
     * Set 当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。
     * @param OnlineSearchOptions 当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。
     */
    public void setOnlineSearchOptions(OnlineSearchOptions OnlineSearchOptions) {
        this.OnlineSearchOptions = OnlineSearchOptions;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.OnlineSearch != null) {
            this.OnlineSearch = new Boolean(source.OnlineSearch);
        }
        if (source.OnlineSearchOptions != null) {
            this.OnlineSearchOptions = new OnlineSearchOptions(source.OnlineSearchOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "OnlineSearch", this.OnlineSearch);
        this.setParamObj(map, prefix + "OnlineSearchOptions.", this.OnlineSearchOptions);

    }
}

