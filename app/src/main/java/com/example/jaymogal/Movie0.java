package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Movie0 extends AppCompatActivity {
    TextView textView10,textView12,textView13,textView15,textView26;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie0);
        textView10=findViewById(R.id.textView10);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView15=findViewById(R.id.textView15);
        textView26=findViewById(R.id.textView26);
        getSupportActionBar().hide();
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),movie00.class);
                startActivity(intent);
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),movie00.class);
                startActivity(intent);
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),movie00.class);
                startActivity(intent);
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),movie00.class);
                startActivity(intent);
            }
        });
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),movie00.class);
                startActivity(intent);
            }
        });
    }
}