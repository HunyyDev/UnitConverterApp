package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etInput;
    private TextView tvOutput;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    double convertToFeet(double centimeters) {
        return centimeters * 0.032808399;
    }

    private void initiate() {
        etInput = findViewById(R.id.etInput);
        tvOutput = findViewById(R.id.tvOutput);
        btnConvert = findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double inputValueInCentimeters = Double.parseDouble(etInput.getText().toString());
                double outputValuesInFeet = convertToFeet(inputValueInCentimeters);
                String resultWithUnit = outputValuesInFeet + "ft";
                tvOutput.setText(resultWithUnit);
            }
        });
    }
}