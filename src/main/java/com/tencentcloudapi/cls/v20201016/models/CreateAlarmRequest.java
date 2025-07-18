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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmRequest extends AbstractModel {

    /**
    * 告警策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监控对象列表。
    */
    @SerializedName("AlarmTargets")
    @Expose
    private AlarmTarget [] AlarmTargets;

    /**
    * 监控任务运行时间点。
    */
    @SerializedName("MonitorTime")
    @Expose
    private MonitorTime MonitorTime;

    /**
    * 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。
    */
    @SerializedName("TriggerCount")
    @Expose
    private Long TriggerCount;

    /**
    * 告警重复的周期，单位是分钟。取值范围是0~1440。
    */
    @SerializedName("AlarmPeriod")
    @Expose
    private Long AlarmPeriod;

    /**
    * 关联的告警通知模板列表。
    */
    @SerializedName("AlarmNoticeIds")
    @Expose
    private String [] AlarmNoticeIds;

    /**
    * 触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。

    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 告警级别
0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。
注意:  
- 不填则默认为0。
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 多触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。



    */
    @SerializedName("MultiConditions")
    @Expose
    private MultiCondition [] MultiConditions;

    /**
    * 是否开启告警策略。
默认值为true
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 请使用Status参数控制是否开启告警策略。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 用户自定义告警内容
    */
    @SerializedName("MessageTemplate")
    @Expose
    private String MessageTemplate;

    /**
    * 用户自定义回调
    */
    @SerializedName("CallBack")
    @Expose
    private CallBackInfo CallBack;

    /**
    * 多维分析
    */
    @SerializedName("Analysis")
    @Expose
    private AnalysisDimensional [] Analysis;

    /**
    * 分组触发状态。
默认值false
    */
    @SerializedName("GroupTriggerStatus")
    @Expose
    private Boolean GroupTriggerStatus;

    /**
    * 分组触发条件。
    */
    @SerializedName("GroupTriggerCondition")
    @Expose
    private String [] GroupTriggerCondition;

    /**
    * 标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。

最大支持10个标签键值对，并且不能有重复的键值对。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
不填则默认为0。
当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。

    */
    @SerializedName("MonitorObjectType")
    @Expose
    private Long MonitorObjectType;

    /**
    * 告警附加分类信息列表。
Classifications元素个数不能超过20个。
Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 `^[a-z]([a-z0-9_]{0,49})$`。
Classifications元素的Value长度不能超过200个字符。
    */
    @SerializedName("Classifications")
    @Expose
    private AlarmClassification [] Classifications;

    /**
     * Get 告警策略名称 
     * @return Name 告警策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警策略名称
     * @param Name 告警策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监控对象列表。 
     * @return AlarmTargets 监控对象列表。
     */
    public AlarmTarget [] getAlarmTargets() {
        return this.AlarmTargets;
    }

    /**
     * Set 监控对象列表。
     * @param AlarmTargets 监控对象列表。
     */
    public void setAlarmTargets(AlarmTarget [] AlarmTargets) {
        this.AlarmTargets = AlarmTargets;
    }

    /**
     * Get 监控任务运行时间点。 
     * @return MonitorTime 监控任务运行时间点。
     */
    public MonitorTime getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set 监控任务运行时间点。
     * @param MonitorTime 监控任务运行时间点。
     */
    public void setMonitorTime(MonitorTime MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。 
     * @return TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。
     */
    public Long getTriggerCount() {
        return this.TriggerCount;
    }

    /**
     * Set 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。
     * @param TriggerCount 持续周期。持续满足触发条件TriggerCount个周期后，再进行告警；最小值为1，最大值为2000。
     */
    public void setTriggerCount(Long TriggerCount) {
        this.TriggerCount = TriggerCount;
    }

    /**
     * Get 告警重复的周期，单位是分钟。取值范围是0~1440。 
     * @return AlarmPeriod 告警重复的周期，单位是分钟。取值范围是0~1440。
     */
    public Long getAlarmPeriod() {
        return this.AlarmPeriod;
    }

    /**
     * Set 告警重复的周期，单位是分钟。取值范围是0~1440。
     * @param AlarmPeriod 告警重复的周期，单位是分钟。取值范围是0~1440。
     */
    public void setAlarmPeriod(Long AlarmPeriod) {
        this.AlarmPeriod = AlarmPeriod;
    }

    /**
     * Get 关联的告警通知模板列表。 
     * @return AlarmNoticeIds 关联的告警通知模板列表。
     */
    public String [] getAlarmNoticeIds() {
        return this.AlarmNoticeIds;
    }

    /**
     * Set 关联的告警通知模板列表。
     * @param AlarmNoticeIds 关联的告警通知模板列表。
     */
    public void setAlarmNoticeIds(String [] AlarmNoticeIds) {
        this.AlarmNoticeIds = AlarmNoticeIds;
    }

    /**
     * Get 触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。
 
     * @return Condition 触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。

     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。

     * @param Condition 触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。

     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 告警级别
0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。
注意:  
- 不填则默认为0。
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。 
     * @return AlarmLevel 告警级别
0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。
注意:  
- 不填则默认为0。
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警级别
0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。
注意:  
- 不填则默认为0。
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。
     * @param AlarmLevel 告警级别
0:警告(Warn); 1:提醒(Info); 2:紧急 (Critical)。
注意:  
- 不填则默认为0。
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 多触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。


 
     * @return MultiConditions 多触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。



     */
    public MultiCondition [] getMultiConditions() {
        return this.MultiConditions;
    }

    /**
     * Set 多触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。



     * @param MultiConditions 多触发条件
 注意:  
- Condition和AlarmLevel是一组配置，MultiConditions是另一组配置，2组配置互斥。



     */
    public void setMultiConditions(MultiCondition [] MultiConditions) {
        this.MultiConditions = MultiConditions;
    }

    /**
     * Get 是否开启告警策略。
默认值为true 
     * @return Status 是否开启告警策略。
默认值为true
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开启告警策略。
默认值为true
     * @param Status 是否开启告警策略。
默认值为true
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 请使用Status参数控制是否开启告警策略。 
     * @return Enable 请使用Status参数控制是否开启告警策略。
     * @deprecated
     */
    @Deprecated
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 请使用Status参数控制是否开启告警策略。
     * @param Enable 请使用Status参数控制是否开启告警策略。
     * @deprecated
     */
    @Deprecated
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 用户自定义告警内容 
     * @return MessageTemplate 用户自定义告警内容
     */
    public String getMessageTemplate() {
        return this.MessageTemplate;
    }

    /**
     * Set 用户自定义告警内容
     * @param MessageTemplate 用户自定义告警内容
     */
    public void setMessageTemplate(String MessageTemplate) {
        this.MessageTemplate = MessageTemplate;
    }

    /**
     * Get 用户自定义回调 
     * @return CallBack 用户自定义回调
     */
    public CallBackInfo getCallBack() {
        return this.CallBack;
    }

    /**
     * Set 用户自定义回调
     * @param CallBack 用户自定义回调
     */
    public void setCallBack(CallBackInfo CallBack) {
        this.CallBack = CallBack;
    }

    /**
     * Get 多维分析 
     * @return Analysis 多维分析
     */
    public AnalysisDimensional [] getAnalysis() {
        return this.Analysis;
    }

    /**
     * Set 多维分析
     * @param Analysis 多维分析
     */
    public void setAnalysis(AnalysisDimensional [] Analysis) {
        this.Analysis = Analysis;
    }

    /**
     * Get 分组触发状态。
默认值false 
     * @return GroupTriggerStatus 分组触发状态。
默认值false
     */
    public Boolean getGroupTriggerStatus() {
        return this.GroupTriggerStatus;
    }

    /**
     * Set 分组触发状态。
默认值false
     * @param GroupTriggerStatus 分组触发状态。
默认值false
     */
    public void setGroupTriggerStatus(Boolean GroupTriggerStatus) {
        this.GroupTriggerStatus = GroupTriggerStatus;
    }

    /**
     * Get 分组触发条件。 
     * @return GroupTriggerCondition 分组触发条件。
     */
    public String [] getGroupTriggerCondition() {
        return this.GroupTriggerCondition;
    }

    /**
     * Set 分组触发条件。
     * @param GroupTriggerCondition 分组触发条件。
     */
    public void setGroupTriggerCondition(String [] GroupTriggerCondition) {
        this.GroupTriggerCondition = GroupTriggerCondition;
    }

    /**
     * Get 标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。

最大支持10个标签键值对，并且不能有重复的键值对。 
     * @return Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。

最大支持10个标签键值对，并且不能有重复的键值对。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。

最大支持10个标签键值对，并且不能有重复的键值对。
     * @param Tags 标签描述列表，通过指定该参数可以同时绑定标签到相应的告警策略。

最大支持10个标签键值对，并且不能有重复的键值对。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
不填则默认为0。
当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。
 
     * @return MonitorObjectType 监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
不填则默认为0。
当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。

     */
    public Long getMonitorObjectType() {
        return this.MonitorObjectType;
    }

    /**
     * Set 监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
不填则默认为0。
当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。

     * @param MonitorObjectType 监控对象类型。0:执行语句共用监控对象; 1:每个执行语句单独选择监控对象。 
不填则默认为0。
当值为1时，AlarmTargets元素个数不能超过10个，AlarmTargets中的Number必须是从1开始的连续正整数，不能重复。

     */
    public void setMonitorObjectType(Long MonitorObjectType) {
        this.MonitorObjectType = MonitorObjectType;
    }

    /**
     * Get 告警附加分类信息列表。
Classifications元素个数不能超过20个。
Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 `^[a-z]([a-z0-9_]{0,49})$`。
Classifications元素的Value长度不能超过200个字符。 
     * @return Classifications 告警附加分类信息列表。
Classifications元素个数不能超过20个。
Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 `^[a-z]([a-z0-9_]{0,49})$`。
Classifications元素的Value长度不能超过200个字符。
     */
    public AlarmClassification [] getClassifications() {
        return this.Classifications;
    }

    /**
     * Set 告警附加分类信息列表。
Classifications元素个数不能超过20个。
Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 `^[a-z]([a-z0-9_]{0,49})$`。
Classifications元素的Value长度不能超过200个字符。
     * @param Classifications 告警附加分类信息列表。
Classifications元素个数不能超过20个。
Classifications元素的Key不能为空，不能重复，长度不能超过50个字符，符合正则 `^[a-z]([a-z0-9_]{0,49})$`。
Classifications元素的Value长度不能超过200个字符。
     */
    public void setClassifications(AlarmClassification [] Classifications) {
        this.Classifications = Classifications;
    }

    public CreateAlarmRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmRequest(CreateAlarmRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AlarmTargets != null) {
            this.AlarmTargets = new AlarmTarget[source.AlarmTargets.length];
            for (int i = 0; i < source.AlarmTargets.length; i++) {
                this.AlarmTargets[i] = new AlarmTarget(source.AlarmTargets[i]);
            }
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new MonitorTime(source.MonitorTime);
        }
        if (source.TriggerCount != null) {
            this.TriggerCount = new Long(source.TriggerCount);
        }
        if (source.AlarmPeriod != null) {
            this.AlarmPeriod = new Long(source.AlarmPeriod);
        }
        if (source.AlarmNoticeIds != null) {
            this.AlarmNoticeIds = new String[source.AlarmNoticeIds.length];
            for (int i = 0; i < source.AlarmNoticeIds.length; i++) {
                this.AlarmNoticeIds[i] = new String(source.AlarmNoticeIds[i]);
            }
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.MultiConditions != null) {
            this.MultiConditions = new MultiCondition[source.MultiConditions.length];
            for (int i = 0; i < source.MultiConditions.length; i++) {
                this.MultiConditions[i] = new MultiCondition(source.MultiConditions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.MessageTemplate != null) {
            this.MessageTemplate = new String(source.MessageTemplate);
        }
        if (source.CallBack != null) {
            this.CallBack = new CallBackInfo(source.CallBack);
        }
        if (source.Analysis != null) {
            this.Analysis = new AnalysisDimensional[source.Analysis.length];
            for (int i = 0; i < source.Analysis.length; i++) {
                this.Analysis[i] = new AnalysisDimensional(source.Analysis[i]);
            }
        }
        if (source.GroupTriggerStatus != null) {
            this.GroupTriggerStatus = new Boolean(source.GroupTriggerStatus);
        }
        if (source.GroupTriggerCondition != null) {
            this.GroupTriggerCondition = new String[source.GroupTriggerCondition.length];
            for (int i = 0; i < source.GroupTriggerCondition.length; i++) {
                this.GroupTriggerCondition[i] = new String(source.GroupTriggerCondition[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.MonitorObjectType != null) {
            this.MonitorObjectType = new Long(source.MonitorObjectType);
        }
        if (source.Classifications != null) {
            this.Classifications = new AlarmClassification[source.Classifications.length];
            for (int i = 0; i < source.Classifications.length; i++) {
                this.Classifications[i] = new AlarmClassification(source.Classifications[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "AlarmTargets.", this.AlarmTargets);
        this.setParamObj(map, prefix + "MonitorTime.", this.MonitorTime);
        this.setParamSimple(map, prefix + "TriggerCount", this.TriggerCount);
        this.setParamSimple(map, prefix + "AlarmPeriod", this.AlarmPeriod);
        this.setParamArraySimple(map, prefix + "AlarmNoticeIds.", this.AlarmNoticeIds);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArrayObj(map, prefix + "MultiConditions.", this.MultiConditions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "MessageTemplate", this.MessageTemplate);
        this.setParamObj(map, prefix + "CallBack.", this.CallBack);
        this.setParamArrayObj(map, prefix + "Analysis.", this.Analysis);
        this.setParamSimple(map, prefix + "GroupTriggerStatus", this.GroupTriggerStatus);
        this.setParamArraySimple(map, prefix + "GroupTriggerCondition.", this.GroupTriggerCondition);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MonitorObjectType", this.MonitorObjectType);
        this.setParamArrayObj(map, prefix + "Classifications.", this.Classifications);

    }
}

