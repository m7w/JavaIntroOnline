package com.github.m7w.mod01._2branches;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */
class Task24 {

	public static void main(String[] args) {

		double A;
        double B;
        double x;
        double y;
        double z;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Введите размеры отверстия A, B: ");
			A = sc.nextDouble();
			B = sc.nextDouble();
			System.out.print("Введите размеры кирпича x, y, z: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Введены неправильные значения.");
			return;
		} finally {
			sc.close();
		}

		double brickMin1;
        double brickMin2;
		brickMin1 = x < y ? x : y;
		if (brickMin1 == x) {
			brickMin2 = y < z ? y : z;
		} else {
 			brickMin2 = x < z ? x : z;
		}
		if ((brickMin1 <= A && brickMin2 <= B) || (brickMin1 <= B && brickMin2 <= A)) {
			System.out.println("Кирпич пройдет через отверстие.");
		} else {
			System.out.println("Кирпич не пройдет через отверстие.");
		}
	}
}
