package com.example.mastercalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MutualFundsActivity extends AppCompatActivity {

  EditText investment,returnintrest,timeperiod;
  TextView txtinvested,txtreturn,txtvalue;
  Button calculationbtn;

  ImageView btnfinish;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutual_funds);
        investment = findViewById(R.id.investment);
        returnintrest = findViewById(R.id.returnintrest);
        timeperiod = findViewById(R.id.timeperiod);
        txtinvested = findViewById(R.id.txtinvested);
        txtreturn = findViewById(R.id.txtreturn);
        txtvalue = findViewById(R.id.txtvalue);
        calculationbtn = findViewById(R.id.calculationbtn);
        btnfinish = findViewById(R.id.btnfinish);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}