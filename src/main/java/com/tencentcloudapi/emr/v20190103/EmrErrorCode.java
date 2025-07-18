package com.tencentcloudapi.emr.v20190103;
public enum EmrErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION_CHECKIFSUPPORTPODSTRETCH("FailedOperation.CheckIfSupportPodStretch"),
     
     /* DB异常 */
     FAILEDOPERATION_DBEXCEPTION("FailedOperation.DBException"),
     
     /* 拉取资源标签失败 */
     FAILEDOPERATION_DESCRIBERESOURCETAGSFAILED("FailedOperation.DescribeResourceTagsFailed"),
     
     /* 重复的订单，请检查emr控制台。 */
     FAILEDOPERATION_DUPLICATEORDERNOTALLOWED("FailedOperation.DuplicateOrderNotAllowed"),
     
     /* 获取cam角色失败。 */
     FAILEDOPERATION_GETCAMROLEFAILED("FailedOperation.GetCamRoleFailed"),
     
     /* 调用cam服务失败。 */
     FAILEDOPERATION_GETCAMSERVERFAILED("FailedOperation.GetCamServerFailed"),
     
     /* 获取cvm 规格信息失败。 */
     FAILEDOPERATION_GETCVMCONFIGQUOTAFAILED("FailedOperation.GetCvmConfigQuotaFailed"),
     
     /* 调用cvm服务失败。 */
     FAILEDOPERATION_GETCVMSERVERFAILED("FailedOperation.GetCvmServerFailed"),
     
     /* 调去询价中心服务失败 */
     FAILEDOPERATION_GETTRADESERVERFAILED("FailedOperation.GetTradeServerFailed"),
     
     /* 不允许更多的扩缩容规则。 */
     FAILEDOPERATION_MORESTRATEGYNOTALLOWED("FailedOperation.MoreStrategyNotAllowed"),
     
     /* 未授权操作。 */
     FAILEDOPERATION_NOTAUTHENTICATED("FailedOperation.NotAuthenticated"),
     
     /* 操作失败，不支持pod。 */
     FAILEDOPERATION_NOTSUPPORTPOD("FailedOperation.NotSupportPod"),
     
     /* 操作失败。 */
     FAILEDOPERATION_REFUNDCVMFAILED("FailedOperation.RefundCvmFailed"),
     
     /* 操作失败。 */
     FAILEDOPERATION_SPECDELETEDENYFORAUTOSCALESTRATEGIES("FailedOperation.SpecDeleteDenyForAutoScaleStrategies"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_ACCOUNTCGWERROR("InternalError.AccountCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CAMCGWERROR("InternalError.CamCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CAMERROR("InternalError.CamError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CBSCGWERROR("InternalError.CbsCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CBSERROR("InternalError.CbsError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CDBCGWERROR("InternalError.CdbCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CDBERROR("InternalError.CdbError"),
     
     /* cvm或cbs资源不够或软件不合法。 */
     INTERNALERROR_CHECKQUOTAERR("InternalError.CheckQuotaErr"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CONFIGCGWERROR("InternalError.ConfigCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_CVMERROR("InternalError.CvmError"),
     
     /* DB查询异常。 */
     INTERNALERROR_DBQUERYEXCEPTION("InternalError.DBQueryException"),
     
     /* 请求OpenTSDB异常。 */
     INTERNALERROR_DOOPENTSDBREQUESTEXCEPTION("InternalError.DoOpenTSDBRequestException"),
     
     /* 调用EKS报错。 */
     INTERNALERROR_EKSERROR("InternalError.EKSError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_KMSERROR("InternalError.KmsError"),
     
     /* 请求OpenTSDB失败。 */
     INTERNALERROR_OPENTSDBHTTPRETURNCODENOTOK("InternalError.OpenTSDBHttpReturnCodeNotOK"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_PROJECTCGWERROR("InternalError.ProjectCgwError"),
     
     /* 安全组接口调用异常。 */
     INTERNALERROR_SGERROR("InternalError.SgError"),
     
     /* TKE调用出错。 */
     INTERNALERROR_TKEERROR("InternalError.TKEError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_TAGERROR("InternalError.TagError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_TRADECGWERROR("InternalError.TradeCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_VPCCGWERROR("InternalError.VpcCgwError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_VPCERROR("InternalError.VpcError"),
     
     /* 内部服务调用异常。 */
     INTERNALERROR_WOODSERVERERROR("InternalError.WoodServerError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_APPIDRESOURCENOTMATCH("InvalidParameter.AppIdResourceNotMatch"),
     
     /* CpuType参数无效。 */
     INVALIDPARAMETER_CPUTYPE("InvalidParameter.CpuType"),
     
     /* 展示策略错误。 */
     INVALIDPARAMETER_DISPLAYSTRATEGYNOTMATCH("InvalidParameter.DisplayStrategyNotMatch"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_HALESSMASTERCOUNT("InvalidParameter.HALessMasterCount"),
     
     /* impala查询参数异常。 */
     INVALIDPARAMETER_IMPALAQUERYEXCEPTION("InvalidParameter.ImpalaQueryException"),
     
     /* Common节点数量无效。 */
     INVALIDPARAMETER_INCORRECTCOMMONCOUNT("InvalidParameter.IncorrectCommonCount"),
     
     /* Master节点数量无效。 */
     INVALIDPARAMETER_INCORRECTMASTERCOUNT("InvalidParameter.IncorrectMasterCount"),
     
     /* 不合法的AllNodeResourceSpec参数。 */
     INVALIDPARAMETER_INVALIDALLNODERESOURCESPEC("InvalidParameter.InvalidAllNodeResourceSpec"),
     
     /* 无效参数，AppId。 */
     INVALIDPARAMETER_INVALIDAPPID("InvalidParameter.InvalidAppId"),
     
     /* 无效的自动续费标识。 */
     INVALIDPARAMETER_INVALIDAUTORENEW("InvalidParameter.InvalidAutoRenew"),
     
     /* 无效的引导脚本。 */
     INVALIDPARAMETER_INVALIDBOOTSTRAPACTION("InvalidParameter.InvalidBootstrapAction"),
     
     /* ExternalAccess.ClbSetting.VpcSetting参数无效。 */
     INVALIDPARAMETER_INVALIDCLBSERVERVPCSETTING("InvalidParameter.InvalidCLBServerVpcSetting"),
     
     /* Classification参数值无效。 */
     INVALIDPARAMETER_INVALIDCLASSIFICATION("InvalidParameter.InvalidClassification"),
     
     /* 无效的ClickHouse集群。 */
     INVALIDPARAMETER_INVALIDCLICKHOUSECLUSTER("InvalidParameter.InvalidClickHouseCluster"),
     
     /* 无效的ClientToken。 */
     INVALIDPARAMETER_INVALIDCLIENTTOKEN("InvalidParameter.InvalidClientToken"),
     
     /* 无效参数，ClusterId。 */
     INVALIDPARAMETER_INVALIDCLUSTERID("InvalidParameter.InvalidClusterId"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDCOMMONDISKTYPE("InvalidParameter.InvalidCommonDiskType"),
     
     /* 不合法的指标比较方法。 */
     INVALIDPARAMETER_INVALIDCOMPAREMETHOD("InvalidParameter.InvalidCompareMethod"),
     
     /* 无效的组件。 */
     INVALIDPARAMETER_INVALIDCOMPONENT("InvalidParameter.InvalidComponent"),
     
     /* 至少需要一个触发条件。 */
     INVALIDPARAMETER_INVALIDCONDITIONNUM("InvalidParameter.InvalidConditionNum"),
     
     /* Core节点数量无效。 */
     INVALIDPARAMETER_INVALIDCORECOUNT("InvalidParameter.InvalidCoreCount"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDCOREDISKTYPE("InvalidParameter.InvalidCoreDiskType"),
     
     /* 无效的CosBucket */
     INVALIDPARAMETER_INVALIDCOSBUCKET("InvalidParameter.InvalidCosBucket"),
     
     /* CosFileUri参数值无效。 */
     INVALIDPARAMETER_INVALIDCOSFILEURI("InvalidParameter.InvalidCosFileURI"),
     
     /* 扩容数量必须大于0。 */
     INVALIDPARAMETER_INVALIDCOUNT("InvalidParameter.InvalidCount"),
     
     /* 同一请求只能扩容Task或者Core节点。 */
     INVALIDPARAMETER_INVALIDCOUNTNUM("InvalidParameter.InvalidCountNum"),
     
     /* 错误信息：Invalid PodParameter。 */
     INVALIDPARAMETER_INVALIDCUSTOMIZEDPODPARAM("InvalidParameter.InvalidCustomizedPodParam"),
     
     /* DependService和EnableKerberos参数冲突。 */
     INVALIDPARAMETER_INVALIDDEPENDSERVICEANDENABLEKERBEROSCONFLICT("InvalidParameter.InvalidDependServiceAndEnableKerberosConflict"),
     
     /* 无效的磁盘数量。 */
     INVALIDPARAMETER_INVALIDDISKNUM("InvalidParameter.InvalidDiskNum"),
     
     /* 无效的磁盘大小。 */
     INVALIDPARAMETER_INVALIDDISKSIZE("InvalidParameter.InvalidDiskSize"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDDISKTYPE("InvalidParameter.InvalidDiskType"),
     
     /* 无效的EKS实例。 */
     INVALIDPARAMETER_INVALIDEKSINSTANCE("InvalidParameter.InvalidEksInstance"),
     
     /* CustomConfig参数值无效。 */
     INVALIDPARAMETER_INVALIDEXTENDFIELD("InvalidParameter.InvalidExtendField"),
     
     /* 无效组件依赖集群vpc。 */
     INVALIDPARAMETER_INVALIDEXTERNALSERVICEVPCID("InvalidParameter.InvalidExternalServiceVpcId"),
     
     /* 无效的任务失败处理策略。 */
     INVALIDPARAMETER_INVALIDFAILUREPOLICY("InvalidParameter.InvalidFailurePolicy"),
     
     /* 无效过滤参数。 */
     INVALIDPARAMETER_INVALIDFILTERKEY("InvalidParameter.InvalidFilterKey"),
     
     /* 无效参数，EMR实例不符合要求。 */
     INVALIDPARAMETER_INVALIDINSTANCE("InvalidParameter.InvalidInstance"),
     
     /* 不合法的实例计费模式。 */
     INVALIDPARAMETER_INVALIDINSTANCECHARGETYPE("InvalidParameter.InvalidInstanceChargeType"),
     
     /* 无效的集群名称。 */
     INVALIDPARAMETER_INVALIDINSTANCENAME("InvalidParameter.InvalidInstanceName"),
     
     /* 无效的集群保留策略。 */
     INVALIDPARAMETER_INVALIDINSTANCEPOLICY("InvalidParameter.InvalidInstancePolicy"),
     
     /* 无效的机型。 */
     INVALIDPARAMETER_INVALIDINSTANCETYPE("InvalidParameter.InvalidInstanceType"),
     
     /* 无效的流程任务。 */
     INVALIDPARAMETER_INVALIDJOBFLOW("InvalidParameter.InvalidJobFlow"),
     
     /* 无效的任务步骤类型。 */
     INVALIDPARAMETER_INVALIDJOBTYPE("InvalidParameter.InvalidJobType"),
     
     /* 不合法的LoadBalancerId */
     INVALIDPARAMETER_INVALIDLOADBALANCER("InvalidParameter.InvalidLoadBalancer"),
     
     /* 无效的登录设置。 */
     INVALIDPARAMETER_INVALIDLOGINSETTING("InvalidParameter.InvalidLoginSetting"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDMASTERDISKTYPE("InvalidParameter.InvalidMasterDiskType"),
     
     /* 无效的元数据库URL。 */
     INVALIDPARAMETER_INVALIDMETADATAJDBCURL("InvalidParameter.InvalidMetaDataJdbcUrl"),
     
     /* 无效的元数据库实例Id。 */
     INVALIDPARAMETER_INVALIDMETAINSTANCEID("InvalidParameter.InvalidMetaInstanceId"),
     
     /* 无效的元数据表类型。 */
     INVALIDPARAMETER_INVALIDMETATYPE("InvalidParameter.InvalidMetaType"),
     
     /* 变配规格无效。 */
     INVALIDPARAMETER_INVALIDMODIFYSPEC("InvalidParameter.InvalidModifySpec"),
     
     /* 不合法的节点数量。 */
     INVALIDPARAMETER_INVALIDNODECOUNT("InvalidParameter.InvalidNodeCount"),
     
     /* 不合法的节点类型。 */
     INVALIDPARAMETER_INVALIDNODEFLAG("InvalidParameter.InvalidNodeFlag"),
     
     /* 无效的NodeType。 */
     INVALIDPARAMETER_INVALIDNODETYPE("InvalidParameter.InvalidNodeType"),
     
     /* 无效的SoftInfo。 */
     INVALIDPARAMETER_INVALIDPARAMTERINVALIDSOFTINFO("InvalidParameter.InvalidParamterInvalidSoftInfo"),
     
     /* 无效密码。 */
     INVALIDPARAMETER_INVALIDPASSWORD("InvalidParameter.InvalidPassword"),
     
     /* 无效的付费类型。 */
     INVALIDPARAMETER_INVALIDPAYMODE("InvalidParameter.InvalidPaymode"),
     
     /* 无效的引导操作脚本。 */
     INVALIDPARAMETER_INVALIDPREEXECUTEDFILE("InvalidParameter.InvalidPreExecutedFile"),
     
     /* 不合法的指标处理方法。 */
     INVALIDPARAMETER_INVALIDPROCESSMETHOD("InvalidParameter.InvalidProcessMethod"),
     
     /* 无效参数，不符合EMR版本。 */
     INVALIDPARAMETER_INVALIDPRODUCT("InvalidParameter.InvalidProduct"),
     
     /* 无效的产品ID。 */
     INVALIDPARAMETER_INVALIDPRODUCTID("InvalidParameter.InvalidProductId"),
     
     /* 不合法的产品版本。 */
     INVALIDPARAMETER_INVALIDPRODUCTVERSION("InvalidParameter.InvalidProductVersion"),
     
     /* 无效的项目ID。 */
     INVALIDPARAMETER_INVALIDPROJECTID("InvalidParameter.InvalidProjectId"),
     
     /* 不合法自动续费标识。 */
     INVALIDPARAMETER_INVALIDRENEWFLAG("InvalidParameter.InvalidRenewFlag"),
     
     /* 无效资源ID。 */
     INVALIDPARAMETER_INVALIDRESOURCEID("InvalidParameter.InvalidResourceId"),
     
     /* 资源ID无效。 */
     INVALIDPARAMETER_INVALIDRESOURCEIDS("InvalidParameter.InvalidResourceIds"),
     
     /* 无效的资源规格。 */
     INVALIDPARAMETER_INVALIDRESOURCESPEC("InvalidParameter.InvalidResourceSpec"),
     
     /* 无效的扩缩容动作。 */
     INVALIDPARAMETER_INVALIDSCALEACTION("InvalidParameter.InvalidScaleAction"),
     
     /* 不合法的引导脚本执行参数。 */
     INVALIDPARAMETER_INVALIDSCRIPTBOOTSTRAPACTIONCONFIG("InvalidParameter.InvalidScriptBootstrapActionConfig"),
     
     /* 该EMR版本不支持开启安全模式。 */
     INVALIDPARAMETER_INVALIDSECURITYSUPPORT("InvalidParameter.InvalidSecuritySupport"),
     
     /* 无效的安全组ID。 */
     INVALIDPARAMETER_INVALIDSERCURITYGRPUPID("InvalidParameter.InvalidSercurityGrpupId"),
     
     /* 服务名无效。 */
     INVALIDPARAMETER_INVALIDSERVICENAME("InvalidParameter.InvalidServiceName"),
     
     /* 参数ServiceNodeInfo无效或错误。 */
     INVALIDPARAMETER_INVALIDSERVICENODEINFO("InvalidParameter.InvalidServiceNodeInfo"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDSERVICETYPE("InvalidParameter.InvalidServiceType"),
     
     /* 参数InvalidSoftDeployInfo无效或错误。 */
     INVALIDPARAMETER_INVALIDSOFTDEPLOYINFO("InvalidParameter.InvalidSoftDeployInfo"),
     
     /* 无效的SoftInfo。 */
     INVALIDPARAMETER_INVALIDSOFTINFO("InvalidParameter.InvalidSoftInfo"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDSOFTWARE("InvalidParameter.InvalidSoftWare"),
     
     /* 软件名无效。 */
     INVALIDPARAMETER_INVALIDSOFTWARENAME("InvalidParameter.InvalidSoftWareName"),
     
     /* 软件版本无效。 */
     INVALIDPARAMETER_INVALIDSOFTWAREVERSION("InvalidParameter.InvalidSoftWareVersion"),
     
     /* invalid Parameter StartTime or EndTime.参数无效 */
     INVALIDPARAMETER_INVALIDSTARTTIMEORENDTIME("InvalidParameter.InvalidStartTimeOrEndTime"),
     
     /* invalid Parameter StatisticPeriod or TriggerThreshold.参数无效 */
     INVALIDPARAMETER_INVALIDSTATISTICPERIODORTRIGGERTHRESHOLD("InvalidParameter.InvalidStatisticPeriodOrTriggerThreshold"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDSTRATEGY("InvalidParameter.InvalidStrategy"),
     
     /* 无效的规则优先级。 */
     INVALIDPARAMETER_INVALIDSTRATEGYPRIORITY("InvalidParameter.InvalidStrategyPriority"),
     
     /* 无效的规格。 */
     INVALIDPARAMETER_INVALIDSTRATEGYSPEC("InvalidParameter.InvalidStrategySpec"),
     
     /* 不支持的扩缩容策略类型。 */
     INVALIDPARAMETER_INVALIDSTRATEGYTYPE("InvalidParameter.InvalidStrategyType"),
     
     /* 无效的子网ID。 */
     INVALIDPARAMETER_INVALIDSUBNETID("InvalidParameter.InvalidSubnetId"),
     
     /* 无效的高可用参数。 */
     INVALIDPARAMETER_INVALIDSUPPORTHA("InvalidParameter.InvalidSupportHA"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDTAGSGROUP("InvalidParameter.InvalidTagsGroup"),
     
     /* task的数量不能超过20。 */
     INVALIDPARAMETER_INVALIDTASKCOUNT("InvalidParameter.InvalidTaskCount"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDTIMELAYOUT("InvalidParameter.InvalidTimeLayout"),
     
     /* 无效的timespan。 */
     INVALIDPARAMETER_INVALIDTIMESPAN("InvalidParameter.InvalidTimeSpan"),
     
     /* 无效的TimeUnit。 */
     INVALIDPARAMETER_INVALIDTIMEUNIT("InvalidParameter.InvalidTimeUnit"),
     
     /* 无效的Tke集群ID，或Tke集群不符合条件。 */
     INVALIDPARAMETER_INVALIDTKEINSTANCE("InvalidParameter.InvalidTkeInstance"),
     
     /* 父账号uin参数输入异常。 */
     INVALIDPARAMETER_INVALIDUINNUM("InvalidParameter.InvalidUinNum"),
     
     /* 无效的统一元数据库。 */
     INVALIDPARAMETER_INVALIDUNIFYMETA("InvalidParameter.InvalidUnifyMeta"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDVENDORTYPE("InvalidParameter.InvalidVendorType"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_INVALIDVOLUMETYPE("InvalidParameter.InvalidVolumeType"),
     
     /* 无效的私有网络ID。 */
     INVALIDPARAMETER_INVALIDVPCID("InvalidParameter.InvalidVpcId"),
     
     /* 无效的可用区。 */
     INVALIDPARAMETER_INVALIDZONE("InvalidParameter.InvalidZone"),
     
     /* 不合法的支持Kerberos标识。 */
     INVALIDPARAMETER_KERBEROSSUPPORT("InvalidParameter.KerberosSupport"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_LESSCOMMONCOUNT("InvalidParameter.LessCommonCount"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_LESSTASKCOUNT("InvalidParameter.LessTaskCount"),
     
     /* 超过cvm实例最大限制个数。 */
     INVALIDPARAMETER_MOREMAXLIMITNUM("InvalidParameter.MoreMaxlimitNum"),
     
     /* 无效参数，不满足必须组件。 */
     INVALIDPARAMETER_NOTCONTAINMUSTSELECTSOFTWARE("InvalidParameter.NotContainMustSelectSoftware"),
     
     /* 排序字段错误。 */
     INVALIDPARAMETER_ORDERFIELDNOTMATCH("InvalidParameter.OrderFieldNotMatch"),
     
     /* 付费模式与资源不匹配。 */
     INVALIDPARAMETER_PAYMODERESOURCENOTMATCH("InvalidParameter.PayModeResourceNotMatch"),
     
     /* 项目与资源不匹配。 */
     INVALIDPARAMETER_PROJECTRESOURCENOTMATCH("InvalidParameter.ProjectResourceNotMatch"),
     
     /* 执行时间重复。 */
     INVALIDPARAMETER_REPEATEDEXECUTIONTIME("InvalidParameter.RepeatedExecutionTime"),
     
     /* 扩缩容规则名重复。 */
     INVALIDPARAMETER_REPEATEDSTRATEGYNAME("InvalidParameter.RepeatedStrategyName"),
     
     /* ResourceProviderType参数无效。 */
     INVALIDPARAMETER_RESOURCEPROVIDERTYPE("InvalidParameter.ResourceProviderType"),
     
     /* 该服务不支持重启。 */
     INVALIDPARAMETER_RESTARTSERVICEUNSUPPORTED("InvalidParameter.RestartServiceUnsupported"),
     
     /* 存在无效的产品组件。 */
     INVALIDPARAMETER_SOFTWARENOTINPRODUCR("InvalidParameter.SoftwareNotInProducr"),
     
     /* 存在无效的产品组件。 */
     INVALIDPARAMETER_SOFTWARENOTINPRODUCT("InvalidParameter.SoftwareNotInProduct"),
     
     /* 策略为授权。 */
     INVALIDPARAMETER_UNGRANTEDPOLICY("InvalidParameter.UngrantedPolicy"),
     
     /* 角色未授权。 */
     INVALIDPARAMETER_UNGRANTEDROLE("InvalidParameter.UngrantedRole"),
     
     /* 参数错误。 */
     INVALIDPARAMETER_UNSATISFIEDSOFTDEPENDECY("InvalidParameter.UnsatisfiedSoftDependecy"),
     
     /* 可用区与资源不匹配。 */
     INVALIDPARAMETER_ZONERESOURCENOTMATCH("InvalidParameter.ZoneResourceNotMatch"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 无效的Tke集群ID，或Tke集群不符合条件。 */
     INVALIDPARAMETERVALUE_INVALIDTKEINSTANCE("InvalidParameterValue.InvalidTkeInstance"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 引导脚本数量超过限制。 */
     LIMITEXCEEDED_BOOTSTRAPACTIONSNUMLIMITEXCEEDED("LimitExceeded.BootstrapActionsNumLimitExceeded"),
     
     /* Pod Cpu请求数量超过集群限制。 */
     LIMITEXCEEDED_PODCPULIMITEXCEEDEDAVAILABLECPU("LimitExceeded.PodCpuLimitExceededAvailableCpu"),
     
     /* Pod Cpu请求数量超过节点限制。 */
     LIMITEXCEEDED_PODCPULIMITEXCEEDEDNODEAVAILABLECPU("LimitExceeded.PodCpuLimitExceededNodeAvailableCpu"),
     
     /* Pod 内存请求数量超过集群限制。 */
     LIMITEXCEEDED_PODMEMORYLIMITEXCEEDEDAVAILABLEMEMORY("LimitExceeded.PodMemoryLimitExceededAvailableMemory"),
     
     /* 请求已经积压并超过了限制 */
     LIMITEXCEEDED_REQUESTBACKLOGEXCEEDSLIMIT("LimitExceeded.RequestBacklogExceedsLimit"),
     
     /* 安全组数量超过限制。 */
     LIMITEXCEEDED_SECURITYGROUPNUMLIMITEXCEEDED("LimitExceeded.SecurityGroupNumLimitExceeded"),
     
     /* 用户数量超过了限制 */
     LIMITEXCEEDED_USERCOUNTEXCEEDSLIMIT("LimitExceeded.UserCountExceedsLimit"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER_MISSINGCORERESOURCE("MissingParameter.MissingCoreResource"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 实例在流程中。 */
     RESOURCEINUSE_INSTANCEINPROCESS("ResourceInUse.InstanceInProcess"),
     
     /* 硬盘规格不满足。 */
     RESOURCEINSUFFICIENT_DISKINSUFFICIENT("ResourceInsufficient.DiskInsufficient"),
     
     /* 不支持或售罄的节点规格。 */
     RESOURCEINSUFFICIENT_INSTANCEINSUFFICIENT("ResourceInsufficient.InstanceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND_CDBINFONOTFOUND("ResourceNotFound.CDBInfoNotFound"),
     
     /* 无法找到该实例。 */
     RESOURCENOTFOUND_CLUSTERNOTFOUND("ResourceNotFound.ClusterNotFound"),
     
     /* 无法找到指定的CVM实例。 */
     RESOURCENOTFOUND_CVMINSTANCENOTFOUND("ResourceNotFound.CvmInstanceNotFound"),
     
     /* 无法找到硬件信息。 */
     RESOURCENOTFOUND_HARDWAREINFONOTFOUND("ResourceNotFound.HardwareInfoNotFound"),
     
     /* 无法找到该实例。 */
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
     /* 无法找到监控元数据。 */
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
     /* 无法找到该服务组件。 */
     RESOURCENOTFOUND_SERVICEGROUPNOTFOUND("ResourceNotFound.ServiceGroupNotFound"),
     
     /* 不存在的规格。 */
     RESOURCENOTFOUND_SPECNOTFOUND("ResourceNotFound.SpecNotFound"),
     
     /* 未找到相应扩缩容规则。 */
     RESOURCENOTFOUND_STRATEGYNOTFOUND("ResourceNotFound.StrategyNotFound"),
     
     /* 找不到对应的子网。 */
     RESOURCENOTFOUND_SUBNETNOTFOUND("ResourceNotFound.SubnetNotFound"),
     
     /* tke集群前置组件未部署。 */
     RESOURCENOTFOUND_TKEPRECONDITIONNOTFOUND("ResourceNotFound.TKEPreconditionNotFound"),
     
     /* 没有查找到指定标签。 */
     RESOURCENOTFOUND_TAGSNOTFOUND("ResourceNotFound.TagsNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE_NOTSUPPORTCLUSTERTYPE("ResourceUnavailable.NotSupportClusterType"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE_NOTSUPPORTNODETYPE("ResourceUnavailable.NotSupportNodeType"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE_NOTSUPPORTRESOURCETYPE("ResourceUnavailable.NotSupportResourceType"),
     
     /* 资源规格重复。 */
     RESOURCEUNAVAILABLE_REPEATSPEC("ResourceUnavailable.RepeatSpec"),
     
     /* 当前资源规格不存在默认规格。 */
     RESOURCEUNAVAILABLE_RESOURCESPECNOTDEFAULTSPEC("ResourceUnavailable.ResourceSpecNotDefaultSpec"),
     
     /* 资源规格不存在。 */
     RESOURCEUNAVAILABLE_RESOURCESPECNOTEXIST("ResourceUnavailable.ResourceSpecNotExist"),
     
     /* 资源售罄。 */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* CBS资源售罄。 */
     RESOURCESSOLDOUT_CBSSOLDOUT("ResourcesSoldOut.CbsSoldOut"),
     
     /* 云服务器已售罄。 */
     RESOURCESSOLDOUT_CVMSOLDOUT("ResourcesSoldOut.CvmSoldOut"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* appid不一致。 */
     UNAUTHORIZEDOPERATION_APPIDMISMATCHED("UnauthorizedOperation.AppIdMismatched"),
     
     /* 校验账号操作无权限。 */
     UNAUTHORIZEDOPERATION_CHECKCAMAUTH("UnauthorizedOperation.CheckCamAuth"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* 该功能白名单支持。 */
     UNSUPPORTEDOPERATION_NOTINWHITELIST("UnsupportedOperation.NotInWhiteList"),
     
     /* 该服务不支持此操作。 */
     UNSUPPORTEDOPERATION_SERVICENOTSUPPORT("UnsupportedOperation.ServiceNotSupport");
     
    private String value;
    private EmrErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

