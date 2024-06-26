package com.example.mastercalculatorandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mastercalculatorandroid.EMICalculatorActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEMICalculator(View view) {
        startActivity(new Intent(this, EMICalculatorActivity.class));
    }


    public void openDiscountCalculator(View view) {
        startActivity(new Intent(this, DiscountCalculatorActivity.class));
    }
}
