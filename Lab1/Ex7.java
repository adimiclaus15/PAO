package com;
import java.util.*;
public class Ex7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1)
            System.out.println(n);
        else
        {
            int a1=0;
            int a2=1;
            for(int i=2;i<=n;i++)
            {
                int a3=a1+a2;
                a1=a2;
                a2=a3;
            }
            System.out.println(a2);
        }
        sc.close();
    }
}
