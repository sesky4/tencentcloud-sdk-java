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

public class CaCertificateItem extends AbstractModel {

    /**
    * 证书的公用名(Common Name)
    */
    @SerializedName("CaCn")
    @Expose
    private String CaCn;

    /**
    * 证书内容
    */
    @SerializedName("CaCertificate")
    @Expose
    private String CaCertificate;

    /**
    * 证书序列号
    */
    @SerializedName("CaSn")
    @Expose
    private String CaSn;

    /**
    * 证书格式，当前仅支持 PEM 格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 验证证书内容
    */
    @SerializedName("VerificationCertificate")
    @Expose
    private String VerificationCertificate;

    /**
    * CA证书的状态
    ACTIVE：激活
    INACTIVE：未激活
    REVOKED：吊销
    PENDING_ACTIVATION：注册待激活
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 上次激活时间，毫秒级时间戳 。
    */
    @SerializedName("LastActivationTime")
    @Expose
    private Long LastActivationTime;

    /**
    * 创建时间，毫秒级时间戳 。
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * 更新时间，毫秒级时间戳 。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 上次去激活时间，毫秒级时间戳 。
    */
    @SerializedName("LastInactivationTime")
    @Expose
    private Long LastInactivationTime;

    /**
    * Ca证书颁发者CN
    */
    @SerializedName("CaIssuerCn")
    @Expose
    private String CaIssuerCn;

    /**
    * 生效时间，毫秒级时间戳 。
    */
    @SerializedName("NotBeforeTime")
    @Expose
    private Long NotBeforeTime;

    /**
    * 失效时间，毫秒级时间戳 。
    */
    @SerializedName("NotAfterTime")
    @Expose
    private Long NotAfterTime;

    /**
     * Get 证书的公用名(Common Name) 
     * @return CaCn 证书的公用名(Common Name)
     */
    public String getCaCn() {
        return this.CaCn;
    }

    /**
     * Set 证书的公用名(Common Name)
     * @param CaCn 证书的公用名(Common Name)
     */
    public void setCaCn(String CaCn) {
        this.CaCn = CaCn;
    }

    /**
     * Get 证书内容 
     * @return CaCertificate 证书内容
     */
    public String getCaCertificate() {
        return this.CaCertificate;
    }

    /**
     * Set 证书内容
     * @param CaCertificate 证书内容
     */
    public void setCaCertificate(String CaCertificate) {
        this.CaCertificate = CaCertificate;
    }

    /**
     * Get 证书序列号 
     * @return CaSn 证书序列号
     */
    public String getCaSn() {
        return this.CaSn;
    }

    /**
     * Set 证书序列号
     * @param CaSn 证书序列号
     */
    public void setCaSn(String CaSn) {
        this.CaSn = CaSn;
    }

    /**
     * Get 证书格式，当前仅支持 PEM 格式 
     * @return Format 证书格式，当前仅支持 PEM 格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 证书格式，当前仅支持 PEM 格式
     * @param Format 证书格式，当前仅支持 PEM 格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 验证证书内容 
     * @return VerificationCertificate 验证证书内容
     */
    public String getVerificationCertificate() {
        return this.VerificationCertificate;
    }

    /**
     * Set 验证证书内容
     * @param VerificationCertificate 验证证书内容
     */
    public void setVerificationCertificate(String VerificationCertificate) {
        this.VerificationCertificate = VerificationCertificate;
    }

    /**
     * Get CA证书的状态
    ACTIVE：激活
    INACTIVE：未激活
    REVOKED：吊销
    PENDING_ACTIVATION：注册待激活 
     * @return Status CA证书的状态
    ACTIVE：激活
    INACTIVE：未激活
    REVOKED：吊销
    PENDING_ACTIVATION：注册待激活
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set CA证书的状态
    ACTIVE：激活
    INACTIVE：未激活
    REVOKED：吊销
    PENDING_ACTIVATION：注册待激活
     * @param Status CA证书的状态
    ACTIVE：激活
    INACTIVE：未激活
    REVOKED：吊销
    PENDING_ACTIVATION：注册待激活
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 上次激活时间，毫秒级时间戳 。 
     * @return LastActivationTime 上次激活时间，毫秒级时间戳 。
     */
    public Long getLastActivationTime() {
        return this.LastActivationTime;
    }

