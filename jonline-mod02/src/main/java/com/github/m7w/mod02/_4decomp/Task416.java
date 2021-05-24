package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
class Task416 {

    public static void main(String[] args) {

        int n;
        long sum = 0;

        n = inputFromConsole("Введите число n: ");

        for (long i = (long) Math.pow(10, n - 1); i < (long) Math.pow(10, n); i++) {
            if (allDigitsOdd(i)) {
                sum += i;
            }
        }
        
        int evenCount = countEvenDigits(sum);

        System.out.println("Сумма: " + sum);
        System.out.println("Четных цифр: " + evenCount);
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

    public static boolean allDigitsOdd(long num) {

        do {
            long d = num % 10;
            if (isDigitEven(d)) {
                return false;
            }
            num = num / 10;
        } while (num > 0);

        return true;
    }

    public static int countEvenDigits(long num) {

        int count = 0;

        do {
            long d = num % 10;
            if (isDigitEven(d)) {
                count++;
            }
            num = num / 10;
        } while (num > 0);

        return count;
    }

    public static boolean isDigitEven(long d) {

        if (d % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
