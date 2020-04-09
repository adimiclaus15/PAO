package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        FileWriter g=new FileWriter("perechi.txt");
        System.out.println("Numarul de perechi: ");
        int n=sc.nextInt();
        int sz=0;
        while(true){
            if(sz>=n){
                break;
            }
            int x=sc.nextInt();
            int y=sc.nextInt();
            sz++;
            try{
                if(x>=y)
                    throw new Exception("Pereche invalida");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println("Dati alta pereche: ");
                sz--;
            }
            finally {
                if(x<y)
                    g.write(x+" "+y+"\n");
            }
        }
        g.close();
    }
}
