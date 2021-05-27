package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
class Task11 {

    public static void main(String[] args) {

        int N, K;

        N = inputFromConsole("Введите N: ");
        K = inputFromConsole("Введите K: ");

        long[] array = new long[N];

        for (int i = 0; i < N; i++) {
            array[i] = (long) (10 * K * Math.random());
        }

        System.out.print("Массив A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > K && array[i] % K == 0) {
                sum += array[i];
            }
        }

        System.out.println("Сумма элементов кратных K = " + sum);
    }

    public static int inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextInt();

        return i;
    }
}
