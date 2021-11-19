package com.example.kinzasharedpreferenceapp;

import java.util.HashSet;
import java.util.Set;

public class KinzaHashSet {

    public static void main(String[] args) {

        Set<Integer> kinzaSet = new HashSet<>();

        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(22);
        kinzaSet.add(23);
        kinzaSet.add(22);
        kinzaSet.add(42);
        kinzaSet.add(52);
        kinzaSet.add(62);
        kinzaSet.add(82);

        kinzaSet.remove(23);

        System.out.println("Chocolaty Kinza: " + kinzaSet);

        System.out.println(kinzaSet.contains(100));

        System.out.println(kinzaSet.contains(82));

        System.out.println(kinzaSet.isEmpty());

      //  kinzaSet.clear();

       // System.out.println(kinzaSet.isEmpty());




    }
}
