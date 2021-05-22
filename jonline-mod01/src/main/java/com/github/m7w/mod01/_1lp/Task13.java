package com.github.m7w.mod01._1lp;

import java.util.Scanner;
import java.lang.Math;

/**
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *    ((sin(x) + cos(y))/(cos(x) - sin(y)))*tg(xy)
 */
public class Task13 {

	public static void main(String[] args) {

		double z;
        double x = 0;
        double y = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное значение. Введите x: ");
			sc.next();
		}
		x = sc.nextDouble();

		System.out.print("Введите y: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное значение. Введите y: ");
			sc.next();
		}
		y = sc.nextDouble();

		double num = Math.sin(x) + Math.cos(y);
		double den = Math.cos(x) - Math.sin(y);

        try {
            z = (num/den) * Math.tan(x * y);
            System.out.printf("z = %f\n", z);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0. " + e);
        } finally {
            sc.close();
        }
	}
}
