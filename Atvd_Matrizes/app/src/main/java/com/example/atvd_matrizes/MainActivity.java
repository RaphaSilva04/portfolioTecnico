package com.example.atvd_matrizes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText var1, var2, var3, var4, var5, var6, var7, var8, var9;
    TextView resul;
    int i, j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        var1 = findViewById(R.id.var1);
        var2 = findViewById(R.id.var2);
        var3 = findViewById(R.id.var3);
        var4 = findViewById(R.id.var4);
        var5 = findViewById(R.id.var5);
        var6 = findViewById(R.id.var6);
        var7 = findViewById(R.id.var7);
        var8 = findViewById(R.id.var8);
        var9 = findViewById(R.id.var9);
        resul = findViewById(R.id.resultado);
    }
    public void calc(View v){
        int [][]matrix = new int[3][3];



  for ( i = 0 ; i < 2 ; j ++ ) {
    }

          for ( j = 0 ; j < 2 ; j ++ ) {
    }

  for ( i = 0 ; i < 2 ; i ++ ) {
    }
     for ( j = 0 ; j < 2 ; j ++ ) {
         Toast toast = new Toast(matrix[i][j] = +matrix[i][j]);


     }   }
}