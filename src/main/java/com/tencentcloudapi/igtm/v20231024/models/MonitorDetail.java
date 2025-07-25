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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorDetail extends AbstractModel {

    /**
    * 探测规则id
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 监控器名称
    */
    @SerializedName("MonitorName")
    @Expose
    private String MonitorName;

    /**
    * 所属用户
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 监控节点id组
    */
    @SerializedName("DetectorGroupIds")
    @Expose
    private Long [] DetectorGroupIds;

    /**
    * 探测协议 PING TCP HTTP HTTPS
    */
    @SerializedName("CheckProtocol")
    @Expose
    private String CheckProtocol;

    /**
    * 探测周期
    */
    @SerializedName("CheckInterval")
    @Expose
    private Long CheckInterval;

    /**
    * 发包数量
    */
    @SerializedName("PingNum")
    @Expose
    private Long PingNum;

    /**
    * tcp端口
    */
    @SerializedName("TcpPort")
    @Expose
    private Long TcpPort;

    /**
    * 探测 host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 探测路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 返回值阈值
    */
    @SerializedName("ReturnCodeThreshold")
    @Expose
    private Long ReturnCodeThreshold;

    /**
    * 是否开启3xx重定向跟随 ENABLED DISABLED
    */
    @SerializedName("EnableRedirect")
    @Expose
    private String EnableRedirect;

    /**
    * 是否启用 sni
ENABLED DISABLED
    */
    @SerializedName("EnableSni")
    @Expose
    private String EnableSni;

    /**
    * 丢包率上限
    */
    @SerializedName("PacketLossRate")
    @Expose
    private Long PacketLossRate;

    /**
    * 探测超时
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 失败次数
    */
    @SerializedName("FailTimes")
    @Expose
    private Long FailTimes;

    /**
    * 失败率上限100
    */
    @SerializedName("FailRate")
    @Expose
    private Long FailRate;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 监控节点类型
AUTO INTERNAL OVERSEAS IPV6 ALL
    */
    @SerializedName("DetectorStyle")
    @Expose
    private String DetectorStyle;

    /**
    * 探测次数
    */
    @SerializedName("DetectNum")
    @Expose
    private Long DetectNum;

    /**
    * 持续周期数
    */
    @SerializedName("ContinuePeriod")
    @Expose
    private Long ContinuePeriod;

    /**
     * Get 探测规则id 
     * @return MonitorId 探测规则id
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 探测规则id
     * @param MonitorId 探测规则id
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监控器名称 
     * @return MonitorName 监控器名称
     */
    public String getMonitorName() {
        return this.MonitorName;
    }

    /**
     * Set 监控器名称
     * @param MonitorName 监控器名称
     */
    public void setMonitorName(String MonitorName) {
        this.MonitorName = MonitorName;
    }

    /**
     * Get 所属用户 
     * @return Uin 所属用户
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 所属用户
     * @param Uin 所属用户
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 监控节点id组 
     * @return DetectorGroupIds 监控节点id组
     */
    public Long [] getDetectorGroupIds() {
        return this.DetectorGroupIds;
    }

    /**
     * Set 监控节点id组
     * @param DetectorGroupIds 监控节点id组
     */
    public void setDetectorGroupIds(Long [] DetectorGroupIds) {
        this.DetectorGroupIds = DetectorGroupIds;
    }

    /**
     * Get 探测协议 PING TCP HTTP HTTPS 
     * @return CheckProtocol 探测协议 PING TCP HTTP HTTPS
     */
    public String getCheckProtocol() {
        return this.CheckProtocol;
    }

    /**
     * Set 探测协议 PING TCP HTTP HTTPS
     * @param CheckProtocol 探测协议 PING TCP HTTP HTTPS
     */
    public void setCheckProtocol(String CheckProtocol) {
        this.CheckProtocol = CheckProtocol;
    }

    /**
     * Get 探测周期 
     * @return CheckInterval 探测周期
     */
    public Long getCheckInterval() {
        return this.CheckInterval;
    }

    /**
     * Set 探测周期
     * @param CheckInterval 探测周期
     */
    public void setCheckInterval(Long CheckInterval) {
        this.CheckInterval = CheckInterval;
    }

    /**
     * Get 发包数量 
     * @return PingNum 发包数量
     */
    public Long getPingNum() {
        return this.PingNum;
    }

    /**
     * Set 发包数量
     * @param PingNum 发包数量
     */
    public void setPingNum(Long PingNum) {
        this.PingNum = PingNum;
    }

    /**
     * Get tcp端口 
     * @return TcpPort tcp端口
     */
    public Long getTcpPort() {
        return this.TcpPort;
    }

    /**
     * Set tcp端口
     * @param TcpPort tcp端口
     */
    public void setTcpPort(Long TcpPort) {
        this.TcpPort = TcpPort;
    }

    /**
     * Get 探测 host 
     * @return Host 探测 host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 探测 host
     * @param Host 探测 host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 探测路径 
     * @return Path 探测路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 探测路径
     * @param Path 探测路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 返回值阈值 
     * @return ReturnCodeThreshold 返回值阈值
     */
    public Long getReturnCodeThreshold() {
        return this.ReturnCodeThreshold;
    }

    /**
     * Set 返回值阈值
     * @param ReturnCodeThreshold 返回值阈值
     */
    public void setReturnCodeThreshold(Long ReturnCodeThreshold) {
        this.ReturnCodeThreshold = ReturnCodeThreshold;
    }

    /**
     * Get 是否开启3xx重定向跟随 ENABLED DISABLED 
     * @return EnableRedirect 是否开启3xx重定向跟随 ENABLED DISABLED
     */
    public String getEnableRedirect() {
        return this.EnableRedirect;
    }

    /**
     * Set 是否开启3xx重定向跟随 ENABLED DISABLED
     * @param EnableRedirect 是否开启3xx重定向跟随 ENABLED DISABLED
     */
    public void setEnableRedirect(String EnableRedirect) {
        this.EnableRedirect = EnableRedirect;
    }

    /**
     * Get 是否启用 sni
ENABLED DISABLED 
     * @return EnableSni 是否启用 sni
ENABLED DISABLED
     */
    public String getEnableSni() {
        return this.EnableSni;
    }

    /**
     * Set 是否启用 sni
ENABLED DISABLED
     * @param EnableSni 是否启用 sni
ENABLED DISABLED
     */
    public void setEnableSni(String EnableSni) {
        this.EnableSni = EnableSni;
    }

    /**
     * Get 丢包率上限 
     * @return PacketLossRate 丢包率上限
     */
    public Long getPacketLossRate() {
        return this.PacketLossRate;
    }

    /**
     * Set 丢包率上限
     * @param PacketLossRate 丢包率上限
     */
    public void setPacketLossRate(Long PacketLossRate) {
        this.PacketLossRate = PacketLossRate;
    }

    /**
     * Get 探测超时 
     * @return Timeout 探测超时
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 探测超时
     * @param Timeout 探测超时
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 失败次数 
     * @return FailTimes 失败次数
     */
    public Long getFailTimes() {
        return this.FailTimes;
    }

    /**
     * Set 失败次数
     * @param FailTimes 失败次数
     */
    public void setFailTimes(Long FailTimes) {
        this.FailTimes = FailTimes;
    }

    /**
     * Get 失败率上限100 
     * @return FailRate 失败率上限100
     */
    public Long getFailRate() {
        return this.FailRate;
    }

    /**
     * Set 失败率上限100
     * @param FailRate 失败率上限100
     */
    public void setFailRate(Long FailRate) {
        this.FailRate = FailRate;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 监控节点类型
AUTO INTERNAL OVERSEAS IPV6 ALL 
     * @return DetectorStyle 监控节点类型
AUTO INTERNAL OVERSEAS IPV6 ALL
     */
    public String getDetectorStyle() {
        return this.DetectorStyle;
    }

    /**
     * Set 监控节点类型
AUTO INTERNAL OVERSEAS IPV6 ALL
     * @param DetectorStyle 监控节点类型
AUTO INTERNAL OVERSEAS IPV6 ALL
     */
    public void setDetectorStyle(String DetectorStyle) {
        this.DetectorStyle = DetectorStyle;
    }

    /**
     * Get 探测次数 
     * @return DetectNum 探测次数
     */
    public Long getDetectNum() {
        return this.DetectNum;
    }

    /**
     * Set 探测次数
     * @param DetectNum 探测次数
     */
    public void setDetectNum(Long DetectNum) {
        this.DetectNum = DetectNum;
    }

    /**
     * Get 持续周期数 
     * @return ContinuePeriod 持续周期数
     */
    public Long getContinuePeriod() {
        return this.ContinuePeriod;
    }

    /**
     * Set 持续周期数
     * @param ContinuePeriod 持续周期数
     */
    public void setContinuePeriod(Long ContinuePeriod) {
        this.ContinuePeriod = ContinuePeriod;
    }

    public MonitorDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorDetail(MonitorDetail source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.MonitorName != null) {
            this.MonitorName = new String(source.MonitorName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DetectorGroupIds != null) {
            this.DetectorGroupIds = new Long[source.DetectorGroupIds.length];
            for (int i = 0; i < source.DetectorGroupIds.length; i++) {
                this.DetectorGroupIds[i] = new Long(source.DetectorGroupIds[i]);
            }
        }
        if (source.CheckProtocol != null) {
            this.CheckProtocol = new String(source.CheckProtocol);
        }
        if (source.CheckInterval != null) {
            this.CheckInterval = new Long(source.CheckInterval);
        }
        if (source.PingNum != null) {
            this.PingNum = new Long(source.PingNum);
        }
        if (source.TcpPort != null) {
            this.TcpPort = new Long(source.TcpPort);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ReturnCodeThreshold != null) {
            this.ReturnCodeThreshold = new Long(source.ReturnCodeThreshold);
        }
        if (source.EnableRedirect != null) {
            this.EnableRedirect = new String(source.EnableRedirect);
        }
        if (source.EnableSni != null) {
            this.EnableSni = new String(source.EnableSni);
        }
        if (source.PacketLossRate != null) {
            this.PacketLossRate = new Long(source.PacketLossRate);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.FailTimes != null) {
            this.FailTimes = new Long(source.FailTimes);
        }
        if (source.FailRate != null) {
            this.FailRate = new Long(source.FailRate);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.DetectorStyle != null) {
            this.DetectorStyle = new String(source.DetectorStyle);
        }
        if (source.DetectNum != null) {
            this.DetectNum = new Long(source.DetectNum);
        }
        if (source.ContinuePeriod != null) {
            this.ContinuePeriod = new Long(source.ContinuePeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "MonitorName", this.MonitorName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "DetectorGroupIds.", this.DetectorGroupIds);
        this.setParamSimple(map, prefix + "CheckProtocol", this.CheckProtocol);
        this.setParamSimple(map, prefix + "CheckInterval", this.CheckInterval);
        this.setParamSimple(map, prefix + "PingNum", this.PingNum);
        this.setParamSimple(map, prefix + "TcpPort", this.TcpPort);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ReturnCodeThreshold", this.ReturnCodeThreshold);
        this.setParamSimple(map, prefix + "EnableRedirect", this.EnableRedirect);
        this.setParamSimple(map, prefix + "EnableSni", this.EnableSni);
        this.setParamSimple(map, prefix + "PacketLossRate", this.PacketLossRate);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FailTimes", this.FailTimes);
        this.setParamSimple(map, prefix + "FailRate", this.FailRate);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "DetectorStyle", this.DetectorStyle);
        this.setParamSimple(map, prefix + "DetectNum", this.DetectNum);
        this.setParamSimple(map, prefix + "ContinuePeriod", this.ContinuePeriod);

    }
}

