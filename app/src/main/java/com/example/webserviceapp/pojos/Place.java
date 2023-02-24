package com.example.webserviceapp.pojos;

public class Place {

    private String vicinity;
    private String name;
    private GeoMetry geoMetry;

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GeoMetry getGeoMetry() {
        return geoMetry;
    }

    public void setGeoMetry(GeoMetry geoMetry) {
        this.geoMetry = geoMetry;
    }

}
