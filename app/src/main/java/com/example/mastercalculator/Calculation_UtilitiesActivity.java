package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Calculation_UtilitiesActivity extends AppCompatActivity {

    ImageView Mutualfundsbtn,Intrestbtn,Discountbtn,Emibtn,SchoolResultbtn,Squarebtn,backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_utilities);

        Mutualfundsbtn = findViewById(R.id.Mutualfundsbtn);
        Intrestbtn = findViewById(R.id.Intrestbtn);
        Discountbtn = findViewById(R.id.Discountbtn);
        Emibtn = findViewById(R.id.Emibtn);
        SchoolResultbtn = findViewById(R.id.SchoolResultbtn);
        Squarebtn = findViewById(R.id.Squarebtn);
        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        Mutualfundsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(Calculation_UtilitiesActivity.this,MutualFundsActivity.class);
               startActivity(intent);

            }
        });

        Intrestbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculation_UtilitiesActivity.this,InterestCalculatorActivity.class);
                startActivity(intent);

            }
        });
        Discountbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculation_UtilitiesActivity.this,DiscountCalculatorActivity.class);
                startActivity(intent);

            }
        });
        Emibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculation_UtilitiesActivity.this, EMICalculatorActivity.class);
                startActivity(intent);

            }
        });
        SchoolResultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculation_UtilitiesActivity.this, SchoolResultActivity.class);
                startActivity(intent);

            }
        });
        Squarebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Calculation_UtilitiesActivity.this, NewSchoolResultActivity.class);
                startActivity(intent);

            }
        });

    }
}