package com.example.webapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.webapp.pojos.Places;

public class MyAdapter extends BaseAdapter {

    Context context;
    Places places;


    public MyAdapter(Context context, Places places) {
        this.context = context;
        this.places=places;
    }

    @Override
    public int getCount() {
        return places.getPlaceArrayList().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.individual_view,null);

        TextView tv1 = view.findViewById(R.id.tv1);
        TextView tv2 = view.findViewById(R.id.tv2);

        tv1.setText(places.getPlaceArrayList().get(position).getName());
        tv2.setText(places.getPlaceArrayList().get(position).getVicinity());

        return view;

    }
}
