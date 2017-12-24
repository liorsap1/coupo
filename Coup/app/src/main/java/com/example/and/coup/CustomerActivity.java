package com.example.and.coup;

import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.location.Geofence;

import static android.provider.MediaStore.Images.ImageColumns.LONGITUDE;
import static android.provider.MediaStore.Video.VideoColumns.LATITUDE;

public class CustomerActivity extends AppCompatActivity {

    private int permissionCheck;
    LocationManager locationManager;
    LocationListener locationListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        // check location Premmision
        permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION);
        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, Constants.REQUEST_LOCATION);

        // set location manager
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };

        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                                                Constants.MIN_TIME_FOR_UPDATE,
                                                Constants.MIN_DIS_FOR_UPFATE,
                                                locationListener);

        Geofence geofence = new Geofence.Builder()
                .setRequestId("1") // Geofence ID
                .setCircularRegion( 31.801202, 35.156869, (float)5.0) // defining fence region
                .setExpirationDuration( 43094 ) // expiring date
                // Transition types that it should look for
                .setTransitionTypes( Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT )
                .build();

        //TO BE CONTINUED..............................

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch(requestCode){
            case Constants.REQUEST_LOCATION:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(CustomerActivity.this, "permission granted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CustomerActivity.this, "permission denied", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


}
