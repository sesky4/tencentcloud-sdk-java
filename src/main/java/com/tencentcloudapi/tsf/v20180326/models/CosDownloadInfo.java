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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosDownloadInfo extends AbstractModel {

    /**
    * 桶名称
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 鉴权信息
    */
    @SerializedName("Credentials")
    @Expose
    private CosCredentials Credentials;

    /**
     * Get 桶名称 
     * @return Bucket 桶名称
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 桶名称
     * @param Bucket 桶名称
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 路径 
     * @return Path 路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 路径
     * @param Path 路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 鉴权信息 
     * @return Credentials 鉴权信息
     */
    public CosCredentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 鉴权信息
     * @param Credentials 鉴权信息
     */
    public void setCredentials(CosCredentials Credentials) {
        this.Credentials = Credentials;
    }

    public CosDownloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosDownloadInfo(CosDownloadInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Credentials != null) {
            this.Credentials = new CosCredentials(source.Credentials);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);

    }
}

