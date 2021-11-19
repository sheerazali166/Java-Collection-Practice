package com.example.kinzasharedpreferenceapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class kinza {

    public static void main(String[] args) {

       // System.out.println("kinza amjad");

        List<Integer> kinza = new ArrayList<>();
        kinza.add(1);
        kinza.add(2);
        kinza.add(3);
        kinza.add(4);
        kinza.add(5);

        kinza.add(6);
        kinza.add(2, 50);


        List<Integer> rabia = new ArrayList<>();
        rabia.add(7);
        rabia.addAll(kinza);
        System.out.println(kinza.get(2));

//        rabia.remove(2);
//        rabia.remove(Integer.valueOf(4));
//        rabia.remove(Integer.valueOf(5));
//
//        kinza.clear();

        kinza.set(2, 100);



        System.out.println(kinza);
        System.out.println(rabia);
        System.out.println(kinza.contains(6));

        for (int i = 0; i < kinza.size(); i++) {
            System.out.println("Kinza's favourite numbers: " + kinza.get(i));
        }

        for (Integer kinzi: kinza) {
            System.out.println("Chocolate Kinza's numbers: " + kinzi);
        }

        Iterator<Integer> iterator = kinza.iterator();

        while (iterator.hasNext()){
            System.out.println("Kinza Chocolaty: " + iterator.next());
        }

     }
}
