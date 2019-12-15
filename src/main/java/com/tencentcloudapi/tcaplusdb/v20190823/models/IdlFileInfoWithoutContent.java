/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdlFileInfoWithoutContent  extends AbstractModel{

    /**
    * 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExtType")
    @Expose
    private String FileExtType;

    /**
    * 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private Long FileId;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * 获取文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileName 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名称，不包含扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileType 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 数据描述语言（IDL）类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileExtType 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileExtType() {
        return this.FileExtType;
    }

    /**
     * 设置文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExtType 文件扩展名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExtType(String FileExtType) {
        this.FileExtType = FileExtType;
    }

    /**
     * 获取文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileSize 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * 设置文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小（Bytes）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * 获取文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileId() {
        return this.FileId;
    }

    /**
     * 设置文件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 文件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(Long FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * 设置错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileExtType", this.FileExtType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}
