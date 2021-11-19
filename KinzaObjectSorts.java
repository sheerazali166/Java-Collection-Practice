package com.example.kinzasharedpreferenceapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KinzaObjectSorts {

    public static void main(String[] args) {

        List<Ramsha> ramshaKinza = new ArrayList<>();

        ramshaKinza.add(new Ramsha("Kinza", 11));
        ramshaKinza.add(new Ramsha("Rabia", 7));
        ramshaKinza.add(new Ramsha("Ramsha", 52));
        ramshaKinza.add(new Ramsha("Kinza", 37));
        ramshaKinza.add(new Ramsha("Rabia", 8));
        ramshaKinza.add(new Ramsha("Ramsha", 42));
        ramshaKinza.add(new Ramsha("Rabia", 23));
        ramshaKinza.add(new Ramsha("Ramsha", 9));
        ramshaKinza.add(new Ramsha("Kinza", 3));

        for (Ramsha r: ramshaKinza) {

            System.out.println(r.ramshaName + " " + r.ramshaRollNo);
        }



        System.out.println("||=====================||");
        System.out.println("||=====================||");
        System.out.println("||=====================||");


        System.out.println("Sorted based on name");

        Collections.sort(ramshaKinza, new Comparator<Ramsha>() {
            @Override
            public int compare(Ramsha o1, Ramsha o2) {
                return o1.ramshaName.compareTo(o2.ramshaName);
            }
        });

        for (Ramsha r: ramshaKinza) {

            System.out.println(r.ramshaName + " " + r.ramshaRollNo);
        }

        System.out.println("||=====================||");
        System.out.println("||=====================||");
        System.out.println("||=====================||");

        System.out.println("Sorted based on roll no");

        Collections.sort(ramshaKinza);

        for (Ramsha r: ramshaKinza) {

            System.out.println(r.ramshaName + " " + r.ramshaRollNo);
        }




    }
}
