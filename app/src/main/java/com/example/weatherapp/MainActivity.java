package com.example.weatherapp;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.weatherapp.ViewModel.WeatherModel;
import com.example.weatherapp.databinding.ActivityMainBinding;
import com.example.weatherapp.retrofit.WeatherApiService;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements LocationListener {

    private static final String TAG = "MainActivity";
    ActivityMainBinding binding;
    private WeatherModel weather;
  //  String api = "b3ff466cf80445e1a3661728252801";
    String url = "http://api.weatherapi.com/v1/";

    Button btn;
    Bundle bundle = new Bundle();
    private BottomSheetBehavior<CoordinatorLayout> bottomSheetBehavior;
    FusedLocationProviderClient mFusedLocationClient;
    LocationManager locationManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        doApiCall();
        navigationCall();
        checkManifestPermission();

        FrameLayout bottomSheet = findViewById(R.id.sheet);
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setPeekHeight(400);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        bottomSheetBehavior.setDraggable(true);

    }

    private void navigationCall(){
        binding.bottonNavigationBar.setOnItemSelectedListener(item -> {

            switch (item.toString()){

                case "AddLocation" :
                    Log.d("TabSwitched", "1");
                    replaceFragment(new AddLocation());
                    break;

                case "menu" :
                    Log.d("TabSwitched", "1");
                    replaceFragment(new AllDetails());
                    break;
                default:
                    Log.d("TabSwitched", item.toString());
                    break;
            }

            return true;
        });
    }

    private void uiDesignChanges() {
        binding.city.setText(weather.getLocation().getName());
         double temp = weather.getCurrent().getTempC();
        binding.temperature.setText(String.valueOf(weather.getCurrent().getTempC()));
        binding.surroundingView.setText(weather.getCurrent().getCondition().getText());
        binding.feelsLike.setText("Feels like " + weather.getCurrent().getFeelslikeC());
    }


    private void doApiCall(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherApiService apiService = retrofit.create(WeatherApiService.class);

        Call<WeatherModel> call = apiService.getWeatherData(
                "d562a63d60c54ac293b72147251902",
                "Mumbai",
                "yes"
        );

        call.enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                if(response.isSuccessful()){
                     weather = response.body();
                    uiDesignChanges();

                    String location = weather.getLocation().getName() + ", " + weather.getLocation();
                    Log.d(TAG, weather.toString());
                    Log.d(TAG, location);
                }
            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                Log.d(TAG,"Unable to load weather data " + t );
            }
        });
    }

    private void replaceFragment(Fragment fragment){
     //   fragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout ,fragment );
        fragmentTransaction.commit();
    }

    private void checkManifestPermission(){
        if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION , Manifest.permission.ACCESS_COARSE_LOCATION
            }, 100);
        }
    }

    @
    @SuppressLint("MissingPermission")
    private void getLocation() {
        try {
            locationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, (android.location.LocationListener) MainActivity.this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void onLocationChanged(Location location) {

    }
}
