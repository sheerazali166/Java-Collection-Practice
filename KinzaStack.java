package com.example.kinzasharedpreferenceapp;

import java.util.Stack;

public class KinzaStack {

    public static void main(String[] args) {

        Stack<String> kinzaAnimal = new Stack<>();

        kinzaAnimal.push("Kinza Lion");
        kinzaAnimal.push("Rabia Tiger");
        kinzaAnimal.push("Ramsha Wolf");

        System.out.println(kinzaAnimal);

        System.out.println(kinzaAnimal.peek());

        kinzaAnimal.pop();

        System.out.println(kinzaAnimal.peek());



    }
}
