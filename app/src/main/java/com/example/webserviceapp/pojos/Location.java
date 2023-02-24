package com.example.webserviceapp.pojos;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitute;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitute() {
        return longitute;
    }

    public void setLongitute(double longitute) {
        this.longitute = longitute;
    }
}
