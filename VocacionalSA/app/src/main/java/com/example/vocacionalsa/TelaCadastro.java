package com.example.vocacionalsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {
    EditText password;
    EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.user);
        password = findViewById(R.id.password);
    }

    public void cadastro(View v){
        Toast.makeText(this, "Usuario Cadastrado", Toast.LENGTH_SHORT).show();
        String l = usuario.getText().toString();
        int s = Integer.parseInt(password.getText().toString());

        Usuario u = new Usuario(l, s);
        u.salvar();
    }
}