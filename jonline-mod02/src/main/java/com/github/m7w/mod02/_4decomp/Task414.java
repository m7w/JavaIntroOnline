package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */
class Task414 {

    public static void main(String[] args) {

        long k;

        k = inputFromConsole("Введите число k: ");

        for (int i = 1; i <= k; i++) {
            if (raisedSumOfDigits(i) == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static long inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long i;

        System.out.print(message);
        while (!sc.hasNextLong()) {
            System.out.print("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextLong();

        return i;
    }

    public static long raisedSumOfDigits(long num) {

        long sum = 0;
        int n = 0;

        do {
            sum += num % 10;
            num = num / 10;
            n++;
        } while (num > 0);

        return (long) Math.pow(sum, n);
    }
}
