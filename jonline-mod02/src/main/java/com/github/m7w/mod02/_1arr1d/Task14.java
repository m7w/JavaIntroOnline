package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
class Task14 {

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

        double[] array = new double[N];
        for (int i = 0; i < N; i++) {
            array[i] = 20 * Math.random() - 10;
        }

        System.out.print("Old A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();

        double maxEl = -Double.MAX_VALUE;
        double minEl = Double.MAX_VALUE;
        int idxMaxEl = 0;
        int idxMinEl = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] < minEl) {
                minEl = array[i];
                idxMinEl = i;
            }
            if (array[i] > maxEl) {
                maxEl = array[i];
                idxMaxEl = i;
            }
        }
        array[idxMinEl] = maxEl;
        array[idxMaxEl] = minEl;

        System.out.print("New A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();
    }
}
