package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class bus2 extends AppCompatActivity {
    TextView price1,price2,price3,price4,price5,ttt1,ttt2,ttt3,ttt4,ttt;
    LinearLayout l1,l2,l3,l4,l5;
    TextView d,m,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus2);
        price1=findViewById(R.id.price1);
        price2=findViewById(R.id.price2);
        price3=findViewById(R.id.price3);
        price4=findViewById(R.id.price);
        price5=findViewById(R.id.price);
        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        l3=findViewById(R.id.l3);
        l4=findViewById(R.id.l4);
        l5=findViewById(R.id.l5);
        d=findViewById(R.id.d);
        m=findViewById(R.id.m);
        ttt=findViewById(R.id.ttt);
        ttt1=findViewById(R.id.ttt1);
        ttt2=findViewById(R.id.ttt2);
        ttt3=findViewById(R.id.ttt3);
        ttt4=findViewById(R.id.ttt4);
        textView3=findViewById(R.id.textView3);
        String dd=getIntent().getStringExtra("destination");
        String ff=getIntent().getStringExtra("from");
        String ddd=getIntent().getStringExtra("date");
        getSupportActionBar().hide();

        d.setText(dd);
        m.setText(ff);
        textView3.setText(ddd);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=d.getText().toString();
                String from=m.getText().toString();
                String datee=textView3.getText().toString();
                String t1=ttt.getText().toString();
                String p1 =price1.getText().toString();

                Intent intent=new Intent(getApplicationContext(),bus.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                intent.putExtra("time",t1);
                intent.putExtra("price",p1);
                startActivity(intent);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=d.getText().toString();
                String from=m.getText().toString();
                String datee=textView3.getText().toString();
                String t1=ttt1.getText().toString();
                String p1=price2.getText().toString();
                Intent intent=new Intent(getApplicationContext(),bus.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                intent.putExtra("time",t1);
                intent.putExtra("price",p1);
                startActivity(intent);

            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=d.getText().toString();
                String from=m.getText().toString();
                String datee=textView3.getText().toString();
                String t1=ttt2.getText().toString();
                String p1=price3.getText().toString();
                Intent intent=new Intent(getApplicationContext(),bus.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                intent.putExtra("time",t1);
                intent.putExtra("price",p1);
                startActivity(intent);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=d.getText().toString();
                String from=m.getText().toString();
                String datee=textView3.getText().toString();
                String t1=ttt3.getText().toString();
                String p1=price4.getText().toString();
                Intent intent=new Intent(getApplicationContext(),bus.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                intent.putExtra("time",t1);
                intent.putExtra("price",p1);
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String destination=d.getText().toString();
                String from=m.getText().toString();
                String datee=textView3.getText().toString();
                String t1=ttt4.getText().toString();
                String p1=price5.getText().toString();
                Intent intent=new Intent(getApplicationContext(),bus.class);
                intent.putExtra("destination",destination);
                intent.putExtra("from",from);
                intent.putExtra("date",datee);
                intent.putExtra("time",t1);
                intent.putExtra("price",p1);
                startActivity(intent);
            }
        });


    }
}