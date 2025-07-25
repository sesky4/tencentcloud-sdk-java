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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePhoneNumberInfoRequest extends AbstractModel {

    /**
    * 查询手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号。
例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
    */
    @SerializedName("PhoneNumberSet")
    @Expose
    private String [] PhoneNumberSet;

    /**
     * Get 查询手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号。
例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。 
     * @return PhoneNumberSet 查询手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号。
例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     */
    public String [] getPhoneNumberSet() {
        return this.PhoneNumberSet;
    }

    /**
     * Set 查询手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号。
例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     * @param PhoneNumberSet 查询手机号码，采用 E.164 标准，格式为+[国家或地区码][手机号]，单次请求最多支持200个手机号。
例如：+8618501234444， 其中前面有一个+号 ，86为国家码，18501234444为手机号。
     */
    public void setPhoneNumberSet(String [] PhoneNumberSet) {
        this.PhoneNumberSet = PhoneNumberSet;
    }

    public DescribePhoneNumberInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePhoneNumberInfoRequest(DescribePhoneNumberInfoRequest source) {
        if (source.PhoneNumberSet != null) {
            this.PhoneNumberSet = new String[source.PhoneNumberSet.length];
            for (int i = 0; i < source.PhoneNumberSet.length; i++) {
                this.PhoneNumberSet[i] = new String(source.PhoneNumberSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PhoneNumberSet.", this.PhoneNumberSet);

    }
}

