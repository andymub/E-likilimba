package com.e_likilimba.Adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e_likilimba.BoardActivity;
import com.e_likilimba.Objet.CardData;
import com.e_likilimba.R;

import java.util.List;
import java.util.Random;

public class CardAdapter extends RecyclerView.Adapter <CardAdapter.MyViewHolder>{
    List<CardData> cardDataList;
    public CardAdapter(List cardDataList, BoardActivity boardActivity) {
        this.cardDataList = cardDataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_list_row, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {
        CardData data = cardDataList.get(position);
        Random rnd = new Random();
//        int currentColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//        viewHolder.parent.setBackgroundColor(currentColor);
        viewHolder.name.setText(data.getName());
        viewHolder.dateValidity.setText(data.getDateValidity());
        viewHolder.id.setText(data.getId());

        String typeOfAccount =data.getTypeaccount();
        if (typeOfAccount.toUpperCase().equals("FC")){
            viewHolder.typeaccount.setImageResource(R.drawable.ic_fc);
            viewHolder.amount.setText(data.getAmount() +" Fc");
        }
        else if  (typeOfAccount.toUpperCase().equals("$")){
            viewHolder.typeaccount.setImageResource(R.drawable.ic_dollars);
            viewHolder.amount.setText(data.getAmount()+ " $");
        }
    }

    //    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        CardAdapter data = cardDataList.get(position);
//        Random rnd = new Random();
//        int currentColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
//        holder.
//        holder.parent.setBackgroundColor(currentColor);
//        holder.name.setText(data.name);
//        holder.age.setText(String.valueOf(data.age));
//
//    }


    @Override
    public int getItemCount() {
        return cardDataList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,dateValidity,id,amount;
        ImageView typeaccount;
        LinearLayout parent;
        public MyViewHolder(View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            name = itemView.findViewById(R.id.txt_cardmember_name);
            dateValidity = itemView.findViewById(R.id.txt_datevalidity);
            typeaccount = itemView.findViewById(R.id.imgTypeOfMoney);
            amount = itemView.findViewById(R.id.txt_sommeCard);
            id = itemView.findViewById(R.id.txt_card_number);

        }

    }
}
