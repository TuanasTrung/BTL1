package com.example.btl1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.btl1.R;
import com.example.btl1.adapter.app;

import java.util.List;

public class customListAdapter extends BaseAdapter {
    private List<app> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public customListAdapter(Context aContext, List<app>listData){
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.home_list, null);
            holder = new ViewHolder();
            holder.appImgView = (ImageView) convertView.findViewById(R.id.appImg);
            holder.appNameView = (TextView) convertView.findViewById(R.id.appName);
            holder.appDesView = (TextView) convertView.findViewById(R.id.appDes);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        app app = this.listData.get(position);
        holder.appNameView.setText(app.getAppName());
        holder.appDesView.setText("Descreption: " + app.getAppDes());
        int imageId = this.getMipmapResIdByName(app.getAppImg());
        holder.appImgView.setImageResource(imageId);
        return convertView;
    }

    public int getMipmapResIdByName(String resName){
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName, "mipmap", pkgName);
        Log.i("customListView","Res Name:" + resName+"==> Res ID = " + resID);
        return resID;
    }

    static class ViewHolder {
        ImageView appImgView;
        TextView appNameView;
        TextView appDesView;
    }
}
