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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDMSTableResponse extends AbstractModel {

    /**
    * 基础对象
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
    * 视图文本
    */
    @SerializedName("ViewOriginalText")
    @Expose
    private String ViewOriginalText;

    /**
    * 视图文本
    */
    @SerializedName("ViewExpandedText")
    @Expose
    private String ViewExpandedText;

    /**
    * hive维护版本
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

    /**
    * 存储对象
    */
    @SerializedName("Sds")
    @Expose
    private DMSSds Sds;

    /**
    * 分区列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionKeys")
    @Expose
    private DMSColumn [] PartitionKeys;

    /**
    * 分区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private DMSPartition [] Partitions;

    /**
    * 表类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Schame名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 存储大小
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 记录数量
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * 生命周期
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * 最后访问时间
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * 数据更新时间
    */
    @SerializedName("DataUpdateTime")
    @Expose
    private String DataUpdateTime;

    /**
    * 结构更新时间
    */
    @SerializedName("StructUpdateTime")
    @Expose
    private String StructUpdateTime;

    /**
    * 列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private DMSColumn [] Columns;

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基础对象 
     * @return Asset 基础对象
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set 基础对象
     * @param Asset 基础对象
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 视图文本 
     * @return ViewOriginalText 视图文本
     */
    public String getViewOriginalText() {
        return this.ViewOriginalText;
    }

    /**
     * Set 视图文本
     * @param ViewOriginalText 视图文本
     */
    public void setViewOriginalText(String ViewOriginalText) {
        this.ViewOriginalText = ViewOriginalText;
    }

    /**
     * Get 视图文本 
     * @return ViewExpandedText 视图文本
     */
    public String getViewExpandedText() {
        return this.ViewExpandedText;
    }

    /**
     * Set 视图文本
     * @param ViewExpandedText 视图文本
     */
    public void setViewExpandedText(String ViewExpandedText) {
        this.ViewExpandedText = ViewExpandedText;
    }

    /**
     * Get hive维护版本 
     * @return Retention hive维护版本
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set hive维护版本
     * @param Retention hive维护版本
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    /**
     * Get 存储对象 
     * @return Sds 存储对象
     */
    public DMSSds getSds() {
        return this.Sds;
    }

    /**
     * Set 存储对象
     * @param Sds 存储对象
     */
    public void setSds(DMSSds Sds) {
        this.Sds = Sds;
    }

    /**
     * Get 分区列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionKeys 分区列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSColumn [] getPartitionKeys() {
        return this.PartitionKeys;
    }

    /**
     * Set 分区列
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionKeys 分区列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionKeys(DMSColumn [] PartitionKeys) {
        this.PartitionKeys = PartitionKeys;
    }

    /**
     * Get 分区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSPartition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 分区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 分区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(DMSPartition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 表类型 
     * @return Type 表类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表类型
     * @param Type 表类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Schame名称 
     * @return SchemaName Schame名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schame名称
     * @param SchemaName Schame名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 存储大小 
     * @return StorageSize 存储大小
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储大小
     * @param StorageSize 存储大小
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 记录数量 
     * @return RecordCount 记录数量
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 记录数量
     * @param RecordCount 记录数量
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get 生命周期 
     * @return LifeTime 生命周期
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set 生命周期
     * @param LifeTime 生命周期
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    /**
     * Get 最后访问时间 
     * @return LastAccessTime 最后访问时间
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最后访问时间
     * @param LastAccessTime 最后访问时间
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get 数据更新时间 
     * @return DataUpdateTime 数据更新时间
     */
    public String getDataUpdateTime() {
        return this.DataUpdateTime;
    }

    /**
     * Set 数据更新时间
     * @param DataUpdateTime 数据更新时间
     */
    public void setDataUpdateTime(String DataUpdateTime) {
        this.DataUpdateTime = DataUpdateTime;
    }

    /**
     * Get 结构更新时间 
     * @return StructUpdateTime 结构更新时间
     */
    public String getStructUpdateTime() {
        return this.StructUpdateTime;
    }

    /**
     * Set 结构更新时间
     * @param StructUpdateTime 结构更新时间
     */
    public void setStructUpdateTime(String StructUpdateTime) {
        this.StructUpdateTime = StructUpdateTime;
    }

    /**
     * Get 列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(DMSColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
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

    public DescribeDMSTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSTableResponse(DescribeDMSTableResponse source) {
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
        if (source.ViewOriginalText != null) {
            this.ViewOriginalText = new String(source.ViewOriginalText);
        }
        if (source.ViewExpandedText != null) {
            this.ViewExpandedText = new String(source.ViewExpandedText);
        }
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
        if (source.Sds != null) {
            this.Sds = new DMSSds(source.Sds);
        }
        if (source.PartitionKeys != null) {
            this.PartitionKeys = new DMSColumn[source.PartitionKeys.length];
            for (int i = 0; i < source.PartitionKeys.length; i++) {
                this.PartitionKeys[i] = new DMSColumn(source.PartitionKeys[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new DMSPartition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new DMSPartition(source.Partitions[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.DataUpdateTime != null) {
            this.DataUpdateTime = new String(source.DataUpdateTime);
        }
        if (source.StructUpdateTime != null) {
            this.StructUpdateTime = new String(source.StructUpdateTime);
        }
        if (source.Columns != null) {
            this.Columns = new DMSColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new DMSColumn(source.Columns[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Asset.", this.Asset);
        this.setParamSimple(map, prefix + "ViewOriginalText", this.ViewOriginalText);
        this.setParamSimple(map, prefix + "ViewExpandedText", this.ViewExpandedText);
        this.setParamSimple(map, prefix + "Retention", this.Retention);
        this.setParamObj(map, prefix + "Sds.", this.Sds);
        this.setParamArrayObj(map, prefix + "PartitionKeys.", this.PartitionKeys);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "DataUpdateTime", this.DataUpdateTime);
        this.setParamSimple(map, prefix + "StructUpdateTime", this.StructUpdateTime);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

