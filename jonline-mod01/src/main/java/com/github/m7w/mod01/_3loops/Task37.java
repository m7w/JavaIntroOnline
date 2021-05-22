package com.github.m7w.mod01._3loops;

import java.util.Scanner;

/**
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
class Task37 {

	public static void main(String[] args) {

		long m;
        long n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число m: ");
		while (!sc.hasNextLong()) {
			System.out.print("Введено неправильное число. Введите m: ");
			sc.next();
		}
		m = sc.nextLong();

		System.out.print("Введите число n: ");
		while (!sc.hasNextLong()) {
			System.out.print("Введено неправильное число. Введите n: ");
			sc.next();
		}
		n = sc.nextLong();

        System.out.print("\n");
		for (long i = m; i <= n; i++) {
			System.out.printf("Делители %d: ", i);
			for (long j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					System.out.printf("%d ", j);
				}
			}
            sc.close();
			System.out.printf("\n");
		}
	}
}
