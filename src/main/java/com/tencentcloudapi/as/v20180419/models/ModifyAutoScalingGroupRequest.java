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

public class ModifyAutoScalingGroupRequest extends AbstractModel {

    /**
    * 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * 默认冷却时间，单位秒，取值范围 [0,3600]，默认值为300。
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Long DefaultCooldown;

    /**
    * 期望实例数，取值范围 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * 启动配置ID。可以通过如下方式获取可用的启动配置ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 最大实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * 最小实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * 项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 ProjectId 字段来获取。默认值为 0，表示使用默认项目。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 子网ID列表。有效的私有网络子网ID可通过登录[控制台](https://console.cloud.tencent.com/vpc/subnet)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/product/215/15784) ，从接口返回中的SubnetId字段获取。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。</li>
<li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。</li>
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * 私有网络ID。修改私有网络时，需将 SubnetIds 参数同步修改为该私有网络的子网。有效的 VpcId 可通过登录[控制台](https://console.cloud.tencent.com/vpc/vpc)查询；也可以调用接口 [DescribeVpc](https://cloud.tencent.com/document/api/215/15778) ，从接口返回中的 VpcId 字段获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区列表
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。部分成功的伸缩活动判定为一次失败活动。
<li>IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li>
<li>INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。</li>
<li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。</li>
<li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。</li>

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
    * 服务设置，包括云监控不健康替换等服务设置。
    */
    @SerializedName("ServiceSettings")
    @Expose
    private ServiceSettings ServiceSettings;

    /**
    * 实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 [IPv6使用限制](https://cloud.tencent.com/document/product/1142/38369)。
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * 多可用区/子网策略，取值包括 PRIORITY 和 EQUALITY，默认为 PRIORITY。
<li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li> 
<li> EQUALITY：扩容出的实例会打散到多个可用区/子网，保证扩容后的各个可用区/子网实例数相对均衡。</li> 

与本策略相关的注意点：
<li> 当伸缩组为基础网络时，本策略适用于多可用区；当伸缩组为VPC网络时，本策略适用于多子网，此时不再考虑可用区因素，例如四个子网ABCD，其中ABC处于可用区1，D处于可用区2，此时考虑子网ABCD进行排序，而不考虑可用区1、2。</li> 
<li> 本策略适用于多可用区/子网，不适用于启动配置的多机型。多机型按照优先级策略进行选择。</li> 
<li> 按照 PRIORITY 策略创建实例时，先保证多机型的策略，后保证多可用区/子网的策略。例如多机型A、B，多子网1、2、3，会按照A1、A2、A3、B1、B2、B3 进行尝试，如果A1售罄，会尝试A2（而非B1）。</li> 
    */
    @SerializedName("MultiZoneSubnetPolicy")
    @Expose
    private String MultiZoneSubnetPolicy;

    /**
    * 伸缩组实例健康检查类型，取值如下：
<li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li>
<li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * CLB健康检查宽限期。
    */
    @SerializedName("LoadBalancerHealthCheckGracePeriod")
    @Expose
    private Long LoadBalancerHealthCheckGracePeriod;

    /**
    * 实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。
<li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li>
<li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
    */
    @SerializedName("InstanceAllocationPolicy")
    @Expose
    private String InstanceAllocationPolicy;

    /**
    * 竞价混合模式下，各计费类型实例的分配策略。
仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时可用。
    */
    @SerializedName("SpotMixedAllocationPolicy")
    @Expose
    private SpotMixedAllocationPolicy SpotMixedAllocationPolicy;

    /**
    * 容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：
<li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li> 
<li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li> 
    */
    @SerializedName("CapacityRebalance")
    @Expose
    private Boolean CapacityRebalance;

    /**
    * 实例名称序号相关设置。开启后为伸缩组内自动创建的实例名称添加递增的数字序号。
    */
    @SerializedName("InstanceNameIndexSettings")
    @Expose
    private InstanceNameIndexSettings InstanceNameIndexSettings;

