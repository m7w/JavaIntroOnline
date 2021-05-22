package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */
public class Task48 {

    public static void main(String[] args) {

        int k;
        int m;
        double[] D = {10.3, -2.0, 11, 8.7, -19.4, -9, -4, 
                     -19, -4.9, 1, -19, -6, 2, 8, -7, 18,
                     -8, 6, -2, 3};

        k = inputFromConsole("Введите k: ");
        m = inputFromConsole("Введите m: ");
        if (k > 19 || m > 19) {
            System.out.println("В массиве 20 элементов, числа k, m должны быть не больше 19.");
        }

        for (int i = k; i < m - 1; i++) {
            double sum;
            sum = tripletSum(D, i);
            System.out.printf("D[%d] + D[%d] + D[%d]: %f\n", i, i + 1, i + 2, sum);
        }
    }

    public static int inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.println("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextInt();

        return i;
    }

    public static double tripletSum(double[] arr, int i) {

        double sum = 0;

        sum = arr[i] + arr[i + 1] + arr[i + 2];

        return sum;
    }
}
