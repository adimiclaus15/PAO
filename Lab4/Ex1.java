package com.company;
import java.util.*;
public class Ex1 {
    public static String sortString(String s)
    {
        char v[]=s.toCharArray();
        Arrays.sort(v);
        return new String(v);
    }
    public static void main(String[] args)
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        s1=sortString(s1);
        s2=sortString(s2);
        if(s1.equals(s2))
            System.out.print("Sunt anagrame");
        else
            System.out.print("Nu sunt anagrame");

    }
}
