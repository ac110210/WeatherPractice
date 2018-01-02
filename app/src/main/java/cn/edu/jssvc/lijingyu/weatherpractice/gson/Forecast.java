package cn.edu.jssvc.lijingyu.weatherpractice.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by C515 on 2018/1/2.
 */

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
