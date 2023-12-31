package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button loginbtn =  findViewById(R.id.loginbtn);
        //admin and admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("rotdeptrai") && password.getText().toString().equals("anh7maidinh"))
                {
                    //corect
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                }else
                    //incorect
                    Toast.makeText(MainActivity.this,"LOGIN FAILED!!!", Toast.LENGTH_SHORT).show();


            }
        });
        Button signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                // Tạo Intent để chuyển đến activity khác
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}