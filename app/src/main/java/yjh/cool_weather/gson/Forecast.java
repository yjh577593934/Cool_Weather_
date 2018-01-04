package yjh.cool_weather.gson;

/**
 * Created by Administrator on 2018/1/3.
 */

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
