package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task45 {

    public static void main(String[] args) {

        int n;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N: ");
        while(!sc.hasNextInt()) {
            System.out.print("Введено неверное значение. Введите N: ");
            sc.next();
        }
        n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Генерируем массив A[N]: ");
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 40) - 20;
            System.out.print(array[i] + " ");
        }

        int secondMax = findSecondMax(array);
        System.out.println();
        System.out.println("Второе по величине число: " + secondMax);
    }

    public static int findSecondMax(int[] array) {

        int firstLargest;
        int secondLargest;

        secondLargest = firstLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            if (array[i] > secondLargest && array[i] < firstLargest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
