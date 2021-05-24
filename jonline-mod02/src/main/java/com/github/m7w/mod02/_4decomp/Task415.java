package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
class Task415 {

    public static void main(String[] args) {

        int n;

        n = inputFromConsole("Введите число n: ");

        for (long i = (long) Math.pow(10, n - 1); i < (long) Math.pow(10, n); i++) {
            if (checkIncreased(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextInt();

        return i;
    }

    public static boolean checkIncreased(long num) {

        long prev, cur;

        prev = num % 10;
        num = num / 10;
        do {
            cur = num % 10;
            if (cur >= prev) {
                return false;
            }
            prev = cur;
            num = num / 10;
        } while (num > 0);

        return true;
    }
}

