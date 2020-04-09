package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("parole.txt");
        Scanner sc=new Scanner(System.in);
        ArrayList<User> useri=new ArrayList<>();
        String s="";
        int ch;
        while((ch=f.read())!=-1){
            if(ch==10){
                String[] user=s.split(" ");
                useri.add(new User(user[0],user[1]));
                s="";
            }
            else{
                s+=(char)ch;
            }
        }
        int limita=5;
        int ok=0;
        while(true)
        {
            if(limita==0)
                break;
            System.out.println("Nume: ");
            String nume=sc.nextLine();
            System.out.println("Parola: ");
            String parola=sc.nextLine();
            limita--;
            for(User u:useri){
                if(u.getNume().equals(nume)){
                    ok=1;
                    if(u.getParola().equals(parola)){
                        ok=2;
                        break;
                    }
                }
            }
            if(ok==2){
                System.out.println("acces permis");
                break;
            }
            if(ok==0){
                System.out.println("nume si parola gresite");
                System.out.println("mai aveti "+limita+" incercari");
            }
            if(ok==1){
                System.out.println("parola gresita");
                int incercari=3;
                while(true){
                    if(incercari==0){
                        break;
                    }
                    System.out.println("introduceti parola din nou");
                    System.out.println("mai aveti "+incercari+" incercari");
                    parola=sc.nextLine();
                    incercari--;
                    for(User u: useri){
                        if(u.getNume().equals(nume) && u.getParola().equals(parola)){
                            System.out.println("acces permis");
                            ok=2;
                            break;
                        }
                    }
                }
                if(ok==1){
                    System.out.println("cont blocat");
                }
                break;
            }
        }
        if(ok==0){
            System.out.println("nu ai cont. inregistreaza-te");
        }
    }
}
