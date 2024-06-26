package com.example.mastercalculatorandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.DecimalFormat;

public class DiscountCalculatorActivity extends AppCompatActivity {
    private EditText editTextOriginalPrice, editTextDiscountRate;
    private TextView textViewResultDiscount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount_calculator);

        editTextOriginalPrice = findViewById(R.id.editTextOriginalPrice);
        editTextDiscountRate = findViewById(R.id.editTextDiscountRate);
        textViewResultDiscount = findViewById(R.id.textViewResultDiscount);
    }

    public void calculateDiscount(View view) {
        double originalPrice = Double.parseDouble(editTextOriginalPrice.getText().toString());
        double discountRate = Double.parseDouble(editTextDiscountRate.getText().toString());

        double discountAmount = originalPrice * discountRate / 100;
        double finalPrice = originalPrice - discountAmount;

        DecimalFormat df = new DecimalFormat("#.##");
        textViewResultDiscount.setText("Discounted Price: " + df.format(finalPrice));
    }
}
