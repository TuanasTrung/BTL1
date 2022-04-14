package com.example.btl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.btl1.adapter.home;

public class user extends AppCompatActivity {

    Button btndx,btndm, btndone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        btndm = findViewById(R.id.btndm);
        btndone = findViewById(R.id.btndone);
        btndx = findViewById(R.id.btndx);

        btndx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, home.class);
                startActivity(intent);
            }
        });

        btndm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user.this, giohang.class);
                startActivity(intent);
            }
        });
    }
}