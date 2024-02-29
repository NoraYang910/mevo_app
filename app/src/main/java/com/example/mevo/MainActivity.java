package com.example.mevo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.maps.MapView;

public class MainActivity extends AppCompatActivity {


    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set your Mapbox access token
        Mapbox.getInstance(this, "sk.eyJ1Ijoibm9yYTkxMCIsImEiOiJjbHQ3cm12M2swbzdxMmptZ3g5M28zN3k4In0.EnlUeQZMK3roBy2QPVpBIA");

        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(mapboxMap -> {
            mapboxMap.setStyle(Style.MAPBOX_STREETS, style -> {
                // Map is set up and the style has loaded
            });
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }
}