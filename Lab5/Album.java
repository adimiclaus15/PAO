package com.company;

public class Album implements Comparable<Album>{
    String nume;
    int an;
    int rating;
    public Album(String nume,int an,int rating)
    {
        this.nume=nume;
        this.rating=rating;
        this.an=an;
    }
    public void setNume(String nume)
    {
        this.nume=nume;
    }
    public void setAn(int an)
    {
        this.an=an;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    public String getNume()
    {
        return this.nume;
    }
    public int getAn()
    {
        return this.an;
    }
    public int genRating()
    {
        return this.rating;
    }
    @Override
    public int compareTo(Album a)
    {
        if(this.nume.equals(a.nume))
        {
            if(this.rating<a.rating)
                return -1;
            else
            {
                if(this.rating>a.rating)
                    return 1;
                else
                    return 0;
            }
        }
        else
        {
            if(this.nume.compareTo(a.nume)>0)
                return 1;
            else
                return -1;
        }
    }
}