    /**
     * Set 上次激活时间，毫秒级时间戳 。
     * @param LastActivationTime 上次激活时间，毫秒级时间戳 。
     */
    public void setLastActivationTime(Long LastActivationTime) {
        this.LastActivationTime = LastActivationTime;
    }

    /**
     * Get 创建时间，毫秒级时间戳 。 
     * @return CreatedTime 创建时间，毫秒级时间戳 。
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，毫秒级时间戳 。
     * @param CreatedTime 创建时间，毫秒级时间戳 。
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间，毫秒级时间戳 。 
     * @return UpdateTime 更新时间，毫秒级时间戳 。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，毫秒级时间戳 。
     * @param UpdateTime 更新时间，毫秒级时间戳 。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 上次去激活时间，毫秒级时间戳 。 
     * @return LastInactivationTime 上次去激活时间，毫秒级时间戳 。
     */
    public Long getLastInactivationTime() {
        return this.LastInactivationTime;
    }

    /**
     * Set 上次去激活时间，毫秒级时间戳 。
     * @param LastInactivationTime 上次去激活时间，毫秒级时间戳 。
     */
    public void setLastInactivationTime(Long LastInactivationTime) {
        this.LastInactivationTime = LastInactivationTime;
    }

    /**
     * Get Ca证书颁发者CN 
     * @return CaIssuerCn Ca证书颁发者CN
     */
    public String getCaIssuerCn() {
        return this.CaIssuerCn;
    }

    /**
     * Set Ca证书颁发者CN
     * @param CaIssuerCn Ca证书颁发者CN
     */
    public void setCaIssuerCn(String CaIssuerCn) {
        this.CaIssuerCn = CaIssuerCn;
    }

    /**
     * Get 生效时间，毫秒级时间戳 。 
     * @return NotBeforeTime 生效时间，毫秒级时间戳 。
     */
    public Long getNotBeforeTime() {
        return this.NotBeforeTime;
    }

    /**
     * Set 生效时间，毫秒级时间戳 。
     * @param NotBeforeTime 生效时间，毫秒级时间戳 。
     */
    public void setNotBeforeTime(Long NotBeforeTime) {
        this.NotBeforeTime = NotBeforeTime;
    }

    /**
     * Get 失效时间，毫秒级时间戳 。 
     * @return NotAfterTime 失效时间，毫秒级时间戳 。
     */
    public Long getNotAfterTime() {
        return this.NotAfterTime;
    }

    /**
     * Set 失效时间，毫秒级时间戳 。
     * @param NotAfterTime 失效时间，毫秒级时间戳 。
     */
    public void setNotAfterTime(Long NotAfterTime) {
        this.NotAfterTime = NotAfterTime;
    }

    public CaCertificateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaCertificateItem(CaCertificateItem source) {
        if (source.CaCn != null) {
            this.CaCn = new String(source.CaCn);
        }
        if (source.CaCertificate != null) {
            this.CaCertificate = new String(source.CaCertificate);
        }
        if (source.CaSn != null) {
            this.CaSn = new String(source.CaSn);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.VerificationCertificate != null) {
            this.VerificationCertificate = new String(source.VerificationCertificate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastActivationTime != null) {
            this.LastActivationTime = new Long(source.LastActivationTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LastInactivationTime != null) {
            this.LastInactivationTime = new Long(source.LastInactivationTime);
        }
        if (source.CaIssuerCn != null) {
            this.CaIssuerCn = new String(source.CaIssuerCn);
        }
        if (source.NotBeforeTime != null) {
            this.NotBeforeTime = new Long(source.NotBeforeTime);
        }
        if (source.NotAfterTime != null) {
            this.NotAfterTime = new Long(source.NotAfterTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaCn", this.CaCn);
        this.setParamSimple(map, prefix + "CaCertificate", this.CaCertificate);
        this.setParamSimple(map, prefix + "CaSn", this.CaSn);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "VerificationCertificate", this.VerificationCertificate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastActivationTime", this.LastActivationTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastInactivationTime", this.LastInactivationTime);
        this.setParamSimple(map, prefix + "CaIssuerCn", this.CaIssuerCn);
        this.setParamSimple(map, prefix + "NotBeforeTime", this.NotBeforeTime);
        this.setParamSimple(map, prefix + "NotAfterTime", this.NotAfterTime);

    }
}