    /**
     * Get 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li> 
     * @return AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     * @param AutoScalingGroupId 伸缩组ID。可以通过如下方式获取可用的伸缩组ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 查询伸缩组ID。</li>
<li>通过调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。 
     * @return AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     * @param AutoScalingGroupName 伸缩组名称，在您账号中必须唯一。名称仅支持中文、英文、数字、下划线、分隔符"-"、小数点，最大长度不能超55个字节。
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get 默认冷却时间，单位秒，取值范围 [0,3600]，默认值为300。 
     * @return DefaultCooldown 默认冷却时间，单位秒，取值范围 [0,3600]，默认值为300。
     */
    public Long getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set 默认冷却时间，单位秒，取值范围 [0,3600]，默认值为300。
     * @param DefaultCooldown 默认冷却时间，单位秒，取值范围 [0,3600]，默认值为300。
     */
    public void setDefaultCooldown(Long DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get 期望实例数，取值范围 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。 
     * @return DesiredCapacity 期望实例数，取值范围 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set 期望实例数，取值范围 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     * @param DesiredCapacity 期望实例数，取值范围 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get 启动配置ID。可以通过如下方式获取可用的启动配置ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li> 
     * @return LaunchConfigurationId 启动配置ID。可以通过如下方式获取可用的启动配置ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set 启动配置ID。可以通过如下方式获取可用的启动配置ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     * @param LaunchConfigurationId 启动配置ID。可以通过如下方式获取可用的启动配置ID:
<li>通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/config) 查询启动配置ID。</li>
<li>通过调用接口 [DescribeLaunchConfigurations](https://cloud.tencent.com/document/api/377/20445) ，取返回信息中的 LaunchConfigurationId 获取启动配置ID。</li>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get 最大实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。 
     * @return MaxSize 最大实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 最大实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     * @param MaxSize 最大实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get 最小实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。 
     * @return MinSize 最小实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set 最小实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     * @param MinSize 最小实例数，取值范围为 [0,2000]。需满足最大值大于等于期望值，期望值大于等于最小值。
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get 项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 ProjectId 字段来获取。默认值为 0，表示使用默认项目。 
     * @return ProjectId 项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 ProjectId 字段来获取。默认值为 0，表示使用默认项目。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 ProjectId 字段来获取。默认值为 0，表示使用默认项目。
     * @param ProjectId 项目ID。该参数可以通过调用 [DescribeProject](https://cloud.tencent.com/document/api/651/78725) 的返回值中的 ProjectId 字段来获取。默认值为 0，表示使用默认项目。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 子网ID列表。有效的私有网络子网ID可通过登录[控制台](https://console.cloud.tencent.com/vpc/subnet)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/product/215/15784) ，从接口返回中的SubnetId字段获取。 
     * @return SubnetIds 子网ID列表。有效的私有网络子网ID可通过登录[控制台](https://console.cloud.tencent.com/vpc/subnet)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/product/215/15784) ，从接口返回中的SubnetId字段获取。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID列表。有效的私有网络子网ID可通过登录[控制台](https://console.cloud.tencent.com/vpc/subnet)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/product/215/15784) ，从接口返回中的SubnetId字段获取。
     * @param SubnetIds 子网ID列表。有效的私有网络子网ID可通过登录[控制台](https://console.cloud.tencent.com/vpc/subnet)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/product/215/15784) ，从接口返回中的SubnetId字段获取。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。</li>
<li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。</li> 
     * @return TerminationPolicies 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。</li>
<li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。</li>
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * Set 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。</li>
<li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。</li>
     * @param TerminationPolicies 销毁策略，目前长度上限为1。取值包括 OLDEST_INSTANCE 和 NEWEST_INSTANCE。
<li> OLDEST_INSTANCE 优先销毁伸缩组中最旧的实例。</li>
<li> NEWEST_INSTANCE，优先销毁伸缩组中最新的实例。</li>
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * Get 私有网络ID。修改私有网络时，需将 SubnetIds 参数同步修改为该私有网络的子网。有效的 VpcId 可通过登录[控制台](https://console.cloud.tencent.com/vpc/vpc)查询；也可以调用接口 [DescribeVpc](https://cloud.tencent.com/document/api/215/15778) ，从接口返回中的 VpcId 字段获取。 
     * @return VpcId 私有网络ID。修改私有网络时，需将 SubnetIds 参数同步修改为该私有网络的子网。有效的 VpcId 可通过登录[控制台](https://console.cloud.tencent.com/vpc/vpc)查询；也可以调用接口 [DescribeVpc](https://cloud.tencent.com/document/api/215/15778) ，从接口返回中的 VpcId 字段获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID。修改私有网络时，需将 SubnetIds 参数同步修改为该私有网络的子网。有效的 VpcId 可通过登录[控制台](https://console.cloud.tencent.com/vpc/vpc)查询；也可以调用接口 [DescribeVpc](https://cloud.tencent.com/document/api/215/15778) ，从接口返回中的 VpcId 字段获取。
     * @param VpcId 私有网络ID。修改私有网络时，需将 SubnetIds 参数同步修改为该私有网络的子网。有效的 VpcId 可通过登录[控制台](https://console.cloud.tencent.com/vpc/vpc)查询；也可以调用接口 [DescribeVpc](https://cloud.tencent.com/document/api/215/15778) ，从接口返回中的 VpcId 字段获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 可用区列表 
     * @return Zones 可用区列表
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 可用区列表
     * @param Zones 可用区列表
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。部分成功的伸缩活动判定为一次失败活动。
<li>IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li>
<li>INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。</li>
<li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li> 
     * @return RetryPolicy 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。部分成功的伸缩活动判定为一次失败活动。
<li>IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li>
<li>INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。</li>
<li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。部分成功的伸缩活动判定为一次失败活动。
<li>IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li>
<li>INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。</li>
<li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     * @param RetryPolicy 重试策略，取值包括 IMMEDIATE_RETRY、 INCREMENTAL_INTERVALS、NO_RETRY，默认取值为 IMMEDIATE_RETRY。部分成功的伸缩活动判定为一次失败活动。
<li>IMMEDIATE_RETRY，立即重试，在较短时间内快速重试，连续失败超过一定次数（5次）后不再重试。</li>
<li>INCREMENTAL_INTERVALS，间隔递增重试，随着连续失败次数的增加，重试间隔逐渐增大，重试间隔从秒级到1天不等。</li>
<li> NO_RETRY，不进行重试，直到再次收到用户调用或者告警信息后才会重试。</li>
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。</li>
<li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。</li>

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。 
     * @return ZonesCheckPolicy 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。</li>
<li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。</li>

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * Set 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。</li>
<li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。</li>

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     * @param ZonesCheckPolicy 可用区校验策略，取值包括 ALL 和 ANY，默认取值为ANY。在伸缩组实际变更资源相关字段时（启动配置、可用区、子网）发挥作用。
<li> ALL，所有可用区（Zone）或子网（SubnetId）都可用则通过校验，否则校验报错。</li>
<li> ANY，存在任何一个可用区（Zone）或子网（SubnetId）可用则通过校验，否则校验报错。</li>

可用区或子网不可用的常见原因包括该可用区CVM实例类型售罄、该可用区CBS云盘售罄、该可用区配额不足、该子网IP不足等。
如果 Zones/SubnetIds 中可用区或者子网不存在，则无论 ZonesCheckPolicy 采用何种取值，都会校验报错。
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * Get 服务设置，包括云监控不健康替换等服务设置。 
     * @return ServiceSettings 服务设置，包括云监控不健康替换等服务设置。
     */
    public ServiceSettings getServiceSettings() {
        return this.ServiceSettings;
    }

    /**
     * Set 服务设置，包括云监控不健康替换等服务设置。
     * @param ServiceSettings 服务设置，包括云监控不健康替换等服务设置。
     */
    public void setServiceSettings(ServiceSettings ServiceSettings) {
        this.ServiceSettings = ServiceSettings;
    }

    /**
     * Get 实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 [IPv6使用限制](https://cloud.tencent.com/document/product/1142/38369)。 
     * @return Ipv6AddressCount 实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 [IPv6使用限制](https://cloud.tencent.com/document/product/1142/38369)。
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set 实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 [IPv6使用限制](https://cloud.tencent.com/document/product/1142/38369)。
     * @param Ipv6AddressCount 实例具有IPv6地址数量的配置，取值包括0、1。默认值为 0，表示实例不分配 IPv6 地址。需使用支持 IPv6 的私有网络，需在子网中开启 IPv6 CIDR，其他使用限制可参考 [IPv6使用限制](https://cloud.tencent.com/document/product/1142/38369)。
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get 多可用区/子网策略，取值包括 PRIORITY 和 EQUALITY，默认为 PRIORITY。
<li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li> 
<li> EQUALITY：扩容出的实例会打散到多个可用区/子网，保证扩容后的各个可用区/子网实例数相对均衡。</li> 

与本策略相关的注意点：
<li> 当伸缩组为基础网络时，本策略适用于多可用区；当伸缩组为VPC网络时，本策略适用于多子网，此时不再考虑可用区因素，例如四个子网ABCD，其中ABC处于可用区1，D处于可用区2，此时考虑子网ABCD进行排序，而不考虑可用区1、2。</li> 
<li> 本策略适用于多可用区/子网，不适用于启动配置的多机型。多机型按照优先级策略进行选择。</li> 
<li> 按照 PRIORITY 策略创建实例时，先保证多机型的策略，后保证多可用区/子网的策略。例如多机型A、B，多子网1、2、3，会按照A1、A2、A3、B1、B2、B3 进行尝试，如果A1售罄，会尝试A2（而非B1）。</li>  
     * @return MultiZoneSubnetPolicy 多可用区/子网策略，取值包括 PRIORITY 和 EQUALITY，默认为 PRIORITY。
<li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li> 
<li> EQUALITY：扩容出的实例会打散到多个可用区/子网，保证扩容后的各个可用区/子网实例数相对均衡。</li> 

与本策略相关的注意点：
<li> 当伸缩组为基础网络时，本策略适用于多可用区；当伸缩组为VPC网络时，本策略适用于多子网，此时不再考虑可用区因素，例如四个子网ABCD，其中ABC处于可用区1，D处于可用区2，此时考虑子网ABCD进行排序，而不考虑可用区1、2。</li> 
<li> 本策略适用于多可用区/子网，不适用于启动配置的多机型。多机型按照优先级策略进行选择。</li> 
<li> 按照 PRIORITY 策略创建实例时，先保证多机型的策略，后保证多可用区/子网的策略。例如多机型A、B，多子网1、2、3，会按照A1、A2、A3、B1、B2、B3 进行尝试，如果A1售罄，会尝试A2（而非B1）。</li> 
     */
    public String getMultiZoneSubnetPolicy() {
        return this.MultiZoneSubnetPolicy;
    }

    /**
     * Set 多可用区/子网策略，取值包括 PRIORITY 和 EQUALITY，默认为 PRIORITY。
<li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li> 
<li> EQUALITY：扩容出的实例会打散到多个可用区/子网，保证扩容后的各个可用区/子网实例数相对均衡。</li> 

与本策略相关的注意点：
<li> 当伸缩组为基础网络时，本策略适用于多可用区；当伸缩组为VPC网络时，本策略适用于多子网，此时不再考虑可用区因素，例如四个子网ABCD，其中ABC处于可用区1，D处于可用区2，此时考虑子网ABCD进行排序，而不考虑可用区1、2。</li> 
<li> 本策略适用于多可用区/子网，不适用于启动配置的多机型。多机型按照优先级策略进行选择。</li> 
<li> 按照 PRIORITY 策略创建实例时，先保证多机型的策略，后保证多可用区/子网的策略。例如多机型A、B，多子网1、2、3，会按照A1、A2、A3、B1、B2、B3 进行尝试，如果A1售罄，会尝试A2（而非B1）。</li> 
     * @param MultiZoneSubnetPolicy 多可用区/子网策略，取值包括 PRIORITY 和 EQUALITY，默认为 PRIORITY。
<li> PRIORITY，按照可用区/子网列表的顺序，作为优先级来尝试创建实例，如果优先级最高的可用区/子网可以创建成功，则总在该可用区/子网创建。</li> 
<li> EQUALITY：扩容出的实例会打散到多个可用区/子网，保证扩容后的各个可用区/子网实例数相对均衡。</li> 

与本策略相关的注意点：
<li> 当伸缩组为基础网络时，本策略适用于多可用区；当伸缩组为VPC网络时，本策略适用于多子网，此时不再考虑可用区因素，例如四个子网ABCD，其中ABC处于可用区1，D处于可用区2，此时考虑子网ABCD进行排序，而不考虑可用区1、2。</li> 
<li> 本策略适用于多可用区/子网，不适用于启动配置的多机型。多机型按照优先级策略进行选择。</li> 
<li> 按照 PRIORITY 策略创建实例时，先保证多机型的策略，后保证多可用区/子网的策略。例如多机型A、B，多子网1、2、3，会按照A1、A2、A3、B1、B2、B3 进行尝试，如果A1售罄，会尝试A2（而非B1）。</li> 
     */
    public void setMultiZoneSubnetPolicy(String MultiZoneSubnetPolicy) {
        this.MultiZoneSubnetPolicy = MultiZoneSubnetPolicy;
    }

    /**
     * Get 伸缩组实例健康检查类型，取值如下：
<li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li>
<li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li> 
     * @return HealthCheckType 伸缩组实例健康检查类型，取值如下：
<li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li>
<li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set 伸缩组实例健康检查类型，取值如下：
<li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li>
<li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     * @param HealthCheckType 伸缩组实例健康检查类型，取值如下：
<li>CVM：根据实例网络状态判断实例是否处于不健康状态，不健康的网络状态即发生实例 PING 不可达事件，详细判断标准可参考[实例健康检查](https://cloud.tencent.com/document/product/377/8553)</li>
<li>CLB：根据 CLB 的健康检查状态判断实例是否处于不健康状态，CLB健康检查原理可参考[健康检查](https://cloud.tencent.com/document/product/214/6097)</li>
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get CLB健康检查宽限期。 
     * @return LoadBalancerHealthCheckGracePeriod CLB健康检查宽限期。
     */
    public Long getLoadBalancerHealthCheckGracePeriod() {
        return this.LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Set CLB健康检查宽限期。
     * @param LoadBalancerHealthCheckGracePeriod CLB健康检查宽限期。
     */
    public void setLoadBalancerHealthCheckGracePeriod(Long LoadBalancerHealthCheckGracePeriod) {
        this.LoadBalancerHealthCheckGracePeriod = LoadBalancerHealthCheckGracePeriod;
    }

    /**
     * Get 实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。
<li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li>
<li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li> 
     * @return InstanceAllocationPolicy 实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。
<li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li>
<li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     */
    public String getInstanceAllocationPolicy() {
        return this.InstanceAllocationPolicy;
    }

    /**
     * Set 实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。
<li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li>
<li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     * @param InstanceAllocationPolicy 实例分配策略，取值包括 LAUNCH_CONFIGURATION 和 SPOT_MIXED。
<li> LAUNCH_CONFIGURATION，代表传统的按照启动配置模式。</li>
<li> SPOT_MIXED，代表竞价混合模式。目前仅支持启动配置为按量计费模式时使用混合模式，混合模式下，伸缩组将根据设定扩容按量或竞价机型。使用混合模式时，关联的启动配置的计费类型不可被修改。</li>
     */
    public void setInstanceAllocationPolicy(String InstanceAllocationPolicy) {
        this.InstanceAllocationPolicy = InstanceAllocationPolicy;
    }

    /**
     * Get 竞价混合模式下，各计费类型实例的分配策略。
仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时可用。 
     * @return SpotMixedAllocationPolicy 竞价混合模式下，各计费类型实例的分配策略。
仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时可用。
     */
    public SpotMixedAllocationPolicy getSpotMixedAllocationPolicy() {
        return this.SpotMixedAllocationPolicy;
    }

    /**
     * Set 竞价混合模式下，各计费类型实例的分配策略。
仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时可用。
     * @param SpotMixedAllocationPolicy 竞价混合模式下，各计费类型实例的分配策略。
仅当 InstanceAllocationPolicy 取 SPOT_MIXED 时可用。
     */
    public void setSpotMixedAllocationPolicy(SpotMixedAllocationPolicy SpotMixedAllocationPolicy) {
        this.SpotMixedAllocationPolicy = SpotMixedAllocationPolicy;
    }

    /**
     * Get 容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：
<li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li> 
<li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li>  
     * @return CapacityRebalance 容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：
<li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li> 
<li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li> 
     */
    public Boolean getCapacityRebalance() {
        return this.CapacityRebalance;
    }

    /**
     * Set 容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：
<li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li> 
<li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li> 
     * @param CapacityRebalance 容量重平衡功能，仅对伸缩组内的竞价实例有效。取值范围：
<li> TRUE，开启该功能，当伸缩组内的竞价实例即将被竞价实例服务自动回收前，AS 主动发起竞价实例销毁流程，如果有配置过缩容 hook，则销毁前 hook 会生效。销毁流程启动后，AS 会异步开启一个扩容活动，用于补齐期望实例数。</li> 
<li> FALSE，不开启该功能，则 AS 等待竞价实例被销毁后才会去扩容补齐伸缩组期望实例数。</li> 
     */
    public void setCapacityRebalance(Boolean CapacityRebalance) {
        this.CapacityRebalance = CapacityRebalance;
    }

    /**
     * Get 实例名称序号相关设置。开启后为伸缩组内自动创建的实例名称添加递增的数字序号。 
     * @return InstanceNameIndexSettings 实例名称序号相关设置。开启后为伸缩组内自动创建的实例名称添加递增的数字序号。
     */
    public InstanceNameIndexSettings getInstanceNameIndexSettings() {
        return this.InstanceNameIndexSettings;
    }

    /**
     * Set 实例名称序号相关设置。开启后为伸缩组内自动创建的实例名称添加递增的数字序号。
     * @param InstanceNameIndexSettings 实例名称序号相关设置。开启后为伸缩组内自动创建的实例名称添加递增的数字序号。
     */
    public void setInstanceNameIndexSettings(InstanceNameIndexSettings InstanceNameIndexSettings) {
        this.InstanceNameIndexSettings = InstanceNameIndexSettings;
    }

    public ModifyAutoScalingGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoScalingGroupRequest(ModifyAutoScalingGroupRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.AutoScalingGroupName != null) {
            this.AutoScalingGroupName = new String(source.AutoScalingGroupName);
        }
        if (source.DefaultCooldown != null) {
            this.DefaultCooldown = new Long(source.DefaultCooldown);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.TerminationPolicies != null) {
            this.TerminationPolicies = new String[source.TerminationPolicies.length];
            for (int i = 0; i < source.TerminationPolicies.length; i++) {
                this.TerminationPolicies[i] = new String(source.TerminationPolicies[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new String(source.RetryPolicy);
        }
        if (source.ZonesCheckPolicy != null) {
            this.ZonesCheckPolicy = new String(source.ZonesCheckPolicy);
        }
        if (source.ServiceSettings != null) {
            this.ServiceSettings = new ServiceSettings(source.ServiceSettings);
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.MultiZoneSubnetPolicy != null) {
            this.MultiZoneSubnetPolicy = new String(source.MultiZoneSubnetPolicy);
        }
        if (source.HealthCheckType != null) {
            this.HealthCheckType = new String(source.HealthCheckType);
        }
        if (source.LoadBalancerHealthCheckGracePeriod != null) {
            this.LoadBalancerHealthCheckGracePeriod = new Long(source.LoadBalancerHealthCheckGracePeriod);
        }
        if (source.InstanceAllocationPolicy != null) {
            this.InstanceAllocationPolicy = new String(source.InstanceAllocationPolicy);
        }
        if (source.SpotMixedAllocationPolicy != null) {
            this.SpotMixedAllocationPolicy = new SpotMixedAllocationPolicy(source.SpotMixedAllocationPolicy);
        }
        if (source.CapacityRebalance != null) {
            this.CapacityRebalance = new Boolean(source.CapacityRebalance);
        }
        if (source.InstanceNameIndexSettings != null) {
            this.InstanceNameIndexSettings = new InstanceNameIndexSettings(source.InstanceNameIndexSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);
        this.setParamObj(map, prefix + "ServiceSettings.", this.ServiceSettings);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "MultiZoneSubnetPolicy", this.MultiZoneSubnetPolicy);
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "LoadBalancerHealthCheckGracePeriod", this.LoadBalancerHealthCheckGracePeriod);
        this.setParamSimple(map, prefix + "InstanceAllocationPolicy", this.InstanceAllocationPolicy);
        this.setParamObj(map, prefix + "SpotMixedAllocationPolicy.", this.SpotMixedAllocationPolicy);
        this.setParamSimple(map, prefix + "CapacityRebalance", this.CapacityRebalance);
        this.setParamObj(map, prefix + "InstanceNameIndexSettings.", this.InstanceNameIndexSettings);

    }
}

