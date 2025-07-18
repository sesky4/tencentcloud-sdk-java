package com.tencentcloudapi.dbbrain.v20210527;
public enum DbbrainErrorCode {
     /* CAM签名/鉴权错误。 */
     AUTHFAILURE("AuthFailure"),
     
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 实例审计未开启 */
     FAILEDOPERATION_AUDITNOTOPENED("FailedOperation.AuditNotOpened"),
     
     /* paas 侧商业审计状态未开启 */
     FAILEDOPERATION_PAASAUDITNOTOPENED("FailedOperation.PaasAuditNotOpened"),
     
     /* 数据加载中 */
     FAILEDOPERATION_SEGMENTLOADING("FailedOperation.SegmentLoading"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 数据库操作失败 */
     INTERNALERROR_DBOPERATIONFAILED("InternalError.DbOperationFailed"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
     /* CAM鉴权错误。 */
     OPERATIONDENIED_USERHASNOSTRATEGY("OperationDenied.UserHasNoStrategy"),
     
     /* 请求的次数超过了频率限制。 */
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
     /* 资源被占用。 */
     RESOURCEINUSE("ResourceInUse"),
     
     /* 资源不足。 */
     RESOURCEINSUFFICIENT("ResourceInsufficient"),
     
     /* 资源不存在。 */
     RESOURCENOTFOUND("ResourceNotFound"),
     
     /* 资源不可用。 */
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
     /* 资源售罄。 */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation"),
     
     /* 该时间范围内的审计日志已下载 */
     UNSUPPORTEDOPERATION_HASDUPLICATEDTASK("UnsupportedOperation.HasDuplicatedTask");
     
    private String value;
    private DbbrainErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

