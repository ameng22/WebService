package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.webapp.pojos.Places;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        listView = (ListView) findViewById(R.id.list_view);
    }

    public void getPlaces(View view){

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://mapps.googleapis.com/").
                addConverterFactory(GsonConverterFactory.create()).build();

        PlacesApi placesApi = retrofit.create(PlacesApi.class);

        Call<Places> call = placesApi.getPlaces();
        call.enqueue(new Callback<Places>() {
            @Override
            public void onResponse(Call<Places> call, Response<Places> response) {

                Places places = response.body();
                listView.setAdapter(new MyAdapter(MainActivity.this,places));
            }

            @Override
            public void onFailure(Call<Places> call, Throwable t) {

            }
        });

    }
}