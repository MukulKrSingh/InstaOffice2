package com.example.android.instaoffice;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.lang.Double;

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
        LatLng iris = new LatLng(28.4185478,77.0380067);
        LatLng goodEarth = new LatLng(28.4213601,77.0532532);
        LatLng nirvana = new LatLng(28.4167438,77.0640684);
        LatLng hudaCityCentre = new LatLng(28.4593364,77.0725872);
        LatLng sector32 = new LatLng(28.4472372,77.0406147);
        LatLng SPML = new LatLng(28.4472372,77.0406147);
        LatLng indiraNagar = new LatLng(12.9506205,77.6392171);
        LatLng doubleRoad = new LatLng(12.9615679,77.6354962);
        LatLng HSR = new LatLng(12.9081357,77.647608);
        LatLng Okhla = new LatLng(28.5357628,77.2764329);
        LatLng giftCity = new LatLng(23.1586396,72.6831136);

        final Marker irisMarker =  mMap.addMarker(new MarkerOptions().position(iris).title("Iris"));
        final Marker earthMarker = mMap.addMarker(new MarkerOptions().position(goodEarth).title("Good Earth"));
        final Marker nirvanaMarker = mMap.addMarker(new MarkerOptions().position(nirvana).title("Nirvana"));
        final Marker hudaMarker = mMap.addMarker(new MarkerOptions().position(hudaCityCentre).title("Huda City Centre"));
        final Marker Marker32 = mMap.addMarker(new MarkerOptions().position(sector32).title("Sector 32"));
        final Marker spmlMarker = mMap.addMarker(new MarkerOptions().position(SPML).title("SPML"));
        final Marker indiraMarker = mMap.addMarker(new MarkerOptions().position(indiraNagar).title("Indira Nagar"));
        final Marker doubleMarker = mMap.addMarker(new MarkerOptions().position(doubleRoad).title("Double Road"));
        final Marker hsrMarker = mMap.addMarker(new MarkerOptions().position(HSR).title("HSR"));
        final Marker okhlaMarker = mMap.addMarker(new MarkerOptions().position(Okhla).title("Okhla"));
        final Marker giftMarker = mMap.addMarker(new MarkerOptions().position(giftCity).title("Gift City"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(iris));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(goodEarth));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nirvana));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hudaCityCentre));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sector32));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPML));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(indiraNagar));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(doubleRoad));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HSR));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Okhla));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(giftCity));




        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if (marker.equals(irisMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Iris.class));

                }

                else  if (marker.equals(earthMarker))
                {
                    startActivity(new Intent(MapsActivity.this,GoodEarth.class));
                }

                else if (marker.equals(nirvanaMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Nirvana.class));
                }
                else if (marker.equals(hudaMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Huda.class));
                }
                else if (marker.equals(Marker32))
                {
                    startActivity(new Intent(MapsActivity.this,Sector.class));
                }
                else if (marker.equals(spmlMarker))
                {
                    startActivity(new Intent(MapsActivity.this,SPML.class));
                }
                else if (marker.equals(indiraMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Indira.class));
                }
                else if (marker.equals(doubleMarker))
                {
                    startActivity(new Intent(MapsActivity.this, com.example.android.instaoffice.Double.class));
                }
                else if (marker.equals(hsrMarker))
                {
                    startActivity(new Intent(MapsActivity.this,HSR.class));
                }
                else if (marker.equals(okhlaMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Okhla.class));
                }
                else if (marker.equals(giftMarker))
                {
                    startActivity(new Intent(MapsActivity.this,Gift.class));
                }


                return false;
            }
        });
    }

}
