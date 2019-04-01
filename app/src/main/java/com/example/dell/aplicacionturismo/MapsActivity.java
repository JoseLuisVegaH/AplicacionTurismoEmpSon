package com.example.dell.aplicacionturismo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener
{

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

    private Marker tinacoMap;

    @Override
    public boolean onMarkerClick(final Marker marker) {

        if (marker.equals(tinacoMap))
        {
            Intent tinaco=new Intent(MapsActivity.this,Tinaco.class);
            startActivity(tinaco);
        }
        return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMinZoomPreference(12.0f);

        LatLng tinaco = new LatLng(27.959164383884897, -110.81891324433282);
        googleMap.setOnMarkerClickListener(this);
        tinacoMap = mMap.addMarker(new MarkerOptions().position(tinaco).title("Plaza de la Independencia (El Tinaco)").icon(BitmapDescriptorFactory.fromResource(R.drawable.construccion)));
       mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tinaco,12));


        LatLng locomotora = new LatLng(27.955037278956965, -110.82666826402026);
        mMap.addMarker(new MarkerOptions().position(tinaco).title("Monumento Centenario (La Locomotora de Vapor)").icon(BitmapDescriptorFactory.fromResource(R.drawable.construccion)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(locomotora,12));

        LatLng mufer = new LatLng(27.95930327323009, -110.81589265280273);
        mMap.addMarker(new MarkerOptions().position(mufer).title("Museo Ferrocarrilero (MUFER)").icon(BitmapDescriptorFactory.fromResource(R.drawable.museo)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mufer,12));


        LatLng cochorit = new LatLng(27.91714681534708, -110.77376795795841);
        mMap.addMarker(new MarkerOptions().position(cochorit).title("Playa del Cochorit").icon(BitmapDescriptorFactory.fromResource(R.drawable.naturaleza)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cochorit,12));

    }

}
