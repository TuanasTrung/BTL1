package com.example.btl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.btl1.adapter.home;

public class view_item extends AppCompatActivity {

    ImageView back;
    ImageView profile;
    ImageView review_img;
    TextView review_appdes;
    TextView review_appname;
    TextView review_appprice;

    String appName, appDes, appPrice;
    int appImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        back = findViewById(R.id.back);
        profile = findViewById(R.id.profile);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(view_item.this, home.class);
                startActivity(intent3);
                finish();
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(view_item.this, user.class);
                startActivity(intent4);
                finish();
            }
        });

        Intent i = getIntent();

        appName = i.getStringExtra("appName");
        appImg = i.getIntExtra("appImg",R.mipmap.ab);
        appDes = i.getStringExtra("appDes");
        appPrice = i.getStringExtra("appPrice");

        review_appname = findViewById(R.id.review_appname);
        review_appdes = findViewById(R.id.review_appdes);
        review_img = findViewById(R.id.review_img);
        review_appprice = findViewById(R.id.review_price);

        review_appname.setText(appName);
        review_appprice.setText(appPrice);
        review_appdes.setText(appDes);
        review_img.setImageResource(appImg);
    }
}