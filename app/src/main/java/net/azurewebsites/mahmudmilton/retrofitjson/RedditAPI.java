package net.azurewebsites.mahmudmilton.retrofitjson;

import net.azurewebsites.mahmudmilton.retrofitjson.model.Feed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by milton on 6/15/17.
 */

public interface RedditAPI {

    String BASE_URL = "https://www.reddit.com/";

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<Feed> getData();
}
