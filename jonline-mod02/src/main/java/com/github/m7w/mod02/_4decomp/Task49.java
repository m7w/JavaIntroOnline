package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
public class Task49 {

    public static void main(String[] args) {

        double x;
        double y;
        double t;
        double z;

        x = inputFromConsole("Введите X: ");
        y = inputFromConsole("Введите Y: ");
        t = inputFromConsole("Введите T: ");
        z = inputFromConsole("Введите Z: ");

        double diag = Math.sqrt(x * x + y * y);

        double tr1Area = trArea(x, y, diag);
        double tr2Area = trArea(t, z, diag);

        //Suppose convex
        double area = tr1Area + tr2Area;
        System.out.println("Площадь выпуклого четырехугольника: " + area);
    }

    public static double inputFromConsole(String message) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double i;

        System.out.print(message);
        while (!sc.hasNextDouble()) {
            System.out.println("Введено неверное число. " + message);
            sc.next();
        }
        i = sc.nextDouble();

        return i;
    }

    public static double trArea(double a, double b, double c) {

        double p;
        double area;

        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

}
