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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeLabelItem extends AbstractModel {

    /**
    * 标签id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * 标签名称，最大80个英文字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
     * Get 标签id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelId 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set 标签id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelId 标签id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get 标签名称，最大80个英文字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelName 标签名称，最大80个英文字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set 标签名称，最大80个英文字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelName 标签名称，最大80个英文字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    public AttributeLabelItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeLabelItem(AttributeLabelItem source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);

    }
}

