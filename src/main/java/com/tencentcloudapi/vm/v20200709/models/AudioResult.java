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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResult extends AbstractModel {

    /**
    * 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
    * 命中的标签
Porn 色情
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
Moan 呻吟
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 得分，0-100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 音频ASR文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 音频片段存储URL，有效期为1天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 音频时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 拓展字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 文本审核结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextResults")
    @Expose
    private AudioResultDetailTextResult [] TextResults;

    /**
    * 音频呻吟审核结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MoanResults")
    @Expose
    private AudioResultDetailMoanResult [] MoanResults;

    /**
    * 音频语种检测结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanguageResults")
    @Expose
    private AudioResultDetailLanguageResult [] LanguageResults;

    /**
     * Get 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitFlag 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitFlag 是否命中
0 未命中
1 命中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    /**
     * Get 命中的标签
Porn 色情
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
Moan 呻吟
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 命中的标签
Porn 色情
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
Moan 呻吟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 命中的标签
Porn 色情
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
Moan 呻吟
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 命中的标签
Porn 色情
Polity 政治
Illegal 违法
Abuse 谩骂
Terror 暴恐
Ad 广告
Moan 呻吟
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 审核建议，可选值：
Pass 通过，
Review 建议人审，
Block 确认违规
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 得分，0-100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 得分，0-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 得分，0-100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 得分，0-100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 音频ASR文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 音频ASR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 音频ASR文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 音频ASR文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 音频片段存储URL，有效期为1天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 音频片段存储URL，有效期为1天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 音频片段存储URL，有效期为1天
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 音频片段存储URL，有效期为1天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 音频时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 音频时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 音频时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 音频时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 拓展字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 拓展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 拓展字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 拓展字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 文本审核结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextResults 文本审核结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioResultDetailTextResult [] getTextResults() {
        return this.TextResults;
    }

    /**
     * Set 文本审核结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextResults 文本审核结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextResults(AudioResultDetailTextResult [] TextResults) {
        this.TextResults = TextResults;
    }

    /**
     * Get 音频呻吟审核结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MoanResults 音频呻吟审核结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioResultDetailMoanResult [] getMoanResults() {
        return this.MoanResults;
    }

    /**
     * Set 音频呻吟审核结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param MoanResults 音频呻吟审核结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMoanResults(AudioResultDetailMoanResult [] MoanResults) {
        this.MoanResults = MoanResults;
    }

    /**
     * Get 音频语种检测结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanguageResults 音频语种检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioResultDetailLanguageResult [] getLanguageResults() {
        return this.LanguageResults;
    }

    /**
     * Set 音频语种检测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanguageResults 音频语种检测结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanguageResults(AudioResultDetailLanguageResult [] LanguageResults) {
        this.LanguageResults = LanguageResults;
    }

    public AudioResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResult(AudioResult source) {
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.TextResults != null) {
            this.TextResults = new AudioResultDetailTextResult[source.TextResults.length];
            for (int i = 0; i < source.TextResults.length; i++) {
                this.TextResults[i] = new AudioResultDetailTextResult(source.TextResults[i]);
            }
        }
        if (source.MoanResults != null) {
            this.MoanResults = new AudioResultDetailMoanResult[source.MoanResults.length];
            for (int i = 0; i < source.MoanResults.length; i++) {
                this.MoanResults[i] = new AudioResultDetailMoanResult(source.MoanResults[i]);
            }
        }
        if (source.LanguageResults != null) {
            this.LanguageResults = new AudioResultDetailLanguageResult[source.LanguageResults.length];
            for (int i = 0; i < source.LanguageResults.length; i++) {
                this.LanguageResults[i] = new AudioResultDetailLanguageResult(source.LanguageResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamArrayObj(map, prefix + "TextResults.", this.TextResults);
        this.setParamArrayObj(map, prefix + "MoanResults.", this.MoanResults);
        this.setParamArrayObj(map, prefix + "LanguageResults.", this.LanguageResults);

    }
}

