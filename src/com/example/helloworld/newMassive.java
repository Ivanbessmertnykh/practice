package com.example.helloworld;

import java.util.Scanner;

public class newMassive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int [10];
        for (int i = 0; i<10; i++) {
            a[i] =(int) Math.round((Math.random() * 20));
            System.out.println(a[i]);
        }
        System.out.println("Sorting...");

            boolean sorted = false;
            int temp;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i+1]) {
                        temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                        sorted = false;
                    }
                }
            }

        for (int i = 0; i<10; i++) {
            System.out.println(a[i]);
        }
    }

}
