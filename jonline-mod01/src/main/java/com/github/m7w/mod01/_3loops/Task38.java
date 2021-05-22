package com.github.m7w.mod01._3loops;

import java.util.Scanner;

/**
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
class Task38 {

	public static void main(String[] args) {

		long a;
        long b;
		int r;
		int[] digits = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		while (!sc.hasNextLong()) {
			System.out.print("Введено неправильное число. Введите число: ");
			sc.next();
		}
		a = sc.nextLong();

		System.out.print("Введите второе число: ");
		while (!sc.hasNextLong()) {
			System.out.print("Введено неправильное число. Введите число: ");
			sc.next();
		}
		b = sc.nextLong();
        
		do {
			r = (int) (a % 10);
			digits[r] = 1;
			a = (a - r) / 10;
		} while (a > 0);

		do {
			r = (int) (b % 10);
			if (digits[r] == 1) {
				digits[r] = 2;
			}
			b = (b - r) / 10;
		} while (b > 0);

        System.out.print("Цифры входящие в запись обоих чисел: ");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (digits[i] == 2) {
                System.out.printf("%d ", i);
                count++;
            }
        }
        if (count == 0) {
            System.out.print("таких нет");
        }
        System.out.println();
        sc.close();
	}
}
