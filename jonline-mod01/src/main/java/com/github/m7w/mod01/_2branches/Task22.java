package com.github.m7w.mod01._2branches;

import java.util.Scanner;

/**
 * 2. Найти max{min(a, b), min(c, d)}.
 */
public class Task22 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        while(!sc.hasNextDouble()) {
            System.out.println("Введено неверное число. Введите a: ");
            sc.next();
        }
        a = sc.nextDouble();

        System.out.print("Введите b: ");
        while(!sc.hasNextDouble()) {
            System.out.println("Введено неверное число. Введите b: ");
            sc.next();
        }
        b = sc.nextDouble();

        System.out.print("Введите c: ");
        while(!sc.hasNextDouble()) {
            System.out.println("Введено неверное число. Введите c: ");
            sc.next();
        }
        c = sc.nextDouble();

        System.out.print("Введите d: ");
        while(!sc.hasNextDouble()) {
            System.out.println("Введено неверное число. Введите d: ");
            sc.next();
        }
        d = sc.nextDouble();

        double minab = a < b ? a : b;
        double mincd = c < d ? c : d;
        double result = minab > mincd ? minab : mincd;
        System.out.println("max{min(a, b), min(c, d)} = " + result);
        sc.close();
    }
}

