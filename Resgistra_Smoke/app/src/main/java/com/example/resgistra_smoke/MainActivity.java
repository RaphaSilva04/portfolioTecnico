package com.example.resgistra_smoke;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText usuario, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        usuario = findViewById(R.id.user);
        senha = findViewById(R.id.senha);
        }

        public void mudarTela(){
            Intent i = new Intent(this, TelaLogin.class);
            startActivity(i);
        }

        public void telaCadastro(View v){
            Intent a = new Intent(this, TelaLogin.class);
            startActivity(a);
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
                int s = Integer.parseInt(senha.getText().toString());

                for (DataSnapshot usuario : snapshot.getChildren()) {
                    if (usuario.getValue(UsuarioBd.class).getUser().equals(l) && usuario.getValue(UsuarioBd.class).getSenha() == s) {
                        aux = true;
                        print("Seja bem Vindo!");
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



