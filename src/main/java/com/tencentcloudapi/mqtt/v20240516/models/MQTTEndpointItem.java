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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTEndpointItem extends AbstractModel {

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 接入点
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * vpc信息
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网信息
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 主机
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 接入点ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 接入点 
     * @return Url 接入点
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 接入点
     * @param Url 接入点
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get vpc信息 
     * @return VpcId vpc信息
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc信息
     * @param VpcId vpc信息
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网信息 
     * @return SubnetId 子网信息
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网信息
     * @param SubnetId 子网信息
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 主机 
     * @return Host 主机
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机
     * @param Host 主机
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 接入点ip 
     * @return Ip 接入点ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 接入点ip
     * @param Ip 接入点ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public MQTTEndpointItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTEndpointItem(MQTTEndpointItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Ip", this.Ip);

    }
}

