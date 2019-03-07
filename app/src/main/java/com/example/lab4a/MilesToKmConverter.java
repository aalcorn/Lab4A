package com.example.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MilesToKmConverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_km_converter);
    }

    public void convertClicked(View v) {
        TextView m = (TextView) findViewById(R.id.milesText);
        TextView k = (TextView) findViewById(R.id.kmText);

        double milesValue;
        double kmValue;

        if (!m.getText().toString().equals("")) {
            milesValue = Double.parseDouble(m.getText().toString());
        } else {
            milesValue = 0;
        }

        if (!k.getText().toString().equals("")) {
            kmValue = Double.parseDouble(k.getText().toString());
        } else {
            kmValue = 0;
        }

        if (milesValue == 0 && kmValue != 0) {
            //convert kmValue to miles and store in m
            milesValue = kmValue / 1.609;
            m.setText(Double.toString(milesValue));
        } else if (milesValue != 0 && kmValue == 0) {
            //convert milesValue to km and store in k
            kmValue = milesValue * 1.609;
            k.setText(Double.toString(kmValue));
        } else if (milesValue != 0 && kmValue != 0) {
            //convert milesValue to km and store in k
            kmValue = milesValue * 1.609;
            k.setText(Double.toString(kmValue));
        } else {
            //do nothing
        }
    }
}
