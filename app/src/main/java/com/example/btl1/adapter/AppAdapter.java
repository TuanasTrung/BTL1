package com.example.btl1.adapter;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.btl1.OnItemClickListener;
import com.example.btl1.R;
import com.example.btl1.adapter.app;
import com.example.btl1.view_item;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {

    private List<app> mListApp;
    private OnItemClickListener onItemClickListener;

    public AppAdapter(List<app> mListApp, OnItemClickListener listener) {
        this.mListApp = mListApp;
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list,parent,false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        final app App = mListApp.get(position);
        if(App == null){
            return;
        }
        holder.appImg.setImageResource(App.getAppImg());
        holder.appName.setText(App.getAppName());
        holder.appDes.setText(App.getAppDes());
        holder.appPrice.setText(App.getAppPrice());
        
        holder.layoutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(App);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (mListApp!= null){
            return mListApp.size();
        }
        return 0;
    }

    public class AppViewHolder extends RecyclerView.ViewHolder{

        private RelativeLayout layoutApp;
        private ImageView appImg;
        private TextView appName;
        private TextView appDes;
        private TextView appPrice;

        public AppViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutApp = itemView.findViewById(R.id.layoutApp);
            appImg = itemView.findViewById(R.id.appImg);
            appName = itemView.findViewById(R.id.appName);
            appDes = itemView.findViewById(R.id.appDes);
            appPrice = itemView.findViewById(R.id.appPrice);

        }
    }
}