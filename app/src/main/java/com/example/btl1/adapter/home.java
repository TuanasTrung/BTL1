package com.example.btl1.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.btl1.OnItemClickListener;
import com.example.btl1.R;
import com.example.btl1.user;
import com.example.btl1.view_item;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private RecyclerView rcvData;
    private AppAdapter appAdapter;
    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(home.this, user.class);
                startActivity(i);
            }
        });

        rcvData = findViewById(R.id.appRcv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);

        appAdapter = new AppAdapter(getListApp(), new OnItemClickListener() {
            @Override
            public void onItemClick(app App) {
                onClickGoToDetail(App);
            }
        });
        rcvData.setAdapter(appAdapter);
    }

    private List<app> getListApp() {
        List<app> list = new ArrayList<>();
        list.add(new app("Angry Bird",R.mipmap.ab,"Trò chơi trẻ em, bắn súng, 12+","$10"));
        list.add(new app("Assasin's Creeb",R.mipmap.ac,"Nhập vai, đánh nhau, 17+","$20"));
        list.add(new app("Maple Story",R.mipmap.ms,"Nhập vai, trò chơi trực tuyến, 12+","$15"));

        return list;
    }


    private void onClickGoToDetail(app App){
        Intent i = new Intent(this,view_item.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object_app",App);
        i.putExtras(bundle);
        startActivity(i);
    }

}
