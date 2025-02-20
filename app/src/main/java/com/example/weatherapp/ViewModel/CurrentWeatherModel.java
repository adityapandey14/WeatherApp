package com.example.weatherapp.ViewModel;

public class CurrentWeatherModel {
    private long last_updated_epoch;
    private String last_updated;
    private double temp_c;
    private double temp_f;
    private int is_day;
    private WeatherConditionModel condition;
    private double wind_mph;
    private double wind_kph;
    private int wind_degree;
    private String wind_dir;
    private double pressure_mb;
    private double pressure_in;
    private double precip_mm;
    private double precip_in;
    private int humidity;
    private int cloud;
    private double feelslike_c;
    private double feelslike_f;
    private double windchill_c;
    private double windchill_f;
    private double heatindex_c;
    private double heatindex_f;
    private double dewpoint_c;
    private double dewpoint_f;
    private double vis_km;
    private double vis_miles;
    private double uv;
    private double gust_mph;
    private double gust_kph;
    private AirQualityModel airQuality;

    // Getters and Setters
    public long getLastUpdatedEpoch() {
        return last_updated_epoch;
    }

    public void setLastUpdatedEpoch(long lastUpdatedEpoch) {
        this.last_updated_epoch = lastUpdatedEpoch;
    }

    public String getLastUpdated() {
        return last_updated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.last_updated = lastUpdated;
    }

    public double getTempC() {
        return temp_c;
    }

    public void setTempC(double tempC) {
        this.temp_c = tempC;
    }

    public double getTempF() {
        return temp_f;
    }

    public void setTempF(double tempF) {
        this.temp_f = tempF;
    }

    public int getIsDay() {
        return is_day;
    }

    public void setIsDay(int isDay) {
        this.is_day = isDay;
    }

    public WeatherConditionModel getCondition() {
        return condition;
    }

    public void setCondition(WeatherConditionModel condition) {
        this.condition = condition;
    }

    public double getWindMph() {
        return wind_mph;
    }

    public void setWindMph(double windMph) {
        this.wind_mph = windMph;
    }

    public double getWindKph() {
        return wind_kph;
    }

    public void setWindKph(double windKph) {
        this.wind_kph = windKph;
    }

    public int getWindDegree() {
        return wind_degree;
    }

    public void setWindDegree(int windDegree) {
        this.wind_degree = windDegree;
    }

    public String getWindDir() {
        return wind_dir;
    }

    public void setWindDir(String windDir) {
        this.wind_dir = windDir;
    }

    public double getPressureMb() {
        return pressure_mb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressure_mb = pressureMb;
    }

    public double getPressureIn() {
        return pressure_in;
    }

    public void setPressureIn(double pressureIn) {
        this.pressure_in = pressureIn;
    }

    public double getPrecipMm() {
        return precip_mm;
    }

    public void setPrecipMm(double precipMm) {
        this.precip_mm = precipMm;
    }

    public double getPrecipIn() {
        return precip_in;
    }

    public void setPrecipIn(double precipIn) {
        this.precip_in = precipIn;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public double getFeelslikeC() {
        return feelslike_c;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslike_c = feelslikeC;
    }

    public double getFeelslikeF() {
        return feelslike_f;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslike_f = feelslikeF;
    }

    public double getWindchillC() {
        return windchill_c;
    }

    public void setWindchillC(double windchillC) {
        this.windchill_c = windchillC;
    }

    public double getWindchillF() {
        return windchill_f;
    }

    public void setWindchillF(double windchillF) {
        this.windchill_f = windchillF;
    }

    public double getHeatindexC() {
        return heatindex_c;
    }

    public void setHeatindexC(double heatindexC) {
        this.heatindex_c = heatindexC;
    }

    public double getHeatindexF() {
        return heatindex_f;
    }

    public void setHeatindexF(double heatindexF) {
        this.heatindex_f = heatindexF;
    }

    public double getDewpointC() {
        return dewpoint_c;
    }

    public void setDewpointC(double dewpointC) {
        this.dewpoint_c = dewpointC;
    }

    public double getDewpointF() {
        return dewpoint_f;
    }

    public void setDewpointF(double dewpointF) {
        this.dewpoint_f = dewpointF;
    }

    public double getVisKm() {
        return vis_km;
    }

    public void setVisKm(double visKm) {
        this.vis_km = visKm;
    }

    public double getVisMiles() {
        return vis_miles;
    }

    public void setVisMiles(double visMiles) {
        this.vis_miles = visMiles;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getGustMph() {
        return gust_mph;
    }

    public void setGustMph(double gustMph) {
        this.gust_mph = gustMph;
    }

    public double getGustKph() {
        return gust_kph;
    }

    public void setGustKph(double gustKph) {
        this.gust_kph = gustKph;
    }

    public AirQualityModel getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(AirQualityModel airQuality) {
        this.airQuality = airQuality;
    }
}
