package com.forbitbd.androidutils.api;




import com.forbitbd.androidutils.models.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ApiClient {

    @GET
    Call<ResponseBody> getImage(@Url String url);
    //Suppliers

    @GET("/civil/api/users/query/{query}")
    Call<List<User>> getQueryUsers(@Path("query") String query);
}
