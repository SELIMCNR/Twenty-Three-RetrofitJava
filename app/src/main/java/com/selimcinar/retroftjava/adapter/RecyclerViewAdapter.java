package com.selimcinar.retroftjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.selimcinar.retroftjava.R;
import com.selimcinar.retroftjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {
    private ArrayList <CryptoModel> cryptList;

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptList) {
        this.cryptList = cryptList;
    }


    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row,parent,false);
        return new RowHolder(view);
    }

    private  String[] colors = {"#CD5C5C","#DFFF00","#FF7F50","#40E0D0","#6495ED","#CCCCFF","#CCCCF4","#6495EZ"};
    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptList.get(position),colors,position);
    }

    @Override
    public int getItemCount() {
        return cryptList.size();
    }

    public  class RowHolder extends RecyclerView.ViewHolder {
        TextView textname;
        TextView textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);


        }
        public  void  bind(CryptoModel cryptoModel,String[] colors,Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]));
            textname = itemView.findViewById(R.id.text_name);
            textPrice = itemView.findViewById(R.id.text_price);
            textname.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
