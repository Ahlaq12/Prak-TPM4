package com.example.fragmentugas4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CaborAdapter extends RecyclerView.Adapter<CaborAdapter.viewHolder>{
    private Context context;
    private ArrayList<CaborModel> caborModels;

    public ArrayList<CaborModel> getCaborModels(){
        return caborModels;
    }
    public void setCaborModels(ArrayList<CaborModel> caborModels){
        this.caborModels = caborModels;
    }

    public CaborAdapter(ArrayList<CaborModel> listData, Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CaborAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cabor,parent, false);
        return new viewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CaborAdapter.viewHolder holder, int position) {
        Glide.with(context).load(getCaborModels().get(position).getLogoCabor()).into(holder.iv1);
        holder.tv1.setText(getCaborModels().get(position).getNamaCabor());

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, getCaborModels().get(position).getPrivew());
                intent.setType("text/plain");
                context.startActivity(Intent.createChooser(intent, "Send To"));
            }
        });
        holder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity2.class);

                intent.putExtra("logo", getCaborModels().get(position).getLogoCabor());
                intent.putExtra("nama", getCaborModels().get(position).getNamaCabor());
                intent.putExtra("privew", getCaborModels().get(position).getPrivew());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return caborModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView iv1;
        private TextView tv1;
        private Button share;
        private Button detail;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            iv1 = itemView.findViewById(R.id.iv1);
            tv1 = itemView.findViewById(R.id.tv1);
            share = itemView.findViewById(R.id.btn_share);
            detail = itemView.findViewById(R.id.btn_preview);

        }
    }
}
