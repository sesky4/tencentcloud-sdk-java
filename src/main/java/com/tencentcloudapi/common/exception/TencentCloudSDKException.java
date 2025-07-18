/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common.exception;

public class TencentCloudSDKException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * UUID of the request, it will be empty if request is not fulfilled.
     */
    private String requestId;

    /**
     * Error code, When API returns a failure, it must have an error code.
     */
    private String errorCode;

    public TencentCloudSDKException(String message, Throwable cause) {
        super(message, cause);
    }

    public TencentCloudSDKException(String message) {
        this(message, "");
    }

    public TencentCloudSDKException(String message, String requestId) {
        this(message, requestId, "");
    }

    public TencentCloudSDKException(String message, String requestId, String errorCode) {
        super(message);
        this.requestId = requestId;
        this.errorCode = errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    /**
     * Get error code
     *
     * @return A string represents error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    public String toString() {
        String msg = "[TencentCloudSDKException]"
                + "code: "
                + this.getErrorCode()
                + " message:"
                + this.getMessage()
                + " requestId:"
                + this.getRequestId();
        if (getCause() != null) {
            msg += " cause:" + getCause().toString();
        }
        return msg;
    }
}
