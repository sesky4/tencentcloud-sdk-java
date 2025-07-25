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

public class Summary extends AbstractModel {

    /**
    * 症状
    */
    @SerializedName("Symptom")
    @Expose
    private SymptomInfo [] Symptom;

    /**
    * 文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 坐标
    */
    @SerializedName("Coords")
    @Expose
    private Coord [] Coords;

    /**
     * Get 症状 
     * @return Symptom 症状
     */
    public SymptomInfo [] getSymptom() {
        return this.Symptom;
    }

    /**
     * Set 症状
     * @param Symptom 症状
     */
    public void setSymptom(SymptomInfo [] Symptom) {
        this.Symptom = Symptom;
    }

    /**
     * Get 文本 
     * @return Text 文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 文本
     * @param Text 文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 坐标 
     * @return Coords 坐标
     */
    public Coord [] getCoords() {
        return this.Coords;
    }

    /**
     * Set 坐标
     * @param Coords 坐标
     */
    public void setCoords(Coord [] Coords) {
        this.Coords = Coords;
    }

    public Summary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Summary(Summary source) {
        if (source.Symptom != null) {
            this.Symptom = new SymptomInfo[source.Symptom.length];
            for (int i = 0; i < source.Symptom.length; i++) {
                this.Symptom[i] = new SymptomInfo(source.Symptom[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Coords != null) {
            this.Coords = new Coord[source.Coords.length];
            for (int i = 0; i < source.Coords.length; i++) {
                this.Coords[i] = new Coord(source.Coords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Symptom.", this.Symptom);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Coords.", this.Coords);

    }
}

