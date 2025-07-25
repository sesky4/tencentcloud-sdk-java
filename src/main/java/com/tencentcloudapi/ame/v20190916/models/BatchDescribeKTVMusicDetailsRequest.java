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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeKTVMusicDetailsRequest extends AbstractModel {

    /**
    * 歌曲Id列表，注：列表最大长度为50
    */
    @SerializedName("MusicIds")
    @Expose
    private String [] MusicIds;

    /**
     * Get 歌曲Id列表，注：列表最大长度为50 
     * @return MusicIds 歌曲Id列表，注：列表最大长度为50
     */
    public String [] getMusicIds() {
        return this.MusicIds;
    }

    /**
     * Set 歌曲Id列表，注：列表最大长度为50
     * @param MusicIds 歌曲Id列表，注：列表最大长度为50
     */
    public void setMusicIds(String [] MusicIds) {
        this.MusicIds = MusicIds;
    }

    public BatchDescribeKTVMusicDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeKTVMusicDetailsRequest(BatchDescribeKTVMusicDetailsRequest source) {
        if (source.MusicIds != null) {
            this.MusicIds = new String[source.MusicIds.length];
            for (int i = 0; i < source.MusicIds.length; i++) {
                this.MusicIds[i] = new String(source.MusicIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MusicIds.", this.MusicIds);

    }
}

