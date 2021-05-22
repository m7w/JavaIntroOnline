package com.github.m7w.mod01._3loops;

import java.util.Scanner;

/**
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е.
 */
class Task35 {

	public static void main(String[] args) {

		double e;
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число e: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Введено неправильное число. Введите е: ");
			sc.next();
		}
		e = sc.nextDouble();

		double sum;
        double a;
        double i;

		sum = 0;
		i = 1;
		a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
		while (a >= e) {
			sum += a;
			i++;
			a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
		}
        sc.close();
		System.out.println("Сумма членов ряда равна " + sum);
	}
}
