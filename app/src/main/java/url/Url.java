package url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {

    //public static String base_url = "http://192.168.1.11:3000"; Laptop ko Ip halne if real mobile bata chalaune
    //public static String base_url = "http://10.0.2.2:3000"; Ghar bata chalauda halne
    public static String base_url = "http://172.100.100.5:3000";

    public static String token ="";

    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }


}
