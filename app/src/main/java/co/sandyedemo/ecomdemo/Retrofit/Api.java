package co.sandyedemo.ecomdemo.Retrofit;

import retrofit.RestAdapter;

/**
 * Created by AbhiAndroid
 */
public class Api {

    public static ApiInterface getClient() {

        // change your base URL
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://sandyedemo.co") //Set the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        return adapter.create(ApiInterface.class);
    }
}
