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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBandwidthPackageBandwidthRequest extends AbstractModel {

    /**
    * 带宽包限速大小。单位：Mbps。带宽包计费类型对应的带宽上下限可参考：[BandwidthRange](https://cloud.tencent.com/document/api/215/15824#BandwidthRange) 
    */
    @SerializedName("InternetMaxBandwidth")
    @Expose
    private Long InternetMaxBandwidth;

    /**
    * 共享带宽包ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get 带宽包限速大小。单位：Mbps。带宽包计费类型对应的带宽上下限可参考：[BandwidthRange](https://cloud.tencent.com/document/api/215/15824#BandwidthRange)  
     * @return InternetMaxBandwidth 带宽包限速大小。单位：Mbps。带宽包计费类型对应的带宽上下限可参考：[BandwidthRange](https://cloud.tencent.com/document/api/215/15824#BandwidthRange) 
     */
    public Long getInternetMaxBandwidth() {
        return this.InternetMaxBandwidth;
    }

    /**
     * Set 带宽包限速大小。单位：Mbps。带宽包计费类型对应的带宽上下限可参考：[BandwidthRange](https://cloud.tencent.com/document/api/215/15824#BandwidthRange) 
     * @param InternetMaxBandwidth 带宽包限速大小。单位：Mbps。带宽包计费类型对应的带宽上下限可参考：[BandwidthRange](https://cloud.tencent.com/document/api/215/15824#BandwidthRange) 
     */
    public void setInternetMaxBandwidth(Long InternetMaxBandwidth) {
        this.InternetMaxBandwidth = InternetMaxBandwidth;
    }

    /**
     * Get 共享带宽包ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。 
     * @return BandwidthPackageId 共享带宽包ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 共享带宽包ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     * @param BandwidthPackageId 共享带宽包ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/product/215/19209)接口查询BandwidthPackageId。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public ModifyBandwidthPackageBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBandwidthPackageBandwidthRequest(ModifyBandwidthPackageBandwidthRequest source) {
        if (source.InternetMaxBandwidth != null) {
            this.InternetMaxBandwidth = new Long(source.InternetMaxBandwidth);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetMaxBandwidth", this.InternetMaxBandwidth);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

