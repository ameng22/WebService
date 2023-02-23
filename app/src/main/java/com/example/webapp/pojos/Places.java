package com.example.webapp.pojos;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Places {

    @SerializedName("results")
    private ArrayList<Place> placeArrayList;

    public ArrayList<Place> getPlaceArrayList() {
        return placeArrayList;
    }

    public void setPlaceArrayList(ArrayList<Place> placeArrayList) {
        this.placeArrayList = placeArrayList;
    }
}
