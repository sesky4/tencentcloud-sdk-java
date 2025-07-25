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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPersonBaseInfoRequest extends AbstractModel {

    /**
    * 人员ID，创建人员接口中的PersonId。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
     * Get 人员ID，创建人员接口中的PersonId。 
     * @return PersonId 人员ID，创建人员接口中的PersonId。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID，创建人员接口中的PersonId。
     * @param PersonId 人员ID，创建人员接口中的PersonId。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    public GetPersonBaseInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPersonBaseInfoRequest(GetPersonBaseInfoRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);

    }
}

