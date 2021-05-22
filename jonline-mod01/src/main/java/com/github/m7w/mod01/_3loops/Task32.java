package com.github.m7w.mod01._3loops;

import java.util.Scanner;

/**
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h
 */
class Task32 {

	public static void main(String[] args) {

		double a;
        double b;
        double h;
        double x;
        double y;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное число. Введите a: ");
			sc.next();
		}
		a = sc.nextDouble();

		System.out.print("Введите b: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное число. Введите b: ");
			sc.next();
		}
		b = sc.nextDouble();

		System.out.print("Введите h: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное число. Введите h: ");
			sc.next();
		}
		h = sc.nextDouble();

        final double threshold = 1e-10;
		x = a;
		while (x < b + threshold) {
            if (x < 2 + threshold) {
				y = -x;
			} else {
				y = x;
			}
			System.out.printf("y(%f) = %f\n", x, y);
			x += h;
		}
        sc.close();
	}
}
