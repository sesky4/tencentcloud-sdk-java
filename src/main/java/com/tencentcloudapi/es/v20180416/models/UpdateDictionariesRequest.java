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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDictionariesRequest extends AbstractModel {

    /**
    * ES实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 安装时填IK分词主词典COS地址，删除时填词典名如test.dic
    */
    @SerializedName("IkMainDicts")
    @Expose
    private String [] IkMainDicts;

    /**
    * 安装时填IK分词停用词词典COS地址，删除时填词典名如test.dic
    */
    @SerializedName("IkStopwords")
    @Expose
    private String [] IkStopwords;

    /**
    * 安装时填同义词词典COS地址，删除时填词典名如test.dic
    */
    @SerializedName("Synonym")
    @Expose
    private String [] Synonym;

    /**
    * 安装时填QQ分词词典COS地址，删除时填词典名如test.dic
    */
    @SerializedName("QQDict")
    @Expose
    private String [] QQDict;

    /**
    * 0：安装；1：删除。默认值0
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 是否强制重启集群。默认值false
    */
    @SerializedName("ForceRestart")
    @Expose
    private Boolean ForceRestart;

    /**
     * Get ES实例ID 
     * @return InstanceId ES实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES实例ID
     * @param InstanceId ES实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 安装时填IK分词主词典COS地址，删除时填词典名如test.dic 
     * @return IkMainDicts 安装时填IK分词主词典COS地址，删除时填词典名如test.dic
     */
    public String [] getIkMainDicts() {
        return this.IkMainDicts;
    }

    /**
     * Set 安装时填IK分词主词典COS地址，删除时填词典名如test.dic
     * @param IkMainDicts 安装时填IK分词主词典COS地址，删除时填词典名如test.dic
     */
    public void setIkMainDicts(String [] IkMainDicts) {
        this.IkMainDicts = IkMainDicts;
    }

    /**
     * Get 安装时填IK分词停用词词典COS地址，删除时填词典名如test.dic 
     * @return IkStopwords 安装时填IK分词停用词词典COS地址，删除时填词典名如test.dic
     */
    public String [] getIkStopwords() {
        return this.IkStopwords;
    }

    /**
     * Set 安装时填IK分词停用词词典COS地址，删除时填词典名如test.dic
     * @param IkStopwords 安装时填IK分词停用词词典COS地址，删除时填词典名如test.dic
     */
    public void setIkStopwords(String [] IkStopwords) {
        this.IkStopwords = IkStopwords;
    }

    /**
     * Get 安装时填同义词词典COS地址，删除时填词典名如test.dic 
     * @return Synonym 安装时填同义词词典COS地址，删除时填词典名如test.dic
     */
    public String [] getSynonym() {
        return this.Synonym;
    }

    /**
     * Set 安装时填同义词词典COS地址，删除时填词典名如test.dic
     * @param Synonym 安装时填同义词词典COS地址，删除时填词典名如test.dic
     */
    public void setSynonym(String [] Synonym) {
        this.Synonym = Synonym;
    }

    /**
     * Get 安装时填QQ分词词典COS地址，删除时填词典名如test.dic 
     * @return QQDict 安装时填QQ分词词典COS地址，删除时填词典名如test.dic
     */
    public String [] getQQDict() {
        return this.QQDict;
    }

    /**
     * Set 安装时填QQ分词词典COS地址，删除时填词典名如test.dic
     * @param QQDict 安装时填QQ分词词典COS地址，删除时填词典名如test.dic
     */
    public void setQQDict(String [] QQDict) {
        this.QQDict = QQDict;
    }

    /**
     * Get 0：安装；1：删除。默认值0 
     * @return UpdateType 0：安装；1：删除。默认值0
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 0：安装；1：删除。默认值0
     * @param UpdateType 0：安装；1：删除。默认值0
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 是否强制重启集群。默认值false 
     * @return ForceRestart 是否强制重启集群。默认值false
     */
    public Boolean getForceRestart() {
        return this.ForceRestart;
    }

    /**
     * Set 是否强制重启集群。默认值false
     * @param ForceRestart 是否强制重启集群。默认值false
     */
    public void setForceRestart(Boolean ForceRestart) {
        this.ForceRestart = ForceRestart;
    }

    public UpdateDictionariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDictionariesRequest(UpdateDictionariesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IkMainDicts != null) {
            this.IkMainDicts = new String[source.IkMainDicts.length];
            for (int i = 0; i < source.IkMainDicts.length; i++) {
                this.IkMainDicts[i] = new String(source.IkMainDicts[i]);
            }
        }
        if (source.IkStopwords != null) {
            this.IkStopwords = new String[source.IkStopwords.length];
            for (int i = 0; i < source.IkStopwords.length; i++) {
                this.IkStopwords[i] = new String(source.IkStopwords[i]);
            }
        }
        if (source.Synonym != null) {
            this.Synonym = new String[source.Synonym.length];
            for (int i = 0; i < source.Synonym.length; i++) {
                this.Synonym[i] = new String(source.Synonym[i]);
            }
        }
        if (source.QQDict != null) {
            this.QQDict = new String[source.QQDict.length];
            for (int i = 0; i < source.QQDict.length; i++) {
                this.QQDict[i] = new String(source.QQDict[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.ForceRestart != null) {
            this.ForceRestart = new Boolean(source.ForceRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "IkMainDicts.", this.IkMainDicts);
        this.setParamArraySimple(map, prefix + "IkStopwords.", this.IkStopwords);
        this.setParamArraySimple(map, prefix + "Synonym.", this.Synonym);
        this.setParamArraySimple(map, prefix + "QQDict.", this.QQDict);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "ForceRestart", this.ForceRestart);

    }
}

