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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSCIMCredentialRequest extends AbstractModel {

    /**
    * 空间ID。z-前缀开头，后面是12位随机数字/小写字母
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 过期时间（秒），最小1小时，最大99年。如果不传则默认一年过期
    */
    @SerializedName("ExpireDuration")
    @Expose
    private Long ExpireDuration;

    /**
     * Get 空间ID。z-前缀开头，后面是12位随机数字/小写字母 
     * @return ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     * @param ZoneId 空间ID。z-前缀开头，后面是12位随机数字/小写字母
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 过期时间（秒），最小1小时，最大99年。如果不传则默认一年过期 
     * @return ExpireDuration 过期时间（秒），最小1小时，最大99年。如果不传则默认一年过期
     */
    public Long getExpireDuration() {
        return this.ExpireDuration;
    }

    /**
     * Set 过期时间（秒），最小1小时，最大99年。如果不传则默认一年过期
     * @param ExpireDuration 过期时间（秒），最小1小时，最大99年。如果不传则默认一年过期
     */
    public void setExpireDuration(Long ExpireDuration) {
        this.ExpireDuration = ExpireDuration;
    }

    public CreateSCIMCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSCIMCredentialRequest(CreateSCIMCredentialRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ExpireDuration != null) {
            this.ExpireDuration = new Long(source.ExpireDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ExpireDuration", this.ExpireDuration);

    }
}

