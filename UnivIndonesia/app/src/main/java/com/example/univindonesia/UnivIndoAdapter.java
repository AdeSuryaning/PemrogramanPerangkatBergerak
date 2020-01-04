package com.example.univindonesia;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class UnivIndoAdapter extends RecyclerView.Adapter<UnivIndoAdapter.ListViewHolder> {
    private ArrayList<UnivIndo> listUnivIndo;
    private Context context;

    public UnivIndoAdapter(Context context, ArrayList<UnivIndo> listUnivIndo) {
        this.listUnivIndo = listUnivIndo;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_univ, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final UnivIndo univIndo = listUnivIndo.get(position);
        Glide.with(holder.itemView.getContext()).load(univIndo.getPhoto()).apply(new RequestOptions().fitCenter()).into(holder.imgPhoto);

        holder.tvName.setText(univIndo.getName());
        holder.tvDesc.setText(univIndo.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(context, DetailListUniv.class);
                detail.putExtra("UnivIndo_id", univIndo.getId());
                context.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listUnivIndo.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_univIndo_list);
            tvName =itemView.findViewById(R.id.name_list_univIndo);
            tvDesc = itemView.findViewById(R.id.desc_univIndo_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

