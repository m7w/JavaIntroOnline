package com.github.m7w.mod01._2branches;

import java.util.Scanner;

/**
 * 5. Вычислить значение функции
 */
class Task25 {

	public static void main(String[] args) {

		double x;
        double F;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неверное число. Введите x: ");
			sc.next();
		}
		x = sc.nextDouble();

		if (x <= 3) {
			F = x * x - 3 * x + 9;
		} else {
			F = 1 / (x * x * x + 6);
		}
        sc.close();
		System.out.printf("F(x) = %f\n", F);
	}
}
