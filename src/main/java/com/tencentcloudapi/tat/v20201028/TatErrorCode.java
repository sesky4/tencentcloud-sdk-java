package com.tencentcloudapi.tat.v20201028;
public enum TatErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* 调用 CVM 失败。 */
     FAILEDOPERATION_CVMERROR("FailedOperation.CVMError"),
     
     /* 调用 Lighthouse 失败。 */
     FAILEDOPERATION_LIGHTHOUSEERROR("FailedOperation.LighthouseError"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 无效的过滤器 */
     INVALIDFILTER("InvalidFilter"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数冲突。 */
     INVALIDPARAMETER_CONFLICTPARAMETER("InvalidParameter.ConflictParameter"),
     
     /* 无效用户名。 */
     INVALIDPARAMETER_INVALIDUSERNAME("InvalidParameter.InvalidUsername"),
     
     /* 参数名称重复。 */
     INVALIDPARAMETER_PARAMETERNAMEDUPLICATED("InvalidParameter.ParameterNameDuplicated"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* Agent不支持此命令类型。 */
     INVALIDPARAMETERVALUE_AGENTUNSUPPORTEDCOMMANDTYPE("InvalidParameterValue.AgentUnsupportedCommandType"),
     
     /* Command 内容无效。 */
     INVALIDPARAMETERVALUE_COMMANDCONTENTINVALID("InvalidParameterValue.CommandContentInvalid"),
     
     /* Command 名称重复。 */
     INVALIDPARAMETERVALUE_COMMANDNAMEDUPLICATED("InvalidParameterValue.CommandNameDuplicated"),
     
     /* ID 格式错误。 */
     INVALIDPARAMETERVALUE_ID("InvalidParameterValue.ID"),
     
     /* ID 数组中，ID 格式错误或格式不一致。 */
     INVALIDPARAMETERVALUE_INCONSISTENTID("InvalidParameterValue.InconsistentID"),
     
     /* 实例类型不一致。 */
     INVALIDPARAMETERVALUE_INCONSISTENTINSTANCE("InvalidParameterValue.InconsistentInstance"),
     
     /* 实例ID与执行活动无关。 */
     INVALIDPARAMETERVALUE_INSTANCEISNOTRELATEDTOINVOCATION("InvalidParameterValue.InstanceIsNotRelatedToInvocation"),
     
     /* CommandId 无效。 */
     INVALIDPARAMETERVALUE_INVALIDCOMMANDID("InvalidParameterValue.InvalidCommandId"),
     
     /* Command 名称无效。 */
     INVALIDPARAMETERVALUE_INVALIDCOMMANDNAME("InvalidParameterValue.InvalidCommandName"),
     
     /* 命令内容无效。 */
     INVALIDPARAMETERVALUE_INVALIDCONTENT("InvalidParameterValue.InvalidContent"),
     
     /* Crontab 表达式无效。 */
     INVALIDPARAMETERVALUE_INVALIDCRONEXPRESSION("InvalidParameterValue.InvalidCronExpression"),
     
     /* Filter 无效。 */
     INVALIDPARAMETERVALUE_INVALIDFILTER("InvalidParameterValue.InvalidFilter"),
     
     /* 实例ID无效。 */
     INVALIDPARAMETERVALUE_INVALIDINSTANCEID("InvalidParameterValue.InvalidInstanceId"),
     
     /* 不合法的执行活动ID。 */
     INVALIDPARAMETERVALUE_INVALIDINVOCATIONID("InvalidParameterValue.InvalidInvocationId"),
     
     /* 不合法的执行任务ID。 */
     INVALIDPARAMETERVALUE_INVALIDINVOCATIONTASKID("InvalidParameterValue.InvalidInvocationTaskId"),
     
     /* InvokerId 无效。 */
     INVALIDPARAMETERVALUE_INVALIDINVOKERID("InvalidParameterValue.InvalidInvokerId"),
     
     /* OutputCOSBucketUrl 无效。 */
     INVALIDPARAMETERVALUE_INVALIDOUTPUTCOSBUCKETURL("InvalidParameterValue.InvalidOutputCOSBucketUrl"),
     
     /* OutputCOSKeyPrefix 无效。 */
     INVALIDPARAMETERVALUE_INVALIDOUTPUTCOSKEYPREFIX("InvalidParameterValue.InvalidOutputCOSKeyPrefix"),
     
     /* 无效的注册码ID。 */
     INVALIDPARAMETERVALUE_INVALIDREGISTERCODEID("InvalidParameterValue.InvalidRegisterCodeId"),
     
     /* 无效的托管实例ID。 */
     INVALIDPARAMETERVALUE_INVALIDREGISTERINSTANCEID("InvalidParameterValue.InvalidRegisterInstanceId"),
     
     /* 无效的场景 ID。 */
     INVALIDPARAMETERVALUE_INVALIDSCENEID("InvalidParameterValue.InvalidSceneId"),
     
     /* 无效的场景名称。 */
     INVALIDPARAMETERVALUE_INVALIDSCENENAME("InvalidParameterValue.InvalidSceneName"),
     
     /* 无效的时间格式。 */
     INVALIDPARAMETERVALUE_INVALIDTIMEFORMAT("InvalidParameterValue.InvalidTimeFormat"),
     
     /* 用户名不合法。 */
     INVALIDPARAMETERVALUE_INVALIDUSERNAME("InvalidParameterValue.InvalidUsername"),
     
     /* 命令执行路径不合法。 */
     INVALIDPARAMETERVALUE_INVALIDWORKINGDIRECTORY("InvalidParameterValue.InvalidWorkingDirectory"),
     
     /* 调用时间已过期。 */
     INVALIDPARAMETERVALUE_INVOKETIMEEXPIRED("InvalidParameterValue.InvokeTimeExpired"),
     
     /* 已启用自定义参数功能，但缺失自定义参数信息。 */
     INVALIDPARAMETERVALUE_LACKOFPARAMETERINFO("InvalidParameterValue.LackOfParameterInfo"),
     
     /* 未提供 Parameters 信息。 */
     INVALIDPARAMETERVALUE_LACKOFPARAMETERS("InvalidParameterValue.LackOfParameters"),
     
     /* 超过参数限制。 */
     INVALIDPARAMETERVALUE_LIMITEXCEEDED("InvalidParameterValue.LimitExceeded"),
     
     /* 未启用自定义参数功能。 */
     INVALIDPARAMETERVALUE_PARAMETERDISABLED("InvalidParameterValue.ParameterDisabled"),
     
     /* 参数为非法 json string 格式。 */
     INVALIDPARAMETERVALUE_PARAMETERINVALIDJSONFORMAT("InvalidParameterValue.ParameterInvalidJsonFormat"),
     
     /* 参数 Key 包含非法字符。 */
     INVALIDPARAMETERVALUE_PARAMETERKEYCONTAINSINVALIDCHAR("InvalidParameterValue.ParameterKeyContainsInvalidChar"),
     
     /* 参数 Key 重复。 */
     INVALIDPARAMETERVALUE_PARAMETERKEYDUPLICATED("InvalidParameterValue.ParameterKeyDuplicated"),
     
     /* 参数 Key 过长。 */
     INVALIDPARAMETERVALUE_PARAMETERKEYLENEXCEEDED("InvalidParameterValue.ParameterKeyLenExceeded"),
     
     /* 参数数目过多。 */
     INVALIDPARAMETERVALUE_PARAMETERNUMBEREXCEEDED("InvalidParameterValue.ParameterNumberExceeded"),
     
     /* 参数 Value 非 string 类型。 */
     INVALIDPARAMETERVALUE_PARAMETERVALUENOTSTRING("InvalidParameterValue.ParameterValueNotString"),
     
     /* 参数取值范围不合法。 */
     INVALIDPARAMETERVALUE_RANGE("InvalidParameterValue.Range"),
     
     /* 未启用自定义参数功能。 */
     INVALIDPARAMETERVALUE_SUPPORTPARAMETERSONLYIFENABLEPARAMETER("InvalidParameterValue.SupportParametersOnlyIfEnableParameter"),
     
     /* 参数取值过大。 */
     INVALIDPARAMETERVALUE_TOOLARGE("InvalidParameterValue.TooLarge"),
     
     /* 长度超过限制。 */
     INVALIDPARAMETERVALUE_TOOLONG("InvalidParameterValue.TooLong"),
     
     /* 参数取值过小。 */
     INVALIDPARAMETERVALUE_TOOSMALL("InvalidParameterValue.TooSmall"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 填写的 Filter 取值过多。 */
     LIMITEXCEEDED_FILTERVALUEEXCEEDED("LimitExceeded.FilterValueExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 命令不存在。 */
     RESOURCENOTFOUND_COMMANDNOTFOUND("ResourceNotFound.CommandNotFound"),
     
     /* CosBucket不存在。 */
     RESOURCENOTFOUND_COSBUCKETNOTFOUNDCODE("ResourceNotFound.CosBucketNotFoundCode"),
     
     /* 实例不存在。 */
     RESOURCENOTFOUND_INSTANCENOTFOUND("ResourceNotFound.InstanceNotFound"),
     
     /* 执行活动未找到。 */
     RESOURCENOTFOUND_INVOCATIONNOTFOUND("ResourceNotFound.InvocationNotFound"),
     
     /* 查询不到注册码。 */
     RESOURCENOTFOUND_REGISTERCODESNOTFOUNDCODE("ResourceNotFound.RegisterCodesNotFoundCode"),
     
     /* 查询不到注册实例。 */
     RESOURCENOTFOUND_REGISTERINSTANCENOTFOUNDCODE("ResourceNotFound.RegisterInstanceNotFoundCode"),
     
     /* 角色不存在。 */
     RESOURCENOTFOUND_ROLENOTFOUND("ResourceNotFound.RoleNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* Agent 未安装。 */
     RESOURCEUNAVAILABLE_AGENTNOTINSTALLED("ResourceUnavailable.AgentNotInstalled"),
     
     /* Agent 不在线。 */
     RESOURCEUNAVAILABLE_AGENTSTATUSNOTONLINE("ResourceUnavailable.AgentStatusNotOnline"),
     
     /* 命令正在执行中。 */
     RESOURCEUNAVAILABLE_COMMANDINEXECUTING("ResourceUnavailable.CommandInExecuting"),
     
     /* 命令已关联执行器。 */
     RESOURCEUNAVAILABLE_COMMANDININVOKER("ResourceUnavailable.CommandInInvoker"),
     
     /* 实例未处于运行中。 */
     RESOURCEUNAVAILABLE_INSTANCESTATENOTRUNNING("ResourceUnavailable.InstanceStateNotRunning"),
     
     /* 不存在的资源名称 */
     RESOURCEUNAVAILABLE_INVALIDRESOURCEQUOTARESOURCECODE("ResourceUnavailable.InvalidResourceQuotaResourceCode"),
     
     /* Lighthouse 尚不支持指定的地域。 */
     RESOURCEUNAVAILABLE_LIGHTHOUSEUNSUPPORTEDREGION("ResourceUnavailable.LighthouseUnsupportedRegion"),
     
     /* 用户配额已用完 */
     RESOURCEUNAVAILABLE_USERHASNOQUOTACODE("ResourceUnavailable.UserHasNoQuotaCode"),
     
     /* 角色扮演未授权。 */
     UNAUTHORIZEDOPERATION_ASSUMEROLEUNAUTHORIZED("UnauthorizedOperation.AssumeRoleUnauthorized"),
     
     /* CAM鉴权失败。 */
     UNAUTHORIZEDOPERATION_CAMAUTHFAILED("UnauthorizedOperation.CamAuthFailed"),
     
     /* Token 无效。 */
     UNAUTHORIZEDOPERATION_INVALIDTOKEN("UnauthorizedOperation.InvalidToken"),
     
     /* Multi-Factor Authentication(MFA) 过期。 */
     UNAUTHORIZEDOPERATION_MFAEXPIRED("UnauthorizedOperation.MFAExpired"),
     
     /* Multi-Factor Authentication(MFA) 不存在。 */
     UNAUTHORIZEDOPERATION_MFANOTFOUND("UnauthorizedOperation.MFANotFound"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TatErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

