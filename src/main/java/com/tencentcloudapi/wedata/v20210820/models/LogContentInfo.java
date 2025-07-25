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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogContentInfo extends AbstractModel {

    /**
    * 日志内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 日志组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * 时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 日志所属的容器名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
     * Get 日志内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Log 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Log 日志内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 日志组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgId 日志组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgId 日志组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgLogId 日志Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgLogId 日志Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Time 时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 日志所属的容器名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 日志所属的容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 日志所属的容器名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 日志所属的容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    public LogContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogContentInfo(LogContentInfo source) {
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);

    }
}

