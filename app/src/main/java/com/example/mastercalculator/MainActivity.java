package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Startbtn,Aboutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Startbtn = findViewById(R.id.Startbtn);
        Aboutbtn = findViewById(R.id.Aboutbtn);

      Startbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, Calculation_UtilitiesActivity.class);
              startActivity(intent);
          }
      });
        Aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculation_UtilitiesActivity.class);
                startActivity(intent);
            }
        });

    }
}