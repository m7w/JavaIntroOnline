package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */
class Task19 {

    public static void main(String[] args) {
        
        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. Введите число n: ");
            sc.next();
        }
        n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (20 * Math.random() - 10);
        }

        System.out.print("A[" + n + "]: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] counts = new int[n];
        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                    counts[i]++;
                    if (counts[i] >= maxCount) {
                        maxCount = counts[i];
                    }
                }
            }
        }

        int minEl = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (counts[i] == maxCount) {
                if (array[i] < minEl) {
                    minEl = array[i];
                }
            }
        }

        System.out.println(minEl + " повторяется " + maxCount + " раз.");
    }
    
}
