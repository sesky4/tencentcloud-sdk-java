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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneVerificationCMCCResponse extends AbstractModel {

    /**
    * 认证结果码，收费情况如下。
- 收费结果码：
0: 认证通过。
-4: 信息不一致（手机号已实名，但姓名和身份证号与实名信息不一致）。

- 不收费结果码：
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 运营商名称。
- 取值范围为["移动","联通","电信",""]。
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 业务结果描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证结果码，收费情况如下。
- 收费结果码：
0: 认证通过。
-4: 信息不一致（手机号已实名，但姓名和身份证号与实名信息不一致）。

- 不收费结果码：
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。 
     * @return Result 认证结果码，收费情况如下。
- 收费结果码：
0: 认证通过。
-4: 信息不一致（手机号已实名，但姓名和身份证号与实名信息不一致）。

- 不收费结果码：
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码，收费情况如下。
- 收费结果码：
0: 认证通过。
-4: 信息不一致（手机号已实名，但姓名和身份证号与实名信息不一致）。

- 不收费结果码：
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
     * @param Result 认证结果码，收费情况如下。
- 收费结果码：
0: 认证通过。
-4: 信息不一致（手机号已实名，但姓名和身份证号与实名信息不一致）。

- 不收费结果码：
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 运营商名称。
- 取值范围为["移动","联通","电信",""]。 
     * @return Isp 运营商名称。
- 取值范围为["移动","联通","电信",""]。
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商名称。
- 取值范围为["移动","联通","电信",""]。
     * @param Isp 运营商名称。
- 取值范围为["移动","联通","电信",""]。
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 业务结果描述。 
     * @return Description 业务结果描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述。
     * @param Description 业务结果描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public PhoneVerificationCMCCResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneVerificationCMCCResponse(PhoneVerificationCMCCResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

