package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
class Task15 {

    public static void main(String[] args) {

        int N;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. Введите число N: ");
            sc.next();
        }
        N = sc.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (1.2 * N * Math.random());
        }

        System.out.print("A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
