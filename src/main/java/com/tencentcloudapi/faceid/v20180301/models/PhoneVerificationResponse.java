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

public class PhoneVerificationResponse extends AbstractModel {

    /**
    * 认证结果码。
- 收费结果码
0: 三要素信息一致。
-4: 三要素信息不一致。

- 不收费结果码
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
-12: 认证次数超过当日限制，请次日重试。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 运营商名称。
- 取值范围为["","移动","电信","联通"]
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 业务结果详细信息。
- 当VerifyMode配置"详版"，且Result为"-4: 三要素信息不一致"时返回。
- 枚举值：
PhoneIdCardMismatch：手机号码与姓名一致，与身份证号不一致。
PhoneNameMismatch：手机号码身份证号一致，与姓名不一致。
PhoneNameIdCardMismatch：手机号码与姓名和身份证号均不一致。
NameIdCardMismatch：姓名和身份证号不一致。
OtherMismatch：其他不一致。
    */
    @SerializedName("ResultDetail")
    @Expose
    private String ResultDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证结果码。
- 收费结果码
0: 三要素信息一致。
-4: 三要素信息不一致。

- 不收费结果码
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
-12: 认证次数超过当日限制，请次日重试。 
     * @return Result 认证结果码。
- 收费结果码
0: 三要素信息一致。
-4: 三要素信息不一致。

- 不收费结果码
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
-12: 认证次数超过当日限制，请次日重试。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码。
- 收费结果码
0: 三要素信息一致。
-4: 三要素信息不一致。

- 不收费结果码
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
-12: 认证次数超过当日限制，请次日重试。
     * @param Result 认证结果码。
- 收费结果码
0: 三要素信息一致。
-4: 三要素信息不一致。

- 不收费结果码
-6: 手机号码不合法。
-7: 身份证号码有误。
-8: 姓名校验不通过。
-9: 没有记录。
-11: 验证中心服务繁忙。
-12: 认证次数超过当日限制，请次日重试。
     */
    public void setResult(String Result) {
        this.Result = Result;
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
     * Get 运营商名称。
- 取值范围为["","移动","电信","联通"] 
     * @return Isp 运营商名称。
- 取值范围为["","移动","电信","联通"]
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商名称。
- 取值范围为["","移动","电信","联通"]
     * @param Isp 运营商名称。
- 取值范围为["","移动","电信","联通"]
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 业务结果详细信息。
- 当VerifyMode配置"详版"，且Result为"-4: 三要素信息不一致"时返回。
- 枚举值：
PhoneIdCardMismatch：手机号码与姓名一致，与身份证号不一致。
PhoneNameMismatch：手机号码身份证号一致，与姓名不一致。
PhoneNameIdCardMismatch：手机号码与姓名和身份证号均不一致。
NameIdCardMismatch：姓名和身份证号不一致。
OtherMismatch：其他不一致。 
     * @return ResultDetail 业务结果详细信息。
- 当VerifyMode配置"详版"，且Result为"-4: 三要素信息不一致"时返回。
- 枚举值：
PhoneIdCardMismatch：手机号码与姓名一致，与身份证号不一致。
PhoneNameMismatch：手机号码身份证号一致，与姓名不一致。
PhoneNameIdCardMismatch：手机号码与姓名和身份证号均不一致。
NameIdCardMismatch：姓名和身份证号不一致。
OtherMismatch：其他不一致。
     */
    public String getResultDetail() {
        return this.ResultDetail;
    }

    /**
     * Set 业务结果详细信息。
- 当VerifyMode配置"详版"，且Result为"-4: 三要素信息不一致"时返回。
- 枚举值：
PhoneIdCardMismatch：手机号码与姓名一致，与身份证号不一致。
PhoneNameMismatch：手机号码身份证号一致，与姓名不一致。
PhoneNameIdCardMismatch：手机号码与姓名和身份证号均不一致。
NameIdCardMismatch：姓名和身份证号不一致。
OtherMismatch：其他不一致。
     * @param ResultDetail 业务结果详细信息。
- 当VerifyMode配置"详版"，且Result为"-4: 三要素信息不一致"时返回。
- 枚举值：
PhoneIdCardMismatch：手机号码与姓名一致，与身份证号不一致。
PhoneNameMismatch：手机号码身份证号一致，与姓名不一致。
PhoneNameIdCardMismatch：手机号码与姓名和身份证号均不一致。
NameIdCardMismatch：姓名和身份证号不一致。
OtherMismatch：其他不一致。
     */
    public void setResultDetail(String ResultDetail) {
        this.ResultDetail = ResultDetail;
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

    public PhoneVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneVerificationResponse(PhoneVerificationResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.ResultDetail != null) {
            this.ResultDetail = new String(source.ResultDetail);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "ResultDetail", this.ResultDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

