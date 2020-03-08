package com.company;
import java.util.*;
public class Ex2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int nr1=0,nr2=0;
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            if(val%2!=0)
            {
                nr1++;
                a[nr1]=val;
            }
            else
            {
                nr2++;
                b[nr2]=val;
            }
        }
        if(nr1>nr2)
            System.out.print("Mai multe impare");
        else
            System.out.print("Mai multe pare");
    }
}
