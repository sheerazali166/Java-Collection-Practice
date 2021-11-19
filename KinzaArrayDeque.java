package com.example.kinzasharedpreferenceapp;

import java.util.ArrayDeque;

public class KinzaArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> kinzaArrayDeque = new ArrayDeque<>();

        kinzaArrayDeque.offer(22);
        kinzaArrayDeque.addFirst(11);
        kinzaArrayDeque.offerLast(25);
        kinzaArrayDeque.offer(24);
        kinzaArrayDeque.offer(222);


        System.out.println("Chocolaty Kinza Amjad: " + kinzaArrayDeque);

        System.out.println(kinzaArrayDeque.peek());
        System.out.println(kinzaArrayDeque.peekFirst());
        System.out.println(kinzaArrayDeque.peekLast());

        System.out.println(kinzaArrayDeque.poll());
        System.out.println("poll()" + kinzaArrayDeque);


        System.out.println(kinzaArrayDeque.pollFirst());
        System.out.println("pollFirst()" + kinzaArrayDeque);


        System.out.println(kinzaArrayDeque.pollLast());
        System.out.println("pollLast()" + kinzaArrayDeque);

    }
}
