package com.example.btl1.adapter;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

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

import com.example.btl1.R;
import com.example.btl1.adapter.app;
import com.example.btl1.view_item;

import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {

    private List<app> mListApp;
    private Context context;

    public AppAdapter(Context context, List<app> mListApp) {
        this.context = context;
        this.mListApp = mListApp;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list,parent,false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        final app app = mListApp.get(position);
        if(app == null){
            return;
        }
        holder.appImg.setImageResource(app.getAppImg());
        holder.appName.setText(app.getAppName());
        holder.appDes.setText(app.getAppDes());
        holder.appPrice.setText(app.getAppPrice());
        
        holder.layoutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(app);
            }
        });
    }

    private void onClickGoToDetail(app app){
        Intent intent = new Intent(context, view_item.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_app", app);
        intent.putExtras(bundle);
        context.startActivity(intent);
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