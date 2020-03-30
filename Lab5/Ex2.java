package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static void main(String[] args)
    {
        ArrayList<Album> list=new ArrayList<>();
        list.add(new Album("abcd",1982,10));
        list.add(new Album("efg",2019,8));
        list.add(new Album("egqve",2011,7));
        list.add(new Album("abcd",200,5));
        System.out.println("Albums before sorting: ");
        for(Album album: list)
            System.out.println(album.getNume()+ " "+album.getAn()+ " "+album.genRating());
        Collections.sort(list);
        System.out.println("Albums after sorting: ");
        for(Album album: list)
            System.out.println(album.getNume()+ " "+album.getAn()+ " "+album.genRating());

    }
}
