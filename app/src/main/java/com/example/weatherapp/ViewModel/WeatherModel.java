package com.example.weatherapp.ViewModel;

public class WeatherModel {

    private LocationViewModel location;
    private CurrentWeatherModel current;

    // Getters and Setters
    public LocationViewModel getLocation() {
        return location;
    }

    public void setLocation(LocationViewModel location) {
        this.location = location;
    }

    public CurrentWeatherModel getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeatherModel current) {
        this.current = current;
    }
}
