package com.example.kinzasharedpreferenceapp;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KinzaPrioryQueue {

    public static void main(String[] args) {

        Queue<Integer> kinzaPrioryQueue = new PriorityQueue<>(Comparator.reverseOrder());

        kinzaPrioryQueue.offer(36);
        kinzaPrioryQueue.offer(24);
        kinzaPrioryQueue.offer(46);
        kinzaPrioryQueue.offer(12);

        System.out.println("Chocolate Kinza: " + kinzaPrioryQueue);

        kinzaPrioryQueue.poll();

        System.out.println("kinza: " + kinzaPrioryQueue);
    }
}
