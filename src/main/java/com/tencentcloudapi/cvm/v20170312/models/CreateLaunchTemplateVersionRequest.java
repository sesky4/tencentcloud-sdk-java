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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLaunchTemplateVersionRequest extends AbstractModel {

    /**
    * 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目，所属宿主机（在专用宿主机上创建子机时指定）等属性。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 启动模板ID，新版本将基于该实例启动模板ID创建。可通过 [DescribeLaunchTemplates](https://cloud.tencent.com/document/api/213/66322) 接口返回值中的`LaunchTemplateId`获取。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 若给定，新实例启动模板将基于给定的版本号创建。若未指定则使用默认版本,可以通过 [DescribeLaunchTemplateVersions](https://cloud.tencent.com/document/api/213/66323)查询默认版本。
    */
    @SerializedName("LaunchTemplateVersion")
    @Expose
    private Long LaunchTemplateVersion;

    /**
    * 实例启动模板版本描述。长度为2~256个英文或中文字符，不指定该参数时默认为空字符。
    */
    @SerializedName("LaunchTemplateVersionDescription")
    @Expose
    private String LaunchTemplateVersionDescription;

    /**
    * 实例机型。不同实例机型指定了不同的资源规格。
<br><li>对于付费模式为PREPAID或POSTPAID\_BY\_HOUR的实例创建，具体取值可通过调用接口[DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749)来获得最新的规格表或参见[实例规格](https://cloud.tencent.com/document/product/213/11518)描述。若不指定该参数，则系统将根据当前地域的资源售卖情况动态指定默认机型。</li><br><li>对于付费模式为CDHPAID的实例创建，该参数以"CDH_"为前缀，根据CPU和内存配置生成，具体形式为：CDH_XCXG，例如对于创建CPU为1核，内存为1G大小的专用宿主机的实例，该参数应该为CDH_1C1G。</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>云镜像市场</li><br/>可通过以下方式获取可用的镜像ID：<br/><li>`公共镜像`、`自定义镜像`、`共享镜像`的镜像ID可通过登录[控制台](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE)查询；`云镜像市场`的镜像ID可通过[云市场](https://market.cloud.tencent.com/list)查询。</li><li>通过调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715) ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的`ImageId`字段。</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。若不指定该参数，则默认使用基础网络。若在此参数中指定了私有网络IP，即表示每个实例的主网卡IP；同时，InstanceCount参数必须与私有网络IP的个数一致且不能大于20。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 购买实例数量。具体配额相关限制详见[CVM实例购买限制](https://cloud.tencent.com/document/product/213/2664)。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 实例显示名称。<br><li>不指定实例显示名称则默认显示‘未命名’。</li><li>购买多台实例，如果指定模式串`{R:x}`，表示生成数字`[x, x+n-1]`，其中`n`表示购买实例的数量，例如`server_{R:3}`，购买1台时，实例显示名称为`server_3`；购买2台时，实例显示名称分别为`server_3`，`server_4`。支持指定多个模式串`{R:x}`。</li><li>购买多台实例，如果不指定模式串，则在实例显示名称添加后缀`1、2...n`，其中`n`表示购买实例的数量，例如`server_`，购买2台时，实例显示名称分别为`server_1`，`server_2`。</li><li>最多支持128个字符（包含模式串）。</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例登录设置。通过该参数可以设置实例的登录方式为密钥或保持镜像的原始登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务；自定义镜像与云镜像市场镜像默认不开启云监控，云安全服务，而使用镜像里保留的服务。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 云服务器的主机名。<br><li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><br><li>Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><br><li>其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
    */
    @SerializedName("ActionTimer")
    @Expose
    private ActionTimer ActionTimer;

    /**
    * 置放群组id，仅支持指定一个。可使用[DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)接口获取。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到云服务器实例。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。关于获取此参数的详细介绍，请参阅[Windows](https://cloud.tencent.com/document/product/213/17526)和[Linux](https://cloud.tencent.com/document/product/213/17525)启动时运行命令。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * CAM角色名称。可通过[ DescribeRoleList ](https://cloud.tencent.com/document/product/598/13887)接口返回值中的`roleName`获取。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。该参数可以通过调用 [DescribeHpcClusters](https://cloud.tencent.com/document/api/213/83220) 的返回值中的 `HpcClusterId` 字段来获取。
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * 实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><li>SPOTPAID：竞价付费</li>默认值：POSTPAID_BY_HOUR。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>TRUE：表示开启实例保护，不允许通过api接口删除实例</li><br><li>FALSE：表示关闭实例保护，允许通过api接口删除实例</li><br><br>默认取值：FALSE。
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * 自定义metadata，支持创建 CVM 时添加自定义元数据键值对。
**注：内测中**。
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * 只允许传递 Update 和 Replace 参数，在模板使用自定义 Metadata 且在 RunInstances 也传递 Metadata 时生效。默认采用 Replace。

- Update：设模板 t含本参数值为Update、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k1:v1, k2:v3] 
- Replace：模板 t含本参数值为Replace、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k2:v3] 
**注：内测中**。
    */
    @SerializedName("TemplateDataModifyAction")
    @Expose
    private String TemplateDataModifyAction;

    /**
     * Get 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目，所属宿主机（在专用宿主机上创建子机时指定）等属性。 
     * @return Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目，所属宿主机（在专用宿主机上创建子机时指定）等属性。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目，所属宿主机（在专用宿主机上创建子机时指定）等属性。
     * @param Placement 实例所在的位置。通过该参数可以指定实例所属可用区，所属项目，所属宿主机（在专用宿主机上创建子机时指定）等属性。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 启动模板ID，新版本将基于该实例启动模板ID创建。可通过 [DescribeLaunchTemplates](https://cloud.tencent.com/document/api/213/66322) 接口返回值中的`LaunchTemplateId`获取。 
     * @return LaunchTemplateId 启动模板ID，新版本将基于该实例启动模板ID创建。可通过 [DescribeLaunchTemplates](https://cloud.tencent.com/document/api/213/66322) 接口返回值中的`LaunchTemplateId`获取。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 启动模板ID，新版本将基于该实例启动模板ID创建。可通过 [DescribeLaunchTemplates](https://cloud.tencent.com/document/api/213/66322) 接口返回值中的`LaunchTemplateId`获取。
     * @param LaunchTemplateId 启动模板ID，新版本将基于该实例启动模板ID创建。可通过 [DescribeLaunchTemplates](https://cloud.tencent.com/document/api/213/66322) 接口返回值中的`LaunchTemplateId`获取。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 若给定，新实例启动模板将基于给定的版本号创建。若未指定则使用默认版本,可以通过 [DescribeLaunchTemplateVersions](https://cloud.tencent.com/document/api/213/66323)查询默认版本。 
     * @return LaunchTemplateVersion 若给定，新实例启动模板将基于给定的版本号创建。若未指定则使用默认版本,可以通过 [DescribeLaunchTemplateVersions](https://cloud.tencent.com/document/api/213/66323)查询默认版本。
     */
    public Long getLaunchTemplateVersion() {
        return this.LaunchTemplateVersion;
    }

    /**
     * Set 若给定，新实例启动模板将基于给定的版本号创建。若未指定则使用默认版本,可以通过 [DescribeLaunchTemplateVersions](https://cloud.tencent.com/document/api/213/66323)查询默认版本。
     * @param LaunchTemplateVersion 若给定，新实例启动模板将基于给定的版本号创建。若未指定则使用默认版本,可以通过 [DescribeLaunchTemplateVersions](https://cloud.tencent.com/document/api/213/66323)查询默认版本。
     */
    public void setLaunchTemplateVersion(Long LaunchTemplateVersion) {
        this.LaunchTemplateVersion = LaunchTemplateVersion;
    }

    /**
     * Get 实例启动模板版本描述。长度为2~256个英文或中文字符，不指定该参数时默认为空字符。 
     * @return LaunchTemplateVersionDescription 实例启动模板版本描述。长度为2~256个英文或中文字符，不指定该参数时默认为空字符。
     */
    public String getLaunchTemplateVersionDescription() {
        return this.LaunchTemplateVersionDescription;
    }

    /**
     * Set 实例启动模板版本描述。长度为2~256个英文或中文字符，不指定该参数时默认为空字符。
     * @param LaunchTemplateVersionDescription 实例启动模板版本描述。长度为2~256个英文或中文字符，不指定该参数时默认为空字符。
     */
    public void setLaunchTemplateVersionDescription(String LaunchTemplateVersionDescription) {
        this.LaunchTemplateVersionDescription = LaunchTemplateVersionDescription;
    }

    /**
     * Get 实例机型。不同实例机型指定了不同的资源规格。
<br><li>对于付费模式为PREPAID或POSTPAID\_BY\_HOUR的实例创建，具体取值可通过调用接口[DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749)来获得最新的规格表或参见[实例规格](https://cloud.tencent.com/document/product/213/11518)描述。若不指定该参数，则系统将根据当前地域的资源售卖情况动态指定默认机型。</li><br><li>对于付费模式为CDHPAID的实例创建，该参数以"CDH_"为前缀，根据CPU和内存配置生成，具体形式为：CDH_XCXG，例如对于创建CPU为1核，内存为1G大小的专用宿主机的实例，该参数应该为CDH_1C1G。</li> 
     * @return InstanceType 实例机型。不同实例机型指定了不同的资源规格。
<br><li>对于付费模式为PREPAID或POSTPAID\_BY\_HOUR的实例创建，具体取值可通过调用接口[DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749)来获得最新的规格表或参见[实例规格](https://cloud.tencent.com/document/product/213/11518)描述。若不指定该参数，则系统将根据当前地域的资源售卖情况动态指定默认机型。</li><br><li>对于付费模式为CDHPAID的实例创建，该参数以"CDH_"为前缀，根据CPU和内存配置生成，具体形式为：CDH_XCXG，例如对于创建CPU为1核，内存为1G大小的专用宿主机的实例，该参数应该为CDH_1C1G。</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例机型。不同实例机型指定了不同的资源规格。
<br><li>对于付费模式为PREPAID或POSTPAID\_BY\_HOUR的实例创建，具体取值可通过调用接口[DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749)来获得最新的规格表或参见[实例规格](https://cloud.tencent.com/document/product/213/11518)描述。若不指定该参数，则系统将根据当前地域的资源售卖情况动态指定默认机型。</li><br><li>对于付费模式为CDHPAID的实例创建，该参数以"CDH_"为前缀，根据CPU和内存配置生成，具体形式为：CDH_XCXG，例如对于创建CPU为1核，内存为1G大小的专用宿主机的实例，该参数应该为CDH_1C1G。</li>
     * @param InstanceType 实例机型。不同实例机型指定了不同的资源规格。
<br><li>对于付费模式为PREPAID或POSTPAID\_BY\_HOUR的实例创建，具体取值可通过调用接口[DescribeInstanceTypeConfigs](https://cloud.tencent.com/document/api/213/15749)来获得最新的规格表或参见[实例规格](https://cloud.tencent.com/document/product/213/11518)描述。若不指定该参数，则系统将根据当前地域的资源售卖情况动态指定默认机型。</li><br><li>对于付费模式为CDHPAID的实例创建，该参数以"CDH_"为前缀，根据CPU和内存配置生成，具体形式为：CDH_XCXG，例如对于创建CPU为1核，内存为1G大小的专用宿主机的实例，该参数应该为CDH_1C1G。</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>云镜像市场</li><br/>可通过以下方式获取可用的镜像ID：<br/><li>`公共镜像`、`自定义镜像`、`共享镜像`的镜像ID可通过登录[控制台](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE)查询；`云镜像市场`的镜像ID可通过[云市场](https://market.cloud.tencent.com/list)查询。</li><li>通过调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715) ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的`ImageId`字段。</li> 
     * @return ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>云镜像市场</li><br/>可通过以下方式获取可用的镜像ID：<br/><li>`公共镜像`、`自定义镜像`、`共享镜像`的镜像ID可通过登录[控制台](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE)查询；`云镜像市场`的镜像ID可通过[云市场](https://market.cloud.tencent.com/list)查询。</li><li>通过调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715) ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的`ImageId`字段。</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>云镜像市场</li><br/>可通过以下方式获取可用的镜像ID：<br/><li>`公共镜像`、`自定义镜像`、`共享镜像`的镜像ID可通过登录[控制台](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE)查询；`云镜像市场`的镜像ID可通过[云市场](https://market.cloud.tencent.com/list)查询。</li><li>通过调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715) ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的`ImageId`字段。</li>
     * @param ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。镜像类型分为四种：<br/><li>公共镜像</li><li>自定义镜像</li><li>共享镜像</li><li>云镜像市场</li><br/>可通过以下方式获取可用的镜像ID：<br/><li>`公共镜像`、`自定义镜像`、`共享镜像`的镜像ID可通过登录[控制台](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE)查询；`云镜像市场`的镜像ID可通过[云市场](https://market.cloud.tencent.com/list)查询。</li><li>通过调用接口 [DescribeImages](https://cloud.tencent.com/document/api/213/15715) ，传入InstanceType获取当前机型支持的镜像列表，取返回信息中的`ImageId`字段。</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。 
     * @return SystemDisk 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     * @param SystemDisk 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 实例数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。 
     * @return DataDisks 实例数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 实例数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。
     * @param DataDisks 实例数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。若不指定该参数，则默认使用基础网络。若在此参数中指定了私有网络IP，即表示每个实例的主网卡IP；同时，InstanceCount参数必须与私有网络IP的个数一致且不能大于20。 
     * @return VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。若不指定该参数，则默认使用基础网络。若在此参数中指定了私有网络IP，即表示每个实例的主网卡IP；同时，InstanceCount参数必须与私有网络IP的个数一致且不能大于20。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。若不指定该参数，则默认使用基础网络。若在此参数中指定了私有网络IP，即表示每个实例的主网卡IP；同时，InstanceCount参数必须与私有网络IP的个数一致且不能大于20。
     * @param VirtualPrivateCloud 私有网络相关信息配置。通过该参数可以指定私有网络的ID，子网ID等信息。若不指定该参数，则默认使用基础网络。若在此参数中指定了私有网络IP，即表示每个实例的主网卡IP；同时，InstanceCount参数必须与私有网络IP的个数一致且不能大于20。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。 
     * @return InternetAccessible 公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。
     * @param InternetAccessible 公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 购买实例数量。具体配额相关限制详见[CVM实例购买限制](https://cloud.tencent.com/document/product/213/2664)。 
     * @return InstanceCount 购买实例数量。具体配额相关限制详见[CVM实例购买限制](https://cloud.tencent.com/document/product/213/2664)。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买实例数量。具体配额相关限制详见[CVM实例购买限制](https://cloud.tencent.com/document/product/213/2664)。
     * @param InstanceCount 购买实例数量。具体配额相关限制详见[CVM实例购买限制](https://cloud.tencent.com/document/product/213/2664)。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 实例显示名称。<br><li>不指定实例显示名称则默认显示‘未命名’。</li><li>购买多台实例，如果指定模式串`{R:x}`，表示生成数字`[x, x+n-1]`，其中`n`表示购买实例的数量，例如`server_{R:3}`，购买1台时，实例显示名称为`server_3`；购买2台时，实例显示名称分别为`server_3`，`server_4`。支持指定多个模式串`{R:x}`。</li><li>购买多台实例，如果不指定模式串，则在实例显示名称添加后缀`1、2...n`，其中`n`表示购买实例的数量，例如`server_`，购买2台时，实例显示名称分别为`server_1`，`server_2`。</li><li>最多支持128个字符（包含模式串）。</li> 
     * @return InstanceName 实例显示名称。<br><li>不指定实例显示名称则默认显示‘未命名’。</li><li>购买多台实例，如果指定模式串`{R:x}`，表示生成数字`[x, x+n-1]`，其中`n`表示购买实例的数量，例如`server_{R:3}`，购买1台时，实例显示名称为`server_3`；购买2台时，实例显示名称分别为`server_3`，`server_4`。支持指定多个模式串`{R:x}`。</li><li>购买多台实例，如果不指定模式串，则在实例显示名称添加后缀`1、2...n`，其中`n`表示购买实例的数量，例如`server_`，购买2台时，实例显示名称分别为`server_1`，`server_2`。</li><li>最多支持128个字符（包含模式串）。</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称。<br><li>不指定实例显示名称则默认显示‘未命名’。</li><li>购买多台实例，如果指定模式串`{R:x}`，表示生成数字`[x, x+n-1]`，其中`n`表示购买实例的数量，例如`server_{R:3}`，购买1台时，实例显示名称为`server_3`；购买2台时，实例显示名称分别为`server_3`，`server_4`。支持指定多个模式串`{R:x}`。</li><li>购买多台实例，如果不指定模式串，则在实例显示名称添加后缀`1、2...n`，其中`n`表示购买实例的数量，例如`server_`，购买2台时，实例显示名称分别为`server_1`，`server_2`。</li><li>最多支持128个字符（包含模式串）。</li>
     * @param InstanceName 实例显示名称。<br><li>不指定实例显示名称则默认显示‘未命名’。</li><li>购买多台实例，如果指定模式串`{R:x}`，表示生成数字`[x, x+n-1]`，其中`n`表示购买实例的数量，例如`server_{R:3}`，购买1台时，实例显示名称为`server_3`；购买2台时，实例显示名称分别为`server_3`，`server_4`。支持指定多个模式串`{R:x}`。</li><li>购买多台实例，如果不指定模式串，则在实例显示名称添加后缀`1、2...n`，其中`n`表示购买实例的数量，例如`server_`，购买2台时，实例显示名称分别为`server_1`，`server_2`。</li><li>最多支持128个字符（包含模式串）。</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例登录设置。通过该参数可以设置实例的登录方式为密钥或保持镜像的原始登录设置。 
     * @return LoginSettings 实例登录设置。通过该参数可以设置实例的登录方式为密钥或保持镜像的原始登录设置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。通过该参数可以设置实例的登录方式为密钥或保持镜像的原始登录设置。
     * @param LoginSettings 实例登录设置。通过该参数可以设置实例的登录方式为密钥或保持镜像的原始登录设置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。 
     * @return SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     * @param SecurityGroupIds 实例所属安全组。该参数可以通过调用 [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808) 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务；自定义镜像与云镜像市场镜像默认不开启云监控，云安全服务，而使用镜像里保留的服务。 
     * @return EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务；自定义镜像与云镜像市场镜像默认不开启云监控，云安全服务，而使用镜像里保留的服务。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务；自定义镜像与云镜像市场镜像默认不开启云监控，云安全服务，而使用镜像里保留的服务。
     * @param EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认公共镜像开启云监控、云安全服务；自定义镜像与云镜像市场镜像默认不开启云监控，云安全服务，而使用镜像里保留的服务。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 云服务器的主机名。<br><li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><br><li>Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><br><li>其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li> 
     * @return HostName 云服务器的主机名。<br><li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><br><li>Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><br><li>其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 云服务器的主机名。<br><li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><br><li>Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><br><li>其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>
     * @param HostName 云服务器的主机名。<br><li>点号（.）和短横线（-）不能作为 HostName 的首尾字符，不能连续使用。</li><br><li>Windows 实例：名字符长度为[2, 15]，允许字母（不限制大小写）、数字和短横线（-）组成，不支持点号（.），不能全是数字。</li><br><li>其他类型（Linux 等）实例：字符长度为[2, 60]，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和短横线（-）组成。</li>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。 
     * @return ActionTimer 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     */
    public ActionTimer getActionTimer() {
        return this.ActionTimer;
    }

    /**
     * Set 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     * @param ActionTimer 定时任务。通过该参数可以为实例指定定时任务，目前仅支持定时销毁。
     */
    public void setActionTimer(ActionTimer ActionTimer) {
        this.ActionTimer = ActionTimer;
    }

    /**
     * Get 置放群组id，仅支持指定一个。可使用[DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)接口获取。 
     * @return DisasterRecoverGroupIds 置放群组id，仅支持指定一个。可使用[DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)接口获取。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 置放群组id，仅支持指定一个。可使用[DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)接口获取。
     * @param DisasterRecoverGroupIds 置放群组id，仅支持指定一个。可使用[DescribeDisasterRecoverGroups](https://cloud.tencent.com/document/api/213/17810)接口获取。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到云服务器实例。 
     * @return TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到云服务器实例。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到云服务器实例。
     * @param TagSpecification 标签描述列表。通过指定该参数可以同时绑定标签到相应的资源实例，当前仅支持绑定标签到云服务器实例。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。 
     * @return InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     * @param InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。关于获取此参数的详细介绍，请参阅[Windows](https://cloud.tencent.com/document/product/213/17526)和[Linux](https://cloud.tencent.com/document/product/213/17525)启动时运行命令。 
     * @return UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。关于获取此参数的详细介绍，请参阅[Windows](https://cloud.tencent.com/document/product/213/17526)和[Linux](https://cloud.tencent.com/document/product/213/17525)启动时运行命令。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。关于获取此参数的详细介绍，请参阅[Windows](https://cloud.tencent.com/document/product/213/17526)和[Linux](https://cloud.tencent.com/document/product/213/17525)启动时运行命令。
     * @param UserData 提供给实例使用的用户数据，需要以 base64 方式编码，支持的最大数据大小为 16KB。关于获取此参数的详细介绍，请参阅[Windows](https://cloud.tencent.com/document/product/213/17526)和[Linux](https://cloud.tencent.com/document/product/213/17525)启动时运行命令。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例。 
     * @return DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例。
     * @param DryRun 是否只预检此次请求。
true：发送检查请求，不会创建实例。检查项包括是否填写了必需参数，请求格式，业务限制和云服务器库存。
如果检查不通过，则返回对应错误码；
如果检查通过，则返回RequestId.
false（默认）：发送正常请求，通过检查后直接创建实例。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get CAM角色名称。可通过[ DescribeRoleList ](https://cloud.tencent.com/document/product/598/13887)接口返回值中的`roleName`获取。 
     * @return CamRoleName CAM角色名称。可通过[ DescribeRoleList ](https://cloud.tencent.com/document/product/598/13887)接口返回值中的`roleName`获取。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM角色名称。可通过[ DescribeRoleList ](https://cloud.tencent.com/document/product/598/13887)接口返回值中的`roleName`获取。
     * @param CamRoleName CAM角色名称。可通过[ DescribeRoleList ](https://cloud.tencent.com/document/product/598/13887)接口返回值中的`roleName`获取。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。该参数可以通过调用 [DescribeHpcClusters](https://cloud.tencent.com/document/api/213/83220) 的返回值中的 `HpcClusterId` 字段来获取。 
     * @return HpcClusterId 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。该参数可以通过调用 [DescribeHpcClusters](https://cloud.tencent.com/document/api/213/83220) 的返回值中的 `HpcClusterId` 字段来获取。
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。该参数可以通过调用 [DescribeHpcClusters](https://cloud.tencent.com/document/api/213/83220) 的返回值中的 `HpcClusterId` 字段来获取。
     * @param HpcClusterId 高性能计算集群ID。若创建的实例为高性能计算实例，需指定实例放置的集群，否则不可指定。该参数可以通过调用 [DescribeHpcClusters](https://cloud.tencent.com/document/api/213/83220) 的返回值中的 `HpcClusterId` 字段来获取。
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get 实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><li>SPOTPAID：竞价付费</li>默认值：POSTPAID_BY_HOUR。 
     * @return InstanceChargeType 实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><li>SPOTPAID：竞价付费</li>默认值：POSTPAID_BY_HOUR。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><li>SPOTPAID：竞价付费</li>默认值：POSTPAID_BY_HOUR。
     * @param InstanceChargeType 实例[计费类型](https://cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID：预付费，即包年包月</li><li>POSTPAID_BY_HOUR：按小时后付费</li><li>CDHPAID：独享子机（基于专用宿主机创建，宿主机部分的资源不收费）</li><li>SPOTPAID：竞价付费</li>默认值：POSTPAID_BY_HOUR。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>TRUE：表示开启实例保护，不允许通过api接口删除实例</li><br><li>FALSE：表示关闭实例保护，允许通过api接口删除实例</li><br><br>默认取值：FALSE。 
     * @return DisableApiTermination 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>TRUE：表示开启实例保护，不允许通过api接口删除实例</li><br><li>FALSE：表示关闭实例保护，允许通过api接口删除实例</li><br><br>默认取值：FALSE。
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>TRUE：表示开启实例保护，不允许通过api接口删除实例</li><br><li>FALSE：表示关闭实例保护，允许通过api接口删除实例</li><br><br>默认取值：FALSE。
     * @param DisableApiTermination 实例销毁保护标志，表示是否允许通过api接口删除实例。取值范围：<br><li>TRUE：表示开启实例保护，不允许通过api接口删除实例</li><br><li>FALSE：表示关闭实例保护，允许通过api接口删除实例</li><br><br>默认取值：FALSE。
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get 自定义metadata，支持创建 CVM 时添加自定义元数据键值对。
**注：内测中**。 
     * @return Metadata 自定义metadata，支持创建 CVM 时添加自定义元数据键值对。
**注：内测中**。
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 自定义metadata，支持创建 CVM 时添加自定义元数据键值对。
**注：内测中**。
     * @param Metadata 自定义metadata，支持创建 CVM 时添加自定义元数据键值对。
**注：内测中**。
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 只允许传递 Update 和 Replace 参数，在模板使用自定义 Metadata 且在 RunInstances 也传递 Metadata 时生效。默认采用 Replace。

- Update：设模板 t含本参数值为Update、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k1:v1, k2:v3] 
- Replace：模板 t含本参数值为Replace、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k2:v3] 
**注：内测中**。 
     * @return TemplateDataModifyAction 只允许传递 Update 和 Replace 参数，在模板使用自定义 Metadata 且在 RunInstances 也传递 Metadata 时生效。默认采用 Replace。

- Update：设模板 t含本参数值为Update、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k1:v1, k2:v3] 
- Replace：模板 t含本参数值为Replace、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k2:v3] 
**注：内测中**。
     */
    public String getTemplateDataModifyAction() {
        return this.TemplateDataModifyAction;
    }

    /**
     * Set 只允许传递 Update 和 Replace 参数，在模板使用自定义 Metadata 且在 RunInstances 也传递 Metadata 时生效。默认采用 Replace。

- Update：设模板 t含本参数值为Update、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k1:v1, k2:v3] 
- Replace：模板 t含本参数值为Replace、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k2:v3] 
**注：内测中**。
     * @param TemplateDataModifyAction 只允许传递 Update 和 Replace 参数，在模板使用自定义 Metadata 且在 RunInstances 也传递 Metadata 时生效。默认采用 Replace。

- Update：设模板 t含本参数值为Update、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k1:v1, k2:v3] 
- Replace：模板 t含本参数值为Replace、 metadata=[k1:v1, k2:v2] ，则RunInstances（给metadata=[k2:v3]）+ t 创建的 cvm 使用metadata=[k2:v3] 
**注：内测中**。
     */
    public void setTemplateDataModifyAction(String TemplateDataModifyAction) {
        this.TemplateDataModifyAction = TemplateDataModifyAction;
    }

    public CreateLaunchTemplateVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLaunchTemplateVersionRequest(CreateLaunchTemplateVersionRequest source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersion != null) {
            this.LaunchTemplateVersion = new Long(source.LaunchTemplateVersion);
        }
        if (source.LaunchTemplateVersionDescription != null) {
            this.LaunchTemplateVersionDescription = new String(source.LaunchTemplateVersionDescription);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.ActionTimer != null) {
            this.ActionTimer = new ActionTimer(source.ActionTimer);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.TemplateDataModifyAction != null) {
            this.TemplateDataModifyAction = new String(source.TemplateDataModifyAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamSimple(map, prefix + "LaunchTemplateVersion", this.LaunchTemplateVersion);
        this.setParamSimple(map, prefix + "LaunchTemplateVersionDescription", this.LaunchTemplateVersionDescription);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamObj(map, prefix + "ActionTimer.", this.ActionTimer);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "TemplateDataModifyAction", this.TemplateDataModifyAction);

    }
}

