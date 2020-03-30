package com.company;

public class Ex1 {
    public static void main(String[] args)
    {
        OutTask a=new OutTask("wfqfq");
        RandomOutTask b=new RandomOutTask();
        CounterOutTask c=new CounterOutTask();
        a.execute();
        b.execute();
        c.execute();
        c.execute();
    }
}
