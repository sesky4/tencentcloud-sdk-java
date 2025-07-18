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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TotalStatus extends AbstractModel {

    /**
    * 正常状态的数目
    */
    @SerializedName("NormalCount")
    @Expose
    private Long NormalCount;

    /**
    * 通知状态的数目
    */
    @SerializedName("NotifyCount")
    @Expose
    private Long NotifyCount;

    /**
    * 异常状态的数目
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Long AbnormalCount;

    /**
     * Get 正常状态的数目 
     * @return NormalCount 正常状态的数目
     */
    public Long getNormalCount() {
        return this.NormalCount;
    }

    /**
     * Set 正常状态的数目
     * @param NormalCount 正常状态的数目
     */
    public void setNormalCount(Long NormalCount) {
        this.NormalCount = NormalCount;
    }

    /**
     * Get 通知状态的数目 
     * @return NotifyCount 通知状态的数目
     */
    public Long getNotifyCount() {
        return this.NotifyCount;
    }

    /**
     * Set 通知状态的数目
     * @param NotifyCount 通知状态的数目
     */
    public void setNotifyCount(Long NotifyCount) {
        this.NotifyCount = NotifyCount;
    }

    /**
     * Get 异常状态的数目 
     * @return AbnormalCount 异常状态的数目
     */
    public Long getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set 异常状态的数目
     * @param AbnormalCount 异常状态的数目
     */
    public void setAbnormalCount(Long AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    public TotalStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TotalStatus(TotalStatus source) {
        if (source.NormalCount != null) {
            this.NormalCount = new Long(source.NormalCount);
        }
        if (source.NotifyCount != null) {
            this.NotifyCount = new Long(source.NotifyCount);
        }
        if (source.AbnormalCount != null) {
            this.AbnormalCount = new Long(source.AbnormalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NormalCount", this.NormalCount);
        this.setParamSimple(map, prefix + "NotifyCount", this.NotifyCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

