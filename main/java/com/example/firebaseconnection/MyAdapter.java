package com.example.firebaseconnection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Quote> list;

    public MyAdapter( Context context,ArrayList<Quote> list) {
        this.list = list;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Quote quote=list.get(position);
        holder.Author.setText(quote.getAuthor());
        holder.Quote.setText(quote.getQuote());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Author , Quote;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Author = itemView.findViewById(R.id.author);
            Quote = itemView.findViewById(R.id.quote);

        }
    }


}
