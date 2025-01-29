package com.example.weatherapp.retrofit;

import com.example.weatherapp.ViewModel.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApiService {
    @GET("current.json") // Base endpoint
    Call<WeatherModel> getWeatherData(
            @Query("key") String apiKey,
            @Query("q") String location,
            @Query("aqi") String aqi
    );
}
