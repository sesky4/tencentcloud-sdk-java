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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoDownloadTask extends AbstractModel {

    /**
    * 下载任务 ID
    */
    @SerializedName("DownloadTaskId")
    @Expose
    private String DownloadTaskId;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 通道编码
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备编码
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
    * 任务状态（0：未执行；1：执行中；2 任务完成；
3：任务失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下载录像时间段
    */
    @SerializedName("VideoTimeSection")
    @Expose
    private String VideoTimeSection;

    /**
    * 倍速
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 下载时长
    */
    @SerializedName("DownloadTime")
    @Expose
    private Long DownloadTime;

    /**
    * 录像大小
    */
    @SerializedName("VideoSize")
    @Expose
    private Long VideoSize;

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 文件下载地址
    */
    @SerializedName("FileDownloadUrl")
    @Expose
    private String FileDownloadUrl;

    /**
    * 失败原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 生命周期规则，热存天数
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * mp4预览地址
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
     * Get 下载任务 ID 
     * @return DownloadTaskId 下载任务 ID
     */
    public String getDownloadTaskId() {
        return this.DownloadTaskId;
    }

    /**
     * Set 下载任务 ID
     * @param DownloadTaskId 下载任务 ID
     */
    public void setDownloadTaskId(String DownloadTaskId) {
        this.DownloadTaskId = DownloadTaskId;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通道名称 
     * @return ChannelName 通道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 通道名称
     * @param ChannelName 通道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 通道编码 
     * @return ChannelCode 通道编码
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 通道编码
     * @param ChannelCode 通道编码
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备编码 
     * @return DeviceCode 设备编码
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set 设备编码
     * @param DeviceCode 设备编码
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Get 任务状态（0：未执行；1：执行中；2 任务完成；
3：任务失败） 
     * @return Status 任务状态（0：未执行；1：执行中；2 任务完成；
3：任务失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（0：未执行；1：执行中；2 任务完成；
3：任务失败）
     * @param Status 任务状态（0：未执行；1：执行中；2 任务完成；
3：任务失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下载录像时间段 
     * @return VideoTimeSection 下载录像时间段
     */
    public String getVideoTimeSection() {
        return this.VideoTimeSection;
    }

    /**
     * Set 下载录像时间段
     * @param VideoTimeSection 下载录像时间段
     */
    public void setVideoTimeSection(String VideoTimeSection) {
        this.VideoTimeSection = VideoTimeSection;
    }

    /**
     * Get 倍速 
     * @return Scale 倍速
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 倍速
     * @param Scale 倍速
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 下载时长 
     * @return DownloadTime 下载时长
     */
    public Long getDownloadTime() {
        return this.DownloadTime;
    }

    /**
     * Set 下载时长
     * @param DownloadTime 下载时长
     */
    public void setDownloadTime(Long DownloadTime) {
        this.DownloadTime = DownloadTime;
    }

    /**
     * Get 录像大小 
     * @return VideoSize 录像大小
     */
    public Long getVideoSize() {
        return this.VideoSize;
    }

    /**
     * Set 录像大小
     * @param VideoSize 录像大小
     */
    public void setVideoSize(Long VideoSize) {
        this.VideoSize = VideoSize;
    }

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 文件下载地址 
     * @return FileDownloadUrl 文件下载地址
     */
    public String getFileDownloadUrl() {
        return this.FileDownloadUrl;
    }

    /**
     * Set 文件下载地址
     * @param FileDownloadUrl 文件下载地址
     */
    public void setFileDownloadUrl(String FileDownloadUrl) {
        this.FileDownloadUrl = FileDownloadUrl;
    }

    /**
     * Get 失败原因 
     * @return FailedReason 失败原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 失败原因
     * @param FailedReason 失败原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 生命周期规则，热存天数 
     * @return Expire 生命周期规则，热存天数
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set 生命周期规则，热存天数
     * @param Expire 生命周期规则，热存天数
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get mp4预览地址 
     * @return PreviewUrl mp4预览地址
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set mp4预览地址
     * @param PreviewUrl mp4预览地址
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    public VideoDownloadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoDownloadTask(VideoDownloadTask source) {
        if (source.DownloadTaskId != null) {
            this.DownloadTaskId = new String(source.DownloadTaskId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.DeviceCode != null) {
            this.DeviceCode = new String(source.DeviceCode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VideoTimeSection != null) {
            this.VideoTimeSection = new String(source.VideoTimeSection);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.DownloadTime != null) {
            this.DownloadTime = new Long(source.DownloadTime);
        }
        if (source.VideoSize != null) {
            this.VideoSize = new Long(source.VideoSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FileDownloadUrl != null) {
            this.FileDownloadUrl = new String(source.FileDownloadUrl);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadTaskId", this.DownloadTaskId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VideoTimeSection", this.VideoTimeSection);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DownloadTime", this.DownloadTime);
        this.setParamSimple(map, prefix + "VideoSize", this.VideoSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FileDownloadUrl", this.FileDownloadUrl);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);

    }
}

