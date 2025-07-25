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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPriceResponse extends AbstractModel {

    /**
    * 实例价格，单位：分。
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 实例原价，单位：分。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Long OriginalPrice;

    /**
    * 货币单位。CNY-人民币，USD-美元。
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例价格，单位：分。 
     * @return Price 实例价格，单位：分。
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 实例价格，单位：分。
     * @param Price 实例价格，单位：分。
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 实例原价，单位：分。 
     * @return OriginalPrice 实例原价，单位：分。
     */
    public Long getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 实例原价，单位：分。
     * @param OriginalPrice 实例原价，单位：分。
     */
    public void setOriginalPrice(Long OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 货币单位。CNY-人民币，USD-美元。 
     * @return Currency 货币单位。CNY-人民币，USD-美元。
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币单位。CNY-人民币，USD-美元。
     * @param Currency 货币单位。CNY-人民币，USD-美元。
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBPriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBPriceResponse(DescribeDBPriceResponse source) {
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Long(source.OriginalPrice);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

