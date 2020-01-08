package com.bibek.googlemapsactivity;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.bibek.googlemapsactivity.model.Latitudeandlongitude;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        List<Latitudeandlongitude> latLang = new ArrayList<>();
        latLang.add(new Latitudeandlongitude(lat:27.7052354, lon:85.329418,marker:"sofrwarica college"));LatLng.add(new Latitudeandlongitude( lat:28.7052355, lon:85.3294158, marker: "ajima khaja ghar"));
        LatLng.add(new Latitudeandlongitude( lat:28.7052357, lon:85.3294198, marker: "Basantapur"));
        LatLng.add(new Latitudeandlongitude( lat:28.70523, lon:85.3294100 marker: "chitwan));
        LatLng.add(new Latitudeandlongitude( lat:28.70524 lon:85.3294106marker: "butwal));

}
