package com.example.worldtour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.worldtour.Adapter.DivisionAdapter;
import com.example.worldtour.Adapter.TipsAdapter;
import com.example.worldtour.Model.DivisionModel;
import com.example.worldtour.TouchListener.RecyclerTouchListener;

import java.util.ArrayList;

public class TipsActivity extends AppCompatActivity {
    RecyclerView tipsRv;
    TipsAdapter adapter;
    ArrayList<DivisionModel> tipslist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        tipsRv = findViewById(R.id.tipsRv);

        showtipslist();

        adapter = new TipsAdapter(this, tipslist);
        tipsRv.setAdapter(adapter);
        tipsRv.setLayoutManager(new LinearLayoutManager(this));
        tipsRv.setHasFixedSize(true);
        tipsRv.addOnItemTouchListener(new RecyclerTouchListener(this, tipsRv, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                startActivity(new Intent(TipsActivity.this,TipsDetailsActivity.class)
                        .putExtra("tipstitle",tipslist.get(position).getName())
                        .putExtra("tipsdetails",tipslist.get(position).getSpotnumber())
                );
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

    private void showtipslist() {

        String [] tipsdetails = getResources().getStringArray(R.array.tips_tricks);
        String [] tipstitle = getResources().getStringArray(R.array.tips_title);

        for (int i = 0;i<tipstitle.length;i++)
        {
            tipslist.add(new DivisionModel(tipstitle[i],tipsdetails[i],i+1));
        }

    }
}