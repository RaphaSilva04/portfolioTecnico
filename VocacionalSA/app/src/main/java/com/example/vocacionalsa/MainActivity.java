package com.example.vocacionalsa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText password;
    AlertDialog.Builder alerta;

    ArrayList<Usuario> lista = new ArrayList<>();
    Usuario encontrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.User);
        password = findViewById(R.id.psSenha);
        alerta = new AlertDialog.Builder(this);
        Usuario u1 = new Usuario("Raphael", 123);
        Usuario u2 = new Usuario("Boemer", 123);
        Usuario u3 = new Usuario("Politico", 123);
        Usuario u4 = new Usuario("Lucas", 123);
        Usuario u5 = new Usuario("Dudinha", 123);
        Usuario u6 = new Usuario("Bequi", 123);

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);
        lista.add(u5);
        lista.add(u6);
    }


    public void mudarTela() {
        Intent a = new Intent(this, Perguntas.class);
        startActivity(a);
    }

    public void AbrirCadastro(View c) {
        Intent i = new Intent(this, TelaCadastro.class);
        startActivity(i);
    }

    public void print(String p) {
        Toast.makeText(this, p, Toast.LENGTH_SHORT).show();
    }

    public void verificaUsuario(View v) {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuario");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean aux = false;

                String l = usuario.getText().toString();
                int s = Integer.parseInt(password.getText().toString());

                for (DataSnapshot usuario : snapshot.getChildren()) {
                    if (usuario.getValue(Usuario.class).getUser().equals(l) && usuario.getValue(Usuario.class).getSenha() == s) {
                        aux = true;
                        print("Bem Vindo!");
                        mudarTela();
                        break;
                    }

                }
                if (!aux) {
                    print("Usuario não Encontrado!");
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
