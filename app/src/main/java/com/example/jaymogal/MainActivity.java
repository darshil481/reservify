package com.example.jaymogal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView4;
    EditText editTextTextPersonName2,editTextTextPersonName3,editTextTextPersonName4,editTextTextPersonName5,editTextTextPersonName6;
    Button Signupbutton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.ggmail);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4=findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5=findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6=findViewById(R.id.editTextTextPersonName6);
        Signupbutton=findViewById(R.id.Signupbutton);
        getSupportActionBar().hide();



        textView4.setOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Signin.class);
                startActivity(intent);

            }
        });

        Signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname=editTextTextPersonName2.getText().toString();
                String lastname=editTextTextPersonName3.getText().toString();
                String email=editTextTextPersonName4.getText().toString();
                String mobile=editTextTextPersonName5.getText().toString();
                String password=editTextTextPersonName6.getText().toString();
                if(!firstname.isEmpty()){
                    editTextTextPersonName2.setError(null);

                    if(!lastname.isEmpty()){
                        editTextTextPersonName3.setError(null);

                        if(!email.isEmpty()){
                            editTextTextPersonName4.setError(null);

                            if(!mobile.isEmpty()){
                                editTextTextPersonName5.setError(null);

                                if(!password.isEmpty()){
                                    editTextTextPersonName6.setError(null);


                                } else{
                                    editTextTextPersonName6.setError("please enter password");
                                }
                            }else{
                                editTextTextPersonName5.setError("please enter mobile number");
                            }
                        }else{
                            editTextTextPersonName4.setError("please enter email");
                        }
                    }else{
                        editTextTextPersonName3.setError("please enter lastname");
                    }
                }else{
                    editTextTextPersonName2.setError("please enter firstname");
                }
                firebaseDatabase=FirebaseDatabase.getInstance();
                reference=firebaseDatabase.getReference("datauser");
                String firstname_s=editTextTextPersonName2.getText().toString();
                String lastname_s=editTextTextPersonName3.getText().toString();
                String email_s=editTextTextPersonName4.getText().toString();
                String mobile_s=editTextTextPersonName5.getText().toString();
                String password_s=editTextTextPersonName6.getText().toString();
                storingdata storingdatass=new storingdata(firstname_s,lastname_s,email_s,mobile_s,password_s);
                reference.child(email_s).setValue(storingdatass);

                        Intent intent=new Intent(getApplicationContext(),navigation.class);
                        startActivity(intent);

            }

        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Signin.class);
                startActivity(intent);

            }
        });

    }
}