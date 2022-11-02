package com.example.worldtour;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageCarousel carosel;
    CardView bdtourcard, worldtourcard, catagorycard, videocard, tipscard, aboutmecard;
    TextView titletext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomActionBar(""+this.getTitle());

        bdtourcard = findViewById(R.id.bdtourcard);
        worldtourcard = findViewById(R.id.worldtourcard);
        catagorycard = findViewById(R.id.catagorycard);
        videocard = findViewById(R.id.videocard);
        tipscard = findViewById(R.id.tipscard);
        aboutmecard = findViewById(R.id.aboutmecard);

        setupcarosel();


        bdtourcard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, DivisionActivity.class));
        });

        worldtourcard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, WorldTourActivity.class));
        });
        catagorycard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, CatagoryActivity.class));
        });
        videocard.setOnClickListener(view -> {

            if (!isNetworkAvailable() == true) {
                new AlertDialog.Builder(this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Internet Connection Alert")
                        .setMessage("Please Check Your Internet Connection")
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
                            }
                        }).show();
            } else if (isNetworkAvailable() == true) {
                startActivity(new Intent(MainActivity.this, VideoActivity.class));
            }

        });
        tipscard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, TipsActivity.class));
        });
        aboutmecard.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, AboutmeActivity.class));
        });


    }


    public void setCustomActionBar(String title) {
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.getSupportActionBar().setDisplayShowTitleEnabled(false);

        LayoutInflater inflator = LayoutInflater.from(this);
        View v = inflator.inflate(R.layout.titleview, null);

//if you need to customize anything else about the text, do it here.
//I'm using a custom TextView with a custom font in my layout xml so all I need to do is set title
       titletext = v.findViewById(R.id.titleid);
       titletext.setText(title);

//assign the view to the actionbar
        this.getSupportActionBar().setCustomView(v);
    }


    public boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null) {


            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {

                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {

                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {

                        return true;
                    }
                }
            }
        }

        return false;

    }

    private void setupcarosel() {

        carosel = findViewById(R.id.carousel);

        List<CarouselItem> list = new ArrayList<>();
        list.add(new CarouselItem(R.drawable.worldtour2, "World Tourism"));
        list.add(new CarouselItem(R.drawable.coxsbazar, "Cox's Bazar"));
        list.add(new CarouselItem(R.drawable.sylhetteastate, "Sylhet Tea State"));
        list.add(new CarouselItem(R.drawable.sundarban, "Sundarban"));
        carosel.setData(list);
    }

    @Override
    public void onBackPressed() {

        AlertDialog exitdialog = new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure want to exit form this app ?")
                .setIcon(R.drawable.ic_baseline_exit_to_app_24)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .create();
        exitdialog.show();

    }
}