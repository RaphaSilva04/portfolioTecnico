package com.example.resgistra_smoke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    int tragadasC = 0;
    int tragadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        getSupportActionBar().hide();
    }
    public void registrarCigarro(View v){
        if (tragadasC > 4){
            Toast.makeText(this, "Tu ja fumou um monte doidao", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Você !", Toast.LENGTH_SHORT).show();
        }
    }
}