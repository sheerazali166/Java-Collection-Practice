package com.example.kinzasharedpreferenceapp;

import java.util.LinkedList;
import java.util.Queue;

public class KinzaLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> kinzaQueue = new LinkedList<>();

        kinzaQueue.offer(11);
        kinzaQueue.offer(22);
        kinzaQueue.offer(33);

        System.out.println("Kinza Chocolate: " + kinzaQueue);

        kinzaQueue.poll();

        System.out.println(kinzaQueue);

        System.out.println(kinzaQueue.peek());

    }
}
