package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task42 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        a = inputFromConsole("Введите A: ");
        b = inputFromConsole("Введите B: ");
        c = inputFromConsole("Введите C: ");
        d = inputFromConsole("Введите D: ");

        int gcd = gcd(a, b);
        gcd = gcd(gcd, c);
        gcd = gcd(gcd, d);

        System.out.println("НОД(A, B, C, D) = " + gcd);
    }

    public static int inputFromConsole(String msg) {

        int input;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print(msg);
        while (!sc.hasNextInt()) {
            System.out.print("Введено неверное число. " + msg);
            sc.next();
        }
        input = sc.nextInt();

        return input;
    }

    /*
     * Euclidean algorithm.
     */
    public static int gcd(int a, int b) {

        int r1, r2;
        
        if (a > b) {
            r1 = a;
            r2 = b;
        } else {
            r1 = b;
            r2 = a;
        }

        while (r2 > 0) {
            int tmp;
            tmp = r2;
            r2 = r1 % r2;
            r1 = tmp;
        }
        return r1;
    }
}
