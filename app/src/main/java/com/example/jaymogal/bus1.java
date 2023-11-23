package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bus1 extends AppCompatActivity {
    Button search_buses;
    EditText dest,fro,date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus1);
        search_buses=findViewById(R.id.search_buses);
        dest=findViewById(R.id.dest);
        fro=findViewById(R.id.fro);
        date=findViewById(R.id.date);
        getSupportActionBar().hide();
        search_buses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=dest.getText().toString();
                String from=fro.getText().toString();
                String datee=date.getText().toString();
                Intent intent=new Intent(getApplicationContext(),bus2.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                startActivity(intent);
            }
        });
    }
}