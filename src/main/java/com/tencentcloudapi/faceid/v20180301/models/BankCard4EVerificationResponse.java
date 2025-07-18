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

public class BankCard4EVerificationResponse extends AbstractModel {

    /**
    * 认证结果码。
- 收费结果码：
'0': '认证通过'。
'-1': '认证未通过'。
'-6': '持卡人信息有误'。
'-7': '未开通无卡支付'。
'-8': '此卡被没收'。
'-9': '无效卡号'。
'-10': '此卡无对应发卡行'。
'-11': '该卡未初始化或睡眠卡'。
'-12': '作弊卡、吞卡'。
'-13': '此卡已挂失'。
'-14': '该卡已过期'。
'-15': '受限制的卡'。
'-16': '密码错误次数超限'。
'-17': '发卡行不支持此交易'。
'-21': '卡状态异常或卡号错误'。

- 不收费结果码：
'-2': '姓名校验不通过'。
'-3': '身份证号码有误'。
'-4': '银行卡号格式有误'。
'-5': '手机号码不合法'。
'-18': '验证中心服务繁忙'。
'-19': '验证次数超限，请次日重试'。
'-20': '该证件号暂不支持核验，当前仅支持二代身份证'。
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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证结果码。
- 收费结果码：
'0': '认证通过'。
'-1': '认证未通过'。
'-6': '持卡人信息有误'。
'-7': '未开通无卡支付'。
'-8': '此卡被没收'。
'-9': '无效卡号'。
'-10': '此卡无对应发卡行'。
'-11': '该卡未初始化或睡眠卡'。
'-12': '作弊卡、吞卡'。
'-13': '此卡已挂失'。
'-14': '该卡已过期'。
'-15': '受限制的卡'。
'-16': '密码错误次数超限'。
'-17': '发卡行不支持此交易'。
'-21': '卡状态异常或卡号错误'。

- 不收费结果码：
'-2': '姓名校验不通过'。
'-3': '身份证号码有误'。
'-4': '银行卡号格式有误'。
'-5': '手机号码不合法'。
'-18': '验证中心服务繁忙'。
'-19': '验证次数超限，请次日重试'。
'-20': '该证件号暂不支持核验，当前仅支持二代身份证'。 
     * @return Result 认证结果码。
- 收费结果码：
'0': '认证通过'。
'-1': '认证未通过'。
'-6': '持卡人信息有误'。
'-7': '未开通无卡支付'。
'-8': '此卡被没收'。
'-9': '无效卡号'。
'-10': '此卡无对应发卡行'。
'-11': '该卡未初始化或睡眠卡'。
'-12': '作弊卡、吞卡'。
'-13': '此卡已挂失'。
'-14': '该卡已过期'。
'-15': '受限制的卡'。
'-16': '密码错误次数超限'。
'-17': '发卡行不支持此交易'。
'-21': '卡状态异常或卡号错误'。

- 不收费结果码：
'-2': '姓名校验不通过'。
'-3': '身份证号码有误'。
'-4': '银行卡号格式有误'。
'-5': '手机号码不合法'。
'-18': '验证中心服务繁忙'。
'-19': '验证次数超限，请次日重试'。
'-20': '该证件号暂不支持核验，当前仅支持二代身份证'。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码。
- 收费结果码：
'0': '认证通过'。
'-1': '认证未通过'。
'-6': '持卡人信息有误'。
'-7': '未开通无卡支付'。
'-8': '此卡被没收'。
'-9': '无效卡号'。
'-10': '此卡无对应发卡行'。
'-11': '该卡未初始化或睡眠卡'。
'-12': '作弊卡、吞卡'。
'-13': '此卡已挂失'。
'-14': '该卡已过期'。
'-15': '受限制的卡'。
'-16': '密码错误次数超限'。
'-17': '发卡行不支持此交易'。
'-21': '卡状态异常或卡号错误'。

- 不收费结果码：
'-2': '姓名校验不通过'。
'-3': '身份证号码有误'。
'-4': '银行卡号格式有误'。
'-5': '手机号码不合法'。
'-18': '验证中心服务繁忙'。
'-19': '验证次数超限，请次日重试'。
'-20': '该证件号暂不支持核验，当前仅支持二代身份证'。
     * @param Result 认证结果码。
- 收费结果码：
'0': '认证通过'。
'-1': '认证未通过'。
'-6': '持卡人信息有误'。
'-7': '未开通无卡支付'。
'-8': '此卡被没收'。
'-9': '无效卡号'。
'-10': '此卡无对应发卡行'。
'-11': '该卡未初始化或睡眠卡'。
'-12': '作弊卡、吞卡'。
'-13': '此卡已挂失'。
'-14': '该卡已过期'。
'-15': '受限制的卡'。
'-16': '密码错误次数超限'。
'-17': '发卡行不支持此交易'。
'-21': '卡状态异常或卡号错误'。

- 不收费结果码：
'-2': '姓名校验不通过'。
'-3': '身份证号码有误'。
'-4': '银行卡号格式有误'。
'-5': '手机号码不合法'。
'-18': '验证中心服务繁忙'。
'-19': '验证次数超限，请次日重试'。
'-20': '该证件号暂不支持核验，当前仅支持二代身份证'。
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

    public BankCard4EVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BankCard4EVerificationResponse(BankCard4EVerificationResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
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
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

