package com.company;
import java.util.*;
public class Ex3 {
    public static int prim(int x)
    {
        if(x<=1)
            return 1;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j]=sc.nextInt();
        }
        int b[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                b[i][j]=prim(a[i][j]);
        }
        int sol=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                sol+=b[i][j];
        }
        System.out.print(sol);
    }
}
