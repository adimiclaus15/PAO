package com.company;

public class User {
    String nume;
    String parola;
    public User(String nume,String parola){
        this.nume=nume;
        this.parola=parola;
    }
    public String getNume(){
        return this.nume;
    }
    public String getParola(){
        return this.parola;
    }
}
