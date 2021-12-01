package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void pressConvertButton(View view) {
        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);
        String amount = amountEditText.getText().toString();
        String convertedAmount = (Integer.parseInt(amount) * 0.88) + "";
        Toast.makeText(this, "$"+amount + " = €"+ convertedAmount, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}