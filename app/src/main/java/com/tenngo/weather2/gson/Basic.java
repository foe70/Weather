package com.tenngo.weather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tenngo on 2017/5/8.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
