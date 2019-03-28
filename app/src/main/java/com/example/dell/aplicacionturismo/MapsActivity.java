package com.example.dell.aplicacionturismo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng tinaco = new LatLng(27.959164383884897, -110.81891324433282);
        mMap.addMarker(new MarkerOptions().position(tinaco).title("Plaza de la Independencia (El Tinaco)").snippet("Ver mas.").icon(BitmapDescriptorFactory.fromResource(R.drawable.construccion)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tinaco,12));

        LatLng mufer = new LatLng(27.95930327323009, -110.81589265280273);
        mMap.addMarker(new MarkerOptions().position(mufer).title("Museo Ferrocarrilero").snippet("Ver mas.").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mufer,12));


        LatLng cochorit = new LatLng(27.91714681534708, -110.77376795795841);
        mMap.addMarker(new MarkerOptions().position(cochorit).title("Playa del Cochorit").snippet("Ver mas.").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cochorit,12));

    }
}
