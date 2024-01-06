package com.example.mastercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class InterestCalculatorActivity extends AppCompatActivity {

    ImageView backbtn;
    EditText edtAmount,edtInterest,edtTime;
    TextView txtAmount;

    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_calculator);

        backbtn = findViewById(R.id.backbtn);
        edtAmount = findViewById(R.id.edtAmount);
        edtInterest = findViewById(R.id.edtInterest);
        edtTime = findViewById(R.id.edtTime);
        txtAmount = findViewById(R.id.txtAmount);
        btnCalculate = findViewById(R.id.btnCalculate);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}