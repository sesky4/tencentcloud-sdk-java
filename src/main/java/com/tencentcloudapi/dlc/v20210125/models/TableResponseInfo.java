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

public class TableResponseInfo extends AbstractModel {

    /**
    * 数据表基本信息。
    */
    @SerializedName("TableBaseInfo")
    @Expose
    private TableBaseInfo TableBaseInfo;

    /**
    * 数据表列信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Column [] Columns;

    /**
    * 数据表分块信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private Partition [] Partitions;

    /**
    * 数据存储路径。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 数据表属性信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 数据表更新时间, 单位: ms。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 数据表创建时间,单位: ms。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据格式。
    */
    @SerializedName("InputFormat")
    @Expose
    private String InputFormat;

    /**
    * 数据表存储大小（单位：Byte）
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 数据表行数
    */
    @SerializedName("RecordCount")
    @Expose
    private Long RecordCount;

    /**
    * xxxx
    */
    @SerializedName("MapMaterializedViewName")
    @Expose
    private String MapMaterializedViewName;

    /**
    * 访问热点
    */
    @SerializedName("HeatValue")
    @Expose
    private Long HeatValue;

    /**
    * InputFormat的缩写
    */
    @SerializedName("InputFormatShort")
    @Expose
    private String InputFormatShort;

    /**
     * Get 数据表基本信息。 
     * @return TableBaseInfo 数据表基本信息。
     */
    public TableBaseInfo getTableBaseInfo() {
        return this.TableBaseInfo;
    }

    /**
     * Set 数据表基本信息。
     * @param TableBaseInfo 数据表基本信息。
     */
    public void setTableBaseInfo(TableBaseInfo TableBaseInfo) {
        this.TableBaseInfo = TableBaseInfo;
    }

    /**
     * Get 数据表列信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 数据表列信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Column [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 数据表列信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 数据表列信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Column [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 数据表分块信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions 数据表分块信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Partition [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set 数据表分块信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions 数据表分块信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(Partition [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get 数据存储路径。 
     * @return Location 数据存储路径。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 数据存储路径。
     * @param Location 数据存储路径。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 数据表属性信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 数据表属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 数据表属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 数据表属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 数据表更新时间, 单位: ms。 
     * @return ModifiedTime 数据表更新时间, 单位: ms。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 数据表更新时间, 单位: ms。
     * @param ModifiedTime 数据表更新时间, 单位: ms。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 数据表创建时间,单位: ms。 
     * @return CreateTime 数据表创建时间,单位: ms。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数据表创建时间,单位: ms。
     * @param CreateTime 数据表创建时间,单位: ms。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据格式。 
     * @return InputFormat 数据格式。
     */
    public String getInputFormat() {
        return this.InputFormat;
    }

    /**
     * Set 数据格式。
     * @param InputFormat 数据格式。
     */
    public void setInputFormat(String InputFormat) {
        this.InputFormat = InputFormat;
    }

    /**
     * Get 数据表存储大小（单位：Byte） 
     * @return StorageSize 数据表存储大小（单位：Byte）
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 数据表存储大小（单位：Byte）
     * @param StorageSize 数据表存储大小（单位：Byte）
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 数据表行数 
     * @return RecordCount 数据表行数
     */
    public Long getRecordCount() {
        return this.RecordCount;
    }

    /**
     * Set 数据表行数
     * @param RecordCount 数据表行数
     */
    public void setRecordCount(Long RecordCount) {
        this.RecordCount = RecordCount;
    }

    /**
     * Get xxxx 
     * @return MapMaterializedViewName xxxx
     */
    public String getMapMaterializedViewName() {
        return this.MapMaterializedViewName;
    }

    /**
     * Set xxxx
     * @param MapMaterializedViewName xxxx
     */
    public void setMapMaterializedViewName(String MapMaterializedViewName) {
        this.MapMaterializedViewName = MapMaterializedViewName;
    }

    /**
     * Get 访问热点 
     * @return HeatValue 访问热点
     */
    public Long getHeatValue() {
        return this.HeatValue;
    }

    /**
     * Set 访问热点
     * @param HeatValue 访问热点
     */
    public void setHeatValue(Long HeatValue) {
        this.HeatValue = HeatValue;
    }

    /**
     * Get InputFormat的缩写 
     * @return InputFormatShort InputFormat的缩写
     */
    public String getInputFormatShort() {
        return this.InputFormatShort;
    }

    /**
     * Set InputFormat的缩写
     * @param InputFormatShort InputFormat的缩写
     */
    public void setInputFormatShort(String InputFormatShort) {
        this.InputFormatShort = InputFormatShort;
    }

    public TableResponseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableResponseInfo(TableResponseInfo source) {
        if (source.TableBaseInfo != null) {
            this.TableBaseInfo = new TableBaseInfo(source.TableBaseInfo);
        }
        if (source.Columns != null) {
            this.Columns = new Column[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Column(source.Columns[i]);
            }
        }
        if (source.Partitions != null) {
            this.Partitions = new Partition[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partition(source.Partitions[i]);
            }
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InputFormat != null) {
            this.InputFormat = new String(source.InputFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.RecordCount != null) {
            this.RecordCount = new Long(source.RecordCount);
        }
        if (source.MapMaterializedViewName != null) {
            this.MapMaterializedViewName = new String(source.MapMaterializedViewName);
        }
        if (source.HeatValue != null) {
            this.HeatValue = new Long(source.HeatValue);
        }
        if (source.InputFormatShort != null) {
            this.InputFormatShort = new String(source.InputFormatShort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableBaseInfo.", this.TableBaseInfo);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InputFormat", this.InputFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "RecordCount", this.RecordCount);
        this.setParamSimple(map, prefix + "MapMaterializedViewName", this.MapMaterializedViewName);
        this.setParamSimple(map, prefix + "HeatValue", this.HeatValue);
        this.setParamSimple(map, prefix + "InputFormatShort", this.InputFormatShort);

    }
}

