package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
class Task46 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        a = inputFromConsole("Введите A: ");
        b = inputFromConsole("Введите B: ");
        c = inputFromConsole("Введите C: ");

        int gcd = gcd(a, b);
        gcd = gcd(gcd, c);
        if (gcd == 1) {
            System.out.println("Числа являются взаимно простыми.");
        } else {
            System.out.println("Числа не являются взаимно простыми.");
        }
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
