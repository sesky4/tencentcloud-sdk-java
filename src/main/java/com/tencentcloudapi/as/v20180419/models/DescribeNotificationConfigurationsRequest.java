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

public class DescribeNotificationConfigurationsRequest extends AbstractModel {

    /**
    * 按照一个或者多个通知ID查询，列表长度上限为100。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取通知ID。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
    */
    @SerializedName("AutoScalingNotificationIds")
    @Expose
    private String [] AutoScalingNotificationIds;

    /**
    * 过滤条件。
<li> auto-scaling-notification-id - String - 是否必填：否 -（过滤条件）按照通知ID过滤。</li>
<li> auto-scaling-group-id - String - 是否必填：否 -（过滤条件）按照伸缩组ID过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 按照一个或者多个通知ID查询，列表长度上限为100。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取通知ID。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。 
     * @return AutoScalingNotificationIds 按照一个或者多个通知ID查询，列表长度上限为100。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取通知ID。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     */
    public String [] getAutoScalingNotificationIds() {
        return this.AutoScalingNotificationIds;
    }

    /**
     * Set 按照一个或者多个通知ID查询，列表长度上限为100。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取通知ID。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     * @param AutoScalingNotificationIds 按照一个或者多个通知ID查询，列表长度上限为100。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 获取通知ID。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     */
    public void setAutoScalingNotificationIds(String [] AutoScalingNotificationIds) {
        this.AutoScalingNotificationIds = AutoScalingNotificationIds;
    }

    /**
     * Get 过滤条件。
<li> auto-scaling-notification-id - String - 是否必填：否 -（过滤条件）按照通知ID过滤。</li>
<li> auto-scaling-group-id - String - 是否必填：否 -（过滤条件）按照伸缩组ID过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。 
     * @return Filters 过滤条件。
<li> auto-scaling-notification-id - String - 是否必填：否 -（过滤条件）按照通知ID过滤。</li>
<li> auto-scaling-group-id - String - 是否必填：否 -（过滤条件）按照伸缩组ID过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li> auto-scaling-notification-id - String - 是否必填：否 -（过滤条件）按照通知ID过滤。</li>
<li> auto-scaling-group-id - String - 是否必填：否 -（过滤条件）按照伸缩组ID过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     * @param Filters 过滤条件。
<li> auto-scaling-notification-id - String - 是否必填：否 -（过滤条件）按照通知ID过滤。</li>
<li> auto-scaling-group-id - String - 是否必填：否 -（过滤条件）按照伸缩组ID过滤。可通过登录 [控制台](https://console.cloud.tencent.com/autoscaling/group) 或调用接口 [DescribeAutoScalingGroups](https://cloud.tencent.com/document/api/377/20438) ，取返回信息中的 AutoScalingGroupId 获取伸缩组ID。</li>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为5。参数不支持同时指定`AutoScalingNotificationIds`和`Filters`。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNotificationConfigurationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNotificationConfigurationsRequest(DescribeNotificationConfigurationsRequest source) {
        if (source.AutoScalingNotificationIds != null) {
            this.AutoScalingNotificationIds = new String[source.AutoScalingNotificationIds.length];
            for (int i = 0; i < source.AutoScalingNotificationIds.length; i++) {
                this.AutoScalingNotificationIds[i] = new String(source.AutoScalingNotificationIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingNotificationIds.", this.AutoScalingNotificationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

