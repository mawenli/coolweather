package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Mr.ye on 2017/5/7.
 *
 * 实体类的总体
 */

public class Weather {

    public String status;//用来返回天气数据是否成功获取

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;


    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;//daily_forecast包含数组

}
