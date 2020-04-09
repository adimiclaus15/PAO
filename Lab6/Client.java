package com.company;

public class Client {
    String nume;
    String prenume;
    int varsta;
    public Client(String nume,String prenume,int varsta){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }
    public int getVarsta(){
        return this.varsta;
    }
    public String toString(){
        return nume+" "+prenume+" "+varsta;
    }
}
