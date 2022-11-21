package com.example.resgistra_smoke;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UsuarioBd {
    String user;
    int senha;

    public UsuarioBd(String user, int senha){
        this.user = user;
        this.senha = senha;
    }

    public UsuarioBd(){

    }

    public void salvarBd(){
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

