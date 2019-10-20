package com.example.film_photography;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    RecyclerView rvCamera;
    RecyclerView.Adapter mAdapterCamera;
    RecyclerView.LayoutManager layoutManagerCamera;
    private ArrayList<String> cameraPhotoUrl = new ArrayList<>();
    private ArrayList<String> cameraName = new ArrayList<>();

    RecyclerView rvFilm;
    RecyclerView.Adapter mAdapterFilm;
    RecyclerView.LayoutManager layoutManagerFilm;
    private ArrayList<String> filmPhotoUrl = new ArrayList<>();
    private ArrayList<String> filmName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: Preparing bitmaps");

        //Camera
        cameraPhotoUrl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        cameraName.add("Havasu Falls");

        cameraPhotoUrl.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        cameraName.add("Trondheim");

        cameraPhotoUrl.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        cameraName.add("Portugal");

        cameraPhotoUrl.add("https://i.redd.it/j6myfqglup501.jpg");
        cameraName.add("Rocky Mountain National Park");

        cameraPhotoUrl.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        cameraName.add("Mahahual");

        cameraPhotoUrl.add("https://i.redd.it/k98uzl68eh501.jpg");
        cameraName.add("Frozen Lake");

        cameraPhotoUrl.add("https://i.redd.it/glin0nwndo501.jpg");
        cameraName.add("White Sands Desert");

        cameraPhotoUrl.add("https://i.redd.it/obx4zydshg601.jpg");
        cameraName.add("Austrailia");

        cameraPhotoUrl.add("https://i.imgur.com/ZcLLrkY.jpg");
        cameraName.add("Washington");

        cameraPhotoUrl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        cameraName.add("Havasu Falls");

        //Film
        filmPhotoUrl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        filmName.add("Film 1");

        filmPhotoUrl.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        filmName.add("Film 2");

        filmPhotoUrl.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        filmName.add("Film 3");

        filmPhotoUrl.add("https://i.redd.it/j6myfqglup501.jpg");
        filmName.add("Film 4");

        filmPhotoUrl.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        filmName.add("Film 5");

        filmPhotoUrl.add("https://i.redd.it/k98uzl68eh501.jpg");
        filmName.add("Frozen Lake");

        filmPhotoUrl.add("https://i.redd.it/glin0nwndo501.jpg");
        filmName.add("White Sands Desert");

        filmPhotoUrl.add("https://i.redd.it/obx4zydshg601.jpg");
        filmName.add("Austrailia");

        filmPhotoUrl.add("https://i.imgur.com/ZcLLrkY.jpg");
        filmName.add("Washington");

        cameraPhotoUrl.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        cameraName.add("Havasu Falls");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        rvCamera = findViewById(R.id.rv_camera);
        layoutManagerCamera = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvCamera.setLayoutManager(layoutManagerCamera);
        mAdapterCamera = new adapterListKamera(cameraPhotoUrl, cameraName, this);
        rvCamera.setAdapter(mAdapterCamera);

        rvFilm = findViewById(R.id.rv_film);
        layoutManagerFilm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvFilm.setLayoutManager(layoutManagerFilm);
        mAdapterFilm = new adapterListFilm(filmPhotoUrl, filmName, this);
        rvFilm.setAdapter(mAdapterFilm);
    }
}
