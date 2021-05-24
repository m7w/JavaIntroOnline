package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел.
 */
class Task41 {

    public static void main(String[] args) {

        int a;
        int b;

        a = inputFromConsole("Введите A: ");
        b = inputFromConsole("Введите B: ");

        int gcd = gcd(a, b);
        int lcm = Math.abs(a * b) / gcd(a, b);

        System.out.println("НОД(A, B) = " + gcd);
        System.out.println("НОК(A, B) = " + lcm);
    }

    public static int inputFromConsole(String msg) {

        int input;
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
