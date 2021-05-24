package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
class Task417 {

    public static void main(String[] args) {

        long num;
        int count = 0;

        num = inputFromConsole("Введите число: ");

        do {
            num -= digitsSum(num);
            count++;
        } while (num > 0);

        System.out.println("Количество действий: " + count);
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

    public static int digitsSum(long num) {

        int sum = 0;

        do {
            sum += num % 10;
            num = num / 10;
        } while (num > 0);

        return sum;
    }
}
