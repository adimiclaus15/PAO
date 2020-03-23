package com.company;
import java.util.*;
public class Ex2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLine();
        String b[]=new String[n];
        int sz=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder(a[i]);
            sb.reverse();
            String s=new String(sb);
            if(a[i].equals(s))
                b[sz++]=a[i];
        }
        String sol="";
        for(int i=0;i<sz;i++)
        {
            if(a[i].length()>sol.length())
                sol=a[i];
        }
        System.out.print(sol);
    }
}
