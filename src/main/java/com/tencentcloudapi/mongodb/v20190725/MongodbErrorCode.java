package com.tencentcloudapi.mongodb.v20190725;
public enum MongodbErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 按key回档未开启 */
     FAILEDOPERATION_FLASHBACKBYKEYNOTOPEN("FailedOperation.FlashbackByKeyNotOpen"),
     
     /* 内核响应超时。 */
     FAILEDOPERATION_KERNELRESPONSETIMEOUT("FailedOperation.KernelResponseTimeout"),
     
     /* 当前实例已开启外网访问。 */
     FAILEDOPERATION_NOTALLOWMODIFYADDRAFTEROPENWANSERVICE("FailedOperation.NotAllowModifyAddrAfterOpenWanService"),
     
     /* 实例锁定中不允许操作。 */
     FAILEDOPERATION_OPERATIONNOTALLOWEDININSTANCELOCKING("FailedOperation.OperationNotAllowedInInstanceLocking"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* appId校验失败。 */
     INTERNALERROR_CHECKAPPIDFAILED("InternalError.CheckAppIdFailed"),
     
     /* 实例查询失败。 */
     INTERNALERROR_FINDINSTANCEFAILED("InternalError.FindInstanceFailed"),
     
     /* password与原先记录的password不同。 */
     INTERNALERROR_PASSWORDERROR("InternalError.PasswordError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 当前实例不支持设置参数。 */
     INVALIDPARAMETER_CURRENTINSTANCENOTSUPPORTMODIFYPARAMS("InvalidParameter.CurrentInstanceNotSupportModifyParams"),
     
     /* 无效Vip信息。 */
     INVALIDPARAMETER_INVALIDVIP("InvalidParameter.InvalidVip"),
     
     /* 参数名有误 */
     INVALIDPARAMETER_MODIFYMONGODBPARAMS("InvalidParameter.ModifyMongodbParams"),
     
     /* 接口参数为空。 */
     INVALIDPARAMETER_PARAMETERSNIL("InvalidParameter.ParametersNil"),
     
     /* 当前子账号无权执行该操作。 */
     INVALIDPARAMETER_PERMISSIONDENIED("InvalidParameter.PermissionDenied"),
     
     /* 可用区已关闭售卖。 */
     INVALIDPARAMETER_ZONECLOSED("InvalidParameter.ZoneClosed"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 备份文件未找到。 */
     INVALIDPARAMETERVALUE_BACKUPFILENOTFOUND("InvalidParameterValue.BackupFileNotFound"),
     
     /* appId校验失败。 */
     INVALIDPARAMETERVALUE_CHECKAPPIDFAILED("InvalidParameterValue.CheckAppIdFailed"),
     
     /* 无效的实例类型。 */
     INVALIDPARAMETERVALUE_CLUSTERTYPEERROR("InvalidParameterValue.ClusterTypeError"),
     
     /* 非法的实例名。 */
     INVALIDPARAMETERVALUE_ILLEGALINSTANCENAME("InvalidParameterValue.IllegalInstanceName"),
     
     /* 非法的实例状态。 */
     INVALIDPARAMETERVALUE_ILLEGALINSTANCESTATUS("InvalidParameterValue.IllegalInstanceStatus"),
     
     /* 实例状态不允许进行下线，进行下线操作的实例状态必须为隔离状态。 */
     INVALIDPARAMETERVALUE_ILLEGALSTATUSTOOFFLINE("InvalidParameterValue.IllegalStatusToOffline"),
     
     /* 实例已删除。 */
     INVALIDPARAMETERVALUE_INSTANCEHASBEENDELETED("InvalidParameterValue.InstanceHasBeenDeleted"),
     
     /* 实例已隔离。 */
     INVALIDPARAMETERVALUE_INSTANCEHASBEENISOLATED("InvalidParameterValue.InstanceHasBeenIsolated"),
     
     /* 计费相关错误，不允许对当前实例进行对应的新购/续费/配置变更操作。 */
     INVALIDPARAMETERVALUE_INVALIDTRADEOPERATION("InvalidParameterValue.InvalidTradeOperation"),
     
     /* limit取值范围[1,100]。 */
     INVALIDPARAMETERVALUE_LIMITPARAOUTOFRANGE("InvalidParameterValue.LimitParaOutOfRange"),
     
     /* 实例锁定失败。 */
     INVALIDPARAMETERVALUE_LOCKFAILED("InvalidParameterValue.LockFailed"),
     
     /* 错误的机型。 */
     INVALIDPARAMETERVALUE_MACHINETYPEERROR("InvalidParameterValue.MachineTypeError"),
     
     /* 内存和磁盘必须同时升配或降配。 */
     INVALIDPARAMETERVALUE_MODIFYMODEERROR("InvalidParameterValue.ModifyModeError"),
     
     /* 参数值有误。 */
     INVALIDPARAMETERVALUE_MODIFYMONGODBPARAMS("InvalidParameterValue.ModifyMongodbParams"),
     
     /* 实例版本错误。 */
     INVALIDPARAMETERVALUE_MONGOVERSIONERROR("InvalidParameterValue.MongoVersionError"),
     
     /* 实例版本不支持查询客户端信息。 */
     INVALIDPARAMETERVALUE_MONGOVERSIONNOTSUPPORTQUERYCLIENT("InvalidParameterValue.MongoVersionNotSupportQueryClient"),
     
     /* 当前副本集/分片未找到该节点。 */
     INVALIDPARAMETERVALUE_NODENOTFOUNDINREPLICA("InvalidParameterValue.NodeNotFoundInReplica"),
     
     /* 未找到实例。 */
     INVALIDPARAMETERVALUE_NOTFOUNDINSTANCE("InvalidParameterValue.NotFoundInstance"),
     
     /* offset取值范围[0, 10000]。 */
     INVALIDPARAMETERVALUE_OFFSETPARAOUTOFRANGE("InvalidParameterValue.OffsetParaOutOfRange"),
     
     /* OplogSize参数设置错误，应介于磁盘容量的10%和90%之间。 */
     INVALIDPARAMETERVALUE_OPLOGSIZEOUTOFRANGE("InvalidParameterValue.OplogSizeOutOfRange"),
     
     /* 密码不符合规范。 */
     INVALIDPARAMETERVALUE_PASSWORDRULEFAILED("InvalidParameterValue.PasswordRuleFailed"),
     
     /* 单个地域后付费实例数量超过限制。 */
     INVALIDPARAMETERVALUE_POSTPAIDINSTANCEBEYONDLIMIT("InvalidParameterValue.PostPaidInstanceBeyondLimit"),
     
     /* 预付费实例不支持销毁。 */
     INVALIDPARAMETERVALUE_PREPAIDINSTANCEUNABLETOISOLATE("InvalidParameterValue.PrePaidInstanceUnableToIsolate"),
     
     /* 项目不存在。 */
     INVALIDPARAMETERVALUE_PROJECTNOTFOUND("InvalidParameterValue.ProjectNotFound"),
     
     /* proxy版本不支持查询客户端信息，请联系工作人员进行升级。 */
     INVALIDPARAMETERVALUE_PROXYNOTSUPPORTQUERYCLIENT("InvalidParameterValue.ProxyNotSupportQueryClient"),
     
     /* 查询offset超出范围。 */
     INVALIDPARAMETERVALUE_QUERYOUTOFRANGE("InvalidParameterValue.QueryOutOfRange"),
     
     /* 只能查询7天内的慢日志。 */
     INVALIDPARAMETERVALUE_QUERYTIMEOUTOFRANGE("InvalidParameterValue.QueryTimeOutOfRange"),
     
     /* 只能查询7天内的慢日志。 */
     INVALIDPARAMETERVALUE_QUERYTIMERANGEBEYONDLIMIT("InvalidParameterValue.QueryTimeRangeBeyondLimit"),
     
     /* 无效的地域。 */
     INVALIDPARAMETERVALUE_REGIONERROR("InvalidParameterValue.RegionError"),
     
     /* 当前地域尚不支持该操作。 */
     INVALIDPARAMETERVALUE_REGIONNOTSUPPORTOPERATION("InvalidParameterValue.RegionNotSupportOperation"),
     
     /* 地域尚不支持查询客户端信息。 */
     INVALIDPARAMETERVALUE_REGIONNOTSUPPORTQUERYCLIENT("InvalidParameterValue.RegionNotSupportQueryClient"),
     
     /* 未找到副本集/分片。 */
     INVALIDPARAMETERVALUE_REPLICANOTFOUND("InvalidParameterValue.ReplicaNotFound"),
     
     /* 副本集（分片）数量错误。 */
     INVALIDPARAMETERVALUE_REPLICASETNUMERROR("InvalidParameterValue.ReplicaSetNumError"),
     
     /* 从节点数错误。 */
     INVALIDPARAMETERVALUE_SECONDARYNUMERROR("InvalidParameterValue.SecondaryNumError"),
     
     /* 安全组ID无效。 */
     INVALIDPARAMETERVALUE_SECURITYGROUPID("InvalidParameterValue.SecurityGroupId"),
     
     /* 设置的磁盘大小不得低于已用磁盘的1.2倍。 */
     INVALIDPARAMETERVALUE_SETDISKLESSTHANUSED("InvalidParameterValue.SetDiskLessThanUsed"),
     
     /* slowMS参数取值范围[100,65536]。 */
     INVALIDPARAMETERVALUE_SLOWMSBELOWLIMIT("InvalidParameterValue.SlowMSBelowLimit"),
     
     /* 购买规格错误。 */
     INVALIDPARAMETERVALUE_SPECNOTONSALE("InvalidParameterValue.SpecNotOnSale"),
     
     /* 起始时间晚于结束时间。 */
     INVALIDPARAMETERVALUE_STARTTIMENOTBEFORETHANENDTIME("InvalidParameterValue.StartTimeNotBeforeThanEndTime"),
     
     /* 实例处于不允许操作的状态。 */
     INVALIDPARAMETERVALUE_STATUSABNORMAL("InvalidParameterValue.StatusAbnormal"),
     
     /* 未找到指定的标签。 */
     INVALIDPARAMETERVALUE_TAGNOTFOUND("InvalidParameterValue.TagNotFound"),
     
     /* 非法的时间格式。 */
     INVALIDPARAMETERVALUE_TIMEFORMATERR("InvalidParameterValue.TimeFormatErr"),
     
     /* 用户账户不存在。 */
     INVALIDPARAMETERVALUE_USERNOTFOUND("InvalidParameterValue.UserNotFound"),
     
     /* 未找到虚拟网络（子网）。 */
     INVALIDPARAMETERVALUE_VPCIDORSUBNETIDNOTFOUND("InvalidParameterValue.VpcIdOrSubnetIdNotFound"),
     
     /* 可用区已关闭售卖。 */
     INVALIDPARAMETERVALUE_ZONECLOSED("InvalidParameterValue.ZoneClosed"),
     
     /* 无效的可用区。 */
     INVALIDPARAMETERVALUE_ZONEERROR("InvalidParameterValue.ZoneError"),
     
     /* 请求太过频繁，触发接口频限。 */
     LIMITEXCEEDED_TOOMANYREQUESTS("LimitExceeded.TooManyRequests"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 没有访问权限 */
     UNAUTHORIZEDOPERATION_NOACCESS("UnauthorizedOperation.NoAccess"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* 内核版本不支持。 */
     UNSUPPORTEDOPERATION_KERNELVERSIONNOTSUPPORT("UnsupportedOperation.KernelVersionNotSupport"),
     
     /* 当前版本不支持该操作。 */
     UNSUPPORTEDOPERATION_VERSIONNOTSUPPORT("UnsupportedOperation.VersionNotSupport");
     
    private String value;
    private MongodbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

