package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
class Task16 {

    public static void main(String[] args) {

        int N;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. Введите N: ");
            sc.next();
        }
        N = sc.nextInt();

        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = 10 * Math.random() - 5;
        }

        System.out.print("A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();

        double sum = 0;
        for (int i = 2; i < N; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }

        System.out.println("Сумма чисел: " + sum);
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
