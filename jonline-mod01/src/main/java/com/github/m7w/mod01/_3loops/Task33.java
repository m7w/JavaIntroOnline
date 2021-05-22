package com.github.m7w.mod01._3loops;

/**
 * 3. Найти сумму квадратов первых ста чисел.
 */
class Task33 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Сумма квадратов первых ста чисел равна " + sum);
	}
}
