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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFilesetsRequest extends AbstractModel {

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * FsetId列表
    */
    @SerializedName("FilesetIds")
    @Expose
    private String [] FilesetIds;

    /**
    * FsetDir列表
    */
    @SerializedName("FilesetDirs")
    @Expose
    private String [] FilesetDirs;

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get FsetId列表 
     * @return FilesetIds FsetId列表
     */
    public String [] getFilesetIds() {
        return this.FilesetIds;
    }

    /**
     * Set FsetId列表
     * @param FilesetIds FsetId列表
     */
    public void setFilesetIds(String [] FilesetIds) {
        this.FilesetIds = FilesetIds;
    }

    /**
     * Get FsetDir列表 
     * @return FilesetDirs FsetDir列表
     */
    public String [] getFilesetDirs() {
        return this.FilesetDirs;
    }

    /**
     * Set FsetDir列表
     * @param FilesetDirs FsetDir列表
     */
    public void setFilesetDirs(String [] FilesetDirs) {
        this.FilesetDirs = FilesetDirs;
    }

    public DescribeFilesetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFilesetsRequest(DescribeFilesetsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FilesetIds != null) {
            this.FilesetIds = new String[source.FilesetIds.length];
            for (int i = 0; i < source.FilesetIds.length; i++) {
                this.FilesetIds[i] = new String(source.FilesetIds[i]);
            }
        }
        if (source.FilesetDirs != null) {
            this.FilesetDirs = new String[source.FilesetDirs.length];
            for (int i = 0; i < source.FilesetDirs.length; i++) {
                this.FilesetDirs[i] = new String(source.FilesetDirs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamArraySimple(map, prefix + "FilesetIds.", this.FilesetIds);
        this.setParamArraySimple(map, prefix + "FilesetDirs.", this.FilesetDirs);

    }
}

