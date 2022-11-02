package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView detailsImage;
    TextView detailsname, detailsDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsImage = findViewById(R.id.detailsImageid);
        detailsname = findViewById(R.id.detailsNameid);
        detailsDescription = findViewById(R.id.details_descriptionid);

        detailsImage.setImageResource(getIntent().getIntExtra("detailsimage", 0));
        detailsname.setText(getIntent().getStringExtra("detailsname"));
        detailsDescription.setText(getIntent().getStringExtra("detailsdescription"));


    }
}