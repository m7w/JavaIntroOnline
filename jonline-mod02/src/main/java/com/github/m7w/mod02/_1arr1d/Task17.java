package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 7. Даны действительные числа a1, a2 ,..., an. Найти max( a1 + a2n , a2 + a2n−1 ,..., an + an+1 ) .
 */
class Task17 {

    public static void main(String[] args) {

        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n для массива a1, a2,...,a2n: ");
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. Введите n: ");
            sc.next();
        }
        n = sc.nextInt();

        double[] array = new double[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            array[i] = 20 * Math.random() - 10;
        }

        System.out.print("A[" + 2 * n + "]: ");
        for (int i = 0; i < 2 * n; i++) {
            System.out.printf("%.3f " , array[i]);
        }
        System.out.println();

        double max = -Double.MAX_VALUE;
        for (int i = 0; i < n + 1; i++) {
            max = Math.max(array[i] + array[2 * n - 1 - i], max);
        }

        System.out.println("max = " + max);
    }
}
