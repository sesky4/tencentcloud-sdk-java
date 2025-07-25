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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceMonitorDataRequest extends AbstractModel {

    /**
    * 开始时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 类型 支持 OnlineChannels/OnlineDevices/RecordingChannels
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 时间粒度 目前只支持 1h
    */
    @SerializedName("TimesSpec")
    @Expose
    private String TimesSpec;

    /**
     * Get 开始时间戳 
     * @return StartTime 开始时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳
     * @param StartTime 开始时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳 
     * @return EndTime 结束时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳
     * @param EndTime 结束时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 类型 支持 OnlineChannels/OnlineDevices/RecordingChannels 
     * @return Type 类型 支持 OnlineChannels/OnlineDevices/RecordingChannels
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 支持 OnlineChannels/OnlineDevices/RecordingChannels
     * @param Type 类型 支持 OnlineChannels/OnlineDevices/RecordingChannels
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 时间粒度 目前只支持 1h 
     * @return TimesSpec 时间粒度 目前只支持 1h
     */
    public String getTimesSpec() {
        return this.TimesSpec;
    }

    /**
     * Set 时间粒度 目前只支持 1h
     * @param TimesSpec 时间粒度 目前只支持 1h
     */
    public void setTimesSpec(String TimesSpec) {
        this.TimesSpec = TimesSpec;
    }

    public DescribeDeviceMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceMonitorDataRequest(DescribeDeviceMonitorDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TimesSpec != null) {
            this.TimesSpec = new String(source.TimesSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimesSpec", this.TimesSpec);

    }
}

