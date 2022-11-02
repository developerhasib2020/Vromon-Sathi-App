package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.worldtour.Adapter.DivisionAdapter;
import com.example.worldtour.Model.DivisionModel;

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

    }

    private void showWorldTourList() {
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));
        worldtourlist.add(new DivisionModel("ভারত","দর্শনীয় স্থান : ৪০ টি",R.drawable.coxsbazar));


    }
}