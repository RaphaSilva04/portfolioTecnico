package com.example.vocacionalsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
    static int P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14;
    TextView valorj;
    int resultado;
    Button Exibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        getSupportActionBar().hide();
        valorj = findViewById(R.id.carioca);
        resultado = P1 + P2 + P3 + P4 + P5 + P6 + P7 + P8 + P9 + P10 + P11 + P12 + P13 + P14;
        Exibir = findViewById(R.id.button);
    }


    public void Calcpontuacao(View view) {
        if (resultado >= 75 && resultado < 100) {
            valorj.setText("Parabéns!\n \nVocê tem perfil de uma pessoa criativa que trabalha melhor sozinho \n");

        } else if (resultado >= 100 && resultado < 159) {
            valorj.setText(" Parabéns!\n \nVocê tem perfil de uma pessoa que trabalha remotamente, independente do lugar, seja na área de vendas, contabilidade ou administração\n");

        } else if (resultado >= 160 && resultado < 225) {
            valorj.setText("Parabéns!\n \nVocê tem perfil para liderar/fundar uma empresa, esse perfil costuma ascender em cargos de gestão, como gerência \n");
        }
        Exibir.setVisibility(View.INVISIBLE);
        
        }
    }
