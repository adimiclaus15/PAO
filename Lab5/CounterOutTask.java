package com.company;

public class CounterOutTask implements Task{
    public static int cnt;
    public CounterOutTask()
    {
        cnt=0;
    }
    @Override
    public void execute()
    {
        cnt++;
        System.out.println(cnt);
    }
}
