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

public class ParseLiveStreamProcessNotificationRequest extends AbstractModel {

    /**
    * 从 CMQ 获取到的直播流事件通知内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 从 CMQ 获取到的直播流事件通知内容。 
     * @return Content 从 CMQ 获取到的直播流事件通知内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 从 CMQ 获取到的直播流事件通知内容。
     * @param Content 从 CMQ 获取到的直播流事件通知内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ParseLiveStreamProcessNotificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseLiveStreamProcessNotificationRequest(ParseLiveStreamProcessNotificationRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

