package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jaymogal.ui.home.HomeFragment;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

import java.util.Locale;

public class bus extends AppCompatActivity implements PaymentResultListener {
    TextView pune,mum,textView3,ppppp,ttttt;
    LinearLayout kkkk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        pune = findViewById(R.id.pune);
        mum = findViewById(R.id.mum);
        textView3 = findViewById(R.id.textView3);
        ppppp = findViewById(R.id.ppppp);
        ttttt = findViewById(R.id.ttttt);
        kkkk = findViewById(R.id.kkkk);
        String dd = getIntent().getStringExtra("destination");
        String ff = getIntent().getStringExtra("from");
        String ddd = getIntent().getStringExtra("date");
        String tk = getIntent().getStringExtra("time");
        String pk = getIntent().getStringExtra("price");
        pune.setText(dd);
        mum.setText(ff);
        textView3.setText(ddd);
        ppppp.setText(pk);
        ttttt.setText(tk);
        getSupportActionBar().hide();
        kkkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startPayment();
            }
        });


    }

    public void  startPayment(){

        String pk = getIntent().getStringExtra("price");


        Checkout checkout = new Checkout();

        checkout.setImage(R.mipmap.ic_launcher);

        final Activity activity = this;

        try {
            JSONObject options = new JSONObject();
            options.put("name", R.string.app_name);
            options.put("description", "Payment for Anything");
            options.put("send_sms_hash", true);
            options.put("allow_rotation", false);

            //You can omit the image option to fetch the image from dashboard
            options.put("currency", "INR");
            options.put("amount","20000");

            JSONObject preFill = new JSONObject();
            preFill.put("email", "email");
            preFill.put("contact", "phone");

            options.put("prefill", preFill);

            checkout.open(activity, options);
        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }

    }

    @Override
    public void onPaymentSuccess(String s) {

        Toast.makeText(this,"payment success"+s,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(getApplicationContext(),success.class);
        startActivity(intent);

    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(this,"payment error "+s,Toast.LENGTH_SHORT).show();


    }
}