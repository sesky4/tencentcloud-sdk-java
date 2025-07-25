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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTraceRequest extends AbstractModel {

    /**
    * 人员ID。
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人体动作轨迹信息。
    */
    @SerializedName("Trace")
    @Expose
    private Trace Trace;

    /**
     * Get 人员ID。 
     * @return PersonId 人员ID。
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 人员ID。
     * @param PersonId 人员ID。
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 人体动作轨迹信息。 
     * @return Trace 人体动作轨迹信息。
     */
    public Trace getTrace() {
        return this.Trace;
    }

    /**
     * Set 人体动作轨迹信息。
     * @param Trace 人体动作轨迹信息。
     */
    public void setTrace(Trace Trace) {
        this.Trace = Trace;
    }

    public CreateTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTraceRequest(CreateTraceRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Trace != null) {
            this.Trace = new Trace(source.Trace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamObj(map, prefix + "Trace.", this.Trace);

    }
}

