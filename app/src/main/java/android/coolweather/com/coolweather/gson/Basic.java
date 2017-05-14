package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mr.ye on 2017/5/7.
 * @SerializedName注解方式用来让JSON字段和JAVA字段之间建立映射关系
 */

public class Basic {

    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public  String weatherId;

    public  Update update;

    public class Update{

        @SerializedName("loc")
        public  String updateTime;

    }
}
