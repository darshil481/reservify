package com.example.jaymogal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Signin extends AppCompatActivity {
    TextView textView3,textView5,textView6;
    EditText editTextTextPersonName,editTextTextPersonName7;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        textView3=findViewById(R.id.textView3);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName7=findViewById(R.id.editTextTextPersonName7);
        button2=findViewById(R.id.button2);
        getSupportActionBar().hide();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=editTextTextPersonName.getText().toString();
                String password=editTextTextPersonName7.getText().toString();
                if(!email.isEmpty()) {
                    editTextTextPersonName.setError(null);
                    editTextTextPersonName.setEnabled(false);
                    if(!password.isEmpty()){
                        editTextTextPersonName7.setError(null);
                        editTextTextPersonName7.setEnabled(false);

                    }else{
                        editTextTextPersonName7.setError("please enter password");
                    }
                }else{
                    editTextTextPersonName.setError("please enter email");
                }
                String email_d=editTextTextPersonName.getText().toString();
                String password_d=editTextTextPersonName7.getText().toString();
                FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
                DatabaseReference databaseReference=firebaseDatabase.getReference("datauser");
                Query check_email=databaseReference.orderByChild("email").equalTo(email_d);
                check_email.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            editTextTextPersonName.setError(null);
                            editTextTextPersonName.setEnabled(false);
                            String password_check=snapshot.child(email_d).child("password").getValue(String.class);
                            if(password_check.equals(password_d)){
                                editTextTextPersonName7.setError(null);
                                editTextTextPersonName7.setEnabled(false);
                            }else{
                                editTextTextPersonName7.setError("wrong password");
                            }
                        }else{
                            editTextTextPersonName.setError("user does note exist");
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),navigation.class);
                startActivity(intent);

            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

    }
}