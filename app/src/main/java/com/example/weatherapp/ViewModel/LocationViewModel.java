package com.example.weatherapp.ViewModel;

public class LocationViewModel {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tzId;
    private long localtimeEpoch;
    private String localtime;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void setLat(double lat){
        this.lat = lat;
    }
    public void setLon(double lon){
        this.lon = lon;
    }
    public void setTzId(String tzId){
        this.tzId = tzId;
    }
    public void setLocaltimeEpoch(long localtimeEpoch){
        this.localtimeEpoch = localtimeEpoch;
    }
    public void setLocaltime(String localtime){
        this.localtime = localtime;
    }



}
