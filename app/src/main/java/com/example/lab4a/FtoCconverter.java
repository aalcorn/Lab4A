package com.example.lab4a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class FtoCconverter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fto_cconverter);
    }

    public void convertClicked(View v) {
        TextView f = (TextView) findViewById(R.id.fahrenheitText);
        TextView c = (TextView) findViewById(R.id.celsiusText);

        double fahValue;
        double celValue;

        if(!f.getText().toString().equals("")) {
            fahValue = Double.parseDouble(f.getText().toString());
        }
        else{
            fahValue = 0;
        }

        if(!c.getText().toString().equals("")) {
            celValue = Double.parseDouble(c.getText().toString());
        }
        else{
            celValue = 0;
        }

        if(fahValue == 0 && celValue != 0) {
            //convert celValue to fah and store in f
            f.setText(Double.toString((celValue * 9/5) + 32));
        }
        else if(fahValue != 0 && celValue == 0) {
            //convert fahValue to cel and store in c
            c.setText(Double.toString((fahValue - 32) * 5/9));
        }
        else if(fahValue != 0 && celValue != 0) {
            //convert fahValue to cel and store in c
            c.setText(Double.toString((fahValue - 32) * 5/9));
        }
        else {
            //do nothing
        }

    }
}
