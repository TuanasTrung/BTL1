package com.example.btl1.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.btl1.R;
import com.example.btl1.user;
import com.example.btl1.view_item;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    private List<app> ListData;
    private RecyclerView customListApdapter;
    private customListAdapter CustomAdapter;

    ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(home.this, user.class);
                startActivity(intent3);
            }
        });

        customListApdapter = findViewById(R.id.listView);
        ListData = new ArrayList<app>();
        home_list();
        CustomAdapter = new customListAdapter(this,ListData);
        customListApdapter.setAdapter(CustomAdapter);
        customListApdapter.setLayoutManager(new LinearLayoutManager(this));
    }

    private void home_list() {
        ListData.add(new app("Angry bird",R.mipmap.ab, "Bắn súng, động vật, 12+", "$10"));
        ListData.add(new app("Assasin's Creeb",R.mipmap.ac, "Đánh nhau, nhập vai, 16+", "$30"));
        ListData.add(new app("Maple story",R.mipmap.ms, "Đánh nhau, nhập vai, 12+", "$15"));
    }
}
