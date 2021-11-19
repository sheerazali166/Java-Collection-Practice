package com.example.kinzasharedpreferenceapp;

import java.util.Set;
import java.util.TreeSet;

public class KiinzaTreeSet {

    public static void main(String[] args) {

        Set<Integer> kinzaAmjadTreeSet =new TreeSet<>();

        kinzaAmjadTreeSet.add(23);
        kinzaAmjadTreeSet.add(11);
        kinzaAmjadTreeSet.add(6);
        kinzaAmjadTreeSet.add(16);
        kinzaAmjadTreeSet.add(12);
        kinzaAmjadTreeSet.add(5);

        System.out.println("Chocolaty Kinza: " + kinzaAmjadTreeSet);

        kinzaAmjadTreeSet.remove(11);

        System.out.println(kinzaAmjadTreeSet);

        System.out.println(kinzaAmjadTreeSet.contains(12));

        System.out.println(kinzaAmjadTreeSet.contains(50));

    }
}
