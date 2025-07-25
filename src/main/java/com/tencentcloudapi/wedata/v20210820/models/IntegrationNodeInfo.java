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

public class IntegrationNodeInfo extends AbstractModel {

    /**
    * 集成节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 集成节点所属任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 集成节点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 集成节点类型,INPUT: 输入节点，OUTPUT:输出节点 
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 节点描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private RecordField [] Config;

    /**
    * 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtConfig")
    @Expose
    private RecordField [] ExtConfig;

    /**
    * 节点schema
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Schema")
    @Expose
    private IntegrationNodeSchema [] Schema;

    /**
    * 节点映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeMapping")
    @Expose
    private IntegrationNodeMapping NodeMapping;

    /**
    * 归属用户AppId,展示字段 非传入
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 创建人uin,展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 操作人uin，展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * owner uin 展示字段 非传入
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 集成节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 集成节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 集成节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 集成节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 集成节点所属任务id 
     * @return TaskId 集成节点所属任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 集成节点所属任务id
     * @param TaskId 集成节点所属任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 集成节点名称 
     * @return Name 集成节点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集成节点名称
     * @param Name 集成节点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 集成节点类型,INPUT: 输入节点，OUTPUT:输出节点  
     * @return NodeType 集成节点类型,INPUT: 输入节点，OUTPUT:输出节点 
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 集成节点类型,INPUT: 输入节点，OUTPUT:输出节点 
     * @param NodeType 集成节点类型,INPUT: 输入节点，OUTPUT:输出节点 
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE 
     * @return DataSourceType 节点数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 节点数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
     * @param DataSourceType 节点数据源类型：MYSQL|POSTGRE|ORACLE|SQLSERVER|FTP|HIVE|HDFS|ICEBERG|KAFKA|HBASE|SPARK|VIRTUAL|TBASE|DB2|DM|GAUSSDB|GBASE|IMPALA|ES|S3_DATAINSIGHT|GREENPLUM|PHOENIX|SAP_HANA|SFTP|OCEANBASE|CLICKHOUSE|KUDU|VERTICA|REDIS|COS|DLC|DLCV1|DORIS|CKAFKA|DTS_KAFKA|S3|CDW|LOCAL|TDSQLC|TDSQL|TDSQL_MYSQL|MONGODB|INFORMIX|SYBASE|REST_API|SuperSQL|PRESTO|DR_SUM|TiDB|StarRocks|Trino|Kyuubi|GDB|TCHOUSE_X|TCHOUSE_P|TDSQL_POSTGRE
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 节点描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getConfig() {
        return this.Config;
    }

    /**
     * Set 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 节点配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(RecordField [] Config) {
        this.Config = Config;
    }

    /**
     * Get 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtConfig 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordField [] getExtConfig() {
        return this.ExtConfig;
    }

    /**
     * Set 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtConfig 节点扩展配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtConfig(RecordField [] ExtConfig) {
        this.ExtConfig = ExtConfig;
    }

    /**
     * Get 节点schema
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Schema 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeSchema [] getSchema() {
        return this.Schema;
    }

    /**
     * Set 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     * @param Schema 节点schema
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchema(IntegrationNodeSchema [] Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 节点映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeMapping 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntegrationNodeMapping getNodeMapping() {
        return this.NodeMapping;
    }

    /**
     * Set 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeMapping 节点映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeMapping(IntegrationNodeMapping NodeMapping) {
        this.NodeMapping = NodeMapping;
    }

    /**
     * Get 归属用户AppId,展示字段 非传入 
     * @return AppId 归属用户AppId,展示字段 非传入
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 归属用户AppId,展示字段 非传入
     * @param AppId 归属用户AppId,展示字段 非传入
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建人uin,展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建人uin,展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建人uin,展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建人uin,展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 操作人uin，展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUin 操作人uin，展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 操作人uin，展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUin 操作人uin，展示字段 非传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get owner uin 展示字段 非传入 
     * @return OwnerUin owner uin 展示字段 非传入
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set owner uin 展示字段 非传入
     * @param OwnerUin owner uin 展示字段 非传入
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public IntegrationNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntegrationNodeInfo(IntegrationNodeInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Config != null) {
            this.Config = new RecordField[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new RecordField(source.Config[i]);
            }
        }
        if (source.ExtConfig != null) {
            this.ExtConfig = new RecordField[source.ExtConfig.length];
            for (int i = 0; i < source.ExtConfig.length; i++) {
                this.ExtConfig[i] = new RecordField(source.ExtConfig[i]);
            }
        }
        if (source.Schema != null) {
            this.Schema = new IntegrationNodeSchema[source.Schema.length];
            for (int i = 0; i < source.Schema.length; i++) {
                this.Schema[i] = new IntegrationNodeSchema(source.Schema[i]);
            }
        }
        if (source.NodeMapping != null) {
            this.NodeMapping = new IntegrationNodeMapping(source.NodeMapping);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamArrayObj(map, prefix + "ExtConfig.", this.ExtConfig);
        this.setParamArrayObj(map, prefix + "Schema.", this.Schema);
        this.setParamObj(map, prefix + "NodeMapping.", this.NodeMapping);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

