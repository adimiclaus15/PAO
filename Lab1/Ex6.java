package com;
import java.util.*;
public class Ex6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sol=1;
        for(int i=1;i<=b;i++)
        {
            sol*=a;
        }
        System.out.println(sol);
        sc.close();
    }
}
