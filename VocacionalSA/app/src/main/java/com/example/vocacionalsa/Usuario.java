package com.example.vocacionalsa;

import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Usuario {
    public String user;
    public int senha;

    public Usuario(String user, int senha) {
        this.user = user;
        this.senha = senha;
    }

    public Usuario() {
    }


    public void salvar(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Usuario").child(user).setValue(this);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}




