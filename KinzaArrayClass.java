package com.example.kinzasharedpreferenceapp;

import java.util.Arrays;

public class KinzaArrayClass {

    public static void main(String[] args) {

        int kinzaArray[] = {22, 11, 3, 7, 45, 9, 35, 23, 12, 8, 2};

        int index = Arrays.binarySearch(kinzaArray, 9);

        System.out.println("Number is at the position: " + index);

        int kinzaArraySort[] = {222, 112, 32, 72, 452, 92, 352, 232, 122, 82, 22};

        for (int i = 0; i < kinzaArraySort.length; i++) {

            System.out.println(kinzaArraySort[i]);
        }



        Arrays.sort(kinzaArraySort);

        for (int i = 0; i < kinzaArraySort.length; i++) {

            System.out.println(kinzaArraySort[i]);
        }

        Arrays.fill(kinzaArraySort, 12);

        for (int i = 0; i < kinzaArraySort.length; i++) {

            System.out.println(kinzaArraySort[i]);
        }
    }
}
