package com.company;
import java.util.*;
public class Ex4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        int n=Integer.parseInt(x);
        Student[] v=new Student[n];
        for(int i=0;i<n;i++)
        {
            String l=sc.nextLine();
            String[] s=l.split(" ");
            v[i]=new Student();
            v[i].setNume(s[0]);
            v[i].setNota(Integer.parseInt(s[1]));

        }
        for(int i=0;i<n;i++)
            System.out.println(v[i].getNume()+" "+v[i].getNota());
    }
}
