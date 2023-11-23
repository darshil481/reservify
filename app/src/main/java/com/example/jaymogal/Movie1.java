package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Movie1 extends AppCompatActivity {
    LinearLayout lll1,lll2,lll3,lll4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie1);
        getSupportActionBar().hide();
        lll1=findViewById(R.id.lll1);
        lll2=findViewById(R.id.lll2);
        lll3=findViewById(R.id.lll3);
        lll4=findViewById(R.id.lll4);

       lll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),Movie11.class);
               startActivity(intent);
            }
        });
       lll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Movie11.class);
                startActivity(intent);
            }
        });
        lll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Movie11.class);
                startActivity(intent);
            }
        });
        lll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Movie11.class);
                startActivity(intent);
            }
        });
    }
}