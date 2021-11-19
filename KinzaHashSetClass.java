package com.example.kinzasharedpreferenceapp;

import java.util.HashSet;
import java.util.Set;

public class KinzaHashSetClass {

    public static void main(String[] args) {

        Set<Ramsha> ramshaKinzaHashSet = new HashSet<>();

        ramshaKinzaHashSet.add(new Ramsha("Kinza", 101));
        ramshaKinzaHashSet.add(new Ramsha("Rabia", 102));
        ramshaKinzaHashSet.add(new Ramsha("Ramsha", 103));
        ramshaKinzaHashSet.add(new Ramsha("Rabia", 102));


        Ramsha r1 = new Ramsha("kinza", 1);
        Ramsha r2 = new Ramsha("Rabia", 1);

        System.out.println(r1.equals(r2));


        System.out.println(ramshaKinzaHashSet);

    }
}
