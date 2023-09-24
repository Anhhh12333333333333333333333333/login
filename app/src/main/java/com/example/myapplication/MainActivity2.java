package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CheckBox checkbox = findViewById(R.id.checkbox);
        Button createbtn = findViewById(R.id.createbtn);
        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkbox.isChecked()) {
                    Toast.makeText(MainActivity2.this,"ĐĂNG KÝ THÀNH CÔNG", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (MainActivity2.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity2.this,"ĐĂNG KÝ THẤT BẠI!", Toast.LENGTH_SHORT).show();
                }
//


            }
        });
    }
}