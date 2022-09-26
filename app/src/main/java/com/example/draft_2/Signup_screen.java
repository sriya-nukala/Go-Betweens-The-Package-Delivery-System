package com.example.draft_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Signup_screen extends AppCompatActivity {
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);
        t1=findViewById(R.id.login);
        b1=findViewById(R.id.signupbtn);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),option_screen.class);
                startActivity(intent1);
            }
        });


    }
    public void login(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}