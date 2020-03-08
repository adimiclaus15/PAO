package com.company;
import java.util.*;
public class Ex1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double suma=0,nr=0,x;
        x=sc.nextInt();
        while(x!=-1)
        {
            suma+=x;
            nr++;
            x=sc.nextInt();
        }
        System.out.print(suma/nr);
    }
}
