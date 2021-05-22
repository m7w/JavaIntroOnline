package com.github.m7w.mod01._1lp;

import java.util.Scanner;
import java.lang.Math;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *       ((b + sqrt(b^2 + 4ac)) / 2a) - a^3*c + b^-2
 */
public class Task12 {

	public static void main(String[] args) {

		double z;
        double a = 0;
        double b = 0;
        double c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное значение. Введите a: ");
			sc.next();
		}
		a = sc.nextDouble();

		System.out.print("Введите b: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное значение. Введите b: ");
			sc.next();
		}
		b = sc.nextDouble();

		System.out.print("Введите c: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное значение. Введите c: ");
			sc.next();
		}
		c = sc.nextDouble();

        try {
            z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.printf("z = %f\n", z);
        } catch (ArithmeticException e) {
            System.out.print("Деление на 0. " + e);
        } finally {
            sc.close();
        }
	}
}
