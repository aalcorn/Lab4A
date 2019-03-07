package com.example.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Locale;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TipCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
    }

    public void calculateClicked(View v) {
        TextView t = (TextView) findViewById(R.id.totalBillText);
        TextView u = (TextView) findViewById(R.id.tipText);
        TextView n = (TextView) findViewById(R.id.numberOfPeopleText);
        TextView p = (TextView) findViewById(R.id.totalPerPersonText);

        double totalBill = Double.parseDouble(t.getText().toString());
        double tipPercentage = Double.parseDouble(u.getText().toString());
        double numberOfPeople = Double.parseDouble(n.getText().toString());
        double totalPerPerson;

        totalPerPerson = (totalBill + (totalBill * tipPercentage/100)) / numberOfPeople;

        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
        p.setText(defaultFormat.format(totalPerPerson));

    }

}
