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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTablesInfo extends AbstractModel {

    /**
    * 源表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcTableClusterId")
    @Expose
    private String SrcTableClusterId;

    /**
    * 源表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcTableGroupId")
    @Expose
    private String SrcTableGroupId;

    /**
    * 源表格的表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcTableName")
    @Expose
    private String SrcTableName;

    /**
    * 目标表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstTableClusterId")
    @Expose
    private String DstTableClusterId;

    /**
    * 目标表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstTableGroupId")
    @Expose
    private String DstTableGroupId;

    /**
    * 目标表格的表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstTableName")
    @Expose
    private String DstTableName;

    /**
    * 源表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SrcTableInstanceId")
    @Expose
    private String SrcTableInstanceId;

    /**
    * 目标表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DstTableInstanceId")
    @Expose
    private String DstTableInstanceId;

    /**
     * Get 源表格的集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcTableClusterId 源表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcTableClusterId() {
        return this.SrcTableClusterId;
    }

    /**
     * Set 源表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcTableClusterId 源表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcTableClusterId(String SrcTableClusterId) {
        this.SrcTableClusterId = SrcTableClusterId;
    }

    /**
     * Get 源表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcTableGroupId 源表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcTableGroupId() {
        return this.SrcTableGroupId;
    }

    /**
     * Set 源表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcTableGroupId 源表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcTableGroupId(String SrcTableGroupId) {
        this.SrcTableGroupId = SrcTableGroupId;
    }

    /**
     * Get 源表格的表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcTableName 源表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcTableName() {
        return this.SrcTableName;
    }

    /**
     * Set 源表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcTableName 源表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcTableName(String SrcTableName) {
        this.SrcTableName = SrcTableName;
    }

    /**
     * Get 目标表格的集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstTableClusterId 目标表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstTableClusterId() {
        return this.DstTableClusterId;
    }

    /**
     * Set 目标表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstTableClusterId 目标表格的集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstTableClusterId(String DstTableClusterId) {
        this.DstTableClusterId = DstTableClusterId;
    }

    /**
     * Get 目标表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstTableGroupId 目标表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstTableGroupId() {
        return this.DstTableGroupId;
    }

    /**
     * Set 目标表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstTableGroupId 目标表格的表格组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstTableGroupId(String DstTableGroupId) {
        this.DstTableGroupId = DstTableGroupId;
    }

    /**
     * Get 目标表格的表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstTableName 目标表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstTableName() {
        return this.DstTableName;
    }

    /**
     * Set 目标表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstTableName 目标表格的表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstTableName(String DstTableName) {
        this.DstTableName = DstTableName;
    }

    /**
     * Get 源表格的实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SrcTableInstanceId 源表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrcTableInstanceId() {
        return this.SrcTableInstanceId;
    }

    /**
     * Set 源表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SrcTableInstanceId 源表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrcTableInstanceId(String SrcTableInstanceId) {
        this.SrcTableInstanceId = SrcTableInstanceId;
    }

    /**
     * Get 目标表格的实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DstTableInstanceId 目标表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDstTableInstanceId() {
        return this.DstTableInstanceId;
    }

    /**
     * Set 目标表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DstTableInstanceId 目标表格的实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDstTableInstanceId(String DstTableInstanceId) {
        this.DstTableInstanceId = DstTableInstanceId;
    }

    public CompareTablesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTablesInfo(CompareTablesInfo source) {
        if (source.SrcTableClusterId != null) {
            this.SrcTableClusterId = new String(source.SrcTableClusterId);
        }
        if (source.SrcTableGroupId != null) {
            this.SrcTableGroupId = new String(source.SrcTableGroupId);
        }
        if (source.SrcTableName != null) {
            this.SrcTableName = new String(source.SrcTableName);
        }
        if (source.DstTableClusterId != null) {
            this.DstTableClusterId = new String(source.DstTableClusterId);
        }
        if (source.DstTableGroupId != null) {
            this.DstTableGroupId = new String(source.DstTableGroupId);
        }
        if (source.DstTableName != null) {
            this.DstTableName = new String(source.DstTableName);
        }
        if (source.SrcTableInstanceId != null) {
            this.SrcTableInstanceId = new String(source.SrcTableInstanceId);
        }
        if (source.DstTableInstanceId != null) {
            this.DstTableInstanceId = new String(source.DstTableInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcTableClusterId", this.SrcTableClusterId);
        this.setParamSimple(map, prefix + "SrcTableGroupId", this.SrcTableGroupId);
        this.setParamSimple(map, prefix + "SrcTableName", this.SrcTableName);
        this.setParamSimple(map, prefix + "DstTableClusterId", this.DstTableClusterId);
        this.setParamSimple(map, prefix + "DstTableGroupId", this.DstTableGroupId);
        this.setParamSimple(map, prefix + "DstTableName", this.DstTableName);
        this.setParamSimple(map, prefix + "SrcTableInstanceId", this.SrcTableInstanceId);
        this.setParamSimple(map, prefix + "DstTableInstanceId", this.DstTableInstanceId);

    }
}

