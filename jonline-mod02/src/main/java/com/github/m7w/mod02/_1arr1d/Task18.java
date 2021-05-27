package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 8. Дана последовательность целых чисел a1, a2,..., an. Образовать новую
 * последовательность, выбросив из исходной те члены, которые равны min( a1, a2,..., an ) .
 */
class Task18 {

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
            array[i] = (int) (10 * Math.random() - 5);
        }

        System.out.print("A[" + n + "]: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println(min);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == min) {
                count++;
            }
        }

        int[] newArray = new int[n - count];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != min) {
                newArray[idx++] = array[i];
            }
        }

        System.out.print("New A[" + (n - count) + "]: ");
        for (int i = 0; i < n - count; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}
