package com.example.manya.locationapp;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    private PlacesListAdapter Adapter;
    private RecyclerView RecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView = (RecyclerView) findViewById(R.id.places_list);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter = new PlacesListAdapter(this);
        RecyclerView.setAdapter(Adapter);
    }
}
