package com.company;

public class RandomOutTask implements Task {
    int n;
    public RandomOutTask()
    {
        this.n=(int)(Math.random()*100)+1;
    }
    @Override
    public void execute()
    {
        System.out.println(this.n);
    }
}
