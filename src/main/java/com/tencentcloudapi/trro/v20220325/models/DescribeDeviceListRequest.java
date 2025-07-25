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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceListRequest extends AbstractModel {

    /**
    * 设备所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 设备类型筛选，不填默认为全部设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配
    */
    @SerializedName("SearchWords")
    @Expose
    private String SearchWords;

    /**
    * 每页返回的最大设备数，不填默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页码，不填默认为1（首页）
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 设备状态筛选，不填默认为不过滤。取值：["ready","connected","online"]，online代表ready或connected
    */
    @SerializedName("DeviceStatus")
    @Expose
    private String DeviceStatus;

    /**
     * Get 设备所属项目ID 
     * @return ProjectId 设备所属项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 设备所属项目ID
     * @param ProjectId 设备所属项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 设备类型筛选，不填默认为全部设备类型 
     * @return DeviceType 设备类型筛选，不填默认为全部设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型筛选，不填默认为全部设备类型
     * @param DeviceType 设备类型筛选，不填默认为全部设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配 
     * @return SearchWords 对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配
     */
    public String getSearchWords() {
        return this.SearchWords;
    }

    /**
     * Set 对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配
     * @param SearchWords 对设备ID或Name按关键字进行模糊匹配，不填则不进行模糊匹配
     */
    public void setSearchWords(String SearchWords) {
        this.SearchWords = SearchWords;
    }

    /**
     * Get 每页返回的最大设备数，不填默认为10 
     * @return PageSize 每页返回的最大设备数，不填默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页返回的最大设备数，不填默认为10
     * @param PageSize 每页返回的最大设备数，不填默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页码，不填默认为1（首页） 
     * @return PageNumber 当前页码，不填默认为1（首页）
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页码，不填默认为1（首页）
     * @param PageNumber 当前页码，不填默认为1（首页）
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 设备状态筛选，不填默认为不过滤。取值：["ready","connected","online"]，online代表ready或connected 
     * @return DeviceStatus 设备状态筛选，不填默认为不过滤。取值：["ready","connected","online"]，online代表ready或connected
     */
    public String getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * Set 设备状态筛选，不填默认为不过滤。取值：["ready","connected","online"]，online代表ready或connected
     * @param DeviceStatus 设备状态筛选，不填默认为不过滤。取值：["ready","connected","online"]，online代表ready或connected
     */
    public void setDeviceStatus(String DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    public DescribeDeviceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceListRequest(DescribeDeviceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.SearchWords != null) {
            this.SearchWords = new String(source.SearchWords);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.DeviceStatus != null) {
            this.DeviceStatus = new String(source.DeviceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "SearchWords", this.SearchWords);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);

    }
}

