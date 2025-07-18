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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TakeMusicOffShelvesRequest extends AbstractModel {

    /**
    * 资源方下架必传结构
    */
    @SerializedName("TakeMusicOffShelves")
    @Expose
    private TakeMusicOffShelves [] TakeMusicOffShelves;

    /**
     * Get 资源方下架必传结构 
     * @return TakeMusicOffShelves 资源方下架必传结构
     */
    public TakeMusicOffShelves [] getTakeMusicOffShelves() {
        return this.TakeMusicOffShelves;
    }

    /**
     * Set 资源方下架必传结构
     * @param TakeMusicOffShelves 资源方下架必传结构
     */
    public void setTakeMusicOffShelves(TakeMusicOffShelves [] TakeMusicOffShelves) {
        this.TakeMusicOffShelves = TakeMusicOffShelves;
    }

    public TakeMusicOffShelvesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TakeMusicOffShelvesRequest(TakeMusicOffShelvesRequest source) {
        if (source.TakeMusicOffShelves != null) {
            this.TakeMusicOffShelves = new TakeMusicOffShelves[source.TakeMusicOffShelves.length];
            for (int i = 0; i < source.TakeMusicOffShelves.length; i++) {
                this.TakeMusicOffShelves[i] = new TakeMusicOffShelves(source.TakeMusicOffShelves[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TakeMusicOffShelves.", this.TakeMusicOffShelves);

    }
}

