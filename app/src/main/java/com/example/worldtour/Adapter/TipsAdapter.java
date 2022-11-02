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

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {
    Context context;
    ArrayList<DivisionModel> tipslist = new ArrayList<DivisionModel>();

    public TipsAdapter(Context context, ArrayList<DivisionModel> tipslist) {
        this.context = context;
        this.tipslist = tipslist;
    }

    @NonNull
    @Override
    public TipsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.tips_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TipsAdapter.ViewHolder holder, int position) {
        DivisionModel model = tipslist.get(position);
        holder.tipsnumbertext.setText(model.getImage()+"");
        holder.divisionName.setText(model.getName());
        holder.divisionNumber.setText(model.getSpotnumber());
    }

    @Override
    public int getItemCount() {
        return tipslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tipsnumbertext;
        TextView divisionName, divisionNumber;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tipsnumbertext = itemView.findViewById(R.id.tipsnumbertext);
            divisionName = itemView.findViewById(R.id.divisionName);
            divisionNumber = itemView.findViewById(R.id.districtNumber);

        }
    }
}
