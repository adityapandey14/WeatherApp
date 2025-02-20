package com.example.weatherapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weatherapp.ViewModel.WeatherModel;

public class AllDetails extends Fragment {

    private WeatherModel weatherData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            weatherData = (WeatherModel) getArguments().getSerializable("weather_data");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        if (weatherData != null) {

            Log.d("AllDetails", "Weather Condition: " + weatherData.getCurrent().getCondition().getText());
        } else {

            Log.d("AllDetails", "No weather data available.");
        }

        return inflater.inflate(R.layout.fragment_all_details, container, false);
    }
}