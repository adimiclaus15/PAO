package com.company;

public class OutTask implements Task {

    String mesaj;
    public OutTask(String msg)
    {
        this.mesaj=msg;
    }
    @Override
    public void execute()
    {
        System.out.println(this.mesaj);
    }
}
