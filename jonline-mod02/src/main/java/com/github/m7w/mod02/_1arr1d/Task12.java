package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., а п. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */
class Task12 {

    public static void main(String[] args) {

        int N;
        double Z;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. Введите N: ");
            sc.next();
        }
        N = sc.nextInt();

        System.out.print("Введите Z: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Введено неверное число. Введите Z (-10, 10): ");
            sc.next();
        }
        Z = sc.nextDouble();

        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = 20 * Math.random() - 10;
        }

        System.out.print("a1, a2,..., an: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
        }

        System.out.println("Количество замен: " + count);
    }
}
