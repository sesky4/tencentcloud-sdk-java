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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubFolderInfo extends AbstractModel {

    /**
    * folder id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * folder name
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
     * Get folder id 
     * @return FolderId folder id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set folder id
     * @param FolderId folder id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get folder name 
     * @return FolderName folder name
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set folder name
     * @param FolderName folder name
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public SubFolderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubFolderInfo(SubFolderInfo source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);

    }
}

