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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatRollInvoiceInfo extends AbstractModel {

    /**
    * 识别出的字段名称(关键字)，支持以下字段：
发票代码、合计金额(小写)、合计金额(大写)、开票日期、发票号码、购买方识别号、销售方识别号、校验码、销售方名称、购买方名称、发票消费类型、省、市、是否有公司印章、单价、金额、数量、服务类型、品名、种类。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 文本行在旋转纠正之后的图像中的像素坐标。
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

    /**
     * Get 识别出的字段名称(关键字)，支持以下字段：
发票代码、合计金额(小写)、合计金额(大写)、开票日期、发票号码、购买方识别号、销售方识别号、校验码、销售方名称、购买方名称、发票消费类型、省、市、是否有公司印章、单价、金额、数量、服务类型、品名、种类。 
     * @return Name 识别出的字段名称(关键字)，支持以下字段：
发票代码、合计金额(小写)、合计金额(大写)、开票日期、发票号码、购买方识别号、销售方识别号、校验码、销售方名称、购买方名称、发票消费类型、省、市、是否有公司印章、单价、金额、数量、服务类型、品名、种类。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出的字段名称(关键字)，支持以下字段：
发票代码、合计金额(小写)、合计金额(大写)、开票日期、发票号码、购买方识别号、销售方识别号、校验码、销售方名称、购买方名称、发票消费类型、省、市、是否有公司印章、单价、金额、数量、服务类型、品名、种类。
     * @param Name 识别出的字段名称(关键字)，支持以下字段：
发票代码、合计金额(小写)、合计金额(大写)、开票日期、发票号码、购买方识别号、销售方识别号、校验码、销售方名称、购买方名称、发票消费类型、省、市、是否有公司印章、单价、金额、数量、服务类型、品名、种类。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。 
     * @return Value 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     * @param Value 识别出的字段名称对应的值，也就是字段Name对应的字符串结果。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 文本行在旋转纠正之后的图像中的像素坐标。 
     * @return Rect 文本行在旋转纠正之后的图像中的像素坐标。
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set 文本行在旋转纠正之后的图像中的像素坐标。
     * @param Rect 文本行在旋转纠正之后的图像中的像素坐标。
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    public VatRollInvoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatRollInvoiceInfo(VatRollInvoiceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Rect != null) {
            this.Rect = new Rect(source.Rect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "Rect.", this.Rect);

    }
}

