package com.company;

public class Persoana {
    private String nume;
    private int varsta;
    public void setVarsta(int varsta)
    {
        this.varsta=varsta;
    }
    public void setNume(String nume)
    {
        this.nume=nume;
    }
    public int getVarsta()
    {
        return varsta;
    }
    public String getNume()
    {
        return nume;
    }
    public Persoana(String nume,int varsta)
    {
        this.nume=nume;
        this.varsta=varsta;
    }
    public void cresteVarsta()
    {
        this.varsta++;
    }

}
