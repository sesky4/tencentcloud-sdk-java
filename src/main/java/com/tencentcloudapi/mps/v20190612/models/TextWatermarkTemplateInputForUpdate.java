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

public class TextWatermarkTemplateInputForUpdate extends AbstractModel {

    /**
    * 字体类型，目前可以支持两种：
<li>simkai.ttf：可以支持中文和英文；</li>
<li>arial.ttf：仅支持英文。</li>
    */
    @SerializedName("FontType")
    @Expose
    private String FontType;

    /**
    * 字体大小，格式：Npx，N 为数值。N的取值范围：[0,1] 和 [8, 4096]
    */
    @SerializedName("FontSize")
    @Expose
    private String FontSize;

    /**
    * 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
    */
    @SerializedName("FontColor")
    @Expose
    private String FontColor;

    /**
    * 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
    */
    @SerializedName("FontAlpha")
    @Expose
    private Float FontAlpha;

    /**
    * 文字内容，长度不超过100个字符。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
     * Get 字体类型，目前可以支持两种：
<li>simkai.ttf：可以支持中文和英文；</li>
<li>arial.ttf：仅支持英文。</li> 
     * @return FontType 字体类型，目前可以支持两种：
<li>simkai.ttf：可以支持中文和英文；</li>
<li>arial.ttf：仅支持英文。</li>
     */
    public String getFontType() {
        return this.FontType;
    }

    /**
     * Set 字体类型，目前可以支持两种：
<li>simkai.ttf：可以支持中文和英文；</li>
<li>arial.ttf：仅支持英文。</li>
     * @param FontType 字体类型，目前可以支持两种：
<li>simkai.ttf：可以支持中文和英文；</li>
<li>arial.ttf：仅支持英文。</li>
     */
    public void setFontType(String FontType) {
        this.FontType = FontType;
    }

    /**
     * Get 字体大小，格式：Npx，N 为数值。N的取值范围：[0,1] 和 [8, 4096] 
     * @return FontSize 字体大小，格式：Npx，N 为数值。N的取值范围：[0,1] 和 [8, 4096]
     */
    public String getFontSize() {
        return this.FontSize;
    }

    /**
     * Set 字体大小，格式：Npx，N 为数值。N的取值范围：[0,1] 和 [8, 4096]
     * @param FontSize 字体大小，格式：Npx，N 为数值。N的取值范围：[0,1] 和 [8, 4096]
     */
    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    /**
     * Get 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。 
     * @return FontColor 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
     */
    public String getFontColor() {
        return this.FontColor;
    }

    /**
     * Set 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
     * @param FontColor 字体颜色，格式：0xRRGGBB，默认值：0xFFFFFF（白色）。
     */
    public void setFontColor(String FontColor) {
        this.FontColor = FontColor;
    }

    /**
     * Get 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li> 
     * @return FontAlpha 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
     */
    public Float getFontAlpha() {
        return this.FontAlpha;
    }

    /**
     * Set 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
     * @param FontAlpha 文字透明度，取值范围：(0, 1]
<li>0：完全透明</li>
<li>1：完全不透明</li>
     */
    public void setFontAlpha(Float FontAlpha) {
        this.FontAlpha = FontAlpha;
    }

    /**
     * Get 文字内容，长度不超过100个字符。 
     * @return TextContent 文字内容，长度不超过100个字符。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set 文字内容，长度不超过100个字符。
     * @param TextContent 文字内容，长度不超过100个字符。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    public TextWatermarkTemplateInputForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextWatermarkTemplateInputForUpdate(TextWatermarkTemplateInputForUpdate source) {
        if (source.FontType != null) {
            this.FontType = new String(source.FontType);
        }
        if (source.FontSize != null) {
            this.FontSize = new String(source.FontSize);
        }
        if (source.FontColor != null) {
            this.FontColor = new String(source.FontColor);
        }
        if (source.FontAlpha != null) {
            this.FontAlpha = new Float(source.FontAlpha);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FontType", this.FontType);
        this.setParamSimple(map, prefix + "FontSize", this.FontSize);
        this.setParamSimple(map, prefix + "FontColor", this.FontColor);
        this.setParamSimple(map, prefix + "FontAlpha", this.FontAlpha);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);

    }
}

