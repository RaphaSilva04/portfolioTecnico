package com.example.resgistra_smoke;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaLogin extends AppCompatActivity {
    EditText usuario, chave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        getSupportActionBar().hide();
        usuario = findViewById(R.id.usuario);
        chave = findViewById(R.id.chave);
    }

    public void Cadastro(View v){
        Toast.makeText(this, "Usuario Cadastrado!", Toast.LENGTH_SHORT).show();
        String l = usuario.getText().toString();
        int s = Integer.parseInt(chave.getText().toString());

        UsuarioBd u = new UsuarioBd(l, s);
        u.salvarBd();
    }
}
