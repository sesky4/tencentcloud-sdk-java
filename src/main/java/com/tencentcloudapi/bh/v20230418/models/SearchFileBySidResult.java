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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFileBySidResult extends AbstractModel {

    /**
    * 会话Id
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 来源Ip
    */
    @SerializedName("FromIp")
    @Expose
    private String FromIp;

    /**
    * 文件操作时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 文件传输协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * method为重命名、移动文件时代表移动后的新位置.其他情况为null
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
    * method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 堡垒机拦截情况, 1-已执行，  2-被阻断
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 复核时间，当Action是3时，需有复核时间
    */
    @SerializedName("ConfirmTime")
    @Expose
    private String ConfirmTime;

    /**
    * 用户部门Id
    */
    @SerializedName("UserDepartmentId")
    @Expose
    private String UserDepartmentId;

    /**
    * 用户部门name
    */
    @SerializedName("UserDepartmentName")
    @Expose
    private String UserDepartmentName;

    /**
    * 设备部门id
    */
    @SerializedName("DeviceDepartmentId")
    @Expose
    private String DeviceDepartmentId;

    /**
    * 设备部门name
    */
    @SerializedName("DeviceDepartmentName")
    @Expose
    private String DeviceDepartmentName;

    /**
    * 签名值
    */
    @SerializedName("SignValue")
    @Expose
    private String SignValue;

    /**
     * Get 会话Id 
     * @return Sid 会话Id
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set 会话Id
     * @param Sid 会话Id
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产账号 
     * @return Account 资产账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 资产账号
     * @param Account 资产账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 来源Ip 
     * @return FromIp 来源Ip
     */
    public String getFromIp() {
        return this.FromIp;
    }

    /**
     * Set 来源Ip
     * @param FromIp 来源Ip
     */
    public void setFromIp(String FromIp) {
        this.FromIp = FromIp;
    }

    /**
     * Get 文件操作时间 
     * @return Time 文件操作时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 文件操作时间
     * @param Time 文件操作时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹 
     * @return Method 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     * @param Method 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 文件传输协议 
     * @return Protocol 文件传输协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件传输协议
     * @param Protocol 文件传输协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置 
     * @return FileCurr method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     * @param FileCurr method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get method为重命名、移动文件时代表移动后的新位置.其他情况为null 
     * @return FileNew method为重命名、移动文件时代表移动后的新位置.其他情况为null
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set method为重命名、移动文件时代表移动后的新位置.其他情况为null
     * @param FileNew method为重命名、移动文件时代表移动后的新位置.其他情况为null
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    /**
     * Get method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null 
     * @return Size method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
     * @param Size method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 堡垒机拦截情况, 1-已执行，  2-被阻断 
     * @return Action 堡垒机拦截情况, 1-已执行，  2-被阻断
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 堡垒机拦截情况, 1-已执行，  2-被阻断
     * @param Action 堡垒机拦截情况, 1-已执行，  2-被阻断
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 复核时间，当Action是3时，需有复核时间 
     * @return ConfirmTime 复核时间，当Action是3时，需有复核时间
     */
    public String getConfirmTime() {
        return this.ConfirmTime;
    }

    /**
     * Set 复核时间，当Action是3时，需有复核时间
     * @param ConfirmTime 复核时间，当Action是3时，需有复核时间
     */
    public void setConfirmTime(String ConfirmTime) {
        this.ConfirmTime = ConfirmTime;
    }

    /**
     * Get 用户部门Id 
     * @return UserDepartmentId 用户部门Id
     */
    public String getUserDepartmentId() {
        return this.UserDepartmentId;
    }

    /**
     * Set 用户部门Id
     * @param UserDepartmentId 用户部门Id
     */
    public void setUserDepartmentId(String UserDepartmentId) {
        this.UserDepartmentId = UserDepartmentId;
    }

    /**
     * Get 用户部门name 
     * @return UserDepartmentName 用户部门name
     */
    public String getUserDepartmentName() {
        return this.UserDepartmentName;
    }

    /**
     * Set 用户部门name
     * @param UserDepartmentName 用户部门name
     */
    public void setUserDepartmentName(String UserDepartmentName) {
        this.UserDepartmentName = UserDepartmentName;
    }

    /**
     * Get 设备部门id 
     * @return DeviceDepartmentId 设备部门id
     */
    public String getDeviceDepartmentId() {
        return this.DeviceDepartmentId;
    }

    /**
     * Set 设备部门id
     * @param DeviceDepartmentId 设备部门id
     */
    public void setDeviceDepartmentId(String DeviceDepartmentId) {
        this.DeviceDepartmentId = DeviceDepartmentId;
    }

    /**
     * Get 设备部门name 
     * @return DeviceDepartmentName 设备部门name
     */
    public String getDeviceDepartmentName() {
        return this.DeviceDepartmentName;
    }

    /**
     * Set 设备部门name
     * @param DeviceDepartmentName 设备部门name
     */
    public void setDeviceDepartmentName(String DeviceDepartmentName) {
        this.DeviceDepartmentName = DeviceDepartmentName;
    }

    /**
     * Get 签名值 
     * @return SignValue 签名值
     */
    public String getSignValue() {
        return this.SignValue;
    }

    /**
     * Set 签名值
     * @param SignValue 签名值
     */
    public void setSignValue(String SignValue) {
        this.SignValue = SignValue;
    }

    public SearchFileBySidResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileBySidResult(SearchFileBySidResult source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.FromIp != null) {
            this.FromIp = new String(source.FromIp);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FileCurr != null) {
            this.FileCurr = new String(source.FileCurr);
        }
        if (source.FileNew != null) {
            this.FileNew = new String(source.FileNew);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ConfirmTime != null) {
            this.ConfirmTime = new String(source.ConfirmTime);
        }
        if (source.UserDepartmentId != null) {
            this.UserDepartmentId = new String(source.UserDepartmentId);
        }
        if (source.UserDepartmentName != null) {
            this.UserDepartmentName = new String(source.UserDepartmentName);
        }
        if (source.DeviceDepartmentId != null) {
            this.DeviceDepartmentId = new String(source.DeviceDepartmentId);
        }
        if (source.DeviceDepartmentName != null) {
            this.DeviceDepartmentName = new String(source.DeviceDepartmentName);
        }
        if (source.SignValue != null) {
            this.SignValue = new String(source.SignValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "FromIp", this.FromIp);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FileCurr", this.FileCurr);
        this.setParamSimple(map, prefix + "FileNew", this.FileNew);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ConfirmTime", this.ConfirmTime);
        this.setParamSimple(map, prefix + "UserDepartmentId", this.UserDepartmentId);
        this.setParamSimple(map, prefix + "UserDepartmentName", this.UserDepartmentName);
        this.setParamSimple(map, prefix + "DeviceDepartmentId", this.DeviceDepartmentId);
        this.setParamSimple(map, prefix + "DeviceDepartmentName", this.DeviceDepartmentName);
        this.setParamSimple(map, prefix + "SignValue", this.SignValue);

    }
}

