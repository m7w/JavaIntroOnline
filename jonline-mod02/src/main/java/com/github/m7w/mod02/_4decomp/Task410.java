package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */
public class Task410 {

    public static void main(String[] args) {

        long N;

        N = inputFromConsole("Введите N: ");

        int len;
        len = getLength(N);
        int[] arrN = new int[len];
        long head = N;
        int tail;
        int i = 0;

        do {
            tail = getTail(head);
            head = getHead(head);
            arrN[i] = tail;
            i++;
        } while (head > 0);

        reverse(arrN);

        System.out.println("Массив цифр числа N:");
        for (int j = 0; j < len; j++) {
            System.out.print(arrN[j] + " ");
        }
        System.out.println();
    }

    public static long inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long i;

        System.out.print(message);
        while (!sc.hasNextLong()) {
            System.out.println("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextLong();

        return i;
    }

    public static int getLength(long N) {

        int len = 0;

        do {
            N = getHead(N);
            len++;
        } while (N > 0);

        return len;
    }

    public static long getHead(long N) {

        return N / 10;
    }

    public static int getTail(long N) {

        return (int) N % 10;
    }

    public static void reverse(int[] arr) {

        int temp;
        int len = arr.length;

        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
    }
}
