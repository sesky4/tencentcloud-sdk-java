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

public class TerrorismConfigureInfo extends AbstractModel {

    /**
    * 画面涉敏任务控制参数。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfo ImgReviewInfo;

    /**
    * 文本涉敏任务控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get 画面涉敏任务控制参数。 
     * @return ImgReviewInfo 画面涉敏任务控制参数。
     */
    public TerrorismImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set 画面涉敏任务控制参数。
     * @param ImgReviewInfo 画面涉敏任务控制参数。
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get 文本涉敏任务控制参数。 
     * @return OcrReviewInfo 文本涉敏任务控制参数。
     */
    public TerrorismOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 文本涉敏任务控制参数。
     * @param OcrReviewInfo 文本涉敏任务控制参数。
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public TerrorismConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerrorismConfigureInfo(TerrorismConfigureInfo source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new TerrorismImgReviewTemplateInfo(source.ImgReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new TerrorismOcrReviewTemplateInfo(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

