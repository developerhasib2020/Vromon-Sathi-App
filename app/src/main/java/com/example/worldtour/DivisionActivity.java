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

public class DivisionActivity extends AppCompatActivity {
    RecyclerView divisionRv;
    DivisionAdapter adapter;
    ArrayList<DivisionModel> divisionlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        divisionRv = findViewById(R.id.divisionRv);

        divisionlist.add(new DivisionModel("ঢাকা বিভাগ", "জেলা ঃ ১১টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("চট্টগ্রাম বিভাগ", "জেলা ঃ ১১টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("খুলনা বিভাগ", "জেলা ঃ ০৭টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("সিলেট বিভাগ", "জেলা ঃ ০৫টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("রাজশাহী বিভাগ", "জেলা ঃ ০৮টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("ময়মনসিংহ বিভাগ", "জেলা ঃ ০৪টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("রংপুর বিভাগ", "জেলা ঃ ০৭টি", R.drawable.coxsbazar));
        divisionlist.add(new DivisionModel("বরিশাল বিভাগ", "জেলা ঃ ০৬টি", R.drawable.coxsbazar));


        adapter = new DivisionAdapter(this, divisionlist);
        divisionRv.setLayoutManager(new LinearLayoutManager(this));
        divisionRv.setAdapter(adapter);
        divisionRv.setHasFixedSize(true);
        divisionRv.addOnItemTouchListener(new RecyclerTouchListener(this, divisionRv, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int pos) {
               startActivity(new Intent(DivisionActivity.this,DistrictActivity.class)
                       .putExtra("division_position", pos)
               );
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

    }
}