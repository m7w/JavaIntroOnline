package com.github.m7w.mod02._1arr1d;

import java.util.Scanner;

/**
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
class Task110 {

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

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                array[i / 2] = array[i];
            }
            if (i > (n - 1) / 2) {
                array[i] = 0;
            }
        }

        System.out.print("New A[" + n + "]: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
