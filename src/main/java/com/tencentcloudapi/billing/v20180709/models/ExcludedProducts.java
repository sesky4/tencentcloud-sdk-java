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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExcludedProducts extends AbstractModel {

    /**
    * 不适用商品名称
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
     * Get 不适用商品名称 
     * @return GoodsName 不适用商品名称
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * Set 不适用商品名称
     * @param GoodsName 不适用商品名称
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * Get postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。 
     * @return PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。
     * @param PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者"*"表示全部模式。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    public ExcludedProducts() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExcludedProducts(ExcludedProducts source) {
        if (source.GoodsName != null) {
            this.GoodsName = new String(source.GoodsName);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

