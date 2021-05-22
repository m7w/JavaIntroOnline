package com.github.m7w.mod01._2branches;

import java.util.Scanner;

/**
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */
public class Task21 {

    public static void main(String[] args) {

        double ang1;
        double ang2;
        double ang3;
        boolean isExist;
        boolean isRectangular;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первый угол: ");
        while(!sc.hasNextDouble()) {
            System.out.print("Введено неверное значение. Введите первый угол: ");
            sc.next();
        }
        ang1 = sc.nextDouble();

        System.out.print("Введите второй угол: ");
        while(!sc.hasNextDouble()) {
            System.out.print("Введено неверное значение. Введите второй угол: ");
            sc.next();
        }
        ang2 = sc.nextDouble();

        ang3 = 180 - (ang1 + ang2);
        isExist = (ang3 > 0 && ang3 < 180);
        isRectangular = (ang1 == 90 || ang2 == 90 || ang3 == 90);
        if (isExist) {
            System.out.println("Треугольник существует: да.");
            if (isRectangular) {
                System.out.println("Треугольник прямоугольный: да");
            } else {
                System.out.println("Треугольник прямоугольный: нет");
            }
        } else {
            System.out.println("Треугольник существует: нет.");
        }
        sc.close();
    }
}
