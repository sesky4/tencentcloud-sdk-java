package com.tencentcloudapi.ims.v20201229;
public enum ImsErrorCode {
     /* DryRun 操作，代表请求将会是成功的，只是多传了 DryRun 参数。 */
     DRYRUNOPERATION("DryRunOperation"),
     
     /* 操作失败。 */
     FAILEDOPERATION("FailedOperation"),
     
     /* 内部错误。 */
     INTERNALERROR("InternalError"),
     
     /* 内部错误。 */
     INTERNALERROR_INTERNALERROR("InternalError.InternalError"),
     
     /* 参数错误。 */
     INVALIDPARAMETER("InvalidParameter"),
     
     /* 图片长宽比太大 */
     INVALIDPARAMETER_IMAGEASPECTRATIOTOOLARGE("InvalidParameter.ImageAspectRatioTooLarge"),
     
     /* 图片体积太小 */
     INVALIDPARAMETER_IMAGEDATATOOSMALL("InvalidParameter.ImageDataTooSmall"),
     
     /* 图片分辨率过低。 */
     INVALIDPARAMETER_IMAGESIZETOOSMALL("InvalidParameter.ImageSizeTooSmall"),
     
     /* 图片内容错误。 */
     INVALIDPARAMETER_INVALIDIMAGECONTENT("InvalidParameter.InvalidImageContent"),
     
     /* 参数不合法。 */
     INVALIDPARAMETER_INVALIDPARAMETER("InvalidParameter.InvalidParameter"),
     
     /* 参数取值错误。 */
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
     /* 图片内容参数为空。 */
     INVALIDPARAMETERVALUE_EMPTYIMAGECONTENT("InvalidParameterValue.EmptyImageContent"),
     
     /* 图片分辨率太低。 */
     INVALIDPARAMETERVALUE_IMAGESIZETOOSMALL("InvalidParameterValue.ImageSizeTooSmall"),
     
     /* 回调地址错误。 */
     INVALIDPARAMETERVALUE_INVALIDCALLBACKURL("InvalidParameterValue.InvalidCallbackUrl"),
     
     /* FileContent和FileUrl为空或base64编码错误。 */
     INVALIDPARAMETERVALUE_INVALIDCONTENT("InvalidParameterValue.InvalidContent"),
     
     /* DataId格式错误。 */
     INVALIDPARAMETERVALUE_INVALIDDATAID("InvalidParameterValue.InvalidDataId"),
     
     /* 图片文件内容大小异常。 */
     INVALIDPARAMETERVALUE_INVALIDFILECONTENTSIZE("InvalidParameterValue.InvalidFileContentSize"),
     
     /* 图片内容错误。 */
     INVALIDPARAMETERVALUE_INVALIDIMAGECONTENT("InvalidParameterValue.InvalidImageContent"),
     
     /* 参数值错误。 */
     INVALIDPARAMETERVALUE_INVALIDPARAMETER("InvalidParameterValue.InvalidParameter"),
     
     /* 超过配额限制。 */
     LIMITEXCEEDED("LimitExceeded"),
     
     /* 缺少参数错误。 */
     MISSINGPARAMETER("MissingParameter"),
     
     /* 操作被拒绝。 */
     OPERATIONDENIED("OperationDenied"),
     
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
     
     /* 图片文件下载失败。 */
     RESOURCEUNAVAILABLE_IMAGEDOWNLOADERROR("ResourceUnavailable.ImageDownloadError"),
     
     /* 入队列失败 */
     RESOURCEUNAVAILABLE_INQUEUEERROR("ResourceUnavailable.InQueueError"),
     
     /* 图片资源错误。 */
     RESOURCEUNAVAILABLE_INVALIDIMAGECONTENT("ResourceUnavailable.InvalidImageContent"),
     
     /* 模型调用失败，请重试。 */
     RESOURCEUNAVAILABLE_MODELCALLFAILED("ResourceUnavailable.ModelCallFailed"),
     
     /* 资源售罄。 */
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
     /* 未授权操作。 */
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
     /* 未开通权限/无有效套餐包/账号已欠费。 */
     UNAUTHORIZEDOPERATION_UNAUTHORIZED("UnauthorizedOperation.Unauthorized"),
     
     /* 未知参数错误。 */
     UNKNOWNPARAMETER("UnknownParameter"),
     
     /* 操作不支持。 */
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private ImsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

