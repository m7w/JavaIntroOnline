package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */
class Task413 {

    public static void main(String[] args) {

        long n;

        do {
            n = inputFromConsole("Введите число n: ");
            if (n < 3)
                System.out.println("Число n должно быть больше 2");
        } while (n < 3);

        for (long i = n; i <= 2 * n; i++) {
            if (isPrime(i)) {
                if (isPrime(i + 2)) {
                    System.out.println(i + " " + (i + 2));
                }
            }
        }
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

    public static boolean isPrime(long n) {

        for (long i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
