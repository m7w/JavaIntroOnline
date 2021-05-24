package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
class Task411 {

    public static void main(String[] args) {

        long N1;
        long N2;

        N1 = inputFromConsole("Введите первое число: ");
        N2 = inputFromConsole("Введите второе число: ");

        int len1, len2;
        len1 = getLength(N1);
        len2 = getLength(N2);

        if (len1 > len2) {
            System.out.println("Цифр больше в первом числе.");
        } else if (len2 > len1) {
            System.out.println("Цифр больше во втором числе.");
        } else if (len1 == len2) {
            System.out.println("В обоих числах одинаковое количество цифр.");
        }
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

}
