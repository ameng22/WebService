package com.example.webapp;

import com.example.webapp.pojos.Places;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlacesApi {

    @GET("maps/api/place/nearbysearch/json?location=-33.8670,151.1957&raadius=500&types=atm&key=AIzaSyDiE-nYx7vmVJ7Ys5nATW7D2eGxTvIxvoc")
    Call<Places> getPlaces();

}
