package com.example.worldtour.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.worldtour.Model.DivisionModel;
import com.example.worldtour.R;

import java.util.ArrayList;

public class DivisionAdapter extends RecyclerView.Adapter<DivisionAdapter.ViewHolder> {
    Context context;
    ArrayList<DivisionModel> divisionlist = new ArrayList<DivisionModel>();

    public DivisionAdapter(Context context, ArrayList<DivisionModel> divisionlist) {
        this.context = context;
        this.divisionlist = divisionlist;
    }

    @NonNull
    @Override
    public DivisionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.division_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DivisionAdapter.ViewHolder holder, int position) {
        DivisionModel model = divisionlist.get(position);
        holder.divisionImage.setImageResource(model.getImage());
        holder.divisionName.setText(model.getName());
        holder.divisionNumber.setText(model.getSpotnumber());
    }

    @Override
    public int getItemCount() {
        return divisionlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView divisionImage;
        TextView divisionName, divisionNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            divisionImage = itemView.findViewById(R.id.divisionimage);
            divisionName = itemView.findViewById(R.id.divisionName);
            divisionNumber = itemView.findViewById(R.id.districtNumber);

        }
    }
}
