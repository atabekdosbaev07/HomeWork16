package com.company;

import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<City> set = new TreeSet<>();
        City city = new City(11,"Moscow");
        City city2 = new City(10,"Piter");
        City city3 = new City(7,"Osh");
        City city4 = new City(22,"Kara-Suu");
        set.add(city);
        set.add(city2);
        set.add(city3);
        set.add(city4);

        for(City i:set){
            if (i.getCode() % 2 == 1) {
                System.out.println(i);
            }
        }



    }
}