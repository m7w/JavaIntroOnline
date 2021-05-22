package com.github.m7w.mod01._3loops;

import java.util.Scanner;

/**
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */
class Task31 {

	public static void main(String[] args) {

		long x;
        long sum = 0;
		Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        while (!sc.hasNextLong()) {
            System.out.print("Введено неверное число. Введите целое положительное число: ");
            sc.next();
        }
        x = sc.nextLong();

		for (long i = 1; i <= x; i++) {
			sum += i;
		}
        sc.close();
		System.out.printf("Сумма чисел от 1 до %d равна %d%n", x, sum);
	}
}
