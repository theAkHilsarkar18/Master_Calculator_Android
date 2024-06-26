package com.example.mastercalculatorandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class EMICalculatorActivity extends AppCompatActivity {
    private EditText editTextPrincipal, editTextRate, editTextTenure;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);

        editTextPrincipal = findViewById(R.id.editTextPrincipal);
        editTextRate = findViewById(R.id.editTextRate);
        editTextTenure = findViewById(R.id.editTextTenure);
        textViewResult = findViewById(R.id.textViewResult);
    }

    @SuppressLint("SetTextI18n")
    public void calculateEMI(View view) {
        double principal = Double.parseDouble(editTextPrincipal.getText().toString());
        double rate = Double.parseDouble(editTextRate.getText().toString()) / 12 / 100;
        double tenure = Double.parseDouble(editTextTenure.getText().toString()) * 12;

        double amount = (principal / tenure * 12);
        double emi = amount + (amount * rate)/100;

        DecimalFormat df = new DecimalFormat("#.##");
        textViewResult.setText("EMI: " + df.format(emi));
    }
}
