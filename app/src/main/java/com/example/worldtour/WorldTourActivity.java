package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.worldtour.Adapter.DivisionAdapter;
import com.example.worldtour.Model.DivisionModel;
import com.example.worldtour.TouchListener.RecyclerTouchListener;

import java.util.ArrayList;

public class WorldTourActivity extends AppCompatActivity {
RecyclerView worldtourRV;
DivisionAdapter worldtourAdapter;
ArrayList<DivisionModel> worldtourlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_tour);

        worldtourRV = findViewById(R.id.worldtourRV);


        showWorldTourList();

        worldtourAdapter = new DivisionAdapter(this,worldtourlist);
        worldtourRV.setLayoutManager(new LinearLayoutManager(this));
        worldtourRV.setHasFixedSize(true);
        worldtourRV.setAdapter(worldtourAdapter);
        worldtourRV.addOnItemTouchListener(new RecyclerTouchListener(this, worldtourRV, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

                if (position==0) {
                    startActivity(new Intent(WorldTourActivity.this, DistrictActivity.class)
                            .putExtra("division_position", position + 8)
                    );
                }else
                    startActivity(new Intent(WorldTourActivity.this,SpotlistActivity.class)
                            .putExtra("Districtname",worldtourlist.get(position).getName())
                    );

                }


            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }

    private void showWorldTourList() {
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.rinchenpongsikkimindia));
        worldtourlist.add(new DivisionModel("নেপাল","দর্শনীয় স্থান : ৪০ টি",R.drawable.annapurnanepal));
        worldtourlist.add(new DivisionModel("থাইল্যান্ড","দর্শনীয় স্থান : ৪০ টি",R.drawable.bangkokthailand));
        worldtourlist.add(new DivisionModel("ভুটান","দর্শনীয় স্থান : ৪০ টি",R.drawable.bumthangbhutan));
        worldtourlist.add(new DivisionModel("শ্রীলংকা","দর্শনীয় স্থান : ৪০ টি",R.drawable.adamspeaksrilanka));
        worldtourlist.add(new DivisionModel("ইন্দোনেশিয়া","দর্শনীয় স্থান : ৪০ টি",R.drawable.adamspeaksrilanka));



    }
}