package com.github.m7w.mod01._1lp;

import java.util.Scanner;

/**
 * 1. Найдите значение функции: z = ((a – 3) * b / 2) + c.
 */
public class Task11 {

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

		z = ((a - 3) * b / 2) + c;
		System.out.printf("z = %f\n", z);
        sc.close();
	}
}
