package com.tenngo.weather2.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tenngo on 2017/5/8.
 */

public class Weather {
    public String status;  //返回的status，成功返回ok；失败的话返回具体的原因。

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList; //daily_forecast包含的是一个数组，所以用List集合来饮用Forecast类。
}
