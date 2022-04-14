package com.example.btl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.btl1.adapter.app;
import com.example.btl1.adapter.home;

public class view_item extends AppCompatActivity {

    Button btnmua;
    ImageView back;
    ImageView profile;
    ImageView review_img;
    TextView review_appdes;
    TextView review_appname;
    TextView review_appprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        back = findViewById(R.id.back);
        profile = findViewById(R.id.profile);
        btnmua = findViewById(R.id.btnmua);

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

        btnmua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(view_item.this, giohang.class);
                startActivity(intent5);
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        app app = (app) bundle.get("object_app");

        review_appname = findViewById(R.id.review_appname);
        review_appdes = findViewById(R.id.review_appdes);
        review_appprice = findViewById(R.id.review_price);
        review_img = findViewById(R.id.appImg);

        review_appname.setText(app.getAppName());
        review_appprice.setText(app.getAppPrice());
        review_appdes.setText(app.getAppDes());
        review_img.setImageResource(app.getAppImg());
    }
}