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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecycleHook extends AbstractModel {

    /**
    * 生命周期挂钩ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * 生命周期挂钩名称
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * 伸缩组ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
- CONTINUE: 默认值，表示继续执行扩缩容活动
- ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * 生命周期挂钩超时等待时间（以秒为单位），范围从 30 到 7200 秒。
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Long HeartbeatTimeout;

    /**
    * 生命周期挂钩场景，取值范围如下:
- INSTANCE_LAUNCHING: 扩容生命周期挂钩
- INSTANCE_TERMINATING: 缩容生命周期挂钩
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * 通知目标的附加信息
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * 创建时间，采用 UTC 标准计时
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 通知目标
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
    * 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
    */
    @SerializedName("LifecycleTransitionType")
    @Expose
    private String LifecycleTransitionType;

    /**
    * 远程命令执行对象
    */
    @SerializedName("LifecycleCommand")
    @Expose
    private LifecycleCommand LifecycleCommand;

    /**
     * Get 生命周期挂钩ID 
     * @return LifecycleHookId 生命周期挂钩ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set 生命周期挂钩ID
     * @param LifecycleHookId 生命周期挂钩ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Get 生命周期挂钩名称 
     * @return LifecycleHookName 生命周期挂钩名称
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set 生命周期挂钩名称
     * @param LifecycleHookName 生命周期挂钩名称
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get 伸缩组ID 
     * @return AutoScalingGroupId 伸缩组ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID
     * @param AutoScalingGroupId 伸缩组ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
- CONTINUE: 默认值，表示继续执行扩缩容活动
- ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动 
     * @return DefaultResult 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
- CONTINUE: 默认值，表示继续执行扩缩容活动
- ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
- CONTINUE: 默认值，表示继续执行扩缩容活动
- ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动
     * @param DefaultResult 定义伸缩组在生命周期挂钩超时或 LifecycleCommand 执行失败时应采取的操作，取值范围如下：
- CONTINUE: 默认值，表示继续执行扩缩容活动
- ABANDON: 针对扩容挂钩，挂钩超时或 LifecycleCommand 执行失败的 CVM 实例会直接释放或移出；而针对缩容挂钩，会继续执行缩容活动
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get 生命周期挂钩超时等待时间（以秒为单位），范围从 30 到 7200 秒。 
     * @return HeartbeatTimeout 生命周期挂钩超时等待时间（以秒为单位），范围从 30 到 7200 秒。
     */
    public Long getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set 生命周期挂钩超时等待时间（以秒为单位），范围从 30 到 7200 秒。
     * @param HeartbeatTimeout 生命周期挂钩超时等待时间（以秒为单位），范围从 30 到 7200 秒。
     */
    public void setHeartbeatTimeout(Long HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get 生命周期挂钩场景，取值范围如下:
- INSTANCE_LAUNCHING: 扩容生命周期挂钩
- INSTANCE_TERMINATING: 缩容生命周期挂钩 
     * @return LifecycleTransition 生命周期挂钩场景，取值范围如下:
- INSTANCE_LAUNCHING: 扩容生命周期挂钩
- INSTANCE_TERMINATING: 缩容生命周期挂钩
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set 生命周期挂钩场景，取值范围如下:
- INSTANCE_LAUNCHING: 扩容生命周期挂钩
- INSTANCE_TERMINATING: 缩容生命周期挂钩
     * @param LifecycleTransition 生命周期挂钩场景，取值范围如下:
- INSTANCE_LAUNCHING: 扩容生命周期挂钩
- INSTANCE_TERMINATING: 缩容生命周期挂钩
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get 通知目标的附加信息 
     * @return NotificationMetadata 通知目标的附加信息
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set 通知目标的附加信息
     * @param NotificationMetadata 通知目标的附加信息
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get 创建时间，采用 UTC 标准计时 
     * @return CreatedTime 创建时间，采用 UTC 标准计时
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间，采用 UTC 标准计时
     * @param CreatedTime 创建时间，采用 UTC 标准计时
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 通知目标 
     * @return NotificationTarget 通知目标
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set 通知目标
     * @param NotificationTarget 通知目标
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Get 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。 
     * @return LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     */
    public String getLifecycleTransitionType() {
        return this.LifecycleTransitionType;
    }

    /**
     * Set 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     * @param LifecycleTransitionType 进行生命周期挂钩的场景类型，取值范围包括 NORMAL 和 EXTENSION，默认值为 NORMAL。
说明：设置为EXTENSION值，在AttachInstances、DetachInstances、RemoveInstances 接口时会触发生命周期挂钩操作，值为NORMAL则不会在这些接口中触发生命周期挂钩。
     */
    public void setLifecycleTransitionType(String LifecycleTransitionType) {
        this.LifecycleTransitionType = LifecycleTransitionType;
    }

    /**
     * Get 远程命令执行对象 
     * @return LifecycleCommand 远程命令执行对象
     */
    public LifecycleCommand getLifecycleCommand() {
        return this.LifecycleCommand;
    }

    /**
     * Set 远程命令执行对象
     * @param LifecycleCommand 远程命令执行对象
     */
    public void setLifecycleCommand(LifecycleCommand LifecycleCommand) {
        this.LifecycleCommand = LifecycleCommand;
    }

    public LifecycleHook() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecycleHook(LifecycleHook source) {
        if (source.LifecycleHookId != null) {
            this.LifecycleHookId = new String(source.LifecycleHookId);
        }
        if (source.LifecycleHookName != null) {
            this.LifecycleHookName = new String(source.LifecycleHookName);
        }
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.DefaultResult != null) {
            this.DefaultResult = new String(source.DefaultResult);
        }
        if (source.HeartbeatTimeout != null) {
            this.HeartbeatTimeout = new Long(source.HeartbeatTimeout);
        }
        if (source.LifecycleTransition != null) {
            this.LifecycleTransition = new String(source.LifecycleTransition);
        }
        if (source.NotificationMetadata != null) {
            this.NotificationMetadata = new String(source.NotificationMetadata);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.NotificationTarget != null) {
            this.NotificationTarget = new NotificationTarget(source.NotificationTarget);
        }
        if (source.LifecycleTransitionType != null) {
            this.LifecycleTransitionType = new String(source.LifecycleTransitionType);
        }
        if (source.LifecycleCommand != null) {
            this.LifecycleCommand = new LifecycleCommand(source.LifecycleCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);
        this.setParamSimple(map, prefix + "LifecycleTransitionType", this.LifecycleTransitionType);
        this.setParamObj(map, prefix + "LifecycleCommand.", this.LifecycleCommand);

    }
}

