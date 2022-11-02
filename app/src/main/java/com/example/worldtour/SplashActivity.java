package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

public class SplashActivity extends AppCompatActivity {
    Animation topAnimation,bottomanimation;
    ImageView logoimage;
    TextView appname,developername;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        logoimage = findViewById(R.id.logoimage);
        appname = findViewById(R.id.appname);
        developername = findViewById(R.id.developer);


        topAnimation = AnimationUtils.loadAnimation(this, R.anim.topanimation);
        bottomanimation = AnimationUtils.loadAnimation(this,R.anim.bottomanimation);


        logoimage.setAnimation(topAnimation);
        appname.setAnimation(bottomanimation);
        developername.setAnimation(bottomanimation);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}