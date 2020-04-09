package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("clienti.txt"));
        String x;
        ArrayList<Client> clienti=new ArrayList<>();
        ArrayList<Client> clientiMajori=new ArrayList<>();
        ArrayList<Client> clientMinori=new ArrayList<>();
        while((x=br.readLine())!=null){
            String[] c=x.split(" ");
            clienti.add(new Client(c[0],c[1],Integer.parseInt(c[2])));
        }
        for(Client c: clienti){
            if(c.getVarsta()>=18){
                clientiMajori.add(c);
            }
            else{
                clientMinori.add(c);
            }
        }
        System.out.println("Clientii majori :");
        System.out.println(clientiMajori.size());
        for(Client c: clientiMajori)
            System.out.println(c);
        System.out.println("Clientii minori :");
        System.out.println(clientMinori.size());
        for(Client c: clientMinori)
            System.out.println(c);
    }
}
