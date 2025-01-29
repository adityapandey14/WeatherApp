package com.example.weatherapp.ViewModel;

public class AirQualityModel {
    private double co;
    private double no2;
    private double o3;
    private double so2;
    private double pm2_5;
    private double pm10;
    private int usEpaIndex;
    private int gbDefraIndex;

    // Getters and Setters
    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public int getUsEpaIndex() {
        return usEpaIndex;
    }

    public void setUsEpaIndex(int usEpaIndex) {
        this.usEpaIndex = usEpaIndex;
    }

    public int getGbDefraIndex() {
        return gbDefraIndex;
    }

    public void setGbDefraIndex(int gbDefraIndex) {
        this.gbDefraIndex = gbDefraIndex;
    }
}
