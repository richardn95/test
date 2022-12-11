package com.example.camera;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("index.php")
    Call<ResponseBody> addImage(
            @Field("image") String image
    );

}
