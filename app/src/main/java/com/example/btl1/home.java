package com.example.btl1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<app> image_detail = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new customListAdapter(this, image_detail));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                app app = (app) o;
                Toast.makeText(home.this,"Selected:" + " " + app, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<app> getListData(){
        List<app> list = new ArrayList<app>();
        app ab = new app ("Angry Bird","ab", "Hành động, trẻ con, 12+");
        app ac = new app ("Assasin's creed", "ac", "Hành động, phiêu lưu, 16+");
        app ms = new app ("Maple story", "ms","Nhập vai, phiêu lưu, 12+");

        list.add(ab);
        list.add(ac);
        list.add(ms);

        return list;
    }
}
