package com.github.m7w.mod02._4decomp;

import java.util.Scanner;

/**
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */
class Task43 {

    public static void main(String[] args) {

        double a;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите a: ");
        while (!sc.hasNextLong()) {
            System.out.print("Введено неверное значение. Введите a: ");
            sc.next();
        }
        a = sc.nextDouble();

        double h = a * Math.sin(Math.PI / 3);
        double St = triangleArea(a, h);
        double Sh = 6 * St;
        System.out.println("Площадь парвильного шестиугольника: " + Sh);
    }

    public static double triangleArea(double a, double h) {
        
        double S;
        S = (a * h) / 2;

        return S;
    }
}
