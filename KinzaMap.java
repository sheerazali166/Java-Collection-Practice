package com.example.kinzasharedpreferenceapp;

import java.util.HashMap;
import java.util.Map;

public class KinzaMap {

    public static void main(String[] args) {

        Map<Integer, String> kinzaMap = new HashMap<>();

        kinzaMap.put(1, "Kinza");
        kinzaMap.put(2, "Rabia");
        kinzaMap.put(3, "Ramsha");

//        if(!kinzaMap.containsKey(1))
//         kinzaMap.put(4, "Kinza");

        kinzaMap.putIfAbsent(1, "Rabia");

        System.out.println(kinzaMap);

        for (Map.Entry<Integer, String> k: kinzaMap.entrySet()){

            System.out.println("Chocolaty Kinza: " + k);

            System.out.println(k.getKey());

            System.out.println(k.getValue());
        }

        System.out.println(kinzaMap.containsKey(1));

        System.out.println(kinzaMap.containsValue("Kinza"));

        System.out.println(kinzaMap.isEmpty());

        for (Integer key: kinzaMap.keySet()){

            System.out.println("Key Number: " + key);
        }

        for (String value: kinzaMap.values()){

            System.out.println("Value is: " + value);
        }

    }
}
