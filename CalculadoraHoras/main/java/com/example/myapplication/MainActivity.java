package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText HoraI, HoraF, MinI, MinF;
    TextView RHora, Rmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        HoraI = findViewById(R.id.HoraI);
        HoraF = findViewById(R.id.HoraF);
        MinI = findViewById(R.id.MinI);
        MinF = findViewById(R.id.MinF);
        RHora = findViewById(R.id.RHora);
        Rmin = findViewById(R.id.RMin);
    }

    public void Subtração(View Pedreiro) {
        double a = Double.parseDouble(HoraI.getText().toString());
        double b = Double.parseDouble(HoraF.getText().toString());
        double c = Double.parseDouble(MinI.getText().toString());
        double d = Double.parseDouble(MinF.getText().toString());
        double CalcMin, CalcHora;
        while (c > 59) {
            a++;
            c = c - 60;
        }
        while (d > 59) {
            b++;
            d = d - 60;
        }

        if (b >=a){
            CalcHora = b - a;
                    if(d >= c){
                        CalcMin = d - c;
                    }
                    else{
                        CalcMin = c - d;
                    }
        }
        else{
            CalcHora = a - b;
            CalcMin =  c - d;
        }
        while(CalcMin > 59){
            CalcHora ++;
            CalcMin = CalcMin - 60;
        }
        while (CalcMin < 0 ){
            CalcHora --;
            CalcMin = CalcMin + 60;
        }


        while (CalcMin > 59) {
            CalcHora++;
            CalcMin = CalcMin - 60;
        }
        while (CalcHora < 0) {
            CalcHora--;
            CalcMin = CalcMin + 60;
        }
        Rmin.setText(CalcMin + "");
        RHora.setText(CalcHora + "");
    }

    public void Soma(View Receba) {
        double a = Double.parseDouble(HoraI.getText().toString());
        double b = Double.parseDouble(HoraF.getText().toString());
        double c = Double.parseDouble(MinI.getText().toString());
        double d = Double.parseDouble(MinF.getText().toString());
        double CalcMin = c + d;
        double CalcHora = a + b;
        while (CalcMin > 59) {
            CalcHora++;
            CalcMin = CalcMin - 60;
        }
        while (CalcMin < 0) {
            CalcHora--;
            CalcMin = CalcMin + 60;
        }
        Rmin.setText(CalcMin + "");
        RHora.setText(CalcHora + "");
    }

    public void reset(View luva) {
        HoraI.setText(null);
        HoraF.setText(null);
        MinI.setText(null);
        MinF.setText(null);
        RHora.setText(null);
        Rmin.setText(null);
    }
}


