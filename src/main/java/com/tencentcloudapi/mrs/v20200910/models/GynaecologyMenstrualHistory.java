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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GynaecologyMenstrualHistory extends AbstractModel {

    /**
    * 妇科月经史总体描述
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
     * Get 妇科月经史总体描述 
     * @return Text 妇科月经史总体描述
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 妇科月经史总体描述
     * @param Text 妇科月经史总体描述
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    public GynaecologyMenstrualHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GynaecologyMenstrualHistory(GynaecologyMenstrualHistory source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);

    }
}

