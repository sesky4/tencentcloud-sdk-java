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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChunkDocument extends AbstractModel {

    /**
    * 文件类型，支持 MD，TXT 格式。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文本原文，使用字符串格式输入。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
     * Get 文件类型，支持 MD，TXT 格式。 
     * @return FileType 文件类型，支持 MD，TXT 格式。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，支持 MD，TXT 格式。
     * @param FileType 文件类型，支持 MD，TXT 格式。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文本原文，使用字符串格式输入。 
     * @return FileContent 文本原文，使用字符串格式输入。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文本原文，使用字符串格式输入。
     * @param FileContent 文本原文，使用字符串格式输入。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    public ChunkDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChunkDocument(ChunkDocument source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);

    }
}

