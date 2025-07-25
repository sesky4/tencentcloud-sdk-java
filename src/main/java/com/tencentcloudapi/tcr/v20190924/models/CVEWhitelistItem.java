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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVEWhitelistItem extends AbstractModel {

    /**
    * 漏洞白名单 ID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
     * Get 漏洞白名单 ID 
     * @return CVEID 漏洞白名单 ID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set 漏洞白名单 ID
     * @param CVEID 漏洞白名单 ID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    public CVEWhitelistItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVEWhitelistItem(CVEWhitelistItem source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);

    }
}

