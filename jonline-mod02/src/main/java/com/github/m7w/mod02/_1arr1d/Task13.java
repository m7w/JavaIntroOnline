package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
class Task13 {

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
            double el = 20 * Math.random() - 10;
            if (el < 0.5 && el > -0.5) {
                array[i] = 0;
            } else {
                array[i] = el;
            }
        }

        System.out.print("A[" + N + "]: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.println();

        int countNeg = 0;
        int countPos = 0;
        int countZero = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] < 0) {
                countNeg++;
            } else if (array[i] > 0) {
                countPos++;
            } else {
                countZero++;
            }
        }

        System.out.printf("Отрицательных: %d, положительных: %d, нулевых: %d\n", countNeg, countPos, countZero);
    }
}
