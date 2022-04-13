package com.example.btl1.adapter;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.renderscript.Allocation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.btl1.R;
import com.example.btl1.adapter.app;

import java.util.List;

public class customListAdapter extends RecyclerView.Adapter<customListAdapter.customListAdapterHolder>{

    private Context aContext;
    private List<app> ListData;

    public customListAdapter(Context aContext, List<app> listData) {
        this.aContext = aContext;
        ListData = listData;
    }

    @NonNull
    @Override
    public customListAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(aContext);
        View appView = inflater.inflate(R.layout.home_list,parent,false);
        customListAdapterHolder viewHolder = new customListAdapterHolder(appView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull customListAdapterHolder holder, int position) {
        holder.appImgView.setBackgroundResource(ListData.get(position).getAppImg());
        holder.appNameView.setText(ListData.get(position).getAppName());
        holder.appDesView.setText(ListData.get(position).getAppDes());
        holder.appPriceView.setText(ListData.get(position).getAppPrice());

    }

    @Override
    public int getItemCount() {
        return ListData.size();
    }

    public static class customListAdapterHolder extends RecyclerView.ViewHolder{

        private ImageView appImgView;
        private TextView appNameView, appDesView, appPriceView;

        public customListAdapterHolder(@NonNull View itemView) {
            super(itemView);
            appImgView = itemView.findViewById(R.id.appImg);
            appNameView = itemView.findViewById(R.id.appName);
            appDesView = itemView.findViewById(R.id.appDes);
            appPriceView = itemView.findViewById(R.id.appPrice);
        }
    }
}