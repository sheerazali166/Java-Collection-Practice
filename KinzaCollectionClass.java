package com.example.kinzasharedpreferenceapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KinzaCollectionClass {

    public static void main(String[] args) {

        List<Integer> kinzaList = new ArrayList<>();

        kinzaList.add(22);
        kinzaList.add(11);
        kinzaList.add(7);
        kinzaList.add(10);
        kinzaList.add(2);
        kinzaList.add(4);
        kinzaList.add(47);
        kinzaList.add(30);
        kinzaList.add(11);
        kinzaList.add(11);
        kinzaList.add(11);
        kinzaList.add(11);
        kinzaList.add(11);

        System.out.println(kinzaList);

        System.out.println(Collections.max(kinzaList));

        System.out.println(Collections.min(kinzaList));

        System.out.println(Collections.frequency(kinzaList, 11));

        Collections.sort(kinzaList);

        System.out.println(kinzaList);

        Collections.sort(kinzaList, Comparator.reverseOrder());

        System.out.println(kinzaList);
    }
}
