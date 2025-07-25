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
package com.tencentcloudapi.vm.v20200709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvilCount extends AbstractModel {

    /**
    * 违规类型：
Terror	24001
Porn	20002
Polity	20001
Ad	20105
Abuse	20007	
Illegal	20006	
Spam	25001	
Moan	26001
    */
    @SerializedName("EvilType")
    @Expose
    private String EvilType;

    /**
    * 分布类型总量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 违规类型：
Terror	24001
Porn	20002
Polity	20001
Ad	20105
Abuse	20007	
Illegal	20006	
Spam	25001	
Moan	26001 
     * @return EvilType 违规类型：
Terror	24001
Porn	20002
Polity	20001
Ad	20105
Abuse	20007	
Illegal	20006	
Spam	25001	
Moan	26001
     */
    public String getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 违规类型：
Terror	24001
Porn	20002
Polity	20001
Ad	20105
Abuse	20007	
Illegal	20006	
Spam	25001	
Moan	26001
     * @param EvilType 违规类型：
Terror	24001
Porn	20002
Polity	20001
Ad	20105
Abuse	20007	
Illegal	20006	
Spam	25001	
Moan	26001
     */
    public void setEvilType(String EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 分布类型总量 
     * @return Count 分布类型总量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 分布类型总量
     * @param Count 分布类型总量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public EvilCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvilCount(EvilCount source) {
        if (source.EvilType != null) {
            this.EvilType = new String(source.EvilType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

