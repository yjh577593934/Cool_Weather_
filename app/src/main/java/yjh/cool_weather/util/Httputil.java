package yjh.cool_weather.util;

/**
 * Created by Administrator on 2018/1/2.
 */



import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Httputil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

    /*public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCountys = new JSONArray(response);
                for (int i = 0; i < allCountys.length(); i++) {
                    JSONObject cityobject = allCountys.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(cityobject.getString(name:"name"));
                    county.setWeatherId(cityobject.getInt(name:"weather_id"));
                    county.getCityId(cityId);
                    county.save();


                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }*/
}






