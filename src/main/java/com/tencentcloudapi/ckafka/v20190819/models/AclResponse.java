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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclResponse extends AbstractModel {

    /**
    * 符合条件的总数据条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * ACL列表
    */
    @SerializedName("AclList")
    @Expose
    private Acl [] AclList;

    /**
     * Get 符合条件的总数据条数 
     * @return TotalCount 符合条件的总数据条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的总数据条数
     * @param TotalCount 符合条件的总数据条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get ACL列表 
     * @return AclList ACL列表
     */
    public Acl [] getAclList() {
        return this.AclList;
    }

    /**
     * Set ACL列表
     * @param AclList ACL列表
     */
    public void setAclList(Acl [] AclList) {
        this.AclList = AclList;
    }

    public AclResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclResponse(AclResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AclList != null) {
            this.AclList = new Acl[source.AclList.length];
            for (int i = 0; i < source.AclList.length; i++) {
                this.AclList[i] = new Acl(source.AclList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AclList.", this.AclList);

    }
}

