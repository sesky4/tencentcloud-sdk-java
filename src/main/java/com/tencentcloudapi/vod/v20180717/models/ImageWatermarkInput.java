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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageWatermarkInput extends AbstractModel {

    /**
    * 水印图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。支持 jpeg、png、gif 图片格式。
    */
    @SerializedName("ImageContent")
    @Expose
    private String ImageContent;

    /**
    * 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。取值范围为[8, 4096]。</li>
默认值：10%。
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素。取值范围为0或[8, 4096]。</li>
默认值：0px，表示 Height 按照原始水印图片的宽高比缩放。
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束（默认值）。</li>
    */
    @SerializedName("RepeatType")
    @Expose
    private String RepeatType;

    /**
    * 图片透明度，取值范围：[0, 100]
<li>0：完全不透明</li>
<li>100：完全透明</li>
默认值：0。
    */
    @SerializedName("Transparency")
    @Expose
    private Long Transparency;

    /**
     * Get 水印图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。支持 jpeg、png、gif 图片格式。 
     * @return ImageContent 水印图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。支持 jpeg、png、gif 图片格式。
     */
    public String getImageContent() {
        return this.ImageContent;
    }

    /**
     * Set 水印图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。支持 jpeg、png、gif 图片格式。
     * @param ImageContent 水印图片 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。支持 jpeg、png、gif 图片格式。
     */
    public void setImageContent(String ImageContent) {
        this.ImageContent = ImageContent;
    }

    /**
     * Get 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。取值范围为[8, 4096]。</li>
默认值：10%。 
     * @return Width 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。取值范围为[8, 4096]。</li>
默认值：10%。
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。取值范围为[8, 4096]。</li>
默认值：10%。
     * @param Width 水印的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Width 为视频宽度的百分比大小，如 10% 表示 Width 为视频宽度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Width 单位为像素，如 100px 表示 Width 为 100 像素。取值范围为[8, 4096]。</li>
默认值：10%。
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素。取值范围为0或[8, 4096]。</li>
默认值：0px，表示 Height 按照原始水印图片的宽高比缩放。 
     * @return Height 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素。取值范围为0或[8, 4096]。</li>
默认值：0px，表示 Height 按照原始水印图片的宽高比缩放。
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素。取值范围为0或[8, 4096]。</li>
默认值：0px，表示 Height 按照原始水印图片的宽高比缩放。
     * @param Height 水印的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示水印 Height 为视频高度的百分比大小，如 10% 表示 Height 为视频高度的 10%；</li>
<li>当字符串以 px 结尾，表示水印 Height 单位为像素，如 100px 表示 Height 为 100 像素。取值范围为0或[8, 4096]。</li>
默认值：0px，表示 Height 按照原始水印图片的宽高比缩放。
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束（默认值）。</li> 
     * @return RepeatType 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束（默认值）。</li>
     */
    public String getRepeatType() {
        return this.RepeatType;
    }

    /**
     * Set 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束（默认值）。</li>
     * @param RepeatType 水印重复类型。使用场景：水印为动态图像。取值范围：
<li>once：动态水印播放完后，不再出现；</li>
<li>repeat_last_frame：水印播放完后，停留在最后一帧；</li>
<li>repeat：水印循环播放，直到视频结束（默认值）。</li>
     */
    public void setRepeatType(String RepeatType) {
        this.RepeatType = RepeatType;
    }

    /**
     * Get 图片透明度，取值范围：[0, 100]
<li>0：完全不透明</li>
<li>100：完全透明</li>
默认值：0。 
     * @return Transparency 图片透明度，取值范围：[0, 100]
<li>0：完全不透明</li>
<li>100：完全透明</li>
默认值：0。
     */
    public Long getTransparency() {
        return this.Transparency;
    }

    /**
     * Set 图片透明度，取值范围：[0, 100]
<li>0：完全不透明</li>
<li>100：完全透明</li>
默认值：0。
     * @param Transparency 图片透明度，取值范围：[0, 100]
<li>0：完全不透明</li>
<li>100：完全透明</li>
默认值：0。
     */
    public void setTransparency(Long Transparency) {
        this.Transparency = Transparency;
    }

    public ImageWatermarkInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageWatermarkInput(ImageWatermarkInput source) {
        if (source.ImageContent != null) {
            this.ImageContent = new String(source.ImageContent);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.RepeatType != null) {
            this.RepeatType = new String(source.RepeatType);
        }
        if (source.Transparency != null) {
            this.Transparency = new Long(source.Transparency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageContent", this.ImageContent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "RepeatType", this.RepeatType);
        this.setParamSimple(map, prefix + "Transparency", this.Transparency);

    }
}

