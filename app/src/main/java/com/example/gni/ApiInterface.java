package com.example.gni;

import com.example.gni.model.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            @Query("country") String country,
            @Query("apikey") String apikey
    );
    @GET("everyhing")
    Call<Headlines> getSpecificData(
            @Query("q") String query,
            @Query("apikey") String apikey
    );
}
