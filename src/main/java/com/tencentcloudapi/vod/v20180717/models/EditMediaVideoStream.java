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

public class EditMediaVideoStream extends AbstractModel {

    /**
    * 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0 或不填时，表示由云点播自动设置码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为0，将自动为视频设置帧率。
默认值为 0。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * Get 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li> 
     * @return Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
     * @param Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0 或不填时，表示由云点播自动设置码率。 
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0 或不填时，表示由云点播自动设置码率。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0 或不填时，表示由云点播自动设置码率。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0 或不填时，表示由云点播自动设置码率。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。 
     * @return ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     * @param ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。 
     * @return Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。 
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率取基准分辨率；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按基准分辨率比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按基准分辨率比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为0，将自动为视频设置帧率。
默认值为 0。 
     * @return Fps 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为0，将自动为视频设置帧率。
默认值为 0。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为0，将自动为视频设置帧率。
默认值为 0。
     * @param Fps 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为0，将自动为视频设置帧率。
默认值为 0。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    public EditMediaVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaVideoStream(EditMediaVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

