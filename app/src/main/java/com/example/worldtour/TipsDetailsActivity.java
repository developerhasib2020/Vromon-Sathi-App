package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TipsDetailsActivity extends AppCompatActivity {
TextView tipsdetailsText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_details);

        tipsdetailsText = findViewById(R.id.tipsdetailstext);

        getSupportActionBar().setTitle(getIntent().getStringExtra("tipstitle"));

        tipsdetailsText.setText(getIntent().getStringExtra("tipsdetails"));
    }
}