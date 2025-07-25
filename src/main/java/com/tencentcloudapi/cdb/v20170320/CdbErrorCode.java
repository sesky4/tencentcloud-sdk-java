package com.tencentcloudapi.cdb.v20170320;
public enum CdbErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 授权无效。 */
     AUTHFAILURE_INVALIDAUTHORIZATION("AuthFailure.InvalidAuthorization"),
     
     /* 子账号无权限。 */
     AUTHFAILURE_SUBACCOUNTDENIED("AuthFailure.SubAccountDenied"),
     
     /* 后端错误或者流程错误。 */
     CDBERROR("CdbError"),
     
     /* 备份错误。 */
     CDBERROR_BACKUPERROR("CdbError.BackupError"),
     
     /* 后端数据库错误。 */
     CDBERROR_DATABASEERROR("CdbError.DatabaseError"),
     
     /* 导入任务错误。 */
     CDBERROR_IMPORTERROR("CdbError.ImportError"),
     
     /* 后端任务错误。 */
     CDBERROR_TASKERROR("CdbError.TaskError"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 异步任务状态异常。 */
     FAILEDOPERATION_ASYNCTASKSTATUSERROR("FailedOperation.AsyncTaskStatusError"),
     
     /* 审计不存在。 */
     FAILEDOPERATION_AUDITCONFIGNOTEXIST("FailedOperation.AuditConfigNotExist"),
     
     /* 实例互斥操作锁定失败,请稍后重试。 */
     FAILEDOPERATION_CDBINSTANCELOCKFAILERROR("FailedOperation.CdbInstanceLockFailError"),
     
     /* 创建失败，请检查用户是否已存在。 */
     FAILEDOPERATION_CREATEACCOUNTERROR("FailedOperation.CreateAccountError"),
     
     /* 创建审计规则失败。 */
     FAILEDOPERATION_CREATEAUDITFAILERROR("FailedOperation.CreateAuditFailError"),
     
     /* 创建审计日志文件失败。 */
     FAILEDOPERATION_CREATEAUDITLOGFILEERROR("FailedOperation.CreateAuditLogFileError"),
     
     /* 申请只读实例独立VIP失败。 */
     FAILEDOPERATION_CREATEROVIPERROR("FailedOperation.CreateRoVipError"),
     
     /* 数据库操作失败。 */
     FAILEDOPERATION_DBOPERATIONACTIONERROR("FailedOperation.DBOperationActionError"),
     
     /* 删除审计失败。 */
     FAILEDOPERATION_DELETEAUDITFAILERROR("FailedOperation.DeleteAuditFailError"),
     
     /* 查询数据库代理失败。 */
     FAILEDOPERATION_DESCRIBEPROXYGROUPERROR("FailedOperation.DescribeProxyGroupError"),
     
     /* 不支持当前操作。 */
     FAILEDOPERATION_FAILEDOPERATIONERROR("FailedOperation.FailedOperationError"),
     
     /* 获取权限错误。 */
     FAILEDOPERATION_GETPRIVILEGEERROR("FailedOperation.GetPrivilegeError"),
     
     /* 查询失败。 */
     FAILEDOPERATION_INSTANCEQUERYERROR("FailedOperation.InstanceQueryError"),
     
     /* 实例任务冲突错误。 */
     FAILEDOPERATION_INSTANCETASKCONFLICTERROR("FailedOperation.InstanceTaskConflictError"),
     
     /* json序列化失败。 */
     FAILEDOPERATION_JSONMARSHALERROR("FailedOperation.JsonMarshalError"),
     
     /* json反序列化失败。 */
     FAILEDOPERATION_JSONUNMARSHALERROR("FailedOperation.JsonUnmarshalError"),
     
     /* 返回数据量过大，请缩减数据查询范围 */
     FAILEDOPERATION_LOGCONTENTOVERLIMIT("FailedOperation.LogContentOverLimit"),
     
     /* 检查到改动前后策略一致，无改动点。 */
     FAILEDOPERATION_NOTCHANGESTRATEGY("FailedOperation.NotChangeStrategy"),
     
     /* 不是延迟复制RO。 */
     FAILEDOPERATION_NOTDELAYRO("FailedOperation.NotDelayRo"),
     
     /* 实例正在执行其他操作，请稍后重试。 */
     FAILEDOPERATION_OPERATIONINCONFLICTERROR("FailedOperation.OperationInConflictError"),
     
     /* 执行的权限修改操作非法。您可以参照产品文档，了解当前实例支持哪些权限修改操作，如有疑问，请您咨询客服进行处理。 */
     FAILEDOPERATION_PRIVILEGEDATAILLEGAL("FailedOperation.PrivilegeDataIllegal"),
     
     /* 数据库代理状态异常。 */
     FAILEDOPERATION_PROXYGROUPSTATUSERROR("FailedOperation.ProxyGroupStatusError"),
     
     /* 查询审计任务失败。 */
     FAILEDOPERATION_QUERYAUDITTASKFAILERROR("FailedOperation.QueryAuditTaskFailError"),
     
     /* 查询日志失败。 */
     FAILEDOPERATION_QUERYLOGERROR("FailedOperation.QueryLogError"),
     
     /* 高可用版服务跨区调用反序列化失败。 */
     FAILEDOPERATION_REMOTECALLUNMARSHALERROR("FailedOperation.RemoteCallUnmarshalError"),
     
     /* 代理创建中或则已存在，请勿重复创建。 */
     FAILEDOPERATION_REPEATCREATEPROXYERROR("FailedOperation.RepeatCreateProxyError"),
     
     /* 后台请求服务异常，请您联系客服解决。 */
     FAILEDOPERATION_RESPONSEVALUEERROR("FailedOperation.ResponseValueError"),
     
     /* 查询日志结果集超出限制，请缩小查询范围。 */
     FAILEDOPERATION_RESULTSETOVERLIMIT("FailedOperation.ResultSetOverLimit"),
     
     /* 操作发起失败，请稍后重试。如果操作持续不成功，请您联系客服进行处理。 */
     FAILEDOPERATION_STARTFLOWERROR("FailedOperation.StartFlowError"),
     
     /* 任务状态冲突。 */
     FAILEDOPERATION_STATUSCONFLICT("FailedOperation.StatusConflict"),
     
     /* 提交任务失败，请稍后重试。如果持续提交失败，请您联系客服进行处理。 */
     FAILEDOPERATION_SUBMITASYNCTASKERROR("FailedOperation.SubmitAsyncTaskError"),
     
     /* 任务冲突 */
     FAILEDOPERATION_TASKCONFLICTERROR("FailedOperation.TaskConflictError"),
     
     /* 查询超时。 */
     FAILEDOPERATION_TIMEOUTERROR("FailedOperation.TimeoutError"),
     
     /* 类型错误，无法执行该操作。 */
     FAILEDOPERATION_TYPEINCONFLICT("FailedOperation.TypeInConflict"),
     
     /* 该IP已被占用。 */
     FAILEDOPERATION_VPCIPINUSEERROR("FailedOperation.VpcIpInUseError"),
     
     /* 无效IP */
     FAILEDOPERATION_VPCIPINVALIDERROR("FailedOperation.VpcIpInvalidError"),
     
     /* 子网中不存在该IP */
     FAILEDOPERATION_VPCIPNOTINSUBNETERROR("FailedOperation.VpcIpNotInSubnetError"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 查询异步任务错误。 */
     INTERNALERROR_ASYNCREQUESTERROR("InternalError.AsyncRequestError"),
     
     /* 创建审计日志文件错误。 */
     INTERNALERROR_AUDITCREATELOGFILEERROR("InternalError.AuditCreateLogFileError"),
     
     /* 删除审计日志错误。 */
     INTERNALERROR_AUDITDELETELOGFILEERROR("InternalError.AuditDeleteLogFileError"),
     
     /* 审计内部服务错误。 */
     INTERNALERROR_AUDITDELETEPOLICYERROR("InternalError.AuditDeletePolicyError"),
     
     /* 查询审计日志错误。 */
     INTERNALERROR_AUDITDESCRIBELOGERROR("InternalError.AuditDescribeLogError"),
     
     /* 审计内部服务错误。 */
     INTERNALERROR_AUDITERROR("InternalError.AuditError"),
     
     /* 修改审计状态失败。 */
     INTERNALERROR_AUDITMODIFYSTATUSERROR("InternalError.AuditModifyStatusError"),
     
     /* 审计服务内部异常。 */
     INTERNALERROR_AUDITOSSLOGICERROR("InternalError.AuditOssLogicError"),
     
     /* 鉴权失败。 */
     INTERNALERROR_AUTHERROR("InternalError.AuthError"),
     
     /* 鉴权失败。 */
     INTERNALERROR_CAUTHERROR("InternalError.CauthError"),
     
     /* 系统内部错误。 */
     INTERNALERROR_CDBCGWERROR("InternalError.CdbCgwError"),
     
     /* 系统错误。 */
     INTERNALERROR_CDBERROR("InternalError.CdbError"),
     
     /* 获取文件信息失败。 */
     INTERNALERROR_COSERROR("InternalError.CosError"),
     
     /* 数据库异常。 */
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
     /* 数据库操作失败。 */
     INTERNALERROR_DBOPERATIONERROR("InternalError.DBOperationError"),
     
     /* 数据库实例不存在。 */
     INTERNALERROR_DBRECORDNOTEXISTERROR("InternalError.DBRecordNotExistError"),
     
     /* 数据库内部错误。 */
     INTERNALERROR_DATABASEACCESSERROR("InternalError.DatabaseAccessError"),
     
     /* 系统内部错误。 */
     INTERNALERROR_DESERROR("InternalError.DesError"),
     
     /* 安全组操作错误。 */
     INTERNALERROR_DFWERROR("InternalError.DfwError"),
     
     /* sql错误。 */
     INTERNALERROR_EXESQLERROR("InternalError.ExeSqlError"),
     
     /* 执行http请求错误。 */
     INTERNALERROR_EXECHTTPREQUESTERROR("InternalError.ExecHttpRequestError"),
     
     /* sql执行失败。 */
     INTERNALERROR_EXECUTESQLERROR("InternalError.ExecuteSQLError"),
     
     /* 文件传输异常。 */
     INTERNALERROR_FTPERROR("InternalError.FtpError"),
     
     /* Http请求异常。 */
     INTERNALERROR_HTTPERROR("InternalError.HttpError"),
     
     /* 请求失败。 */
     INTERNALERROR_HTTPREQUESTERROR("InternalError.HttpRequestError"),
     
     /* 导入失败。 */
     INTERNALERROR_IMPORTERROR("InternalError.ImportError"),
     
     /* 内部服务错误。 */
     INTERNALERROR_INNERCOMMONERROR("InternalError.InnerCommonError"),
     
     /* 内部服务异常，请您联系客服进行处理。 */
     INTERNALERROR_INTERNALASSERTERROR("InternalError.InternalAssertError"),
     
     /* 请求执行异常。 */
     INTERNALERROR_INTERNALHTTPSERVERERROR("InternalError.InternalHttpServerError"),
     
     /* 内部服务异常，请稍后重试 */
     INTERNALERROR_INTERNALINNERSERVICEERROR("InternalError.InternalInnerServiceError"),
     
     /* 后台请求服务失败，请稍后重试。 */
     INTERNALERROR_INTERNALREQUESTERROR("InternalError.InternalRequestError"),
     
     /* 访问内部服务错误。 */
     INTERNALERROR_INTERNALSERVICEERRORERR("InternalError.InternalServiceErrorErr"),
     
     /* json解析失败。 */
     INTERNALERROR_JSONERROR("InternalError.JSONError"),
     
     /* 开通加密失败。 */
     INTERNALERROR_KMSERROR("InternalError.KmsError"),
     
     /* 网络错误。 */
     INTERNALERROR_NETWORKERROR("InternalError.NetworkError"),
     
     /* 高可用版服务错误。 */
     INTERNALERROR_OSSERROR("InternalError.OssError"),
     
     /* 参数错误。 */
     INTERNALERROR_PARAMERROR("InternalError.ParamError"),
     
     /* 正则表达式编译错误。 */
     INTERNALERROR_REGEXPCOMPILEERROR("InternalError.RegexpCompileError"),
     
     /* 资源不匹配。 */
     INTERNALERROR_RESOURCENOTMATCH("InternalError.ResourceNotMatch"),
     
     /* 资源不唯一。 */
     INTERNALERROR_RESOURCENOTUNIQUE("InternalError.ResourceNotUnique"),
     
     /* 安全组错误。 */
     INTERNALERROR_SECURITYGROUPERROR("InternalError.SecurityGroupError"),
     
     /* 系统内部错误。 */
     INTERNALERROR_SERVERERROR("InternalError.ServerError"),
     
     /* 内部服务异常。 */
     INTERNALERROR_SERVICEERROR("InternalError.ServiceError"),
     
     /* 更改tag失败，请稍后重试。 */
     INTERNALERROR_TAGERROR("InternalError.TagError"),
     
     /* 任务异常。 */
     INTERNALERROR_TASKERROR("InternalError.TaskError"),
     
     /* 异步任务错误。 */
     INTERNALERROR_TASKFRAMEERROR("InternalError.TaskFrameError"),
     
     /* 时间窗错误。 */
     INTERNALERROR_TIMEWINDOWERROR("InternalError.TimeWindowError"),
     
     /* 交易系统错误。 */
     INTERNALERROR_TRADEERROR("InternalError.TradeError"),
     
     /* 开启事务失败 */
     INTERNALERROR_TRANSACTIOBEGINERROR("InternalError.TransactioBeginError"),
     
     /* 操作失败。 */
     INTERNALERROR_TRANSACTIONBEGINERROR("InternalError.TransactionBeginError"),
     
     /* 未知错误。 */
     INTERNALERROR_UNDEFINEDERROR("InternalError.UndefinedError"),
     
     /* 未知错误。 */
     INTERNALERROR_UNKNOWNERROR("InternalError.UnknownError"),
     
     /* 私有网络或子网错误。 */
     INTERNALERROR_VPCERROR("InternalError.VpcError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 未找到该接口。 */
     INVALIDPARAMETER_CONTROLLERNOTFOUNDERROR("InvalidParameter.ControllerNotFoundError"),
     
     /* 置放群组下存在资源。 */
     INVALIDPARAMETER_DEPLOYGROUPNOTEMPTY("InvalidParameter.DeployGroupNotEmpty"),
     
     /* 异常参数。 */
     INVALIDPARAMETER_EXCEPTIONPARAM("InvalidParameter.ExceptionParam"),
     
     /* 未找到该实例。 */
     INVALIDPARAMETER_INSTANCENAMENOTFOUND("InvalidParameter.InstanceNameNotFound"),
     
     /* 实例不存在。 */
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
     /* 异步任务不存在。 */
     INVALIDPARAMETER_INVALIDASYNCREQUESTID("InvalidParameter.InvalidAsyncRequestId"),
     
     /* 非法的名称。 */
     INVALIDPARAMETER_INVALIDNAME("InvalidParameter.InvalidName"),
     
     /* 无效的参数值。 */
     INVALIDPARAMETER_INVALIDPARAMETERERROR("InvalidParameter.InvalidParameterError"),
     
     /* Json反序列化错误。 */
     INVALIDPARAMETER_JSONUNMARSHALERROR("InvalidParameter.JsonUnmarshalError"),
     
     /* 超出置放群组资源数量配额。 */
     INVALIDPARAMETER_OVERDEPLOYGROUPQUOTA("InvalidParameter.OverDeployGroupQuota"),
     
     /* 资源已存在。 */
     INVALIDPARAMETER_RESOURCEEXISTS("InvalidParameter.ResourceExists"),
     
     /* 资源不存在。 */
     INVALIDPARAMETER_RESOURCENOTEXISTS("InvalidParameter.ResourceNotExists"),
     
     /* 未找到相关资源。 */
     INVALIDPARAMETER_RESOURCENOTFOUND("InvalidParameter.ResourceNotFound"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 账号描述信息包含特殊字符。 */
     INVALIDPARAMETERVALUE_ACCOUNTDESCRIPTIONCHARACTERERROR("InvalidParameterValue.AccountDescriptionCharacterError"),
     
     /* 账号描述信息长度超过255个字符。 */
     INVALIDPARAMETERVALUE_ACCOUNTDESCRIPTIONLENGTHERROR("InvalidParameterValue.AccountDescriptionLengthError"),
     
     /* 账号主机参数规则错误。 */
     INVALIDPARAMETERVALUE_ACCOUNTHOSTRULEERROR("InvalidParameterValue.AccountHostRuleError"),
     
     /* 账号密码中包含无效的字符。 */
     INVALIDPARAMETERVALUE_ACCOUNTPASSWORDCHARACTERERROR("InvalidParameterValue.AccountPasswordCharacterError"),
     
     /* 账号密码不符合长度。 */
     INVALIDPARAMETERVALUE_ACCOUNTPASSWORDLENGTHERROR("InvalidParameterValue.AccountPasswordLengthError"),
     
     /* 密码规则错误，至少包含字母、数字和字符（_+-&=!@#$%^*()）中的两种，长度为8-64个字符。 */
     INVALIDPARAMETERVALUE_ACCOUNTPASSWORDRULEERROR("InvalidParameterValue.AccountPasswordRuleError"),
     
     /* 数据转换失败。 */
     INVALIDPARAMETERVALUE_DATACONVERTERROR("InvalidParameterValue.DataConvertError"),
     
     /* 参数值无效。 */
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUEERROR("InvalidParameterValue.InvalidParameterValueError"),
     
     /* 账号用户名规则错误。 */
     INVALIDPARAMETERVALUE_USERNAMERULEERROR("InvalidParameterValue.UserNameRuleError"),
     
     /* 账号信息不存在。 */
     INVALIDPARAMETERVALUE_USERNOTEXISTERROR("InvalidParameterValue.UserNotExistError"),
     
     /* 未找到root账号信息。 */
     INVALIDPARAMETERVALUE_VERIFYACCOUNTNOROOTERROR("InvalidParameterValue.VerifyAccountNoRootError"),
     
     /* 账号密码无效。 */
     INVALIDPARAMETERVALUE_VERIFYACCOUNTPASSWORDERROR("InvalidParameterValue.VerifyAccountPasswordError"),
     
     /* 账号无GRANT权限。 */
     INVALIDPARAMETERVALUE_VERIFYACCOUNTPRIVERROR("InvalidParameterValue.VerifyAccountPrivError"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 缺失账号相关参数。 */
     MISSINGPARAMETER_ACCOUNTMISSINGPARAMETERERROR("MissingParameter.AccountMissingParameterError"),
     
     /* 缺少必要参数。 */
     MISSINGPARAMETER_MISSINGPARAMERROR("MissingParameter.MissingParamError"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 云账号权限不足，不支持该操作。 */
     OPERATIONDENIED_ACCOUNTOPERATIONDENIED("OperationDenied.AccountOperationDenied"),
     
     /* 实例正在执行其他任务。 */
     OPERATIONDENIED_ACTIONINPROCESS("OperationDenied.ActionInProcess"),
     
     /* 不支持的操作。 */
     OPERATIONDENIED_ACTIONNOTSUPPORT("OperationDenied.ActionNotSupport"),
     
     /* 已开启安全审计，至少保留一个全审计。 */
     OPERATIONDENIED_ATLEASTALLRULEAUDITPOLICYERROR("OperationDenied.AtLeastAllRuleAuditPolicyError"),
     
     /* 至少保留一个审计策略。 */
     OPERATIONDENIED_ATLEASTAUDITPOLICYERROR("OperationDenied.AtLeastAuditPolicyError"),
     
     /* 审计日志文件数超过最大限制数。 */
     OPERATIONDENIED_AUDITFILEOVERQUOTAERROR("OperationDenied.AuditFileOverQuotaError"),
     
     /* 审计策略冲突。 */
     OPERATIONDENIED_AUDITPOLICYCONFLICTERROR("OperationDenied.AuditPolicyConflictError"),
     
     /* 审计策略已存在。 */
     OPERATIONDENIED_AUDITPOLICYEXISTERROR("OperationDenied.AuditPolicyExistError"),
     
     /* 审计策略不存在。 */
     OPERATIONDENIED_AUDITPOLICYNOTEXISTERROR("OperationDenied.AuditPolicyNotExistError"),
     
     /* 审计策略数量超限。 */
     OPERATIONDENIED_AUDITPOLICYOVERQUOTAERROR("OperationDenied.AuditPolicyOverQuotaError"),
     
     /* 审计规则删除失败。 */
     OPERATIONDENIED_AUDITRULEDELETEERROR("OperationDenied.AuditRuleDeleteError"),
     
     /* 审计规则已存在。 */
     OPERATIONDENIED_AUDITRULEEXISTERROR("OperationDenied.AuditRuleExistError"),
     
     /* 审计规则已绑定。 */
     OPERATIONDENIED_AUDITRULEHASBIND("OperationDenied.AuditRuleHasBind"),
     
     /* 审计规则不存在。 */
     OPERATIONDENIED_AUDITRULENOTEXISTERROR("OperationDenied.AuditRuleNotExistError"),
     
     /* 审计状态异常。 */
     OPERATIONDENIED_AUDITSTATUSERROR("OperationDenied.AuditStatusError"),
     
     /* 审计任务冲突。 */
     OPERATIONDENIED_AUDITTASKCONFLICTERROR("OperationDenied.AuditTaskConflictError"),
     
     /* 当前RO组有RO实例处于非法状态，不允许执行当前操作。 */
     OPERATIONDENIED_CONFLICTROSTATUS("OperationDenied.ConflictRoStatus"),
     
     /* 当前只读组配置正在变更中，请勿重复发起请求。 */
     OPERATIONDENIED_CONFLICTSTATUS("OperationDenied.ConflictStatus"),
     
     /* 已开通安全审计,不支持规则审计。 */
     OPERATIONDENIED_DBBRAINPOLICYCONFLICT("OperationDenied.DBBrainPolicyConflict"),
     
     /* 延迟复制正在运行，不允许执行操作。 */
     OPERATIONDENIED_DELAYREPLICATIONRUNNING("OperationDenied.DelayReplicationRunning"),
     
     /* root账号禁止被删除。 */
     OPERATIONDENIED_DELETEROOTACCOUNTERROR("OperationDenied.DeleteRootAccountError"),
     
     /* 该实例无此功能权限。 */
     OPERATIONDENIED_FUNCTIONDENIED("OperationDenied.FunctionDenied"),
     
     /* 当前类型实例不支持该操作。 */
     OPERATIONDENIED_INSTTYPENOTSUPPORT("OperationDenied.InstTypeNotSupport"),
     
     /* 实例锁冲突，请稍后重试。 */
     OPERATIONDENIED_INSTANCELOCKERCONFLICT("OperationDenied.InstanceLockerConflict"),
     
     /* 实例状态异常。 */
     OPERATIONDENIED_INSTANCESTATUSERROR("OperationDenied.InstanceStatusError"),
     
     /* 当前实例正在进行其他任务，不能执行延迟复制。 */
     OPERATIONDENIED_INSTANCETASKRUNNING("OperationDenied.InstanceTaskRunning"),
     
     /* 实例任务状态异常。 */
     OPERATIONDENIED_INSTANCETASKSTATUSERROR("OperationDenied.InstanceTaskStatusError"),
     
     /* 实例不支持该操作。 */
     OPERATIONDENIED_INSTANCEUNSUPPORTEDOPERATEERROR("OperationDenied.InstanceUnsupportedOperateError"),
     
     /* 修改审计状态失败。 */
     OPERATIONDENIED_MODIFYAUDITSTATUSERROR("OperationDenied.ModifyAuditStatusError"),
     
     /* 基础版实例不支持当前操作（功能）。 */
     OPERATIONDENIED_NOTSUPPORTBASIC("OperationDenied.NotSupportBasic"),
     
     /* 不支持修改本地root账号host信息。 */
     OPERATIONDENIED_NOTSUPPORTMODIFYLOCALROOTHOSTERROR("OperationDenied.NotSupportModifyLocalRootHostError"),
     
     /* 操作拒绝。 */
     OPERATIONDENIED_OPERATIONDENIEDERROR("OperationDenied.OperationDeniedError"),
     
     /* 当前有其他订单正在处于下单过程中，请稍后重试。 */
     OPERATIONDENIED_OTHERODERINPROCESS("OperationDenied.OtherOderInProcess"),
     
     /* 资源配额超限。 */
     OPERATIONDENIED_OVERQUOTA("OperationDenied.OverQuota"),
     
     /* 代理地址超限。 */
     OPERATIONDENIED_PROXYADDRESSLIMITERROR("OperationDenied.ProxyAddressLimitError"),
     
     /* 代理地址未找到。 */
     OPERATIONDENIED_PROXYADDRESSNOTFUND("OperationDenied.ProxyAddressNotFund"),
     
     /* 代理节点超限。 */
     OPERATIONDENIED_PROXYNODECOUNTLIMITERROR("OperationDenied.ProxyNodeCountLimitError"),
     
     /* 数据库代理升级任务中，不允许该操作。 */
     OPERATIONDENIED_PROXYUPGRADETASKSTATUSERROR("OperationDenied.ProxyUpgradeTaskStatusError"),
     
     /* 查询审计日志失败。 */
     OPERATIONDENIED_QUERYAUDITLOGSERROR("OperationDenied.QueryAuditLogsError"),
     
     /* 资源未找到。 */
     OPERATIONDENIED_RESOURCENOTFOUNDERROR("OperationDenied.ResourceNotFoundError"),
     
     /* 资源未找到。 */
     OPERATIONDENIED_RESOURCENOTFUNDERROR("OperationDenied.ResourceNotFundError"),
     
     /* 结果集超过限制，请缩小检索范围。 */
     OPERATIONDENIED_RESULTOVERLIMIT("OperationDenied.ResultOverLimit"),
     
     /* 腾讯云子账号权限不足，不允许执行当前操作。 */
     OPERATIONDENIED_SUBACCOUNTOPERATIONDENIED("OperationDenied.SubAccountOperationDenied"),
     
     /* 该实例暂不支持退款。 */
     OPERATIONDENIED_UNSUPPORTREFUNDERROR("OperationDenied.UnSupportRefundError"),
     
     /* 不支持创建代理地址。 */
     OPERATIONDENIED_UNSUPPORTCREATEADDRESSERROR("OperationDenied.UnsupportCreateAddressError"),
     
     /* 不支持开通审计。 */
     OPERATIONDENIED_UNSUPPORTOPENAUDITERROR("OperationDenied.UnsupportOpenAuditError"),
     
     /* 用户没有该策略权限。 */
     OPERATIONDENIED_USERHASNOSTRATEGY("OperationDenied.UserHasNoStrategy"),
     
     /* 密码错误或校验未通过。 */
     OPERATIONDENIED_WRONGPASSWORD("OperationDenied.WrongPassword"),
     
     /* 后端任务状态非法。 */
     OPERATIONDENIED_WRONGSTATUS("OperationDenied.WrongStatus"),
     
     /* 超限错误。 */
     OVERQUOTA("OverQuota"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不足。 */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 未找到数据库实例，请确认您的实例状态是否正常。 */
     RESOURCENOTFOUND_CDBINSTANCENOTFOUNDERROR("ResourceNotFound.CdbInstanceNotFoundError"),
     
     /* 该实例不存在。 */
     RESOURCENOTFOUND_INSTANCENOTFOUNDERROR("ResourceNotFound.InstanceNotFoundError"),
     
     /* 该实例不存在。 */
     RESOURCENOTFOUND_INSTANCENOTFUNDERROR("ResourceNotFound.InstanceNotFundError"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 认证失败，没有足够权限。 */
     UNAUTHORIZEDOPERATION_NOTENOUGHPRIVILEGES("UnauthorizedOperation.NotEnoughPrivileges"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* 非强隔离实例不支持当前操作。 */
     UNSUPPORTEDOPERATION_NOTSUPPORTNORMALINSTANCE("UnsupportedOperation.NotSupportNormalInstance"),
     
     /* 权限不支持。 */
     UNSUPPORTEDOPERATION_PRIVILEGESUNSUPPORTEDERROR("UnsupportedOperation.PrivilegesUnsupportedError");
     
    private String value;
    private CdbErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

