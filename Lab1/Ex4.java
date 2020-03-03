package com;
import java.util.*;
public class Ex4
{
    public static int factorial(int n)
    {
        int sol=1;
        for(int i=1;i<=n;i++)
            sol*=i;
        return sol;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
